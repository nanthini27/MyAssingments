package week2.day1;

public class Calculator1 {

	public int sub(int a,int b) {
		int c=a-b;
		return c;
	}
	
	public void add(int sub,int b) {
		int c=sub+b;
		System.out.println(c);
	}
	
	public static void main(String[]args) {
		Calculator1 calc=new Calculator1();
		int sub=calc.sub(30, 20);
		System.out.println(sub); 
		calc.add(sub,50);
	}
} 