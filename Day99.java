package day_100;

import java.util.Scanner;

public class Day99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah karakter: ");
        char karakter = scanner.next().charAt(0);

        if (Character.isDigit(karakter)) {
            System.out.println("Karakter tersebut adalah angka.");
        } else if (Character.isLetter(karakter)) {
            System.out.println("Karakter tersebut adalah huruf.");
        } else {
            System.out.println("Karakter tersebut bukan angka maupun huruf.");
        }
    }
}
