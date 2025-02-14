package org.example.com.TryWithResources_AutoClosingResources;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//main class
public class AutoClosingResources {
    public static void main(String[] args) {

        //filePath
        String fileName = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week04\\Day_04\\src\\main\\java\\org\\example\\com\\TryWithResources_AutoClosingResources\\file";

        //Try block
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            //reading single line
            String firstLine = br.readLine();
            System.out.println("Text File first line - " + firstLine);
        }
        //Handling exception
        catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
