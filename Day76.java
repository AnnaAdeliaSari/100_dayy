package day_100;

import java.util.Scanner;


public class Day76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan dua bilangan
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();

        // Menggunakan if untuk menentukan bilangan yang lebih besar
        if (bilangan1 > bilangan2) {
            System.out.println(bilangan1 + " lebih besar dari " + bilangan2);
        } else if (bilangan1 < bilangan2) {
            System.out.println(bilangan2 + " lebih besar dari " + bilangan1);
        } else {
            System.out.println("Kedua bilangan sama besar");
        }
}
}
