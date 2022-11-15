package week2.day1;

public class Calculator {
	
	public void add(){
		int a=12;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}

	public void sub(){
		int a=12;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
	public void mul(){
		int a=12;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	
	public void div(){
		int a=12;
		int b=20;
		int c=a/b;
		System.out.println(c);
	}
		
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
	}
}
