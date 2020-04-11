import java.util.Arrays;

public class StringAnagram {
	
	public static void main(String[] args) {
		
		String str1 = "sumit";
		String str2 = "umits";
		System.out.println("Are both string anagram?"+"---"+isAnagram(str1, str2));
		
	}

	
		
		public static boolean isAnagram(String str1, String str2)
		
		{
		
			char[] chararray1 = str1.toCharArray();
			char[] chararray2 = str2.toCharArray();			
			Arrays.sort(chararray1);
			Arrays.sort(chararray2);
			return Arrays.equals(chararray1, chararray2);
			
		}
}
			
		

		



