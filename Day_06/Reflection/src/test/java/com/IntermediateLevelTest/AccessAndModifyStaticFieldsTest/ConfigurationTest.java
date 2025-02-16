package com.IntermediateLevelTest.AccessAndModifyStaticFieldsTest;
import org.example.com.IntermediateLevel.AccessAndModifyStaticFields.Configuration;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

//Testing class
class ConfigurationTest {

    @Test
    void testModifyStaticField() throws Exception {
        //get Configuration class
        Class<?> configClass = Configuration.class;

        //get private static field API_KEY
        Field apiKeyField = configClass.getDeclaredField("API_KEY");

        //make it accessible
        apiKeyField.setAccessible(true);

        //modify static field value
        apiKeyField.set(null, "TEST_KEY");

        //verify updated value
        assertEquals("TEST_KEY", Configuration.getApiKey());
    }
}
