import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the name of the file to read: ");
    File file = new File(scanner.nextLine());
    scanner = new Scanner(file);

    int total = 0;
    for(int i = 864677; scanner.hasNext(); total++){
      scanner.next();
    }

    System.out.println( total + " words");
  }
}
