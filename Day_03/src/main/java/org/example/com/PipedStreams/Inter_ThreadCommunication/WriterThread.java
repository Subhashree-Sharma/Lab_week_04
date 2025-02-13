package org.example.com.PipedStreams.Inter_ThreadCommunication;
import java.io.*;

//WriterThread class
class WriterThread extends Thread {
    private PipedOutputStream pos;

    //constructor
    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    //run method
    public void run() {
        try {
            String message = "This message is from WriterThread";
            //write data as bytes
            pos.write(message.getBytes());
            //close stream after writing
            pos.close();
        } catch (IOException e) {
            System.out.println("Writer Error: " + e.getMessage());
        }
    }
}

//ReaderThread class
class ReaderThread extends Thread {
    private PipedInputStream pis;

    //constructor
    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    //run method
    public void run() {
        try {
            int data;
            System.out.print("Reader received -> ");

            //Read byte by byte
            while ((data = pis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
            pis.close(); // Close stream after reading
        } catch (IOException e) {
            System.out.println("Reader Error: " + e.getMessage());
        }
    }
}
