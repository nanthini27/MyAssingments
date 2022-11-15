package week2.day3;

public class JumpStatement {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
		if(i==3) {
			System.out.println("three");
			continue;
		}
		System.out.println(i);
		}
	}
}

//continue(1,2,three,4,5)
//break(1,2,three)
//_______1,2,3three,3,4,5