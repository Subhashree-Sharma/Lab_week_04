package org.example.com.BankingSystem;

//BankAccount class
class BankAccount {
    String accountNumber;
    double balance;

    //constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{Number='" + accountNumber + "', Balance=" + balance + "}";
    }
}
