package org.example.com.CustomAnnotations.IntermediateLevel.CreateLogExecutionTime;
import java.lang.reflect.Method;

//ExecutionLogger class
public class ExecutionLogger {

    //Method to measure ExecutionTime
    public static void measureExecutionTime(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(obj);
                long endTime = System.nanoTime();
                //Convert to milliseconds
                long executionTime = (endTime - startTime) / 1_000_000;

                System.out.println("Method: " + methodName + " executed in " + executionTime + " ms");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
