public class Calculator {

  public static void main(String[] args) {
    // TODO - call upon powerLoop with a base case input and print the result
    System.out.println(powerLoop(0,0));
    // // TODO - call upon powerLoop with a non-base case input and print the result
    System.out.println(powerLoop(2,4));
    // // TODO - call upon powerRecursive with a base case input and print the result
    System.out.println(powerRecursive(0,0));
    // // TODO - call upon powerRecursive with a non-base case input and print the result
    System.out.println(powerRecursive(2,4));
    // // TODO - call upon multiplyLoop with a base case input and print the result
    System.out.println(multiplyLoop(3,1));
    // // TODO - call upon multiplyLoop with a non-base case input and print the result
    System.out.println(multiplyLoop(3,5));
    // // TODO - call upon multiplyRecursive with a base case input and print the result
    System.out.println(multiplyRecursive(1,1));
    // // TODO - call upon multiplyRecursive with a non-base case input and print the result
    System.out.println(multiplyRecursive(3,5));
    // // TODO - call upon divideLoop with a base case input and print the result
    System.out.println(divideLoop(1,1));
    // TODO - call upon divideLoop with a non-base case input and print the result
    System.out.println(divideLoop(10,3));
    // TODO - call upon divideRecursive with a base case input and print the result
    System.out.println(divideRecursive(1,1));
    // TODO - call upon divideRecursive with a non-base case input and print the result
    System.out.println(divideRecursive(10,3));
  }

  public static int powerLoop(int x, int y) {
    int result=1;
    if(y==0){
      return 1;
    }
    if(x==0){
      return 0;
    }
    for(int i=0;i<y;i++){
      result = result*x;
    }
    return result;
  }

  public static int powerRecursive(int x, int y) {
    int result=1;
    if(y==0){
      return 1;
    }
    if(x==0){
      return 0;
    }
    if(x>0 && y>0){
      result = result*x;
      y--;
    }
    return result*powerRecursive(x,y);
  }

  public static int multiplyLoop(int x, int y) {
    int result=0;
    if(x>0 && y>0){
      for(int i=0;i<y;i++){
      result = result+x;
      }
    }
    return result;
  }

  public static int multiplyRecursive(int x, int y) {
    int result=0;
    if(y==0 || x==0){
      return 0;
    }
    if(x>0 && y>0){
      result = result+x;
      y--;
    }
    return result + multiplyRecursive(x,y);
  }

  public static int divideLoop(int x, int y) {
    int count=0;
    if(x>=0 && y>0){
      while(x>=y){
        x=x-y;
        count++;
      }
    }
    return count;
  }

  public static int divideRecursive(int x, int y) {
    int result=1;
    if(x<y){
      return 0;
    }    
    if(x>=y){
      x=x-y;
    }
    return result+divideRecursive(x,y);
  }
}