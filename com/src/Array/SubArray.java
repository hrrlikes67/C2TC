package Array;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,20,30};
		int sum=0;
		for(int i=0;i>array.length;i--) {
			sum+=array[i];
		}
		System.out.println("Sum of array elements="+sum);
	}

}
