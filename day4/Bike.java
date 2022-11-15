package week4.day4;

public class Bike extends Vehicle {
	public void Applygear() {
		System.out.println("Apply gear");
		
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		b.Applybreak();
		b.Applygear();
	}

}
