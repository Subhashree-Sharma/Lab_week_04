package com.CustomAnnotationsTest.AdvancedLevelTest.CustomSerializationTest;
import org.example.com.CustomAnnotations.AdvancedLevel.CustomSerialization.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Testing class
public class JsonSerializerTest {

    @Test
    public void testJsonSerialization() {
        User user = new User("henry", 30, "Ignored");

        String json = JsonSerializer.toJson(user);
        String expectedJson = "{\"user_name\": \"henry\", \"user_age\": \"30\"}";

        assertEquals(expectedJson, json, "JSON output should match expected format");
    }
}
