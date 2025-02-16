package org.example.com.CustomAnnotations.AdvancedLevel.CustomSerialization;

import java.lang.annotation.*;

//Available at runtime
@Retention(RetentionPolicy.RUNTIME)
//Can be applied to fields
@Target(ElementType.FIELD)
public @interface JsonField {
    // Custom JSON field name
    String name();
}
