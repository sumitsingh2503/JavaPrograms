
public class DuplicateElement {
	
	public static void main(String[] args) {
		
		String names[] = {"C","python","Java","C#","Python"};
		
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element is "+names[i]);
				}
			}
			
		}
	}

}
