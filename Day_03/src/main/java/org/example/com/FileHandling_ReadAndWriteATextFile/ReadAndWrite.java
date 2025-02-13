package org.example.com.FileHandling_ReadAndWriteATextFile;
import java.io.*;

//ReadAndWrite class
public class ReadAndWrite {
    public static void main(String[] args) {

        //source and destination files
        String sourceFile = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week04\\Day_03\\src\\main\\java\\org\\example\\com\\FileHandling_ReadAndWriteATextFile\\source.txt";
        String destinationFile = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week04\\Day_03\\src\\main\\java\\org\\example\\com\\FileHandling_ReadAndWriteATextFile\\destination.txt";

        copyFile(sourceFile, destinationFile);
    }

    //using method to copy file
    public static void copyFile(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int data;
            //Read one byte at a time
            while ((data = fis.read()) != -1) {
                //write to destination
                fos.write(data);
            }

            System.out.println("File is copied successfully");

        }
        //if file generate any error then these exception will handle it
        catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found");
        } catch (IOException e) {
            System.out.println("Error reading or writing file");
        }
    }
}


