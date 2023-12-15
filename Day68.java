package day_100;

public class Day68 {
    public static void main(String[] args) {
        int jumlahGenap = 0;

        // Menggunakan perulangan for untuk menghitung jumlah angka genap dari 1 hingga 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                jumlahGenap += i;
            }
        }

        System.out.println("Jumlah angka genap dari 1 hingga 10: " + jumlahGenap);
    }
}

    
