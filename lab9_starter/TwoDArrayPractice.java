public class TwoDArrayPractice {

    public static void main(String[] args) {
        int[][] array = {
            {15, 83, 52, 36, 44},
            {99, 32, 78, 64, 9},
            {45, 58, 12, 67, 38},
            {3, 96, 89, 71, 27},
            {24, 7, 91, 0, 5}
        };
        
        System.out.println("\nRow Sums:");
        print1DArray(rowSum(array));
        System.out.println("\nColumn Sums:");
        print1DArray(columnSum(array));
        System.out.println("\nDiagonal Sums:");
        print1DArray(diagonalSums(array));
        System.out.println("\n2D Array Traversed Backwards:");
        print2DArray(traverseBackwards(array));
    }

    // This method should print the provided 1D array. You will use this later to print your results
    // Each element should be separated by a tab.
    public static void print1DArray(int[] array) {
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+"\t"); 
            //for loop in order to count through the first row only. 
        }
    }

    // This method should print the provided 2D array in a tabular form.
    // Each row of the matrix should be printed on a new line,
    // and each element of the row should be separated by a tab.
    public static void print2DArray(int[][] array) {
        // ... Method implementation
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                System.out.print(array[i][j]+ "\t");
                //two for loops in order to treverse through the entire array by row and column. 
            }
            System.out.println();
        }
    }
    
    // This method should calculate and return the sum of numbers in each row of the 2D array.
    // The result should be a 1D array where each element is the sum of the numbers in the corresponding row of the 2D array.
    public static int[] rowSum(int[][] array) {
        int[] newArray = new int[array.length];
        for(int i=0;i<array.length;i++){
            int sum=0;
            //first loop is used to treverse column by column,
            for(int j=0;j<array.length;j++){
                sum += array[i][j];
                //and second loop is used to add up the total sum of each row.
            }
            newArray[i]=sum;
        }
        return newArray;
    }

    // This method should calculate and return the sum of numbers in each column of the 2D array.
    // The result should be a 1D array where each element is the sum of the numbers in the corresponding column of the 2D array.
    public static int[] columnSum(int[][] array) {
        int[] newArray = new int[array.length];
        for(int i=0;i<array.length;i++){
            int sum=0;
            //first loop is used to treverse column by column,
            for(int j=0;j<array.length;j++){
                sum += array[j][i];
                //and second loop is used to add up the total sum of each row.
                //The only difference between this method and the previous, is the order of the array index's.
            }
            newArray[i]=sum;
        }
        return newArray;
    }
    

    // This method should calculate and return the sum of numbers in the two main diagonals of the 2D array.
    // The result should be a 1D array where the first element is the sum of the main diagonal and the second element is the sum of the secondary diagonal.
    public static int[] diagonalSums(int[][] array) {
        int sum=0;
        int[] newArray= new int[2];
            for(int i=0; i<array.length;i++){
               newArray[0] += array[i][i];
               //first for loop is used in order to traverse across column index's,
            }
            int j=array.length-1;
            for(int i=0;i<array.length;i++){
                newArray[1]+= array[i][j];
                j--;
                //and the second for loop is used in order to traverse across row index's.
            }
            return newArray;
        }
    

    // This method should return a new 2D array that is a reversed version of the original 2D array.
    // The new 2D array should have rows in reverse order, and the elements within each row should also be in reverse order.
    public static int[][] traverseBackwards(int[][] array) {
        int[][] newArray= new int[array.length][array[0].length];
        int k=0;
        for(int i=array.length-1; i>=0;i--){
            //loop that traverses through the array backwards(by rows).
            int l=0;
            for(int j=array[i].length-1; j>=0;j--){
                newArray[k][l]=array[i][j];
                l++;
            }
            k++;
        }
        return newArray;
    }
}






