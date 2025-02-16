package org.example.com.AdvancedLevel.MethodExecutionTiming;
import java.lang.reflect.Method;

//ExecutionTimer class
public class ExecutionTimer {
    public static void measureExecutionTime(Object obj, String methodName, Object... args) {
        try {
            //get method by name and parameter types
            Method method = obj.getClass().getMethod(methodName);

            //measure execution time
            long startTime = System.nanoTime();
            method.invoke(obj, args);
            long endTime = System.nanoTime();

            //calculate execution duration
            long duration = endTime - startTime;
            System.out.println("Execution time of " + methodName + ": " + duration + " nanoseconds");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

