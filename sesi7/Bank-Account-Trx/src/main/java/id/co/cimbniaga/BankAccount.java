package id.co.cimbniaga;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(TransactionThread.currentThread().getName() + " depositing " + amount);
        System.out.println("New balance after deposit: " + this.getBalance());
    }

    public synchronized void withdraw(double amount) {
        balance -= amount;
        System.out.println(TransactionThread.currentThread().getName() + " withdrawing " + amount);
        System.out.println("New balance after withdrawal: " + this.getBalance());
    }

    public double getBalance() {
        return balance;
    }
}