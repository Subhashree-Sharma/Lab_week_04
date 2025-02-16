package org.example.com.CustomAnnotations.IntermediateLevel.MaxLength;
import java.lang.annotation.*;

//available at runtime
@Retention(RetentionPolicy.RUNTIME)
// Can be applied to fields
@Target(ElementType.FIELD)
public @interface MaxLength {
    //defines the max length
    int value();
}
