package day_100;

public class Day56 {
    public static void main(String[] args) {
        int[] arrayAngka = {1, 2, 3, 4, 5};
        int hasilPenjumlahan = jumlahArray(arrayAngka);

        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
    }

    // Fungsi untuk menjumlahkan elemen-elemen array
    static int jumlahArray(int[] arr) {
        int hasil = 0;
        for (int i = 0; i < arr.length; i++) {
            hasil += arr[i];
        }
        return hasil;
    }
}

