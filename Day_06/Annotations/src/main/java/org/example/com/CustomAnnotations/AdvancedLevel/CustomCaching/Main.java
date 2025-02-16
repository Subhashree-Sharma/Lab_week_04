package org.example.com.CustomAnnotations.AdvancedLevel.CustomCaching;

//main class
public class Main {
    public static void main(String[] args) {
        ExpensiveComputation computation = new ExpensiveComputationImpl();
        ExpensiveComputation proxy = CacheInterceptor.createProxy(computation, ExpensiveComputation.class);

        //computation happens
        System.out.println(proxy.computeFactorial(5));
        //cached result is returned
        System.out.println(proxy.computeFactorial(5));
        //computation happens for new input
        System.out.println(proxy.computeFactorial(6));
    }
}


