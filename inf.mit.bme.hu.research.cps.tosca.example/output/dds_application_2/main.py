#!/usr/bin/python3
import dds_topic_4_publisher as pub_0

import rticonnextdds_connector as rti
import threading
import os
from time import sleep

connector = rti.Connector("dds_application_2ParticipantLibrary::dds_application_2Participant", "ParticipantDescriptor.xml")
lock = threading.RLock()

dds_topic_4_pub_thread = pub_0.dds_topic_4Writer("dds_topic_4", lock, connector)
dds_topic_4_pub_thread.start()

while True:
	pass
