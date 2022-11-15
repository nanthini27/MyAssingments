package week4.day4;

public class Splender extends Bike {
	public void applyacclerate() {
		System.out.println("applyacclerate");
	}
public static void main(String[] args) {
	Splender s=new Splender();
	s.Applybreak();
	s.Applygear();
	s.applyacclerate();
}
}
