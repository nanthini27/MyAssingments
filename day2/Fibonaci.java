package week2.day2;

public class Fibonaci {
	public static void main(String[] args) {
		int x=0,y=1,a=8;
		
		for (int i = 1; i <= a; i++) {
			System.out.println(x+" ");
			int n=x+y;
			x=y;
			y=n;
			
		}
	}
	

}
