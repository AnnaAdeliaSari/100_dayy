package day_100;

import java.util.Scanner;

public class BilanganTerbesarDay33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int jumlahBilangan = scanner.nextInt();

        if (jumlahBilangan <= 0) {
            System.out.println("Tidak ada bilangan untuk dianalisis.");
        } else {
            System.out.print("Masukkan bilangan ke-1: ");
            int bilanganTerbesar = scanner.nextInt();

            for (int i = 2; i <= jumlahBilangan; i++) {
                System.out.print("Masukkan bilangan ke-" + i + ": ");
                int bilangan = scanner.nextInt();

                if (bilangan > bilanganTerbesar) {
                    bilanganTerbesar = bilangan;
                }
            }

            System.out.println("Bilangan terbesar adalah: " + bilanganTerbesar);
        }

    }
}

