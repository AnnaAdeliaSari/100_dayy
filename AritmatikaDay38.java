package day_100;

import java.util.Scanner;

public class AritmatikaDay38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan dua angka
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();
        
        System.out.print("Masukkan operasi aritmatika (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double hasil = 0;

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
                System.out.println("Error: Pembagian oleh nol tidak diperbolehkan.");
                System.exit(0);
            }
        } else {
            System.out.println("Error: Operasi aritmatika tidak valid.");
            System.exit(0);
        }

        System.out.println("Hasil: " + hasil);
    }
}
