import java.util.Scanner;

public class quiz3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  for(int i = 100; i > 0; i /= 2){
 
   if(i % 2 == 0){
      System.out.println( i );
 
   }else{
      System.out.println("Not " + i);
 
   }
    if( i % 6 == 0){
     System.out.println( i );
 
   }
}
}
}
