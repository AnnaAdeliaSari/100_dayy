package day_100;

import java.util.Scanner;

public class PembagianDay46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Memastikan pembagian oleh nol tidak terjadi
        if (angka2 != 0) {
            double hasil = angka1 / angka2;
            System.out.println("Hasil pembagian: " + hasil);
        } else {
            System.out.println("Error: Pembagian oleh nol tidak diizinkan.");
        }
    }
}
