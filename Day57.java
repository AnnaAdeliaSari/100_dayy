package day_100;

import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nomor hari
        System.out.print("Masukkan nomor hari (1-7): ");
        int nomorHari = scanner.nextInt();

        // Menggunakan switch untuk menentukan hari
        String namaHari;
        switch (nomorHari) {
            case 1:
                namaHari = "Minggu";
                break;
            case 2:
                namaHari = "Senin";
                break;
            case 3:
                namaHari = "Selasa";
                break;
            case 4:
                namaHari = "Rabu";
                break;
            case 5:
                namaHari = "Kamis";
                break;
            case 6:
                namaHari = "Jumat";
                break;
            case 7:
                namaHari = "Sabtu";
                break;
            default:
                namaHari = "Nomor hari tidak valid";
                break;
        }
        
        System.out.println("Hari ke-" + nomorHari + " adalah " + namaHari);
    }
}
