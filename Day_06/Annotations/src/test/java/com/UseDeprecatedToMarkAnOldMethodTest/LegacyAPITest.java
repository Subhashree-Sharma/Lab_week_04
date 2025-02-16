package com.UseDeprecatedToMarkAnOldMethodTest;
import org.example.com.ExerciseProblems.UseDeprecatedToMarkAnOldMethod.LegacyAPI;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Testing class
public class LegacyAPITest {

    @Test
    public void testNewFeature() {
        LegacyAPI api = new LegacyAPI();
        //should not throw an error
        assertDoesNotThrow(api::newFeature);
    }

    @Test
    //suppress warning for deprecated method
    @SuppressWarnings("deprecation")
    public void testOldFeature() {
        LegacyAPI api = new LegacyAPI();
        //deprecated but should still run
        assertDoesNotThrow(api::oldFeature);
    }
}


