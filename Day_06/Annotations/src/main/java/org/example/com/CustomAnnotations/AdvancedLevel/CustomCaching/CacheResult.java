package org.example.com.CustomAnnotations.AdvancedLevel.CustomCaching;
import java.lang.annotation.*;

// Available at runtime
@Retention(RetentionPolicy.RUNTIME)
// Can be applied to methods
@Target(ElementType.METHOD)
public @interface CacheResult {
}

