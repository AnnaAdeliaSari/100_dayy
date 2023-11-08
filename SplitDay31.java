package day_100;

import java.util.Scanner;

public class SplitDay31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        
        //Memisahkan kata-kata menggunakan spasi sebagai pemisah
        String[]katakata = kalimat.split(" ");
        
        // Mencetak setiap kata secara terpisah
        System.out.println("Kata-kata dalam kalimat :");
        for(String kata : katakata){
            System.out.println(kata);
            
        }
        
    }
    
}
