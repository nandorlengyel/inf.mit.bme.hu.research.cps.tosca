#!/usr/bin/python3
import dds_topic_5_subscriber as sub_0 
import dds_topic_11_subscriber as sub_1 
import dds_topic_7_publisher as pub_0

import rticonnextdds_connector as rti
import threading
import os
from time import sleep

connector = rti.Connector("event_based_dds_application_3ParticipantLibrary::event_based_dds_application_3Participant", "ParticipantDescriptor.xml")
lock = threading.RLock()

dds_topic_5_sub_thread = sub_0.dds_topic_5Reader("dds_topic_5", lock, connector)
dds_topic_5_sub_thread.start()
dds_topic_11_sub_thread = sub_1.dds_topic_11Reader("dds_topic_11", lock, connector)
dds_topic_11_sub_thread.start()
dds_topic_7_pub_thread = pub_0.dds_topic_7Writer("dds_topic_7", lock, connector)
dds_topic_7_pub_thread.start()

while True:
	pass
