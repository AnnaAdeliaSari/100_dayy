package day_100;

public class LoopBreakDay23 {
  public static void main(String args[]){
     
    int i;
    for (i = 1; i <= 10; i++) { 
      System.out.println(i + " + " + i + " = "+ (i+i));
      if (i == 5) { 
        break; 
      }
    }
  
  }
}
