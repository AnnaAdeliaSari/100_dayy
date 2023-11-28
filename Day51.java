package day_100;

public class Day51 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue;
            }
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
        }
    }
}   
