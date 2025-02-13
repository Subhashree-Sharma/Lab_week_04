package org.example.com.BufferedStreams.EfficientFileCopy;
import java.io.*;

//main class
public class EfficientFileCopy {
    public static void main(String[] args) {

        //filepath
        String sourceFile = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week04\\Day_03\\src\\main\\java\\org\\example\\com\\BufferedStreams\\EfficientFileCopy\\1mb-examplefile-com.txt";
        String buffered = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week04\\Day_03\\src\\main\\java\\org\\example\\com\\BufferedStreams\\EfficientFileCopy\\buffered_copy.txt";
        String unbuffered = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week04\\Day_03\\src\\main\\java\\org\\example\\com\\BufferedStreams\\EfficientFileCopy\\unbuffered_copy.txt";

        //copy using Buffered Streams
        long bufferedTime = copyFileBuffered(sourceFile, buffered);
        System.out.println("Buffered Copy Time: " + bufferedTime + " nanoseconds");

        //copy using Unbuffered Streams
        long unbufferedTime = copyFileUnbuffered(sourceFile, unbuffered);
        System.out.println("Unbuffered Copy Time: " + unbufferedTime + " nanoseconds");

        //Time difference
        System.out.println("\nBuffered Copy is " + (unbufferedTime / (double) bufferedTime) + " times faster");
    }

    //buffered Copy - this is faster
    public static long copyFileBuffered(String source, String destination) {
        long startTime = System.nanoTime();

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            //buffer array - 4kb
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //return execution time
        return System.nanoTime() - startTime;
    }

    // Unbuffered Copy -> slower
    public static long copyFileUnbuffered(String source, String destination) {
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int data;
            // Reads one byte at a time -> very slow
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //return execution time
        return System.nanoTime() - startTime;
    }
}
