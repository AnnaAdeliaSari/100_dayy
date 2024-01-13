package day_100;

import java.util.Scanner;


public class Day97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah huruf: ");
        char huruf = scanner.next().charAt(0);

        if (huruf == 'a' || huruf == 'e' || huruf == 'i' || huruf == 'o' || huruf == 'u') {
            System.out.println("Huruf " + huruf + " adalah vokal.");
        } else {
            System.out.println("Huruf " + huruf + " adalah konsonan.");
        }
    }
}