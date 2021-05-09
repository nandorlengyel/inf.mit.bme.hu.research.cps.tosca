from dds_threads import ReaderThread

class dds_topic_5Reader(ReaderThread):

	def process_data(self, sample):
		print(self.topic_name + " data received: ")
		print(sample.get_dictionary())

