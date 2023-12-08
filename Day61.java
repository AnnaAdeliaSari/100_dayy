package day_100;

import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan penghasilan tahunan: ");
        int penghasilanTahunan = input.nextInt();

        int pajak = 0;

        if (penghasilanTahunan <= 50000) {
            pajak = penghasilanTahunan / 100; // 1%
        } else if (penghasilanTahunan <= 100000) {
            pajak = 500 + ((penghasilanTahunan - 50000) / 50); // 2%
        } else {
            pajak = 1500 + ((penghasilanTahunan - 100000) / 33); // 3%
        }

        System.out.println("Pajak yang harus dibayar: " + pajak);
    }
}
