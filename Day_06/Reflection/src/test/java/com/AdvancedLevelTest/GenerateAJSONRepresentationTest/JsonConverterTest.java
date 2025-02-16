package com.AdvancedLevelTest.GenerateAJSONRepresentationTest;
import org.example.com.AdvancedLevel.GenerateAJSONRepresentation.JsonConverter;
import org.example.com.AdvancedLevel.GenerateAJSONRepresentation.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//JsonConverterTest class
class JsonConverterTest {

    @Test
    void testJsonConversion() {
        Person person = new Person("Subha", 21, true);
        String expectedJson = "{\"name\": \"Subha\", \"age\": 21, \"isEmployed\": true}";

        String actualJson = JsonConverter.toJson(person);

        assertEquals(expectedJson, actualJson);
    }

    @Test
    void testJsonConversionWithNullObject() {
        String expectedJson = "{}";
        String actualJson = JsonConverter.toJson(null);

        assertEquals(expectedJson, actualJson);
    }
}
