package org.example.com.CustomAnnotations.BeginnerLevel.CreateAnAnnotationToMarkImpMethods;
import java.lang.reflect.Method;

//Main class
public class ImportantMethodReader {
    public static void main(String[] args) {
        Class<?> cls = TaskProcessor.class;

        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Important Method: " + method.getName() + ", Level: " + annotation.level());
            }
        }
    }
}

