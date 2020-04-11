import java.util.Arrays;

public class SecondHighestArray {
	
	public static void main(String[] args) {
		
		int arr[] = {2,4,6,4,76,81,98};
		
		
		Arrays.sort(arr);
		
		System.out.println("Second largest element is"+arr[arr.length-2]);
	}

}
 