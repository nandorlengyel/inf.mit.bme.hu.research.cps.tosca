#!/usr/bin/python3
import dds_topic_12_subscriber as sub_0 
import dds_topic_3_publisher as pub_0

import rticonnextdds_connector as rti
import threading
import os
from time import sleep

connector = rti.Connector("event_based_dds_application_1ParticipantLibrary::event_based_dds_application_1Participant", "ParticipantDescriptor.xml")
lock = threading.RLock()

dds_topic_12_sub_thread = sub_0.dds_topic_12Reader("dds_topic_12", lock, connector)
dds_topic_12_sub_thread.start()
dds_topic_3_pub_thread = pub_0.dds_topic_3Writer("dds_topic_3", lock, connector)
dds_topic_3_pub_thread.start()

while True:
	pass
