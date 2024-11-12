package id.co.cimbniaga.sesi3;

import java.util.Scanner;


public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();
        System.out.println(isEven(angka));
        scanner.close();
    }

    public static String isEven(int num) {
        if (num % 2 == 0) {
            return "Bilangan ini adalah bilangan genap";
        }
        return "Bilangan ini adalah bilangan ganjil";
    }
}
