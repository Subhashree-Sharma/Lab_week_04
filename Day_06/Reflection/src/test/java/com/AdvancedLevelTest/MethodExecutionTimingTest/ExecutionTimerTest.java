package com.AdvancedLevelTest.MethodExecutionTimingTest;
import org.example.com.AdvancedLevel.MethodExecutionTiming.SampleTask;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

//ExecutionTimerTest class
class ExecutionTimerTest {

    @Test
    void testExecutionTimeMeasurement() {
        SampleTask task = new SampleTask();

        long startTime = System.nanoTime();
        task.performTask();
        long endTime = System.nanoTime();

        long measuredTime = endTime - startTime;

        //ensuring execution time is reasonable -> greater than 1 second due to sleep
        assertTrue(measuredTime >= 1_000_000_000L, "Execution time should be at least 1 second.");
    }
}
