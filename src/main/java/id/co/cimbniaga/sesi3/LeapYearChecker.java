package id.co.cimbniaga.sesi3;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = scanner.nextInt();
        if (isLeapYear(tahun)) {
            System.out.println("Tahun ini tahun kabisat");
        } else {
            System.out.println("Tahun ini bukan tahun kabisat");
        }
        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear = false;
        if (year % 4 == 0) {
            leapYear = true;
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                } else {
                    leapYear = false;
                }
            }
        } else {
            leapYear = false;
        }

        return leapYear;
    }
}
