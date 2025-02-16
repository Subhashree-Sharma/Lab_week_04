package org.example.com.CustomAnnotations.AdvancedLevel.RoleBasedAccess;
import java.lang.annotation.*;

// Available at runtime
@Retention(RetentionPolicy.RUNTIME)
// Can be applied to methods
@Target(ElementType.METHOD)
public @interface RoleAllowed {
    //Defines the required role
    String value();
}
