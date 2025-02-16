package org.example.com.AdvancedLevel.CustomLoggingProxyUsingReflection;

import org.example.com.AdvancedLevel.DependencyInjectionUsingReflection.Client;
import org.example.com.AdvancedLevel.DependencyInjectionUsingReflection.Inject;

import java.lang.reflect.Field;

// Dependency Injection Container
public class DIContainer {

    // Performs dependency injection
    public static void injectDependencies(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                Class<?> fieldType = field.getType();
                Object dependency = fieldType.getDeclaredConstructor().newInstance(); // Create instance dynamically

                field.setAccessible(true); // Allow setting private fields
                field.set(obj, dependency);
            }
        }
    }

    // Main method to demonstrate DI
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        injectDependencies(client); // Inject dependencies dynamically
        client.performTask(); // Call method that uses injected service
    }
}

