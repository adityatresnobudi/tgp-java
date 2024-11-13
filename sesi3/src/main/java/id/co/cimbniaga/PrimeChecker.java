package id.co.cimbniaga;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();
        if (isPrime(angka)) {
            System.out.println("Angka ini adalah bilangan prima");
        } else {
            System.out.println("Angka ini bukan bilangan prima");
        }
        scanner.close();
    }

    // Fungsi untuk memeriksa apakah angka adalah bilangan prima
    public static boolean isPrime(int angka) {
        // Corner case: angka 1 dan dibawahnya
        if (angka <= 1) {
            return false;
        }
        if (angka == 2 || angka == 3) {
            return true;
        }
        // Memeriksa kelipatan 2 atau 3
        if (angka % 2 == 0 || angka % 3 == 0) {
            return false;
        }
        // Memeriksa angka mulai dari 5 hingga akar angka
        for (int i = 5; i <= Math.sqrt(angka); i = i+6) {
            if (angka % i == 0 || angka % (i+2) == 0) {
                return false;
            }
        }
        return true;
    }
}
