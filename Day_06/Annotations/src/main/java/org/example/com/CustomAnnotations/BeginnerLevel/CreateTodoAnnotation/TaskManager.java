package org.example.com.CustomAnnotations.BeginnerLevel.CreateTodoAnnotation;

//TaskManager class
public class TaskManager {

    @Todo(task = "Implement user authentication", assignedTo = "Alice", priority = "HIGH")
    public void implementAuth() {
        System.out.println("Implementing authentication...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDB() {
        System.out.println("Optimizing database queries...");
    }

    @Todo(task = "Improve UI responsiveness", assignedTo = "Charlie", priority = "LOW")
    public void improveUI() {
        System.out.println("Improving UI responsiveness...");
    }
}

