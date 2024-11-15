package id.co.cimbniaga;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        TransactionThread t1 = new TransactionThread(account, 500, true, "DepositThread1");
        TransactionThread t2 = new TransactionThread(account, 300, false, "WithdrawThread1");
        TransactionThread t3 = new TransactionThread(account, 700, true, "DepositThread1");
        TransactionThread t4 = new TransactionThread(account, 200, false, "WithdrawThread2");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}