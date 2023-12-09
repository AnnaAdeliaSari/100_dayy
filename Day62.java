package day_100;

import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi segiempat: ");
        int panjangSisi = input.nextInt();

        // Membuat pola segiempat
        for (int i = 1; i <= panjangSisi; i++) {
            for (int j = 1; j <= panjangSisi; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}