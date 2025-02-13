package org.example.com.FilterStreams_ConvertUppercaseToLowercase;
import java.io.IOException;

//main class
public class ConvertTextMain {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week04\\Day_03\\src\\main\\java\\org\\example\\com\\FilterStreams_ConvertUppercaseToLowercase\\input.txt";
        String outputFile = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week04\\Day_03\\src\\main\\java\\org\\example\\com\\FilterStreams_ConvertUppercaseToLowercase\\output.txt";

        try {
            ConvertText.convertUppercaseToLowercase(inputFile, outputFile);
            System.out.println("Conversion successful -> " + outputFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
