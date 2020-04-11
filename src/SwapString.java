import java.lang.*;
public class SwapString {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
	   System.out.println(s1+" "+s2);
       s1=s1+s2;
       s2=s1.replace(s2,"");
       s1=s1.replace(s2,"");
       System.out.println(s1+" "+s2);
		
	}
	
}
