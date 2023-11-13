package day_100;

public class RataRataArrayDay36 {
    public static void main(String[] args) {
      
        // Tentukan nilai-nilai array
        int[] nilaiArray = {80, 95, 75, 90, 85};

        // Panggil fungsi untuk menghitung rata-rata
        double rataRata = hitungRataRata(nilaiArray);

        // Tampilkan hasil
        System.out.println("Nilai-nilai dalam array:");
        tampilkanArray(nilaiArray);
        System.out.println("\nRata-rata nilai: " + rataRata);
    }

    // Fungsi untuk menghitung rata-rata array
    public static double hitungRataRata(int[] array) {
        int total = 0;

        // Jumlahkan semua elemen dalam array
        for (int nilai : array) {
            total += nilai;
        }

        // Hitung rata-rata
        return (double) total / array.length;
    }

    // Fungsi untuk menampilkan isi array
    public static void tampilkanArray(int[] array) {
        for (int nilai : array) {
            System.out.print(nilai + " ");
        }
    }
}
