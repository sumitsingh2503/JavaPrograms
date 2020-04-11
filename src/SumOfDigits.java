
public class SumOfDigits {
	
	
	public static void main(String[] args) {
		
		int num = 234576;
		
		int var=0;
		
		while(num>0)
		{
			
			 var = var+num%10;
			 num=num/10;
			
		}
		
		System.out.println("Sum of digits is:"+var);
	}
	

}
