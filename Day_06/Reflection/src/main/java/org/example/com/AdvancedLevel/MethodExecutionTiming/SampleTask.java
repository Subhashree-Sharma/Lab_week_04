package org.example.com.AdvancedLevel.MethodExecutionTiming;

//SampleTask class
public class SampleTask {
    public void performTask() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task Completed.");
    }

    public void quickTask() {
        System.out.println("Quick Task Done.");
    }
}

