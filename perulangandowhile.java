package day10;

public class perulangandowhile {
    public static void main(String[] args) {
        int j = 0;
        do{
            if (j % 2 == 0){
                System.out.println(j +"adalah bilangan genap");
                
            }else{
                System.out.println( j +"adalah bilangan ganjil");
            }
            j++;
        }while (j < 5);
        }
    }
    
