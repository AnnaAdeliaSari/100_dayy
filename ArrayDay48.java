package day_100;

public class ArrayDay48 {
    public static void main(String[] args) {
        int[] angka = new int[5];

        // Mengisi array dengan nilai
        angka[0] = 10;
        angka[1] = 20;
        angka[2] = 30;
        angka[3] = 40;
        angka[4] = 50;

        // Menampilkan nilai dari setiap elemen array
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Elemen ke-" + i + ": " + angka[i]);
        }
    }
}
