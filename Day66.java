
package day_100;

import java.util.Scanner;


public class Day66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        short bilangan1 = scanner.nextShort();

        System.out.print("Masukkan bilangan kedua: ");
        short bilangan2 = scanner.nextShort();

        short hasil = (short) (bilangan1 * bilangan2);

        System.out.println("Hasil perkalian: " + hasil);

    }
}
