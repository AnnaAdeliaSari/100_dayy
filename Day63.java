package day_100;

import java.util.Scanner;


public class Day63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah string: ");
        String kalimat = input.nextLine().toLowerCase();

        int jumlahVokal = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            char huruf = kalimat.charAt(i);
            if (huruf == 'a' || huruf == 'e' || huruf == 'i' || huruf == 'o' || huruf == 'u') {
                jumlahVokal++;
            }
        }

        System.out.println("Jumlah huruf vokal dalam string: " + jumlahVokal);
    }
}
