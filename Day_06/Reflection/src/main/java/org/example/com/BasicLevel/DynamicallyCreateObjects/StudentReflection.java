package org.example.com.BasicLevel.DynamicallyCreateObjects;

import java.lang.reflect.Constructor;

public class StudentReflection {
    public static void main(String[] args) throws Exception{

            //get Student class
            Class<?> studentClass = Class.forName("org.example.com.BasicLevel.DynamicallyCreateObjects.Student");

            //get constructor
            Constructor<?> constructor = studentClass.getDeclaredConstructor(String.class);

            //create object dynamically without 'new' keyword
            Object studentObj = constructor.newInstance("Subhashree");

            //display method using Reflection
            Student student = (Student) studentObj;
            student.display();

    }
}

