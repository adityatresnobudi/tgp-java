package id.co.cimbniaga;

import java.util.Scanner;

public class CustomerStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah saldo (dalam rupiah):");
        int saldo = scanner.nextInt();
        System.out.println("Status nasabah: " + checkStatus(saldo));
        scanner.close();
    }

    // Fungsi untuk menentukan status nasabah berdasarkan saldo
    public static String checkStatus(int saldo) {
        String status = "";
        if (saldo < 1000000) {
            status = "Basic";
        } else if (saldo >= 1000000 && saldo < 5000000) {
            status = "Silver";
        } else if (saldo >= 5000000 && saldo < 10000000) {
            status = "Gold";
        } else {
            status = "Platinum";
        }
        return status;
    }
}
