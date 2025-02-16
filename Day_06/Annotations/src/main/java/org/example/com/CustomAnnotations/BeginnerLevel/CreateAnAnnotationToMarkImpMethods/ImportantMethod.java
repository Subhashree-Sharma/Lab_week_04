package org.example.com.CustomAnnotations.BeginnerLevel.CreateAnAnnotationToMarkImpMethods;
import java.lang.annotation.*;

//available at runtime
@Retention(RetentionPolicy.RUNTIME)
//can be applied to methods
@Target(ElementType.METHOD)
public @interface ImportantMethod {
    //optional parameter with default value
    String level() default "HIGH";
}
