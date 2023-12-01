package day_100;

import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka, jumlah = 0;

        do {
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            angka = scanner.nextInt();
            jumlah += angka;
        } while (angka != 0);

        System.out.println("Jumlah angka yang dimasukkan: " + jumlah);
    }
}