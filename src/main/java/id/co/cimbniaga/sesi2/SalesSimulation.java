package id.co.cimbniaga.sesi2;

public class SalesSimulation {
    public static void main(String[] args) {
        // Harga per unit produk
        double pricePerUnit = 50.0;

        // Jumlah unit produk yang terjual
        int unitsSold = 200;

        // Biaya produksi
        double productionCost = 8000.0;

        // Target penjualan
        double targetSales = 10000.0;

        // Hitung total penjualan di sini
        double totalSales = unitsSold*pricePerUnit;
        System.out.println("Total Penjualan : " + totalSales);

        // Tentukan apakah target penjualan tercapai
        if (totalSales >= targetSales) {
            System.out.println("Target penjualan tercapai :" + true);
        } else {
            System.out.println("Target penjualan tercapai :" + false);
        }

        // Hitung Keuntungan
        double profit = totalSales-productionCost;
        System.out.println("Keuntungan : " + profit);

        // Tentukan apakah perusahaan menghasilkan keuntungan
        if (profit > 0) {
            System.out.println("Mengalami keuntungan : " + true);
        } else {
            System.out.println("Mengalami keuntungan : " + false);
        }

        // Cetak Hasil simulasi
    }
}
