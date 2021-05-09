#!/usr/bin/python3
import dds_topic_5_publisher as pub_0

import rticonnextdds_connector as rti
import threading
import os
from time import sleep

connector = rti.Connector("dds_application_3ParticipantLibrary::dds_application_3Participant", "ParticipantDescriptor.xml")
lock = threading.RLock()

dds_topic_5_pub_thread = pub_0.dds_topic_5Writer("dds_topic_5", lock, connector)
dds_topic_5_pub_thread.start()

while True:
	pass
