package com.CreateAndUseARepeatableAnnotationTest;
import org.example.com.ExerciseProblems.CreateAndUseARepeatableAnnotation.BugReport;
import org.example.com.ExerciseProblems.CreateAndUseARepeatableAnnotation.BugTracker;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

//Testing class
public class BugTrackerTest {

    @Test
    public void testBugReportAnnotation() throws Exception {
        Class<?> cls = BugTracker.class;
        Method method = cls.getDeclaredMethod("buggyMethod");

        assertTrue(method.isAnnotationPresent(BugReport.BugReports.class), "BugReports annotation should be present");

        BugReport.BugReports bugReports = method.getAnnotation(BugReport.BugReports.class);
        assertEquals(2, bugReports.value().length, "There should be 2 bug reports");

        assertEquals("NullPointerException occurs when input is null", bugReports.value()[0].description());
        assertEquals("Subhashree", bugReports.value()[0].reportedBy());

        assertEquals("ArrayIndexOutOfBoundsException in edge cases", bugReports.value()[1].description());
        assertEquals("Riya", bugReports.value()[1].reportedBy());
    }
}

