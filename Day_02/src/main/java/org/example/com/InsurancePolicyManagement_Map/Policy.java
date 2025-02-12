package org.example.com.InsurancePolicyManagement_Map;
import java.time.LocalDate;

//policy class
class Policy {
    String policyNumber;
    String policyHolder;
    LocalDate expiryDate;

    //constructor
    public Policy(String policyNumber, String policyHolder, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Policy{Number='" + policyNumber + "', Holder='" + policyHolder + "', Expiry=" + expiryDate + "}";
    }
}
