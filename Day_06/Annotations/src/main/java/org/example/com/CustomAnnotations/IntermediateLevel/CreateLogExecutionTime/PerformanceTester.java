package org.example.com.CustomAnnotations.IntermediateLevel.CreateLogExecutionTime;

//PerformanceTester class
public class PerformanceTester {

    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 1_000; i++) {}
        System.out.println("Fast method executed.");
    }

    @LogExecutionTime
    public void slowMethod() {
        try {
            //simulating delay
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Slow method executed.");
    }
}
