package day_100;


public class Day71 {
    public static void main(String[] args) {
        // Mendefinisikan dua variabel
        int a = 8;
        int b = 3;

        // Menampilkan nilai awal
        System.out.println("Sebelum swap:");
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);

        // Melakukan swap tanpa variabel tambahan menggunakan operasi aritmatika
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nSetelah swap:");
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
    }
}

