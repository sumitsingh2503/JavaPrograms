 
public class MissingNumberInArray {
	
	public static void main(String[] args) {
	
		int a[] = {1,2,3,4,6};
		
		int sum = 0;
		
		for(int i =0;i<a.length;i++) {
			
			sum=sum+a[i];
		
	}
	
		int sum1 = 0;
		
		for(int j=0;j<=6;j++) {
			
			sum1=sum1+j;
			
		}
		
		System.out.println("missing number is:"+(sum1-sum));
		
	}
	

}
