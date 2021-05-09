#!/usr/bin/python3
import dds_topic_9_subscriber as sub_0 
import dds_topic_8_subscriber as sub_1 
import dds_topic_10_subscriber as sub_2 
import dds_topic_12_publisher as pub_0

import rticonnextdds_connector as rti
import threading
import os
from time import sleep

connector = rti.Connector("event_based_dds_application_7ParticipantLibrary::event_based_dds_application_7Participant", "ParticipantDescriptor.xml")
lock = threading.RLock()

dds_topic_9_sub_thread = sub_0.dds_topic_9Reader("dds_topic_9", lock, connector)
dds_topic_9_sub_thread.start()
dds_topic_8_sub_thread = sub_1.dds_topic_8Reader("dds_topic_8", lock, connector)
dds_topic_8_sub_thread.start()
dds_topic_10_sub_thread = sub_2.dds_topic_10Reader("dds_topic_10", lock, connector)
dds_topic_10_sub_thread.start()
dds_topic_12_pub_thread = pub_0.dds_topic_12Writer("dds_topic_12", lock, connector)
dds_topic_12_pub_thread.start()

while True:
	pass
