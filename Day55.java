package day_100;

import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
        // Jawaban Soal 15
        Scanner scanner = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan angka (1-5): ");
            angka = scanner.nextInt();
        } while (angka < 1 || angka > 5);

        System.out.println("Anda memasukkan angka yang benar: " + angka);
    }
}
