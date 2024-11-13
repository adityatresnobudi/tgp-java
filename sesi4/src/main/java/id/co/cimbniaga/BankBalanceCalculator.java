package id.co.cimbniaga;

import java.util.Scanner;

public class BankBalanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.print("Masukkan jumlah setoran bulanan: ");
        double setoran = inputCheckerDouble("Masukkan jumlah setoran bulanan: ", scanner);
        System.out.print("Masukkan suku bunga tahunan (dalam persentase): ");
        double bunga = inputCheckerDouble("Masukkan suku bunga tahunan (dalam persentase): ", scanner);
        System.out.print("Masukkan jumlah bulan: ");
        int bulan = inputCheckerInt("Masukkan jumlah bulan: ", scanner);

        for (int i = 0; i < bulan; i++) {
            total += setoran;
            total += total*(bunga/1200);
            // total = setoran + (total+setoran)*(bunga/100 / 12)
            // 1/12 / 100 = 1/1200
            System.out.format("Saldo setelah bulan ke-%d: %.2f\n", (i + 1), total);
        }
        System.out.format("Saldo akhir setelah %d bulan adalah: %.2f\n", bulan, total);
//        System.out.format("Saldo akhir setelah %d bulan adalah: %.4f\n", bulan, total);
//        System.out.format("Saldo akhir setelah %d bulan adalah: %.5f\n", bulan, total);

        scanner.close();
    }

    public static double inputCheckerDouble(String s, Scanner scanner) {
        double input;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter an integer!");
                System.out.print(s);
                scanner.next(); // this is important!

            }
            input = scanner.nextDouble();
            if (input < 0) {
                System.out.println("Please enter an integer > 0");
                System.out.print(s);
            }
        } while (input < 0);
        return input;
    }

    public static int inputCheckerInt(String s, Scanner scanner) {
        int input;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter an integer!");
                System.out.print(s);
                scanner.next(); // this is important!
            }
            input = scanner.nextInt();
            if (input < 0) {
                System.out.println("Please enter an integer > 0");
                System.out.print(s);
            }
        } while (input < 0);
        return input;
    }
}
