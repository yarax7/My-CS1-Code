import java.io.FileNotFoundException;
public class WordleGame {

    private WordleLetter[][] gameArr=new WordleLetter[6][5];
    private String answer;
    private int puzzleNumber;
    private int numGuess;
    private String guess;

    //Constructor:
    public WordleGame(int puzzleNumberIn) throws FileNotFoundException{
      this.puzzleNumber=puzzleNumberIn;
      this.answer=WordBank.getAnswerForPuzzleNumber(puzzleNumber);
    }

    public String getAnswer(){
      //Returns the string answer and is used later to check the accuracy of the user inputted words.
      return this.answer;
    }

    public void guess(String guessWord)throws FileNotFoundException{
      //Counter that stops the same letter from turning yellow multiple times.
      // int yellow=0;
      //Counter that allows us to change what vertical index in the array we are looking at.
      this.numGuess++;

      for(int j=0;j<5;j++){
        //Creates a new WordleLetter instance in order to check and compare char's between guessLetter and the chars in getAnswer.
        WordleLetter guessLetter= new WordleLetter(guessWord.charAt(j));
        //Checks if the same char is in the same position in the guess and answer.
        if(guessWord.charAt(j)==getAnswer().charAt(j)){
          guessLetter.setColor("green");
          // yellow++;
          //Yellow++ in order to not have duplicate yellow characters.
        } 

        else {

          // if(yellow==0){
            //Checks if yellow will be duplicated.
            for(int i=0;i<5;i++){
              WordleLetter actualLetter1= new WordleLetter(getAnswer().charAt(i));
              if(guessWord.charAt(j)==getAnswer().charAt(i)){
                guessLetter.setColor("yellow");
              }
            }
          // }
          // yellow=0;
        }
        //We check if the color is set inside the for loop before setting it to red in order for the red not to overwrite the yellow and green characters.
        if(!guessLetter.isColorSet()){
         guessLetter.setColor("red");
        }
        //Sets the guessLetters in the array to their respective colors.
        gameArr[numGuess-1][j]=guessLetter;
      }

          
    }

    public int getNumberGuessesSoFar(){
      return this.numGuess;
    }

    public WordleLetter[] getGuess(int guessNumber){
      //Returns the same guess however this time with colors set to each letter.
      WordleLetter[] array = gameArr[guessNumber];
      return array;
    }

    public boolean isGameWin(){
      //Checks if the game was started.
      if(numGuess==0){
        return false;
      }
      //Checks if any letter is not green, and if so, returns false.
      int i=numGuess-1;
      for(int j=0;j<5;j++){
        if(!gameArr[i][j].isGreen()){
          return false;
        }
      }
      return true;
    }

    public boolean isGameOver(){
      //Checks if the game was won or if the number of guesses has reached 6. 
      if(isGameWin()){
        return true;
      } else if(numGuess==6){
        return true;
      } else {
        return false;
      }
    }
    
      
  // TODO - implement according to spec

  // TODO - include the remainder of the below code back in once rest of class is implemented.
  // Do not modify this method implementation.
  public String toString() {
    // result will be used to build the full answer String
    String result = "";
    // for each word guessed so far
    for (int i = 0; i < getNumberGuessesSoFar(); i++) {
      // get each letter of each word
      for (int j = 0; j < 5; j++) {
        // concatenate it to the result
        // WordleLetter's toString() is automatically invoked here.
        result += getGuess(i)[j];
      }
      // new line separator between each word
      result += "\n";
    }
    return result;
  }
}


