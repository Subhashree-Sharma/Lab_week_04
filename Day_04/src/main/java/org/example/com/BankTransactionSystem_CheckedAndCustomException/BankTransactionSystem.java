package org.example.com.BankTransactionSystem_CheckedAndCustomException;

//class extending exception
class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

// BankTransactionSystem class
public class BankTransactionSystem {
    private int bankAccountNum;
    private String bankAccHolder;
    private long balance;

    //constructor
    public BankTransactionSystem(int bankAccountNum, String bankAccHolder, long balance){
        this.bankAccountNum = bankAccountNum;
        this.bankAccHolder  = bankAccHolder;
        this.balance = balance;
    }

    //Methods to get details of Account holder
    public int getBankAccountNum(){
        return bankAccountNum;
    }
    public String getBankAccHolder(){
        return bankAccHolder;
    }

    public long getBalance(){
        return balance;
    }

    //withdraw method -> throws exception if occurring
    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException{
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance -> " + balance);
    }

    //main method
    public static void main(String[] args) {

        //obj created
        BankTransactionSystem account = new BankTransactionSystem(1234, "Subhashree", 10000);

        //try-catch block for handling exception
        try {
            account.withdraw(1000);
            account.withdraw(300);
        }
        catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(-100);
        }
        catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


