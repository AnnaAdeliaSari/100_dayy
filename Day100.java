package day_100;

import java.util.Scanner;


public class Day100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan dua angka: ");
        double angka1 = scanner.nextDouble();
        double angka2 = scanner.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double hasil;

        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Error: Pembagian dengan nol.");
                return;
            }
        } else {
            System.out.println("Error: Operator tidak valid.");
            return;
        }

        System.out.println("Hasil: " + hasil);
    }
}