package org.example.com.PipedStreams.ReadALargeFileLineByLine;
import java.io.*;

//ReadLargeFile class
public class ReadLargeFile{
        public static void main(String[] args) {
            //filepath
            String filePath = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week04\\Day_03\\src\\main\\java\\org\\example\\com\\PipedStreams\\ReadALargeFileLineByLine\\1mb-examplefile-com.txt";

            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;

                //Read line by line
                while ((line = br.readLine()) != null) {
                    //Case-insensitive check
                    if (line.toLowerCase().contains("error")) {
                        //print matching lines
                        System.out.println(line);
                    }
                }
            }//handle exception using catch block
            catch (IOException e) {
                System.out.println("Error reading file -> " + e.getMessage());
            }
        }
    }

