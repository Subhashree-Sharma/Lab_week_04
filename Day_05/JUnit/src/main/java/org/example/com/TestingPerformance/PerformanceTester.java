package org.example.com.TestingPerformance;

import java.util.concurrent.TimeUnit;


public class PerformanceTester {

    public String longRunningTask() {
        try {
            TimeUnit.SECONDS.sleep(3); // Simulates a delay of 3 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }
}
