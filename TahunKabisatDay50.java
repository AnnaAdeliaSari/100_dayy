package day_100;

import java.util.Scanner;

public class TahunKabisatDay50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = scanner.nextInt();

        // Menentukan apakah tahun tersebut kabisat
        boolean Year = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);

        System.out.println(tahun + (Year ? " adalah tahun kabisat." : " bukan tahun kabisat."));

    }
}
