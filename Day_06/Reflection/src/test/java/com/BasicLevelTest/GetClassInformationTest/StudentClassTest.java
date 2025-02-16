package com.BasicLevelTest.GetClassInformationTest;
import org.example.com.BasicLevel.GetClassInformation.StudentClass;
import org.junit.jupiter.api.Test;

import java.lang.reflect.*;

import static org.junit.jupiter.api.Assertions.*;

//Testing class
public class StudentClassTest {

    //Test class name
    @Test
    void testClassName(){
        Class<?> cls = StudentClass.class;
        assertEquals("StudentClass", cls.getSimpleName());
    }

    //Test constructor
    @Test
    void testConstructorExists() {
        Class<?> cls = StudentClass.class;
        Constructor<?>[] constructors = cls.getConstructors();
        assertTrue(constructors.length > 0);
    }

    //Test fields
    @Test
    void testFieldsExist() {
        Class<?> cls = StudentClass.class;
        Field[] fields = cls.getDeclaredFields();
        assertTrue(fields.length > 0);
    }

    //Test method exist or not
    @Test
    void testMethodsExist() {
        Class<?> cls = StudentClass.class;
        Method[] methods = cls.getDeclaredMethods();
        assertTrue(methods.length > 0);
    }
}