package day_100;

import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = scanner.nextInt();

        int hasil = 0;
        for (int i = 0; i < b; i++) {
            hasil += a;
        }

        System.out.println("Hasil perkalian a * b: " + hasil);
    }
}
