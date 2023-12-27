package day_100;


public class Day80 {
    public static void main(String[] args) {
        int jumlahGanjil = 0;

        // Menggunakan loop for untuk mengiterasi dari 1 hingga 10
        for (int i = 1; i <= 10; i++) {
            // Mengecek apakah bilangan saat ini adalah ganjil
            if (i % 2 != 0) {
                // Jika ganjil, tambahkan ke jumlahGanjil
                jumlahGanjil += i;
            }
        }

        // Mencetak hasil jumlah bilangan ganjil
        System.out.println("Jumlah bilangan ganjil dari 1 hingga 10 adalah: " + jumlahGanjil);
    }
}
