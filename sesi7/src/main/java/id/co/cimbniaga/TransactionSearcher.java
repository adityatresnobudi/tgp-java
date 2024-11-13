package id.co.cimbniaga;

import static id.co.cimbniaga.TransactionSorter.selectionSort;

public class TransactionSearcher {
    public static void main(String[] args) {
        // Array transaksi yang akan diurutkan
        double[] transactions = {2500, 1500, 800, 1200, 3000};

        // Nominal yang ingin dicari
        double target = 1500;

        System.out.println("Mencari transaksi dengan nominal: " + target);

        // urutkan array transaksi terlebih dahulu
        selectionSort(transactions);

        // Panggil method binarySearch dan cetak hasil pencarian
        int result = binarySearch(transactions, target);
        System.out.println("Transaksi dengan nominal " + target + " ditemukan di indeks: " + result);
    }

    public static int binarySearch(double[] transactions, double target) {
        // Tambahkan logika binary search disini
        int pointerL = 0;
        int pointerR = transactions.length-1;

        while (pointerL <= pointerR) {
            int mid = pointerL+(pointerR-pointerL) / 2;
            if (transactions[mid] == target) {
                return mid;
            }
            if (transactions[mid] < target) {
                pointerL = mid+1;
            } else {
                pointerR = mid-1;
            }
        }
        // Target not found
        return -1;
    }
}
