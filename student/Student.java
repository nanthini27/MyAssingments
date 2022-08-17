package org.student;

import org.college.College;

public class Student extends College {
	
	public void studentName() {
		System.out.println("studentName");
	}
	public void studentDept() {
		System.out.println("studentDept");
	}
	public void studentId() {
		System.out.println("studentId");
	}

	public static void main(String[] args) {
		Student stu=new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegRank();
		stu.department();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
	}
}
