package day_100;

import java.util.Scanner;

public class HitungUmurDay29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna memasukkan tahun lahir
        System.out.print("Masukkan tahun lahir anda: ");
        int tahunLahir = scanner.nextInt();
        
        // Mendapatkan tahun sekarang
        int tahunSekarang = 2023; 
        
        // Menghitung umur
        int umur = tahunSekarang - tahunLahir;
        
        System.out.println("Umur Anda adalah: " + umur + " tahun");
    }
    
}
