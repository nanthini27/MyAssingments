package week2.day4;

public class FindE {
	public static void main(String[] args) {
		
		int count=0;
		String text="testleaf";
		
		char[] charArray=text.toCharArray();
		
		for (int i = 0; i <charArray.length; i++ ) {
			for (int j = i+1; j < charArray.length; j++) {
				
			}
			if(charArray[i]=='e') {
				
				
				
				
				count=count+1;
		//break;
			}
			
			
			System.out.println("e" +" "+count);
			
		
		break;
		}
}
}