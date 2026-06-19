public class BankAccount {

    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Deposit
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Check balance
    public double getBalance() {
        return balance;
    }
}