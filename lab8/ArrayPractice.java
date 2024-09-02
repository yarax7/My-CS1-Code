public class ArrayPractice{

    public static void main(String[] args) {

        char[] evil = {'e','v','i','l','x','s','t','o','p','s','x','d','e','s','s','e','r','t','s'};
        printCharArray(evil);
           //Prints the variable evil with _'s instead of x's.
        System.out.println();
        
        reverseCharArray(evil);
        //Prints the variable evil with_'s and backwards.

        // Print results of Method #3 (Add all numbers from double array and print sum)
        double[] doubleArray = {100.50, 200.25, 333.33, 400.11, 200.37};
        System.out.println();
        //calls the sumDoubleArray method with doubleArray as the paramter.
        System.out.print(sumDoubleArray(doubleArray));
        System.out.println();
          
        int [] minMax={-3, 72, 39, -94, 5};
        // Print results of Method #4 using find = "min". (Find minimum of integer array)
        int min=findMinMax(minMax, "min");
        System.out.println(min);
        // Print results of Method #4 using find = "max". (Find maximim of integer array)
        int max=findMinMax(minMax, "max");
        System.out.println(max);
    }

    // Method #1 (Replace all x's with '_' and print all elements)
    public static void printCharArray(char[] array) {
        for(int i = 0; i<array.length; i++){
            //for loop in order to treverse throughout the entire array to find the 'x's and replace them with '_'.
                if (array[i] == 'x'){
                    array[i] = '_';
                    System.out.print(array[i]);
                } else{
                    System.out.print(array[i]);
                }
        }
    }
    // Method #2 (Reverse char array and return new reversed char array)
    public static char[] reverseCharArray(char[] array){
        int index=0;
        char reverse[]= new char[array.length];
        for(int i = reverse.length-1; i>=0; i--){
            reverse[index]=array[i];
            //exact reveresed for loop in comparison to the previous one in order to print the char's backwards.
            index++;
        }  
        for (int i=0; i<reverse.length;i++){
            System.out.print(reverse[i]);
            
        }
        return reverse;  
    }


    // Method #3 (Add all elements of doubleArray and return sum)
    public static double sumDoubleArray(double[] array){
        double sum =0;
        //initializes sum outside the loop so it does not terminate at any point.
        for(int i=0;i<=array.length-1;i++){
            sum += array[i];
            //adds each value in the array to the sum in order to have a complete sum.
        }
        return sum;   
    }
    
    // Method #4 (Find the min/max of given array)
    public static int findMinMax(int[] array, String find){
        int min=array[0];
        int max=array[0];
        //initializes the values of min and max so they do not get terminated.
        if (find.equals("min")){
            for(int i =0; i<array.length;i++){
                //treverses throughout the entire array to compare each value to find the min.
                if(min>array[i]){
                    min=array[i];
                }
            }
            return min;
        }
        if(find.equals("max")){
            for(int i=0;i<array.length;i++){
                //treverses throughout the entire array to compare each value to find the max.
                if(max<array[i]){
                    max=array[i];
                }
            }
        }
        return max;
    }
}
        
     