package week5.day4;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicate {

	public static void main(String[] args) {
		int[]data= {4,3,6,8,29,1,2,4,7,8};
		
		Set<Integer>PrintDuplicate=new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			if(!PrintDuplicate.add(data[i])) {
				System.out.println(data[i]);
			}
			
		}
		
	}
}
