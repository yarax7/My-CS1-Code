import java.util.Scanner;
class BlackDiamond {
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in); 
    System.out.print("Enter a positive integer for pattern size: ");
    // TODO accept an integer input from the console using Scanner.

    // TODO code to generate star pattern below here.
  int size = scanner.nextInt();
    // TODO code to generate star pattern below here.
  int numChar = (size*2)-1;
  int numStar = (2*size)-1;
  int numSpace = numChar-numStar;
  //Identifies the variables needed for our loops.
  for(int i = 1; i<=size; i++){
     //Ensures the number of lines printed is the same as the size.
    numStar = (2*i)-1;
    numSpace = numChar-numStar;
     //Re-identifies the variables needed for the following loops.
    for(int w=1; w<=numSpace/2; w++){
      //Prints the accurate number of spaces per line.
      System.out.print(" "); 
    }
    for(int y=1; y<=numStar; y++){
      System.out.print("*");
      //Prints the accurate number of stars per line.
    }
    for(int w=1; w<=numSpace/2; w++){
      //Prints the accurate number of spaces per line.
      System.out.print(" ");
    }
      System.out.println ();
      //Skips to the next line.

    }
 
    for(int i = 1; i<=size; i++){
    numSpace = (2*i); 
    numStar = numChar-numSpace;
    for(int x=1; x<=numSpace/2; x++){
      //Prints the accurate number of spaces per line.
      System.out.print(" "); 
    }
    for(int z=1; z<=numStar; z++){
      //Prints the accurate number of stars per line.
      System.out.print("*");
    }
    for(int x=1; x<=numSpace; x++){
      //Prints the accurate number of spaces per line.
      System.out.print(" ");
}
    if (i != size) {
      //Removes the extra line at the end of the shape.
    System.out.println ();
    //Skips to the next line.
  }
}
}
}
