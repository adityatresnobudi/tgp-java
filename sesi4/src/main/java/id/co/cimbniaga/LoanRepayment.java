package id.co.cimbniaga;

import java.util.Scanner;

public class LoanRepayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        System.out.print("Masukkan jumlah pinjaman awal: ");
        double pinjaman = scanner.nextDouble();
        System.out.print("Masukkan suku bunga bulanan (misal: 1.5 untuk 1.5%): ");
        double bunga = scanner.nextDouble();
        System.out.print("Masukkan jumlah angsuran bulanan: ");
        int angsuran = scanner.nextInt();

        while (pinjaman > 0) {
            pinjaman += (pinjaman*(bunga/100));
            pinjaman -= angsuran;
            i++;
            if (pinjaman < 0) {
                break;
            }
            System.out.println("Saldo pinjaman setelah bulan ke-" + i + ": " + pinjaman);
        }
        System.out.println("Pinjaman lunas setelah bulan ke-" + i);
    }
}
