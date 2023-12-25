package day_100;

import java.util.Scanner;


public class Day78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat : ");
        String inputKalimat = scanner.nextLine();

        // Memanggil fungsi untuk menghitung jumlah kata
        int jumlahKata = hitungJumlahKata(inputKalimat);

        // Menampilkan hasil
        System.out.println("Jumlah kata dalam kalimat: " + jumlahKata);

    }

    // Fungsi untuk menghitung jumlah kata dalam sebuah kalimat atau paragraf
    private static int hitungJumlahKata(String kalimat) {
        // Memeriksa apakah kalimat tidak kosong atau null
        if (kalimat == null || kalimat.isEmpty()) {
            return 0;
        }

        // Menggunakan split(" ") untuk memecah kalimat berdasarkan spasi
        // dan menghitung panjang array hasilnya
        String[] kataArray = kalimat.split(" ");
        return kataArray.length;
    }
}

    
