package day_100;

import java.util.Scanner;

public class SwitchDay42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah huruf: ");
        char huruf = scanner.next().charAt(0);

        // Percabangan switch
        switch (huruf) {
            case 'A':
            case 'a':
                System.out.println("Anda memasukkan huruf A");
                break;
            case 'B':
            case 'b':
                System.out.println("Anda memasukkan huruf B");
                break;
            default:
                System.out.println("Huruf yang dimasukkan bukan A atau B");
        }

        scanner.close();
    }
}
