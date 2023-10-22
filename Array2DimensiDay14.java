package day_100;

public class Array2DimensiDay14 {
    public static void main(String[] args) {
        int[][] Array = new int[2][3];
        
        Array[0][0] = 70;
        Array[0][1] = 20;
        Array[0][2] = 45;
        Array[1][0] = 30;
        Array[1][1] = 60;
        Array[1][2] = 82;
        
        int i,j;
        for (i = 0; i < 2; i++) {
        for (j = 0; j < 3; j++) {
                
        System.out.print(Array[i][j] +"");
            System.out.println("");
                
            }
            
        }
    }
    
}
