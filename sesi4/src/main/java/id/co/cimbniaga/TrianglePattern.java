package id.co.cimbniaga;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = inputChecker(scanner);

        if (tinggi > 0) {
            for (int i = 1; i < tinggi+1; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            tinggi *= -1;
            for (int i = 1; i < tinggi+1; i++) {
                for (int j = tinggi+1; j > i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }

    public static int inputChecker(Scanner scanner) {
        int input = 0;
        boolean isNum = false;
        do {
            System.out.print("Masukkan tinggi segitiga: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter an integer!");
                scanner.next();
                continue;
            }
            input = scanner.nextInt();
            isNum = true;
        } while (!isNum);
        return input;
    }
}
