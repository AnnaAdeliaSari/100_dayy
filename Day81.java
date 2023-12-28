package day_100;

import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan panjang sisi-sisi segitiga
        System.out.print("Masukkan panjang sisi a: ");
        double a = scanner.nextDouble();

        System.out.print("Masukkan panjang sisi b: ");
        double b = scanner.nextDouble();

        System.out.print("Masukkan panjang sisi c: ");
        double c = scanner.nextDouble();

        // Menggunakan if-else untuk menentukan jenis segitiga
        if (a == b && b == c) {
            System.out.println("Segitiga sama sisi");
        } else if (a == b || b == c || a == c) {
            System.out.println("Segitiga sama kaki");
        } else {
            System.out.println("Segitiga sembarang");
        }
    }
}