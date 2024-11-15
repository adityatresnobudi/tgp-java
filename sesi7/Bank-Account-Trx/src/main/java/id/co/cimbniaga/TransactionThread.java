package id.co.cimbniaga;

public class TransactionThread extends Thread {
    private final BankAccount bankAccount;
    private final double amount;
    private final boolean isDeposit;

    public TransactionThread(BankAccount bankAccount, double amount, boolean isDeposit, String name) {
        super(name);
        this.bankAccount = bankAccount;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    @Override
    public void run() {
        if (!isDeposit) {
            bankAccount.withdraw(amount);
        } else {
            bankAccount.deposit(amount);
        }
    }
}