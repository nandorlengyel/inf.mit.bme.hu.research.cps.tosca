#!/usr/bin/python3
import dds_topic_1_subscriber as sub_0 
import dds_topic_11_subscriber as sub_1 
import dds_topic_4_subscriber as sub_2 
import dds_topic_10_publisher as pub_0

import rticonnextdds_connector as rti
import threading
import os
from time import sleep

connector = rti.Connector("event_based_dds_application_6ParticipantLibrary::event_based_dds_application_6Participant", "ParticipantDescriptor.xml")
lock = threading.RLock()

dds_topic_1_sub_thread = sub_0.dds_topic_1Reader("dds_topic_1", lock, connector)
dds_topic_1_sub_thread.start()
dds_topic_11_sub_thread = sub_1.dds_topic_11Reader("dds_topic_11", lock, connector)
dds_topic_11_sub_thread.start()
dds_topic_4_sub_thread = sub_2.dds_topic_4Reader("dds_topic_4", lock, connector)
dds_topic_4_sub_thread.start()
dds_topic_10_pub_thread = pub_0.dds_topic_10Writer("dds_topic_10", lock, connector)
dds_topic_10_pub_thread.start()

while True:
	pass
