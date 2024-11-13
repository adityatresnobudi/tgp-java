package id.co.cimbniaga;

public class TransactionThread extends Thread {
    private BankAccount bankAccount;
    private double amount;

    public TransactionThread(BankAccount bankAccount, double amount, String name) {
        super(name);
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(amount);
    }
}
