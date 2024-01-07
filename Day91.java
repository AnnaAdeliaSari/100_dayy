package day_100;

import java.util.Scanner;

public class Day91 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int jumlah = input.nextInt();

        int total = 0;

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            int bilangan = input.nextInt();
            total += bilangan;
        }

        double rataRata = (double) total / jumlah;

        System.out.println("Nilai rata-rata: " + rataRata);

    }
}

