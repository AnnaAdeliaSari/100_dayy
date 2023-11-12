package day_100;

import java.util.Scanner;

public class BilanganTerkecilDay35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int jumlahBilangan = scanner.nextInt();

        int bilangan;
        int nilaiTerkecil = Integer.MAX_VALUE;

        for (int i = 1; i <= jumlahBilangan; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            bilangan = scanner.nextInt();

            // Menggunakan if-else untuk mencari nilai terkecil
            if (bilangan < nilaiTerkecil) {
                nilaiTerkecil = bilangan;
            }
        }
        // Menampilkan hasil
        System.out.println("Nilai terkecil: " + nilaiTerkecil);
    }
}
