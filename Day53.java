package day_100;

public class Day53 {
    public static void main(String[] args) {
        int[][] matriks = {
                {5, 8, 12},
                {21, 15, 7},
                {4, 10, 18}
        };

        int nilaiTerbesar = matriks[0][0];

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                if (matriks[i][j] > nilaiTerbesar) {
                    nilaiTerbesar = matriks[i][j];
                }
            }
        }

        System.out.println("Nilai terbesar dalam matriks: " + nilaiTerbesar);
    }
}
