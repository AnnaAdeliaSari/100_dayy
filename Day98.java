package day_100;

import java.util.Scanner;

public class Day98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = scanner.nextDouble();
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = scanner.nextDouble();

        double bmi = beratBadan / (tinggiBadan * tinggiBadan);

        if (bmi < 18.5) {
            System.out.println("Kategori BMI: Kurang berat badan");
        } else if (bmi < 25) {
            System.out.println("Kategori BMI: Normal");
        } else if (bmi < 30) {
            System.out.println("Kategori BMI: Kelebihan berat badan");
        } else {
            System.out.println("Kategori BMI: Obesitas");
        }
    }
}
