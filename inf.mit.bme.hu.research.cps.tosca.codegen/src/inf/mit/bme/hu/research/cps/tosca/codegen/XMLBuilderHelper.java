package inf.mit.bme.hu.research.cps.tosca.codegen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

import org.eclipse.emf.ecore.resource.Resource;

import com.jamesmurty.utils.XMLBuilder2;

public class XMLBuilderHelper {
    public static String createXML(String nodeName, Resource nextTo, ArrayList<String> subscriberTopics,ArrayList<String> publisherTopics, HashMap<String, ArrayList<String>> topicXMLs) {


        XMLBuilder2 qos_libraryXML = XMLBuilder2
            .create("qos_library")
            .a("name", "QosLibrary")
            .e("qos_profile")
            .a("name", "DefaultProfile")
            .a("base_name", "BuiltinQosLib::Generic.StrictReliable")
            .a("is_default_qos", "true")
            .e("participant_qos")
            .e("participant_name")
            .e("name")
            .t(nodeName);

        XMLBuilder2 typesXML = XMLBuilder2
            .create("types");

        XMLBuilder2 domain_libraryXML = XMLBuilder2
            .create("domain_library")
            .a("name", "DDSDomainLibrary")
            .e("domain")
            .a("name", "DDSDomain")
            .a("domain_id", "0");

        for (String topicXML : topicXMLs.keySet()) {

            String topicXMLString = CodeGeneratorHelper.readFileToString(nextTo,"idl", topicXML);

            Scanner scanner = new Scanner(topicXMLString);

            String typeName = "";

            while (scanner.hasNextLine()) {

                boolean struct = true;
                HashMap<String, String> topicMemberTypePairs = new HashMap<String, String>();
                ArrayList<String> enums = new ArrayList();

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.contains(("}"))) break;
                    if (line.contains("struct")) {
                        String[] structLine = line.split(" ");
                        typeName = structLine[1].replace("{", "");
                        continue;
                    } else if (line.contains("enum")) {
                        struct = false;
                        String[] structLine = line.split(" ");
                        typeName = structLine[1].replace("{", "");
                        continue;
                    } else if (line.contains("{")) {
                        continue;
                    } else {
                        if (struct) {
                            String[] words = line.split("\\W+");
                            if (words.length > 2) {
                                topicMemberTypePairs.put(words[2], words[1]);
                            }
                        } else {
                            line = line.replaceAll("\\s+", "");
                            line = line.replace(",", "");
                            enums.add(line);
                        }
                    }
                }

                XMLBuilder2 topicTypeXML = null;
                Iterator it = topicMemberTypePairs.entrySet().iterator();

                if (struct && it.hasNext()) {
                    topicTypeXML = XMLBuilder2.create("struct").a("name", typeName)
                        .a("extensibility", "extensible");

                    while (it.hasNext()) {
                        Map.Entry pair = (Map.Entry) it.next();
                        String type = pair.getValue().toString();

                        if (type.equals("string")) {
                            topicTypeXML.e("member")
                                .a("name", pair.getKey().toString()).a("type", type).a("stringMaxLength", "30");
                        } else if (type.equals("long") || type.equals("float") || type.equals("boolean")) {
                            topicTypeXML.e("member")
                                .a("name", pair.getKey().toString()).a("type", type);
                        } else {
                            topicTypeXML.e("member")
                                .a("name", pair.getKey().toString()).a("type", "nonBasic")
                                .a("nonBasicTypeName", type);
                        }
                        it.remove();
                    }
                } else if (!enums.isEmpty()) {
                    topicTypeXML = XMLBuilder2.create("enum").a("name", typeName)
                        .a("extensibility", "extensible");

                    int i = 0;
                    for (String enumeratorName : enums) {
                        topicTypeXML.e("enumerator").a("name", enumeratorName).a("value", String.valueOf(i));
                        i++;
                    }

                }

                if (topicTypeXML != null) typesXML.importXMLBuilder(topicTypeXML);
            }
            scanner.close();

            //register type, register topics
            domain_libraryXML.e("register_type")
                .a("name", typeName)
                .a("type_ref", typeName)
                .up();

            ArrayList<String> topicNames = topicXMLs.get(topicXML);

            for (String topicName : topicNames) {
                domain_libraryXML.e("topic")
                    .a("name", topicName)
                    .a("register_type_ref", typeName)
                    .up();
            }
        }

        XMLBuilder2 domain_participant_libraryXML = XMLBuilder2
            .create("domain_participant_library")
            .a("name", nodeName + "ParticipantLibrary")
            .e("domain_participant")
            .a("name", nodeName + "Participant")
            .a("domain_ref", "DDSDomainLibrary::DDSDomain");

        for (String publisherTopic : publisherTopics) {
            domain_participant_libraryXML
                .e("publisher")
                .a("name", publisherTopic + "Publisher")
                .e("data_writer")
                .a("name", publisherTopic + "Writer")
                .a("topic_ref", publisherTopic);
        }

        for (String subscriberTopic : subscriberTopics) {
            domain_participant_libraryXML
                .e("subscriber")
                .a("name", subscriberTopic + "Subscriber")
                .e("data_reader")
                .a("name", subscriberTopic + "Reader")
                .a("topic_ref", subscriberTopic);
        }

        XMLBuilder2 ddsXML = XMLBuilder2
            .create("dds")
            .a("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance")
            .a("xsi:noNamespaceSchemaLocation", "http://community.rti.com/schema/6.0.0/rti_dds_profiles.xsd")
            .a("version", "6.0.0")
            .importXMLBuilder(qos_libraryXML)
            .importXMLBuilder(typesXML)
            .importXMLBuilder(domain_libraryXML)
            .importXMLBuilder(domain_participant_libraryXML);

        String filename = "ParticipantDescriptor.xml";

        Properties outputProperties = new Properties();
        outputProperties.put(
            javax.xml.transform.OutputKeys.INDENT, "yes");

        return ddsXML.asString(outputProperties);
    }
}
