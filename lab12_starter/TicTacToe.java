// import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;
    //Our size will always be set to a 3 by 3 board
    private int boardSize = 3;
    // Scanner scanner=new Scanner(System.in);
    int oWin=0;
    int xWin=0;
    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        resetBoard();
    }

    public void setCurrentPlayer(char currentPlayerIn){
        this.currentPlayer=currentPlayerIn;
    }

    public void setBoardSize(int boardSizeIn){
        this.boardSize=boardSizeIn;
    }

    public int getBoardSize(){
        return this.boardSize;
    }

    public void resetBoard(){
        board[0][0]='-';
        board[0][1]='-';
        board[0][2]='-';
        board[1][0]='-';
        board[1][1]='-';
        board[1][2]='-';
        board[2][0]='-';
        board[2][1]='-';
        board[2][2]='-';
        }

    public void displayBoard() {
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public boolean makeMove(int row, int col) {
        if((row > 2) || (col > 2)){
            System.out.println("Position out of bounds, please try again.");
            return false;
        }
        if (board[row][col] != '-'){
            System.out.println("Position taken, please try again.");
            return false;
        }
        if(currentPlayer=='O'){
            board[row][col]='O';
        }
        if(currentPlayer=='X'){
            board[row][col]='X';
        }
        return true;
    }

    public boolean checkWin() {
        // Check rows
        int winO=0;
        int winX=0;
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                if(board[i][j]=='O'){
                    winO++;
                }
                if(board[i][j]=='X'){
                    winX++;
                }
            }
            if(winO==3){
                oWin++;
                return true;
            } 
            if(winX==3){
                xWin++;
                return true;
            }
            else{
                winX=0;
                winO=0;
            }
        }
    
        // Check columns
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                if(board[j][i]=='O'){
                    winO++;
                }
                if(board[j][i]=='X'){
                    winX++;
                }
            }
            if(winO==3){
                oWin++;
                return true;
            } 
            if(winX==3){
                xWin++;
                return true;
            }
            else{
                winX=0;
                winO=0;
            }
        }

        // Check diagonals
        //Top left to bottom right.
        for(int i=0;i<boardSize;i++){
            if(board[i][i]=='O'){
                winO++;
            }
            if(board[i][i]=='X'){
                winX++;
            }
        }
         if(winO==3){
            oWin++;
            return true;
        } 
        if(winX==3){
            xWin++;
            return true;
        } 
        else{
            winX=0;
            winO=0;
        }

        //Bottom left to top right.
        int j=boardSize-1;
        for(int i=0;i<boardSize;i++){
                if(board[i][j]=='O'){
                    winO++;
                }
                if(board[i][j]=='X'){
                    winX++;
                }
                j--;
            }
            if(winO==3){
                oWin++;
                return true;
            } 
            if(winX==3){
                xWin++;
                return true;
            } 
            else{
                winX=0;
                winO=0;
            }

        return false;
    }    

    public void changePlayer(){

        if(currentPlayer=='X'){
            this.currentPlayer='O';
        }

        else{                 
            this.currentPlayer='X';
        }
    }

    public boolean isBoardFull(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[i][j]=='-'){
                    return false;
                }
            }
        }
        return true;
    }

    public char getCurrentPlayer(){
        // if(currentPlayer=='X'){
        //     return 'X';
        // }
        // if (currentPlayer='O'){
        //     return 'O';
        // }
        return this.currentPlayer;
    }

    public void winCount(){
        int totalOWin=oWin;
        int totalXWin=xWin;
    }
}

