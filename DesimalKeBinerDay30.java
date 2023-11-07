package day_100;

import java.util.Scanner;

public class DesimalKeBinerDay30 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna memasukkan angka desimal
        System.out.print("Masukkan angka desimal: ");
        int decimal = scanner.nextInt();
        
        // Mengkonversi angka desimal menjadi biner
        String binary = Integer.toBinaryString(decimal);
        
        // Menampilkan hasil
        System.out.println("Konversi ke biner: " + binary);
    }
    
}
