package com.CustomAnnotationsTest.BeginnerLevelTest.CreateAnAnnotationToMarkImpMethodsTest;
import org.example.com.CustomAnnotations.BeginnerLevel.CreateAnAnnotationToMarkImpMethods.ImportantMethod;
import org.example.com.CustomAnnotations.BeginnerLevel.CreateAnAnnotationToMarkImpMethods.TaskProcessor;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

//Testing class
public class TaskProcessorTest {

    @Test
    public void testImportantMethodAnnotation() {
        Class<?> cls = TaskProcessor.class;
        int count = 0;

        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                count++;
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                assertNotNull(annotation.level(), "Annotation level should not be null");
            }
        }

        assertEquals(2, count, "Two methods should be marked as ImportantMethod");
    }
}

