#!/usr/bin/python3
import dds_topic_7_subscriber as sub_0 
import dds_topic_9_publisher as pub_0

import rticonnextdds_connector as rti
import threading
import os
from time import sleep

connector = rti.Connector("event_based_dds_application_5ParticipantLibrary::event_based_dds_application_5Participant", "ParticipantDescriptor.xml")
lock = threading.RLock()

dds_topic_7_sub_thread = sub_0.dds_topic_7Reader("dds_topic_7", lock, connector)
dds_topic_7_sub_thread.start()
dds_topic_9_pub_thread = pub_0.dds_topic_9Writer("dds_topic_9", lock, connector)
dds_topic_9_pub_thread.start()

while True:
	pass
