package day_100;

import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu Restoran:");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Sate ayam");
        System.out.println("4. Es Teh");
        System.out.println("5. Keluar");

        System.out.print("Pilih nomor menu yang diinginkan: ");
        int nomorMenu = scanner.nextInt();

        switch (nomorMenu) {
            case 1:
                System.out.println("Anda memesan Nasi Goreng. Harganya Rp 15.000,-");
                break;
            case 2:
                System.out.println("Anda memesan Mie Goreng. Harganya Rp 12.000,-");
                break;
            case 3:
                System.out.println("Anda memesan Sate ayam. Harganya Rp 20.000,-");
                break;
            case 4:
                System.out.println("Anda memesan Es Teh. Harganya Rp 5.000,-");
                break;
            case 5:
                System.out.println("Terima kasih, silakan datang kembali!");
                break;
            default:
                System.out.println("Nomor menu tidak valid. Silakan pilih nomor menu yang benar.");
        }
    }
}
