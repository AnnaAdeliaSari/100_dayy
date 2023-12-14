package day_100;


public class Day67 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Sebelum pertukaran:");
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);

        // Menukar nilai tanpa variabel tambahan menggunakan XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\nSetelah pertukaran:");
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
    }
}
