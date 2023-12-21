package day_100;


public class Day74 {
    public static void main(String[] args) {
        int start = 1;

        for (; ; start += 2) {
            if (start % 5 == 0) {
                System.out.println("Bilangan ganjil pertama yang habis dibagi 5: " + start);
                break;
            }
        }
    }
}
