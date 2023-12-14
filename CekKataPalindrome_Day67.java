package day_100;

import java.util.Scanner;


public class CekKataPalindrome_Day67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah kata: ");
        String kata = scanner.nextLine();

        boolean Palindrome = kata.equals(new StringBuilder(kata).reverse().toString());

        if (Palindrome) {
            System.out.println("Kata \"" + kata + "\" adalah palindrom.");
        } else {
            System.out.println("Kata \"" + kata + "\" bukan palindrom.");
        }
    }
}
