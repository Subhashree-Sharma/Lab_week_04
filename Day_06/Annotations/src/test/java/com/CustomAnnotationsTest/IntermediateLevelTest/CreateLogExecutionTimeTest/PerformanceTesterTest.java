package com.CustomAnnotationsTest.IntermediateLevelTest.CreateLogExecutionTimeTest;
import org.example.com.CustomAnnotations.IntermediateLevel.CreateLogExecutionTime.PerformanceTester;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

//Testing class
public class PerformanceTesterTest {

    @Test
    public void testFastMethodExecutionTime() {
        PerformanceTester tester = new PerformanceTester();
        long startTime = System.nanoTime();
        tester.fastMethod();
        long endTime = System.nanoTime();
        // Convert to ms
        long executionTime = (endTime - startTime) / 1_000_000;

        System.out.println("Fast method execution time: " + executionTime + " ms");
        assertTrue(executionTime < 5, "Fast method should execute quickly.");
    }

    @Test
    public void testSlowMethodExecutionTime() {
        PerformanceTester tester = new PerformanceTester();
        long startTime = System.nanoTime();
        tester.slowMethod();
        long endTime = System.nanoTime();
        // Convert to ms
        long executionTime = (endTime - startTime) / 1_000_000;

        System.out.println("Slow method execution time: " + executionTime + " ms");
        assertTrue(executionTime >= 200, "Slow method should take around 200 ms.");
    }
}
