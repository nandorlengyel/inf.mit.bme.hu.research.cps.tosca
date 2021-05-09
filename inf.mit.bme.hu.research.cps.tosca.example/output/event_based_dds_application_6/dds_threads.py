import abc
from abc import ABCMeta
import threading
from time import sleep
import rticonnextdds_connector as rti

class ReaderThread(threading.Thread, metaclass=ABCMeta):

    def __init__(self, topic_name, lock, connector):

        self.topic_name = topic_name
        self.lock = lock
        self.connector = connector

        self.subscriber_name = topic_name + "Subscriber"
        self.data_reader_name = topic_name + "Reader"

        threading.Thread.__init__(self, target=self.read_data, name=self.subscriber_name, daemon=True)
          

    def read_data(self):
        while True :
            with self.lock: # Protect access to methods on the same Connector
                input = self.connector.get_input(self.subscriber_name + "::" + self.data_reader_name)

            input.wait() # wait outside the lock

            with self.lock: # Take the lock again
                input.take()
                for sample in input.samples.valid_data_iter:
                    self.process_data(sample)

    @abc.abstractmethod
    def process_data(self, sample):
        """Method documentation"""
        return

class WriterThread(threading.Thread, metaclass=ABCMeta):

    def __init__(self, topic_name, lock, connector):
      
        self.topic_name = topic_name
        self.lock = lock
        self.connector = connector

        self.publisher_name = topic_name + "Publisher"
        self.data_writer_name = topic_name + "Writer"

        threading.Thread.__init__(self, target=self.write_data, name=self.publisher_name, daemon=True)         

    def write_data(self):
        while True :
            with self.lock: # Protect access to methods on the same Connector                 
                output = self.connector.get_output(self.publisher_name + "::" + self.data_writer_name)        
                self.produce_data(output)          
                output.write()
            sleep(2)

    @abc.abstractmethod
    def produce_data(self, output):
        """Method documentation"""
        return

