package programs;

public class Prime {
	public static void main(String[] args) {
		int num= 7;
		boolean prime=true;
		for(int i = 2;i < num; i++) {
			if(num%i==0) {
		     prime=false;
		     break;
			}}
				
			if(prime==true) {
				System.out.println("prime number");
			}
			else {
				System.out.println("not a prime");
			}
				
	}
		

	
			
			
		}
	

