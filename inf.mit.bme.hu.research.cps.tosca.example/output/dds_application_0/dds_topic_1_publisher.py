from dds_threads import WriterThread

class dds_topic_1Writer(WriterThread):

	def produce_data(self, output):
		print(self.topic_name + " data sent")
		
