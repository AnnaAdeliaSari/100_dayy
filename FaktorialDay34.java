package day_100;

import java.util.Scanner;

public class FaktorialDay34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        long faktorial = 1;

        if (bilangan < 0) {
            System.out.println("Masukkan bilangan bulat positif.");
        } else {
            for (int i = 1; i <= bilangan; i++) {
                faktorial *= i;
            }

            System.out.println("Faktorial dari " + bilangan + " adalah: " + faktorial);
        }

    }
}
