package org.example.com.AdvancedLevel.CreateACustomObjectMapper;

 import java.util.HashMap;
 import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            //create a map with property values
            Map<String, Object> properties = new HashMap<>();
            properties.put("name", "Subha");
            properties.put("age", 21);
            properties.put("isEmployed", true);

            //convert Map to Person object using ObjectMapper
            Person person = ObjectMapper.toObject(Person.class, properties);

            //print created object
            System.out.println(person);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Employed: " + person.isEmployed());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
