package day_100;

import java.util.Scanner;

public class DigitAngkaDay27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        long angka = input.nextLong();

        int jumlahDigit = 0;
        
        // Menghitung jumlah digit dalam angka
        while (angka != 0) {
            jumlahDigit++;
            angka /= 10;  // Menghapus digit paling kanan
        }

        System.out.println("Jumlah digit dalam angka adalah " + jumlahDigit);
    }
    
}
