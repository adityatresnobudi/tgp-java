package id.co.cimbniaga;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int x = 10;
        int y = x + 5;
        System.out.println(y);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama anda:");
        String name = scanner.nextLine();
        System.out.println("Halo " + name + "!");

        scanner.close();
    }
}