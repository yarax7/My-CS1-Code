import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TicTacToe game= new TicTacToe();
        System.out.println("Player X, what is your name?");
        Scanner scanner=new Scanner(System.in);
        String playerX = scanner.nextLine();
        System.out.println("Player O, what is your name?");
        String playerO = scanner.nextLine();
        String winner="random";
        boolean playAgain=true;
        int xNumWins=0;
        int oNumWins=0;
        while(playAgain){
            game.resetBoard();
            while(!game.checkWin()){
                System.out.println("Player "+game.getCurrentPlayer()+", enter the coordinates for your move.");
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                if(game.makeMove(row, col)){
                    game.changePlayer();
                }
                game.displayBoard();
            }

            if(game.checkWin()){
                if(game.getCurrentPlayer()==('O')){
                    xNumWins++;
                    System.out.println("Congrats "+playerX+" on your "+xNumWins+" win(s)!");
                } else if(game.getCurrentPlayer()==('X')){
                    oNumWins++;
                    System.out.println("Congrats "+playerO+" on your "+oNumWins+" win(s)!");
                }
            System.out.println("Play again? (True or False)");
            playAgain=scanner.nextBoolean();
            }
        }
    }
}
