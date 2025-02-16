package org.example.com.CustomAnnotations.BeginnerLevel.CreateTodoAnnotation;
import java.lang.annotation.*;

//available at runtime
@Retention(RetentionPolicy.RUNTIME)
//Can be applied to methods only
@Target(ElementType.METHOD)
public @interface Todo {
    String task();
    String assignedTo();
    //Default value
    String priority() default "MEDIUM";
}

