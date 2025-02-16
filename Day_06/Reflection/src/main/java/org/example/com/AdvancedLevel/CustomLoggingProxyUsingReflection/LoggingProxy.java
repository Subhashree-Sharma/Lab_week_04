package org.example.com.AdvancedLevel.CustomLoggingProxyUsingReflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//LoggingProxy class
public class LoggingProxy {

    //real implementation of Greeting
    private static class GreetingImpl implements Greeting {
        @Override
        public String sayHello(String name) {
            return "Hello, " + name + "!";
        }
    }

    //method to create a proxy with logging
    public static Greeting createProxy() {
        //create original object
        Greeting target = new GreetingImpl();

        return (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class<?>[]{Greeting.class},
                new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("Logging: Invoking method -> " + method.getName());
                    //call original method
                    return method.invoke(target, args);
                    }
                }
        );
    }

    //main method
    public static void main(String[] args) {
        Greeting proxy = createProxy();
        String response = proxy.sayHello("Subhashree");
        System.out.println("Response: " + response);
    }
}
