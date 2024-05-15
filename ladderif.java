package com.learn;

import java.util.Scanner;

public class ladderif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rno,s1,s2,s3,total;
		double per;
		String sname;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Student Name: ");
		sname= sc.next();
		
		System.out.print("Enter the Roll Number: ");
		rno= sc.nextInt();
		
		System.out.print("Enter the Subject 1 marks: ");
		s1=sc.nextInt();
		
		System.out.print("Enter the Subject 2 marks: ");
		s2=sc.nextInt();
		
		System.out.print("Enter the Subject 3 marks: ");
		s3=sc.nextInt();
		
		total=s1+s2+s3;
		per=total/3;
		
		System.out.println("Student Name :" +sname);
		System.out.println("Roll Number: "+rno);
		System.out.println("Total : "+total);
		System.out.println("Percentage: "+per);
		
		if(per>=70)
		{
			System.out.println("Distinction");
		}
		else if(per>=60)
		{
			System.out.println("First Class");
		}
		else if(per>=50)
		{
			System.out.println("Second Class");
		}
		else if(per>=40)
		{
			System.out.println("Pass Class");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
