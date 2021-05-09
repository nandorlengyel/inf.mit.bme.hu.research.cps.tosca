#!/usr/bin/python3
import dds_topic_1_publisher as pub_0

import rticonnextdds_connector as rti
import threading
import os
from time import sleep

connector = rti.Connector("dds_application_0ParticipantLibrary::dds_application_0Participant", "ParticipantDescriptor.xml")
lock = threading.RLock()

dds_topic_1_pub_thread = pub_0.dds_topic_1Writer("dds_topic_1", lock, connector)
dds_topic_1_pub_thread.start()

while True:
	pass
