package week5.day4;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {
	
	public static void main(String[] args) {
		String text="We learn java basics as a part of java sessions in java week1";
		String[]split=text.split(" ");
		Set<String>removeDuplicate=new LinkedHashSet<String>();
		for (int i = 0; i < split.length; i++) {
			removeDuplicate.add(split[i]);
			  
			System.out.println(removeDuplicate);
		}
		
	   
	  
	
	
	}

}
