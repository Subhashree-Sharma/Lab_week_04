package org.example.com.FilterStreams_ConvertUppercaseToLowercase;
import java.io.*;

//ConvertText class
public class ConvertText{
    //convert uppercase to lowercase
    public static void convertUppercaseToLowercase(String inputFile, String outputFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                //convert to lowercase
                writer.write(line.toLowerCase());
                //preserve line breaks
                writer.newLine();
            }
        }
    }
}
