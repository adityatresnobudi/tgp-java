package id.co.cimbniaga;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + "is withdrawing " + amount);
            balance -= amount;
            System.out.println("New balance after withdrawal by " + Thread.currentThread().getName() + ": " + balance);
        } else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }

    public double getBalance() {
        return balance;
    }
}
