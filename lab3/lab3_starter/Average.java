import java.util.Scanner;

public class Average {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // TODO: Add your implementation below here.
    // The following lines are provided for you to modify and re-arrange.
    // More lines of code will need to be added.
    System.out.print("Find the average of the first N positive integers, where N is: ");
    int sum = 0;
    int n = scanner.nextInt();
    for (int i = 1 ; i <= n ; i++ ){ 
      sum = sum + i;
    }
    double result = sum / n;
    System.out.println("Total is: " + sum);
    System.out.println("Result is: " + result);
  }
}
