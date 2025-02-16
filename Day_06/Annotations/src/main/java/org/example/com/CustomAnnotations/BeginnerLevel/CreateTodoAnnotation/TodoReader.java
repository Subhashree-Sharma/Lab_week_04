package org.example.com.CustomAnnotations.BeginnerLevel.CreateTodoAnnotation;
import java.lang.reflect.Method;

//Main class
public class TodoReader {
    public static void main(String[] args) {
        Class<?> cls = TaskManager.class;

        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo annotation = method.getAnnotation(Todo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("  Task: " + annotation.task());
                System.out.println("  Assigned To: " + annotation.assignedTo());
                System.out.println("  Priority: " + annotation.priority());
                System.out.println(" ");
            }
        }
    }
}
