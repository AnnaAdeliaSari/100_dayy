package day_100;

public class Day77 {
    public static void main(String[] args) {
        int[][][] kubus = {
            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
            {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
            {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };

        // Menampilkan elemen-elemen array tiga dimensi
        System.out.println("Elemen-elemen array :");
        for (int i = 0; i < kubus.length; i++) {
            for (int j = 0; j < kubus[i].length; j++) {
                for (int k = 0; k < kubus[i][j].length; k++) {
                    System.out.print(kubus[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}