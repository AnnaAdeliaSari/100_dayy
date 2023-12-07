package day_100;

import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang deret: ");
        int n = input.nextInt();
        int a = 0, b = 1;

        System.out.print("Deret Fibonacci: " + a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
