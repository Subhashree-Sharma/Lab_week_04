package com.AdvancedLevelTest.CreateACustomObjectMapperTest;
import org.example.com.AdvancedLevel.CreateACustomObjectMapper.ObjectMapper;
import org.example.com.AdvancedLevel.CreateACustomObjectMapper.Person;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

//ObjectMapperTest class
class ObjectMapperTest {

    @Test
    void testToObjectMapping() throws Exception {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Subha");
        properties.put("age", 21);
        properties.put("isEmployed", true);

        Person person = ObjectMapper.toObject(Person.class, properties);

        assertNotNull(person);
        assertEquals("Subha", person.getName());
        assertEquals(21, person.getAge());
        assertTrue(person.isEmployed());
    }

    @Test
    void testToObjectWithMissingFields() throws Exception{
        Map<String, Object> properties = new HashMap<>();
        //age and isEmployed are missing
        properties.put("name", "Riya");

        Person person = ObjectMapper.toObject(Person.class, properties);

        assertNotNull(person);
        assertEquals("Riya", person.getName());
        //default int value
        assertEquals(0, person.getAge());
        //default boolean value
        assertFalse(person.isEmployed());
    }
}
