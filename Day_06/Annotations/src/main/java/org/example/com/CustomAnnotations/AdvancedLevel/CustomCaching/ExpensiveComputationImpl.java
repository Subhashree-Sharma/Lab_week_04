package org.example.com.CustomAnnotations.AdvancedLevel.CustomCaching;

//ExpensiveComputationImpl class
public class ExpensiveComputationImpl implements ExpensiveComputation {

    @CacheResult
    public int computeFactorial(int n) {
        System.out.println("Computing factorial for: " + n);
        if (n <= 1) return 1;
        return n * computeFactorial(n - 1);
    }
}
