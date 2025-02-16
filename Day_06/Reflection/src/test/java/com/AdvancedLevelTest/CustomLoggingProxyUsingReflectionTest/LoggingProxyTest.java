package com.AdvancedLevelTest.CustomLoggingProxyUsingReflectionTest;
import org.example.com.AdvancedLevel.CustomLoggingProxyUsingReflection.Greeting;
import org.example.com.AdvancedLevel.CustomLoggingProxyUsingReflection.LoggingProxy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//LoggingProxyTest class
class LoggingProxyTest {

    @Test
    void testProxyMethodInvocation() {
        Greeting proxy = LoggingProxy.createProxy();
        String result = proxy.sayHello("Riya");

        assertEquals("Hello, Riya!", result);
    }
}
