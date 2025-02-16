package org.example.com.AdvancedLevel.DependencyInjectionUsingReflection;

import java.lang.reflect.Field;

//dependency Injection Container
public class DIContainer {

    //performs dependency injection
    public static void injectDependencies(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                Class<?> fieldType = field.getType();

                //if the field type is an interface, find a concrete implementation
                Object dependency;
                if (fieldType.isInterface()) {
                    if (fieldType.equals(Service.class)) {
                        //inject ServiceImpl when Service is required
                        dependency = new ServiceImpl();
                    } else {
                        throw new RuntimeException("No implementation found for interface: " + fieldType.getName());
                    }
                } else {
                    //create instance dynamically
                    dependency = fieldType.getDeclaredConstructor().newInstance();
                }

                //allow setting private fields
                field.setAccessible(true);
                field.set(obj, dependency);
            }
        }
    }

    //main method
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        //inject dependencies dynamically
        injectDependencies(client);
        //call method that uses injected service
        client.performTask();
    }
}
