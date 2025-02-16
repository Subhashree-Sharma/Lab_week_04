package org.example.com.AdvancedLevel.GenerateAJSONRepresentation;
import java.lang.reflect.Field;

//JsonConverter class
public class JsonConverter {
    public static String toJson(Object obj) {
        //handle null objects
        if (obj == null) return "{}";

        StringBuilder json = new StringBuilder("{");

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            //allow access to private fields
            field.setAccessible(true);

            try {
                Object value = field.get(obj);
                json.append("\"").append(field.getName()).append("\": ");

                if (value instanceof String) {
                    //add quotes for strings
                    json.append("\"").append(value).append("\"");
                } else {
                    //directly append numbers & booleans
                    json.append(value);
                }

                if (i < fields.length - 1) {
                    json.append(", ");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        json.append("}");

        return json.toString();
    }

    //main method
    public static void main(String[] args) {
        Person person = new Person("Subha", 21, true);
        String json = toJson(person);
        System.out.println(json);
    }
}
