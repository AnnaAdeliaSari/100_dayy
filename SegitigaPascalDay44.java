package day_100;

public class SegitigaPascalDay44 {
    public static void main(String[] args) {
        int tinggi = 5;

        for (int i = 0; i < tinggi; i++) {
            int nilai = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(nilai + " ");
                nilai = nilai * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
