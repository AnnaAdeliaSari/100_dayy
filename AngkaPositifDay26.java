package day_100;

import java.util.Scanner;

public class AngkaPositifDay26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan angka positif: ");
            angka = input.nextInt();
        } while (angka <= 0);

        System.out.println("Anda memasukkan angka positif: " + angka);
    }
}
