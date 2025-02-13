package org.example.com.PipedStreams.Inter_ThreadCommunication;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

//main class
public class Main {
        public static void main(String[] args) {
            //try block
            try {
                PipedOutputStream pos = new PipedOutputStream();
                //connect streams
                PipedInputStream pis = new PipedInputStream(pos);

                //create and start threads
                WriterThread writer = new WriterThread(pos);
                ReaderThread reader = new ReaderThread(pis);

                writer.start();
                reader.start();
            }
            //catch block to handle the exception
            catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


