package day_100;

import java.util.Scanner;


public class Day82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();

        // Keputusan menggunakan tipe data boolean
        boolean lulus = nilai >= 60;

        // Menampilkan hasil keputusan
        if (lulus) {
            System.out.println("Selamat! Anda lulus.");
        } else {
            System.out.println("Maaf, Anda belum lulus.");
        }
    }
}
    
