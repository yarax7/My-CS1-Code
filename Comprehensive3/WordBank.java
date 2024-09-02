import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordBank {

  // This first method implementation is completed for you already.
  // Do not modify the method signature.
  public static String getAnswerForPuzzleNumber(int puzzleNumber) throws FileNotFoundException {
    // Create a file scanner to read answers.txt.
    Scanner scanner = new Scanner(new File("answers.txt"));
    // Skip the first puzzleNumber number of words in the file.
    for (int i = 0; i < puzzleNumber; i++) {
      scanner.next();
    }
    // Returns the very next word:
    return scanner.next();
  }

  // Do not modify the method signature.
  public static boolean checkInDictionary(String proposed) throws FileNotFoundException {
    Scanner scanner = new Scanner(new File("dictionary.txt"));
    //Traverses throughout the entire dictionary file in order to see if the word proposed by the user and returns that boolean.
    while(scanner.hasNext()){
      String word = scanner.nextLine();

      if(proposed.equals(word)){
        return true;
      }
      
    }
    return false;  // TODO - implement and replace me
  }
}
