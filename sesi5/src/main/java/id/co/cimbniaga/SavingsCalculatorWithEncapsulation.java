package id.co.cimbniaga;

import java.util.Scanner;

class SavingsAccount {
    private double monthlySavings;
    private int months;
    private double totalBalance;

    public SavingsAccount(double monthlySavings, int months) {
        this.monthlySavings = monthlySavings;
        this.months = months;
        this.totalBalance = 0;
    }

    public void calculateTotalBalance() {
        for (int i = 0; i < this.months; i++) {
            this.totalBalance += this.monthlySavings;
            System.out.printf("Saldo setelah bulan ke-%d: Rp. %.2f\n", (i+1), this.totalBalance);
        }
    }

    public double getTotalBalance() {
        return this.totalBalance;
    }

    public int getMonths() {
        return this.months;
    }
}

public class SavingsCalculatorWithEncapsulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah tabungan bulanan: ");
        double tabungan = scanner.nextDouble();

        System.out.print("Masukkan jumlah bulan: ");
        int bulan = scanner.nextInt();

        SavingsAccount account = new SavingsAccount(tabungan, bulan);
        account.calculateTotalBalance();
        System.out.printf("Total saldo setelah %d bulan adalah: Rp %.2f\n", account.getMonths(), account.getTotalBalance());
        scanner.close();
    }
}
