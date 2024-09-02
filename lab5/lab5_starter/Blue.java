import java.util.Scanner;
class Blue {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a positive integer for pattern size: ");
     int size = scanner.nextInt();
     for(int i=1;i<=size;i++){
      for(int j=1;j<=(size-i);j++){
        System.out.print(" ");
      }
      for(int w=1;w<=i;w++){
        System.out.print("*");
      }
      System.out.println();
     }
    }
  }