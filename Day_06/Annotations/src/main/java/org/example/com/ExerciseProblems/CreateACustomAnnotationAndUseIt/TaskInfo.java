package org.example.com.ExerciseProblems.CreateACustomAnnotationAndUseIt;
import java.lang.annotation.*;

//annotation is available at runtime
@Retention(RetentionPolicy.RUNTIME)
//can be applied only to methods
@Target(ElementType.METHOD)
public @interface TaskInfo {

    //priority field (e.g., "High", "Medium", "Low")
    String priority();

    //person assigned to the task
    String assignedTo();
}

