package id.co.cimbniaga.sesi3;

import java.util.Scanner;

public class CashbackCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah transaksi (dalam rupiah): ");
        int trx = scanner.nextInt();
        double cashback = cashbackChecker(trx);
        double totalCashback = trx*cashback;
        System.out.println("Total cashback yang didapatkan: Rp" + totalCashback);
        scanner.close();
    }

    public static double cashbackChecker(int trx) {
        if (trx < 100_000) {
            return 0.02;
        } else if (trx < 500_000) {
            return 0.05;
        } else if (trx < 1_000_000) {
            return 0.1;
        } else {
            return 0.15;
        }
    }
}
