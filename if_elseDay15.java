package day_100;

import java.util.Scanner;

public class if_elseDay15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();

        if (nilai >= 60) {
            System.out.println("Nilai = " + nilai + " lulus ujian");
        } else {
            System.out.println("Nilai = " + nilai + " tidak lulus ujian");
        }
    }
}
