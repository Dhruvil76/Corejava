package com.learn;

import java.util.Scanner;

public class IfCondition {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Simple If.. else
		
		int a,b;
		Scanner sc= new Scanner(System.in); //Use for take user input
		
		System.out.print("Enter A: ");
		a=sc.nextInt();
		
		System.out.print("Enter B: ");
		b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println("A is Max Number");
		}
		else
		{
			System.out.println("B is Max Number");
		}
	}

}
