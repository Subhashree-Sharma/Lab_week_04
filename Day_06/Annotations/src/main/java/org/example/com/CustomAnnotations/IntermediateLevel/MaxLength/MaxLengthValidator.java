package org.example.com.CustomAnnotations.IntermediateLevel.MaxLength;
import java.lang.reflect.Field;

//MaxLengthValidator class
public class MaxLengthValidator {
    public static void validate(Object obj) {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                field.setAccessible(true);
                try {
                    String value = (String) field.get(obj);
                    int maxLength = field.getAnnotation(MaxLength.class).value();
                    if (value.length() > maxLength) {
                        throw new IllegalArgumentException(
                                "Error: Field '" + field.getName() + "' exceeds max length of " + maxLength);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
