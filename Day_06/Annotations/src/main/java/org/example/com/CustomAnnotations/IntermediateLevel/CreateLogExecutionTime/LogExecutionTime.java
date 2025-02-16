package org.example.com.CustomAnnotations.IntermediateLevel.CreateLogExecutionTime;

import java.lang.annotation.*;

//available at runtime
@Retention(RetentionPolicy.RUNTIME)
//can be applied to methods
@Target(ElementType.METHOD)
public @interface LogExecutionTime {
}

