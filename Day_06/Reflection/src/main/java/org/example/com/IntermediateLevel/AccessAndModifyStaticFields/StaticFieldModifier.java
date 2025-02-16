package org.example.com.IntermediateLevel.AccessAndModifyStaticFields;
import java.lang.reflect.Field;

//main class
public class StaticFieldModifier {
    public static void main(String[] args) throws Exception{

            //get Configuration class
            Class<?> configClass = Configuration.class;

            //get private static field API_KEY
            Field apiKeyField = configClass.getDeclaredField("API_KEY");

            //make it accessible
            apiKeyField.setAccessible(true);

            //modify the static field value
            apiKeyField.set(null, "NEW_SECRET_KEY");

            //Print updated value
            System.out.println("Updated API_KEY: " + Configuration.getApiKey());

    }
}
