package org.example.com.CustomAnnotations.BeginnerLevel.CreateAnAnnotationToMarkImpMethods;

//TaskProcessor class
public class TaskProcessor {

    @ImportantMethod(level = "HIGH")
    public void processCriticalTask() {
        System.out.println("Processing a HIGH-priority task...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void processNormalTask() {
        System.out.println("Processing a MEDIUM-priority task...");
    }

    //helper method
    public void helperMethod() {
        System.out.println("This is a normal method, not marked as important.");
    }
}
