package day_100;

import java.util.Scanner;

public class If_elseDay20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        if (umur < 0) {
            System.out.println("Umur tidak valid.");
        } else if (umur < 18) {
            System.out.println("Anda adalah seorang anak-anak.");
        } else if (umur >= 18 && umur < 60) {
            System.out.println("Anda adalah seorang dewasa.");
        } else {
            System.out.println("Anda adalah seorang lansia.");
        }
    }
    
}
