import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    // Do not modify the method signature.
    public static WordleGame startGame(Scanner scanner) throws FileNotFoundException {
        System.out.println("Enter a number between 0 and 2315: ");
        //Promts user input.
        int num= scanner.nextInt();
        WordleGame instanceGame = new WordleGame(num);
        //Creates new WordleGame instance.
        return instanceGame;  // TODO - implement and replace me
    }

    // Do not modify the method signature.
    public static void playGame(Scanner scanner, WordleGame game) throws FileNotFoundException {
        while(!game.isGameOver()){
            //Checks that the game is not over.
            System.out.println("Enter a a 5 letter guess: ");
            //Prompts user input again.
            String guess =scanner.next();

            while(!WordBank.checkInDictionary(guess)){
                //checks if the word inputted is a real word.
                System.out.println("Invalid word, please try again.");
                guess= scanner.next();
            }

            game.guess(guess);
            //Calls guess method in order to set each letter to a color.
            
            System.out.println(game.toString());
        }

        // reportGameOutcome(game);

    }

    // Do not modify the method signature.
    public static void reportGameOutcome(WordleGame game) {
        if(game.isGameWin()){
            System.out.println("You won!");
            //Checks if the game is won and responds accordingly.
        } else {
            System.out.println("The answer was "+game.getAnswer());
        }
    }

    // This main method body should not be modified.
    public static void main(String[] args) throws FileNotFoundException {
        // Only use this Scanner for user input, do not create new ones via `new Scanner(System.in)`.

        //Calls all methods in the correct order.
        Scanner scanner = new Scanner(System.in);
        WordleGame game = startGame(scanner);
        playGame(scanner, game);
        reportGameOutcome(game);
    }
}
