package org.example.com.ExerciseProblems.CreateAndUseARepeatableAnnotation;
import java.lang.annotation.*;

//available at runtime
@Retention(RetentionPolicy.RUNTIME)
//can be applied to methods only
@Target(ElementType.METHOD)
//Make it repeatable
@Repeatable(BugReport.BugReports.class)
public @interface BugReport {
    String description();
    String reportedBy();

    //container annotation inside the same file
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface BugReports {
        BugReport[] value();
    }
}
