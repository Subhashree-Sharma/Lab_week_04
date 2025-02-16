package com.BasicLevel.DynamicallyCreateObjectsTest;

import org.example.com.BasicLevel.DynamicallyCreateObjects.Student;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Constructor;
import static org.junit.jupiter.api.Assertions.*;

//Testing class
class StudentTest {

    @Test
    void testDynamicallyCreateStudent() throws Exception {
        //Get Student class
        Class<?> studentClass = Class.forName("org.example.com.BasicLevel.DynamicallyCreateObjects.Student");

        //Get constructor
        Constructor<?> constructor = studentClass.getDeclaredConstructor(String.class);

        //create object dynamically
        Object studentObj = constructor.newInstance("Subha");

        //verify object
        Student student = (Student) studentObj;
        assertEquals("Subha", student.getName());
    }
}
