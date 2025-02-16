package org.example.com.ExerciseProblems.CreateAndUseARepeatableAnnotation;
import java.lang.reflect.Method;

//BugReportReader class
public class BugReportReader {
    //main method
    public static void main(String[] args) throws Exception {
        Class<?> cls = BugTracker.class;
        Method method = cls.getDeclaredMethod("buggyMethod");

        if (method.isAnnotationPresent(BugReport.BugReports.class)) {
            BugReport.BugReports bugReports = method.getAnnotation(BugReport.BugReports.class);
            for (BugReport bug : bugReports.value()) {
                System.out.println("Bug Description: " + bug.description());
                System.out.println("Reported By: " + bug.reportedBy());
                System.out.println(" ");
            }
        }
    }
}

