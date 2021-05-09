#!/usr/bin/python3
import dds_topic_2_subscriber as sub_0 
import dds_topic_8_publisher as pub_0

import rticonnextdds_connector as rti
import threading
import os
from time import sleep

connector = rti.Connector("event_based_dds_application_4ParticipantLibrary::event_based_dds_application_4Participant", "ParticipantDescriptor.xml")
lock = threading.RLock()

dds_topic_2_sub_thread = sub_0.dds_topic_2Reader("dds_topic_2", lock, connector)
dds_topic_2_sub_thread.start()
dds_topic_8_pub_thread = pub_0.dds_topic_8Writer("dds_topic_8", lock, connector)
dds_topic_8_pub_thread.start()

while True:
	pass
