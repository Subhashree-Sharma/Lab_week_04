package com.AdvancedLevelTest.DependencyInjectionUsingReflectionTest;
import org.example.com.AdvancedLevel.DependencyInjectionUsingReflection.Client;
import org.example.com.AdvancedLevel.DependencyInjectionUsingReflection.DIContainer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//DIContainerTest class
class DIContainerTest {

    @Test
    void testDependencyInjection() throws Exception {
        Client client = new Client();
        DIContainer.injectDependencies(client);

        //ensures the service is injected
        assertNotNull(client.getService());
    }
}
