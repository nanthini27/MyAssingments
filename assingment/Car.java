   package week1.day1.assingment;

public class Car {
	
	public void applybreak() {
		System.out.println("applybreak");
	}
	public void applygear() {
		System.out.println("applygear");
	}
	public void switchonAc() {
		System.out.println("switchonAc");
	}
	public void applyacclerate() {
		System.out.println("applyacclerate");
	}
	public static void main(String[] args) {
		Car car=new Car();
		car.applybreak();
		car.applygear();
		car.switchonAc();
		car.applyacclerate();
	}

}
