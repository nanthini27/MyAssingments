package week1.day1;

public class Mobile {
			
	public void makeCall() {
		System.out.println("makeCall");
	}
	public void sendText() {
	   System.out.println("send Text");
	}
		
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.makeCall();
		mobile.sendText();
	}
}
		
