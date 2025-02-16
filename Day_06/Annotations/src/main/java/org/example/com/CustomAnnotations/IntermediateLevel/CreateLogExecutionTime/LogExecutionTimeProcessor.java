package org.example.com.CustomAnnotations.IntermediateLevel.CreateLogExecutionTime;

//main class
public class LogExecutionTimeProcessor {
    public static void main(String[] args) {
        PerformanceTester tester = new PerformanceTester();

        ExecutionLogger.measureExecutionTime(tester, "fastMethod");
        ExecutionLogger.measureExecutionTime(tester, "slowMethod");
    }
}
