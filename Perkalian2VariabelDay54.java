package day_100;

import java.util.Scanner;

public class Perkalian2VariabelDay54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan1: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan bilangan2: ");
        int b = scanner.nextInt();

        int hasil = 0;
        for (int i = 0; i < b; i++) {
            hasil += a;
        }

        System.out.println("Hasil perkalian dari dua variabel diatas adalah: " + hasil);
    }
}
