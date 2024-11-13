package id.co.cimbniaga;

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

    public static int inputChecker(Scanner scanner, int input) {
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter an integer!");
                System.out.print("Masukkan jumlah angka Fibonacci yang ingin ditampilkan: ");
                scanner.next(); // this is important!
            }
            input = scanner.nextInt();
            if (input < 0) {
                System.out.println("Please enter an Integer > 0");
                System.out.print("Masukkan jumlah angka Fibonacci yang ingin ditampilkan: ");
            }
        } while (input < 0);
        return input;
    }
}
