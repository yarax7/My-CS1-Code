import java.util.Scanner;

public class Collatz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the start of the Collatz sequence x (positive int): ");
    
    int result = scanner.nextInt();
    int counter = 1;
    while(result != 1){
      if((result % 2) == 0){
        counter++;
        System.out.println(result);
        result = result / 2;
      } else{
        counter++;
        System.out.println(result);
        result = 3*result + 1;
      }
    }
    System.out.println(result);
    System.out.println("\nNumber of steps: " + counter);
  }
  }

