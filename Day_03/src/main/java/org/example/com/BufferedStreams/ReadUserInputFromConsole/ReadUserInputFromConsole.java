package org.example.com.BufferedStreams.ReadUserInputFromConsole;
import java.io.*;

//main class
public class ReadUserInputFromConsole {
    public static void main(String[] args) {
        //file to save user data
        String fileName = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week04\\Day_03\\src\\main\\java\\org\\example\\com\\BufferedStreams\\ReadUserInputFromConsole\\user_info.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(fileName, true)) {

            //Taking name, age and lang as input
            System.out.print("Enter your name -> ");
            String name = reader.readLine();

            System.out.print("Enter your age -> ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language -> ");
            String language = reader.readLine();

            //write in file
            writer.write("Name- " + name + "\n");
            writer.write("Age- " + age + "\n");
            writer.write("your favorite Programming Language- " + language + "\n");

            System.out.println("Information saved successfully in " + fileName);

        }//catch block to handle exception
        catch (IOException e) {
            System.out.println("Error - " + e.getMessage());
        }
    }
}
