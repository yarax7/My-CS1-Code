public class Bruh{
	public static void main(String[] args){

		 int [] nums= {5, 2, 8, 1, 7};

		 System.out.println("Max in array:  "+ maxArray(nums));
		}

	public static int maxArray(int[] arr){
		int max=Integer.MIN_VALUE;

		for(int i=0; i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}

		return max;
	}



}
	