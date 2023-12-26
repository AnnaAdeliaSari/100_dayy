package day_100;

import java.util.Scanner;


public class Day79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi : ");
        int tinggi = scanner.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            // Membuat spasi sebelum angka
            for (int j = tinggi - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Menampilkan angka secara menaik
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Menampilkan angka secara menurun (tanpa angka terakhir)
            for (int l = i - 1; l > 0; l--) {
                System.out.print(l);
            }

            // Pindah ke baris baru setelah satu baris selesai
            System.out.println();
        }
    }
}

