package org.example.com.InsurancePolicyManagement_Map;
import java.time.LocalDate;

//main class
public class InsuranceSystem {
    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        //Adding policies
        manager.addPolicy(new Policy("P1001", "Alice", LocalDate.now().plusDays(20)));
        manager.addPolicy(new Policy("P1002", "Bob", LocalDate.now().plusDays(40)));
        manager.addPolicy(new Policy("P1003", "Alice", LocalDate.now().plusDays(10)));
        manager.addPolicy(new Policy("P1004", "Charlie", LocalDate.now().minusDays(5)));

        //display all policies
        System.out.println("All Policies:");
        manager.displayPolicies();

        //get a policy by number
        System.out.println("\nPolicy P1001: " + manager.getPolicy("P1001"));

        //List policies expiring in 30 days
        System.out.println("\nPolicies expiring in the next 30 days:");
        for (Policy policy : manager.getExpiringPolicies()) {
            System.out.println(policy);
        }

        //List policies for Alice
        System.out.println("\nPolicies for Alice:");
        for (Policy policy : manager.getPoliciesByHolder("Alice")) {
            System.out.println(policy);
        }

        //remove expired policies and display remaining policies
        manager.removeExpiredPolicies();
        System.out.println("\nPolicies after removing expired ones:");
        manager.displayPolicies();
    }
}
