package org.example.com.CustomAnnotations.AdvancedLevel.CustomSerialization;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

//JsonSerializer class
public class JsonSerializer {
    public static String toJson(Object obj) {
        try {
            Map<String, String> jsonMap = new HashMap<>();
            Class<?> cls = obj.getClass();

            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);

                if (field.isAnnotationPresent(JsonField.class)) {
                    JsonField annotation = field.getAnnotation(JsonField.class);
                    String key = annotation.name();
                    String value = field.get(obj).toString();
                    jsonMap.put(key, value);
                }
            }

            //Convert map to JSON string format
            StringBuilder json = new StringBuilder("{");
            for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
                json.append("\"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\", ");
            }

            if (json.length() > 1) {
                //remove last comma
                json.delete(json.length() - 2, json.length());
            }
            json.append("}");

            return json.toString();
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Error during serialization", e);
        }
    }
}
