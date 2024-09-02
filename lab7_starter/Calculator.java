import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Calculator {

    public static int add(int x, int y){
        return (x+y);
    }

    public static int subtract(int x, int y){
        return (x-y);
    }


     public static int multiply(int x, int y){
        return (x*y);
    }


    public static int divide(int x, int y){
        return (x/y);
    }


     public static int power(int x, int y){
        int power1=1;
        for(int i=0; i<y; i++){
            power1 = power1*x;
        }
        return (power1);
    }


     public static int factorial(int x){
        int factorial1=1;
        for(int i = x; i>=1; i--){
            factorial1 = factorial1 * i;
        }
        return (factorial1);
    }

    public static int calculate (int first, int second, String operator){
        int result = 0;
        if (operator.equals("+")){
            result = add(first, second);
        }
        
        else if(operator.equals("-")){
            result = subtract(first, second);
        } 

        else if (operator.equals("/")){
            result = divide(first, second);
        } 

        else if (operator.equals("*")){
            result = multiply(first, second);
        } 

        else if (operator.equals("!")){
            result = factorial(first);
        } 

        else if (operator.equals("^")){
            result = power(first,second);
        }
        return (result);
}
    public static void main(String[] args) throws FileNotFoundException {

      String fileName = "operations.txt";
      File operations = new File(fileName);
      Scanner operationsScanner = new Scanner(operations);
      int first=0;
      int second=0;
      String operator="";
      int result =0;
      while(operationsScanner.hasNextLine()){
          String line = operationsScanner.nextLine();
          Scanner lineReader = new Scanner(line);
          first = Integer.parseInt(lineReader.next());
          second = Integer.parseInt(lineReader.next());
          operator = lineReader.next();
          result = calculate(first, second, operator);  
          System.out.println(result);                
}
        // For every line in the file, call your method calculate to calculate the correct result
    

}
}



