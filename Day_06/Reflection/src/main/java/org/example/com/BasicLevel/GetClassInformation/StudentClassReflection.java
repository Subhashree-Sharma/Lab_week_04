package org.example.com.BasicLevel.GetClassInformation;

import java.lang.reflect.*;

//StudentClassReflection class
public class StudentClassReflection {
    public static void main(String[] args) throws Exception {

            //Getting class name
            Class<?> cls = StudentClass.class;

            System.out.println("Class-> " + cls.getSimpleName());

            //get Constructors
            System.out.println("\nConstructors:");
            for (Constructor<?> constructor : cls.getConstructors()) {
                System.out.println(constructor);
            }

            //get Fields
            System.out.println("\nFields:");
            for (Field field : cls.getDeclaredFields()) {
                System.out.println(field.getName() + " : " + field.getType().getSimpleName());
            }

            //Get Methods
            System.out.println("\nMethods:");
            for (Method method : cls.getDeclaredMethods()) {
                System.out.println(method.getName() + "()");
            }

    }
}



