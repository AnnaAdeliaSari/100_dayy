package day_100;

import java.util.Scanner;

public class konversiSuhuDay47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan suhu dalam Celsius: ");
        double suhuCelsius = scanner.nextDouble();

        // Melakukan konversi suhu dari Celsius ke Fahrenheit
        double suhuFahrenheit = (suhuCelsius * 9/5) + 32;

        System.out.println("Suhu dalam Fahrenheit: " + suhuFahrenheit);
    }
}