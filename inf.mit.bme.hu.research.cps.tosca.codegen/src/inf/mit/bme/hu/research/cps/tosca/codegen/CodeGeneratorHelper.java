package inf.mit.bme.hu.research.cps.tosca.codegen;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * A helper class with static methods for file and folder creation for the
 * templates.
 * 
 * @author Semerath
 */
public class CodeGeneratorHelper {

	public static IFile createFile(Resource nextTo,
			String name, String extension, String folder, CharSequence content)
			throws CoreException {
		// Getting the project from the name described in the URI of the
		// resource
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(nextTo.getURI().segment(1));

		IFolder outputFolder = project.getFolder("output");
		IFolder targetFolder = getOrCreateFolder(outputFolder, folder);

		// At the end a new java file is created in the target folder.
		String dot = ".";
		if(extension == "") dot = "";
		return createFile(targetFolder, name + dot + extension, true, content);
	}

	/**
	 * Returns a folder with the same name as <code>newFolder</code> located in
	 * <code>newFolder</code>. The function create such folder if it is
	 * necessary.
	 * 
	 * @param container
	 *            The container folder.
	 * @param newFolder
	 *            The name of the folder needed.
	 * @return A folder in the <code>container</code> named
	 *         <code>newFolder</code>.
	 * @throws CoreException
	 *             If the folder can not be created.
	 */
	public static IFolder getOrCreateFolder(IFolder container, String newFolder)
			throws CoreException {
		// Referring a folder by a relative name.
		IFolder folder = container.getFolder(newFolder);

		// If the folder doesn't exists create it.
		if (!folder.exists()) {
			IProgressMonitor monitor = new NullProgressMonitor();
			folder.create(true, true, monitor);
		}

		// Return with the folder.
		return folder;
	}

	/**
	 * Creates a file named <code>name</code> into the folder
	 * <code>folder</code>with the content <code>content</code> and sets the
	 * derived. It overwrites only derived files and it doesn't delete anything
	 * editable by the user.
	 * 
	 * @param folder
	 *            The target folder.
	 * @param name
	 *            The name of the new file.
	 * @param derived
	 *            The derived property of the new file.
	 * @param content
	 *            The content of the new file.
	 * @return The new file.
	 * @throws CoreException
	 *             If an existing file can not be deleted, the new file can not
	 *             be created or the derived property can not be set.
	 */
	public static IFile createFile(IFolder folder, String name,
			boolean derived, CharSequence content) throws CoreException {
		// Referring a file by a relative name.
		IFile file = folder.getFile(name);

		// If the file existed before, and it is not editable, it should be
		// deleted
		IProgressMonitor monitor = new NullProgressMonitor();
		if (file.exists() && file.isDerived())
			file.delete(true, monitor);

		// Create the file if it is to exists.
		if (!file.exists()) {
			file.create(
					new ByteArrayInputStream(content.toString().getBytes()),
					true, monitor);

			// Setting the properties of the file.
			if (derived)
				file.setDerived(true, monitor);
		}

		// Return with the file.
		return file;
	}
	
	 public static String readFileToString(Resource nextTo, String folderName, String fileName) 
	    {
		 	IProject project = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(nextTo.getURI().segment(1));

			IFolder idlFolder = project.getFolder(folderName);
	        String content = "";
	        String filePath = idlFolder.getLocationURI().getPath().substring(1) +"/" +fileName;
	 
	        try
	        {
	        	//TODO: path resolving
	            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	 
	        return content;
	    }
	
	public static void copyDDSThreads(Resource nextTo, String nodeName) {
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(nextTo.getURI().segment(1));

		IFolder outputFolder = project.getFolder("output/"+nodeName);
		Path dstPath = Paths.get(outputFolder.getLocationURI().getPath().substring(1) +"/dds_threads.py");
		Path srcPath = Paths.get("C:\\Users\\Nándi\\eclipse-workspace\\inf.mit.bme.hu.research.cps.tosca\\inf.mit.bme.hu.research.cps.tosca.codegen\\resources\\dds_threads.py");
		try {
			Files.copy(srcPath, dstPath, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void printResults(Process process) throws IOException {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	    String line = "";
	    while ((line = reader.readLine()) != null) {
	        System.out.println(line);
	    }
	}

}
