package day_100;

import java.util.Scanner;

public class PerkalianDay45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasil = angka1 * angka2;

        System.out.println("Hasil perkalian: " + hasil);
    }
}
