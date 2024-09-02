import java.io.FileNotFoundException;

/**
 * Tester file.
 *
 * Use this main method to test classes and methods as you create them.
 * Feel free to modify this file as you wish.
 */
public class Tester {
  public static void main(String[] args) throws FileNotFoundException {
  //Checks if checkInDictionary and getAnswerForPuzzleNumber are working:

    System.out.println(WordBank.checkInDictionary("hello"));  // true
    System.out.println(WordBank.checkInDictionary("asdfg"));  // false

    System.out.println(WordBank.getAnswerForPuzzleNumber(0)); // bused
    System.out.println(WordBank.getAnswerForPuzzleNumber(0)); // bused
    System.out.println(WordBank.getAnswerForPuzzleNumber(1)); // plumb

    System.out.println("//////////////////////////////////////////////");

    WordleLetter word = new WordleLetter('a');
    word.setColor("red");
    System.out.println(word.isColorSet());
    System.out.println(word.isGreen());

    //Word bank tests:

    //Checks methods in WordBank file.
    String answer= WordBank.getAnswerForPuzzleNumber(26);
    System.out.println(answer);

    boolean isRealWord= WordBank.checkInDictionary("abyss");
    System.out.println(isRealWord);

    System.out.println("//////////////////////////////////////////////");

    // TODO add tests for Wordle Letter

    //Checking isColorSet and isGreen methods to see if they work correctly.
    // boolean isColorSet = WordleLetter.isColorSet();
    // System.out.println(isColorSet);

    // boolean isGreen = WordleLetter.isGreen();
    // System.out.println(isGreen);

    // System.out.println("//////////////////////////////////////////////");

    // TODO add tests for Wordle Game

    //Checks if getAnswer method is working correctly.
    WordleGame word1 = new WordleGame(26);
    System.out.println(word1.getAnswer());
  }
}
