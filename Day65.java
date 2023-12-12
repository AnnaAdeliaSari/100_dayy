package day_100;

import java.util.Scanner;


public class Day65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai mahasiswa: ");
        int nilai = input.nextInt();

        if (nilai >= 60) {
            System.out.println("Mahasiswa lulus.");
        } else {
            System.out.println("Mahasiswa tidak lulus.");
        }
    }
}
   