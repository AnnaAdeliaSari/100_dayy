package day_100;

import java.util.ArrayList;


public class Day92 {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();

        daftarNama.add("Dina");
        daftarNama.add("Nasrah");
        daftarNama.add("Intan");

        System.out.println("Daftar Nama:");
        for (String nama : daftarNama) {
            System.out.println(nama);
        }
    }
}