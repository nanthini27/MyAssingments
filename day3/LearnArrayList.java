package week5.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnArrayList {
	public static void main(String[] args) {
		List<Integer>num=new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(10);
		System.out.println(num);
		System.out.println(num.size());
		Collections.sort(num);
		System.out.println(num);
		Collections.reverse(num);
		System.out.println(num);
		
	}

}
