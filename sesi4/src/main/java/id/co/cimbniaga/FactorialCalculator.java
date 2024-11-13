package id.co.cimbniaga;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long result = 1;

        System.out.print("Masukkan angka untuk menghitung faktorial: ");
        int n = scanner.nextInt();

        for (int i = n; i > 1; i--) {
            result *= i;
        }
        System.out.println("Faktorial dari " + n + " adalah: " + result);

        scanner.close();
    }
}
