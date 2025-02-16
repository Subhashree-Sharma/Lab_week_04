package com.CustomAnnotationsTest.BeginnerLevelTest.CreateTodoAnnotationTest;
import org.example.com.CustomAnnotations.BeginnerLevel.CreateTodoAnnotation.Todo;
import org.example.com.CustomAnnotations.BeginnerLevel.CreateTodoAnnotation.TaskManager;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

//Testing class
public class TaskManagerTest {

    @Test
    public void testTodoAnnotation() {
        Class<?> cls = TaskManager.class;
        int count = 0;

        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                count++;
                Todo annotation = method.getAnnotation(Todo.class);
                assertNotNull(annotation.task(), "Task should not be null");
                assertNotNull(annotation.assignedTo(), "AssignedTo should not be null");
                assertNotNull(annotation.priority(), "Priority should not be null");
            }
        }

        assertEquals(3, count, "Three methods should be marked with @Todo annotation");
    }
}
