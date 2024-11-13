package id.co.cimbniaga;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        TransactionThread t1 = new TransactionThread(account, 600, "Transaction 1");
        TransactionThread t2 = new TransactionThread(account, 500, "Transaction 2");

        t1.start();
        t2.start();
    }
}