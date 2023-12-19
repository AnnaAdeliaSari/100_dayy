package day_100;

import java.util.Scanner;


public class Day72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga terbalik: ");
        int tinggi = scanner.nextInt();

        // Menggunakan for untuk mencetak pola segitiga terbalik
        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print("  "); // Menambahkan spasi untuk membentuk segitiga terbalik
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
    
