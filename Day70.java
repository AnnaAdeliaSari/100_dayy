package day_100;

import java.util.Scanner;


public class Day70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan usia Anda: ");
        int usia = scanner.nextInt();

        if (usia < 0) {
            System.out.println("Usia tidak valid.");
        } else if (usia < 18) {
            System.out.println("Anda adalah seorang anak atau remaja.");
        } else if (usia < 60) {
            System.out.println("Anda adalah seorang dewasa.");
        } else {
            System.out.println("Anda adalah seorang lansia.");
        }
    }
}
