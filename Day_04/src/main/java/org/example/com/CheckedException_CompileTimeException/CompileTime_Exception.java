package org.example.com.CheckedException_CompileTimeException;
import java.io.*;

public class CompileTime_Exception{
    public static void main(String[] args) {
        //filePath
        String filePath = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week04\\Day_04\\src\\main\\java\\org\\example\\com\\CheckedException_CompileTimeException\\file";

        try {
            //create a FileReader object
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            System.out.println("Content of the file is -> ");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            //close resources
            bufferedReader.close();
            fileReader.close();

        }
        //catch block to handle exceptions
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file");
        }
    }
}
