package id.co.cimbniaga;

import java.util.Arrays;

public class TransactionSorter {
    public static void main(String[] args) {
        // Array transaksi yang akan diurutkan
        double[] transactions = {2500, 1500, 800, 1200, 3000};

        // Cetak transaksi sebelum diurutkan
        System.out.println("Transaksi sebelum diurutkan:" + Arrays.toString(transactions));

        // Panggil method selectionSort dan cetak hasil setelah diurutkan
        selectionSort(transactions);
        System.out.println("Transaksi setelah diurutkan (kecil ke besar): "+ Arrays.toString(transactions));
    }
    public static void selectionSort(double[] transactions) {
        // Tambahkan logika selectionSort di sini
        int n = transactions.length;

        for (int i = 0; i < n; i++) {
            int minIdx = i;
            for (int j = i; j < n; j++) {
                if (transactions[j] < transactions[minIdx]) {
                    minIdx = j;
                }
            }

            // Tukar elemen terkecil dengan elemen pertama
            double temp = transactions[minIdx];
            transactions[minIdx] = transactions[i];
            transactions[i] = temp;
        }
    }
}
