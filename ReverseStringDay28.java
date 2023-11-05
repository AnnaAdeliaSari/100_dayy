package day_100;

import java.util.Scanner;

public class ReverseStringDay28 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String input = scanner.nextLine();

        StringBuilder reversed = new StringBuilder(input).reverse();

        System.out.println("Kata terbalik: " + reversed.toString());
    }
    
}
