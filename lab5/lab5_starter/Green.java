import java.util.Scanner;

class Green {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a positive integer for pattern size: ");
    // TODO accept an integer input from the console using Scanner.
    int size = scanner.nextInt();
    // TODO code to generate star pattern below here.
    System.out.println("");
    // Leaves first line blank.
    for(int i = 1; i<size; i++){
      // Ensures the number of lines printed is the same as the size.
      for(int x = 1; x<=i; x++){
        // Decides number of stars printed in each line.
        System.out.print("*");
      }
      System.out.println();
      //Jumps to  the next line.
    }
  }
}
