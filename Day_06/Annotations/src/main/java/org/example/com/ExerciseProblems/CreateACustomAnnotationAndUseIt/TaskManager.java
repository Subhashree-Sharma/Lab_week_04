package org.example.com.ExerciseProblems.CreateACustomAnnotationAndUseIt;

//TaskManager class
public class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Subhashree")
    public void completeTask() {
        System.out.println("Task completed successfully.");
    }
}
