package org.example.com.BankingSystem;

//Banking class
public class Banking {
        public static void main(String[] args) {
            BankingSystem bank = new BankingSystem();

            //adding accounts
            bank.addAccount("A1001", 5000.00);
            bank.addAccount("A1002", 1200.00);
            bank.addAccount("A1003", 8000.00);

            //Request withdrawals
            bank.requestWithdrawal("A1001");
            bank.requestWithdrawal("A1002");

            //process withdrawals
            bank.processWithdrawals(1000.00);

            //display accounts sorted by balance
            bank.displaySortedAccounts();
        }
    }
