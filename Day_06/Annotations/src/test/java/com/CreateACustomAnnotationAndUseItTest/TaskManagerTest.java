package com.CreateACustomAnnotationAndUseItTest;

import org.example.com.ExerciseProblems.CreateACustomAnnotationAndUseIt.TaskInfo;
import org.example.com.ExerciseProblems.CreateACustomAnnotationAndUseIt.TaskManager;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

//Testing class
public class TaskManagerTest {

    @Test
    public void testTaskInfoAnnotation() throws Exception {
        Class<?> cls = TaskManager.class;
        Method method = cls.getDeclaredMethod("completeTask");

        assertTrue(method.isAnnotationPresent(TaskInfo.class), "Annotation should be present");

        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
        assertEquals("High", taskInfo.priority(), "Priority should be High");
        assertEquals("Subhashree", taskInfo.assignedTo(), "Assigned person should be Subhashree");
    }
}
