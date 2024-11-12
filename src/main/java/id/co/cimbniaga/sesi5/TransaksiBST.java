package id.co.cimbniaga.sesi5;

class Node {
    double value;
    Node left, right;

    public Node(double value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class TransaksiBST {
    Node root;

    public static void main(String[] args) {
        // Membuat instance dari kelas TransaksiBST
        TransaksiBST tree = new TransaksiBST();

        // Data array transaksi
        double[] transaksi = {500_000, 1_000_000, 250_000, 750_000, 1_200_000};

        // Menambahkan setiap transaksi ke dalam BST
        for (double nominal : transaksi) {
            tree.tambahTransaksi(nominal);
        }

        // Menghitung total transaksi
        double totalTransaksi = tree.hitungTotalTransaksi(tree.root);
        System.out.printf("Total semua transaksi: Rp. %.1f", totalTransaksi);
    }

    // Metode untuk menambahkan node baru dengan nilai transaksi ke dalam BST
    public void tambahTransaksi(double value) {
        root = tambahRekursif(root, value);
    }

    // Metode rekursif untuk menambahkan node sesuai dengan aturan BST
    private Node tambahRekursif(Node node, double value) {
        // Jika node saat ini kosong, buat node baru dengan value nilai transaksi
        if (node == null) {
            return new Node(value);
        }

        // Menentukan lokasi berdasarkan aturan BST
        if (value < node.value) {
            node.left = tambahRekursif(node.left, value);
            return node;
        }
        node.right = tambahRekursif(node.right, value);
        return node;
    }

    // Metode untuk menghitung total transaksi melalui traveral in-order
    public double hitungTotalTransaksi(Node node) {
        if (node == null) {
            return 0;
        }
        return node.value + hitungTotalTransaksi(node.left) + hitungTotalTransaksi(node.right);
    }
}
