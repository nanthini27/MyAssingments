package week2.day2;

public class Fibonaci {
	public static void main(String[] args) {
		int x=0,y=1;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(x+" ");
			int num=x+y;
			x=y;
			y=num;
			
		}
	}
	

}
