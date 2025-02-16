package org.example.com.ExerciseProblems.CreateACustomAnnotationAndUseIt;
import java.lang.reflect.Method;

//TaskAnnotationReader class
public class TaskAnnotationReader {
    public static void main(String[] args) throws Exception {
        Class<?> cls = TaskManager.class;

        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
                System.out.println(" ");
            }
        }
    }
}
