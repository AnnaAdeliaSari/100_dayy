package day_100;

import java.util.Scanner;

public class SegitigaBintangDay21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = input.nextInt();
        
        for (int i = 1; i <= tinggi; i++) {
            // Membuat spasi untuk bagian kiri segitiga
            for (int j = tinggi - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Membuat bintang untuk segitiga
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
    
}
