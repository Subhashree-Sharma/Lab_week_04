package org.example.com.DataStreams_StoreAndRetrievePrimitiveData;
import java.io.*;
import java.util.Scanner;

//main class
public class HandleStudentData {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Taking filename as input
            System.out.print("Enter file name to store student data -");
            String fileName = scanner.nextLine();

            try {
                //writing student data to file
                FileOutputStream fos = new FileOutputStream(fileName, true);
                DataOutputStream dos = new DataOutputStream(fos);

                //Taking roll_no, name and gpa as input
                System.out.print("Enter Roll Number -> ");
                int rollNumber = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Name -> ");
                String name = scanner.nextLine();

                System.out.print("Enter GPA -> ");
                double gpa = scanner.nextDouble();

                dos.writeInt(rollNumber);
                dos.writeUTF(name);
                dos.writeDouble(gpa);
                dos.close();

                System.out.println("\nStudent data is saved successfully");

                //reading student data from file
                FileInputStream fis = new FileInputStream(fileName);
                DataInputStream dis = new DataInputStream(fis);

                System.out.println("\nStudent Records -> ");
                while (dis.available() > 0) {
                    int roll = dis.readInt();
                    String studentName = dis.readUTF();
                    double studentGpa = dis.readDouble();
                    System.out.println("Roll No: " + roll + ", Name: " + studentName + ", GPA: " + studentGpa);
                }
                dis.close();

            }//catch block to handle exception
            catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

            scanner.close();
        }
    }
