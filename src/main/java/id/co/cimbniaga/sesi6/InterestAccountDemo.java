package id.co.cimbniaga.sesi6;

abstract class Account {
    protected double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void calculateTotalBalance();

    public double getBalance() {
        return this.balance;
    }
}

class InterestAccount extends Account {
    double monthlySaving;
    int month;
    double interest;

    public InterestAccount(double initialBalance ,double monthlySaving, int month, double interest) {
        super(initialBalance);
        this.monthlySaving = monthlySaving;
        this.month = month;
        this.interest = interest;
    }

    @Override
    public void calculateTotalBalance() {
        for (int i = 1; i <= this.month; i++) {
            this.balance += this.monthlySaving;
            this.balance += this.balance*this.interest;
            System.out.println("Saldo setelah bulan ke-"+i+": Rp"+this.balance);
        }
    }
}

public class InterestAccountDemo {
    public static void main(String[] args) {
        // Buat objek InterestAccount dengan saldo awal, tabungan bulanan, durasi menabung, dan tingkat bunga
        InterestAccount interestAccount = new InterestAccount(500_000, 1_000_000, 3, 0.02);

        System.out.println("Saldo Akun Berbunga:");
        // Panggil metode untuk menghitung saldo
        interestAccount.calculateTotalBalance();

        // Tampilkan saldo akhir
        System.out.println("Saldo akhir setelah " + 3 + " bulan adalah: Rp" + interestAccount.getBalance());
    }
}
