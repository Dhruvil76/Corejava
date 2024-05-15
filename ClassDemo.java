package com.learn;

import java.util.Scanner;

class Student
{
	int rno;
	String sname;
	double per;
	
	//Create the function
	void getData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Roll Number: ");
		rno=sc.nextInt();
		System.out.print("Enter the Student Name: ");
		sname=sc.next();
		System.out.print("Enter the Percentage: ");
		per=sc.nextDouble();
		
	}
	
	void putData()
	{
		System.out.println("Roll Number: "+rno);
		System.out.println("Student Name: "+sname);
		System.out.println("Percentager: "+per);
	}
}
public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student();
		s1.getData();
		System.out.println("After getData \n");
		s1.putData();
		System.out.println("After putData");
		
		Student s2= new Student();
		s2.getData();
		System.out.println("After getData \n");
		s2.putData();
		System.out.println("After putData");
	}

}
