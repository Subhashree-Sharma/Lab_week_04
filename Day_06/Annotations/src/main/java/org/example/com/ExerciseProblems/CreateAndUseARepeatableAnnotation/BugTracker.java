package org.example.com.ExerciseProblems.CreateAndUseARepeatableAnnotation;

//BugTracker class
public class BugTracker {

    @BugReport(description = "NullPointerException occurs when input is null", reportedBy = "Subhashree")
    @BugReport(description = "ArrayIndexOutOfBoundsException in edge cases", reportedBy = "Riya")
    public void buggyMethod() {
        System.out.println("Executing buggy method...");
    }
}

