package day_100;

import java.util.Scanner;

public class NilaiMaksimunDay40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai pertama: ");
        int nilai1 = scanner.nextInt();

        System.out.print("Masukkan nilai kedua: ");
        int nilai2 = scanner.nextInt();

        System.out.print("Masukkan nilai ketiga: ");
        int nilai3 = scanner.nextInt();

        int nilaiMaksimum = Math.max(Math.max(nilai1, nilai2), nilai3);

        System.out.println("Nilai maksimum adalah: " + nilaiMaksimum);
    }
    
}
