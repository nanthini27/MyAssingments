package programs;

public class Fibo {
	public static void main(String[] args) {
		
		int a=0,b=1;
		for (int i = 1; i<=7; i++) {
			System.out.println(a+" ");
			int num=a+b;
			a=b;
			b=num;
			
		}
	}

}
