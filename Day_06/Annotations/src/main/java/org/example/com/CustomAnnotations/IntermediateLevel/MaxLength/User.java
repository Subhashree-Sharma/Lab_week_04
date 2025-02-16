package org.example.com.CustomAnnotations.IntermediateLevel.MaxLength;
import java.lang.reflect.Field;

//User class
public class User {

    //Max length allowed is 10
    @MaxLength(10)
    private String username;

    //constructor
    public User(String username) {
        validateMaxLength(this, username);
        this.username = username;
    }

    //get username
    public String getUsername() {
        return username;
    }

    //get valid max length
    private void validateMaxLength(Object obj, String value) {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                int maxLength = field.getAnnotation(MaxLength.class).value();
                if (value.length() > maxLength) {
                    throw new IllegalArgumentException(
                            "Error: Field '" + field.getName() + "' exceeds max length of " + maxLength);
                }
            }
        }
    }
}

