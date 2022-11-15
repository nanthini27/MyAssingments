package week2.day4;

public class Palindrome {
	
	public static void main(String[] args) {
		
	   String text =" madam ";
		String rev="";
		char[] charArray=text.toCharArray();
		for (int i =  charArray.length-1;i>=0; i--) {
			
			System.out.println(rev);
			rev=rev+charArray[i];
			
		}
	if(text==rev) {
		System.out.println("palindrome");
	}
	else
		System.out.println("not palindrome");
				
		
		
		}

}
