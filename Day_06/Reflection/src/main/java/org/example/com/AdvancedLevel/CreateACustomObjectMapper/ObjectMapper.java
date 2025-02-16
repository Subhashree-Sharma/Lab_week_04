package org.example.com.AdvancedLevel.CreateACustomObjectMapper;
import java.lang.reflect.Field;
import java.util.Map;

//ObjectMapper class
public class ObjectMapper{
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception{
            //create a new instance of the class
            T instance = clazz.getDeclaredConstructor().newInstance();

            //iterate over the properties map
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                    //get the field by name
                    Field field = clazz.getDeclaredField(fieldName);
                   //allow modification of private fields
                    field.setAccessible(true);

                    //handle primitive type conversion
                    Object convertedValue = convertType(field.getType(), fieldValue);

                    //set field value
                    field.set(instance, convertedValue);

            }
            return instance;
    }

    private static Object convertType(Class<?> targetType, Object value) {
        if (value == null) return null;

        if (targetType.isAssignableFrom(value.getClass())) {
            return value;
        }

        //convert common types
        if (targetType == int.class || targetType == Integer.class) {
            return Integer.parseInt(value.toString());
        } else if (targetType == double.class || targetType == Double.class) {
            return Double.parseDouble(value.toString());
        } else if (targetType == boolean.class || targetType == Boolean.class) {
            return Boolean.parseBoolean(value.toString());
        } else if (targetType == long.class || targetType == Long.class) {
            return Long.parseLong(value.toString());
        } else if (targetType == float.class || targetType == Float.class) {
            return Float.parseFloat(value.toString());
        }

        return value;
    }
}
