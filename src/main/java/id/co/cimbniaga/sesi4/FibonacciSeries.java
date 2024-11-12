package id.co.cimbniaga.sesi4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka Fibonacci yang ingin ditampilkan: ");
        int deret = scanner.nextInt();

        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);

        for (int i = 1; i < deret-1; i++) {
            fibonacci.add(fibonacci.get(i-1)+fibonacci.get(i));
        }

        String fibonacciString = fibonacci.stream().map(Object::toString).collect(Collectors.joining(", "));
        System.out.println("Deret Fibonacci: " + fibonacciString);

        scanner.close();
    }
}
