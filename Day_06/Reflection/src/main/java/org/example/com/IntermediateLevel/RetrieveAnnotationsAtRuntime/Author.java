package org.example.com.IntermediateLevel.RetrieveAnnotationsAtRuntime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//keeping annotation available at runtime
@Retention(RetentionPolicy.RUNTIME)

//define custom annotation @Author with a name parameter
public @interface Author {
    String name();
}

