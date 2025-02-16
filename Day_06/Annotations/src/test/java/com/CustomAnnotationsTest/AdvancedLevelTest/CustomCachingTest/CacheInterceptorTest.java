package com.CustomAnnotationsTest.AdvancedLevelTest.CustomCachingTest;
import org.example.com.CustomAnnotations.AdvancedLevel.CustomCaching.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Testing class
public class CacheInterceptorTest {

    @Test
    public void testCacheInterceptor() {
        //Create instance and proxy
        ExpensiveComputation computation = new ExpensiveComputationImpl();
        ExpensiveComputation proxy = CacheInterceptor.createProxy(computation, ExpensiveComputation.class);

        //First call should compute normally
        int firstCall = proxy.computeFactorial(5);
        assertEquals(120, firstCall, "Factorial of 5 should be 120");

        //Second call should return cached result
        int secondCall = proxy.computeFactorial(5);
        assertEquals(120, secondCall, "Factorial of 5 should be cached and still 120");

        //Call with a new input (should compute)
        int thirdCall = proxy.computeFactorial(6);
        assertEquals(720, thirdCall, "Factorial of 6 should be 720");

        //checking if cache is working for 6
        int fourthCall = proxy.computeFactorial(6);
        assertEquals(720, fourthCall, "Factorial of 6 should be cached and still 720");
    }
}

