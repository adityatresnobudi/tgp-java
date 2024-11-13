package id.co.cimbniaga;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long result = 1;

        System.out.print("Masukkan angka untuk menghitung faktorial: ");
        int n;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter an integer!");
                System.out.print("Masukkan angka untuk menghitung faktorial: ");
                scanner.next(); // this is important!
            }
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Please enter an integer > 0");
                System.out.print("Masukkan angka untuk menghitung faktorial: ");
            }
        } while (n < 0);

        for (int i = n; i > 1; i--) {
            result *= i;
        }
        System.out.println("Faktorial dari " + n + " adalah: " + result);

        scanner.close();
    }
}
