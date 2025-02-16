package com.BasicLevel.AccessPrivateFieldTest;
import org.example.com.BasicLevel.AccessPrivateField.*;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

//Testing class
class PersonTest {

    //testing modified age
    @Test
    void testModifyPrivateField() throws Exception {
        //Created a Person object
        Person person = new Person(25);

        //using reflection for private field
        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true);

        //modify the field
        ageField.set(person, 35);

        //Verify modified value
        assertEquals(35, person.getAge());
    }
}

