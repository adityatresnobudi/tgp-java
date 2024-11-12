package id.co.cimbniaga.sesi4;

import java.util.Scanner;

public class SavingsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalTabungan = 0;

        System.out.print("Masukkan jumlah tabungan bulanan: ");
        int tabungan = scanner.nextInt();
        System.out.print("Masukkan jumlah bulan: ");
        int bulan = scanner.nextInt();

        for (int i = 0; i < bulan; i++) {
            totalTabungan += tabungan;
            System.out.println("Saldo setelah bulan ke-" + (i + 1) + ": " + totalTabungan);
        }
        System.out.println("Total saldo setelah " + bulan + " bulan adalah: " + totalTabungan);

        scanner.close();
    }
}
