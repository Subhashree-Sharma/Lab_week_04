package org.example.com.ExerciseProblems.UseDeprecatedToMarkAnOldMethod;

public class LegacyAPI {

    //oldFeature method
    @Deprecated
    public void oldFeature() {
        System.out.println("Warning-> This is an old feature. Use newFeature()");
    }

    //newFeature method
    public void newFeature() {
        System.out.println("This is the new and improved feature.");
    }

    //main method
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        //calling the deprecated method should show a warning
        api.oldFeature();

        //calling the new method
        api.newFeature();
    }
}

