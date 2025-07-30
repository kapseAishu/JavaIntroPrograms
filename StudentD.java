package com.prime.javaintro;

public class StudentD {
	static String student_name="Aishwarya";
	int rollnumber=3;
	String gender="F";
	String institute_name="SPMVV";
	static int marks=84;
	
public static void main(String[] args) {
	System.out.println("student_name"+student_name);
	StudentD s=new StudentD();
	System.out.println(s.gender);
	System.out.println(s.institute_name);
	s.display();
	
}
public void display() {
	System.out.println("marks"+marks);
	StudentD s=new StudentD();
	System.out.println(s.rollnumber);
}
}
