import java.util.Scanner;

public class quiz3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = 5;
  int y = 10;
  int z = x * y;
  int w = z + y;
 
  if (x % 2 == 0 || y % 2 == 0 ){
   System.out.println("Woohoo");
  }
  if ( w % x == 0){
   System.out.println("Yay!");
  }
  if ( w % z == 0){
   System.out.println("Yeehaw");
  }
  else{
   System.out.println("Yippee");
  }
  System.out.println(x+y+z+w);