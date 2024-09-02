import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the name of the file to read: ");
    File file = new File(scanner.nextLine());
    scanner = new Scanner(file);
    int sum = 0;
    while(scanner.hasNext()){
      scanner.next();
      sum++;
    }

    System.out.println(sum + " words");
  }
}
