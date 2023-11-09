package day_100;

import java.util.Scanner;

public class MenghitungGajiDay32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah jam kerja per minggu: ");
        int jamKerja = scanner.nextInt();

        System.out.print("Masukkan tarif per jam: ");
        double tarifPerJam = scanner.nextDouble();

        double gaji;
        
        if (jamKerja <= 40) {
            gaji = jamKerja * tarifPerJam;
        } else {
            int jamLembur = jamKerja - 40;
            gaji = 40 * tarifPerJam + (jamLembur * (tarifPerJam * 1.5));
        }

        System.out.println("Gaji karyawan adalah: $" + gaji);

        scanner.close();
    }
}

