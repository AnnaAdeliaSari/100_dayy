package day_100;

import java.util.Scanner;

public class SegitigaAngkaDay24 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     
    int tinggi_segitiga,i,j;
  
    System.out.print("Input tinggi segitiga: ");
    tinggi_segitiga = input.nextInt();
     
    System.out.println();
    
    for(i=1; i<=tinggi_segitiga; i++) {
      for(j=1; j<=i; j++) {
        System.out.print(i+" ");
      }
      System.out.println();
    }
    
    }  
}
