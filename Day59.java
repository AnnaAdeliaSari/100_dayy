package day_100;


public class Day59 {
    public static void main(String[] args) {
        int[] nilai = {75, 80, 90, 85, 95};
        int jumlah = 0;

        for (int i = 0; i < nilai.length; i++) {
            jumlah += nilai[i];
        }

        double rataRata = (double) jumlah / nilai.length;
        System.out.println("Rata-rata nilai: " + rataRata);
    }
}
