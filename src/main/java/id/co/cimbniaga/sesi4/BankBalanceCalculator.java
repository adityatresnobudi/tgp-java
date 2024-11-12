package id.co.cimbniaga.sesi4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BankBalanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.print("Masukkan jumlah setoran bulanan: ");
        int setoran = scanner.nextInt();
        System.out.print("Masukkan suku bunga tahunan (dalam persentase): ");
        double bunga = scanner.nextInt();
        System.out.print("Masukkan jumlah bulan: ");
        int bulan = scanner.nextInt();

        for (int i = 0; i < bulan; i++) {
            total += setoran;
            total += total*(bunga/1200);
            System.out.format("Saldo setelah bulan ke-%d: %.2f\n", (i + 1), total);
        }
        System.out.format("Saldo akhir setelah %d adalah: %.2f\n", bulan, total);
    }
}
