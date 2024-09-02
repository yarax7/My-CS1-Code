import java.util.Scanner;

public class Average {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Find the average of the first N positive integers, where N is: ");
    int sum = 0;
    int n = scanner.nextInt();
    int y = n;
    while (n > 0){
      sum = sum + n;
      n--;
    }
    int total = sum; 
    double result = sum / y;
    System.out.println("Total is: " + total);
    System.out.println("Result is: " + result);
  }
}
