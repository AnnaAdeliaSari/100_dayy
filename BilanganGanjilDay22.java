package day_100;

public class BilanganGanjilDay22 {
    public static void main(String[] args) {
        int n = 10; // Ganti dengan nilai N yang diinginkan
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Jumlah bilangan ganjil dari 1 hingga " + n + " adalah " + sum);
    }
    
}
