package assingment;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println(id+" ,"+name);
	}
		public void getStudentInfo(String email,long phoneNumber) {
			System.out.println(email+", "+phoneNumber);
		}
		public static void main(String[] args) {
			Students stu=new Students();
			stu.getStudentInfo(1);
			stu.getStudentInfo(1, "darika");
			stu.getStudentInfo("darika@gmail.com", 1234567890l);
			stu.getStudentInfo(2);
			stu.getStudentInfo(2, "shobika");
			stu.getStudentInfo("shobika@gmail.com", 1234567890l);
			stu.getStudentInfo(3);
			stu.getStudentInfo(3, "monika");
			stu.getStudentInfo("monika@gmail.com", 1234567890l);
			stu.getStudentInfo(4);
			stu.getStudentInfo(4,"siva");
			stu.getStudentInfo("siva@gmail.com",1234567890l);
			
		}
	}


