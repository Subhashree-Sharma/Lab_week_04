package org.example.com.IntermediateLevel.AccessAndModifyStaticFields;
//Configuration class
public class Configuration {
    private static String API_KEY = "DEFAULT_KEY";

    //getter method for testing
    public static String getApiKey() {
        return API_KEY;
    }
}

