public class Bruh{
	public static void main(String[] args){

		int [] myArray ={21, 45, 76, 59, 32, 17, 34};

		System.out.println(addArray(myArray,0));

	}

	public static int addArray(int [] arr, int i){
		int sum=0;
		if(i==arr.length){
			return 0;
		} else {
			return sum + addArray(arr, i+1);
		}
	}
}