package org.example.com.BasicLevel.GetClassInformation;

//StudentClass
public class StudentClass {
    String studentName;

    //Constructor
    public StudentClass(String studentName){
        this.studentName = studentName;
    }

    //Display name
    public void display() {
        System.out.println("Student Name: " + studentName);
    }
}