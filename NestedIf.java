package com.learn;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		Scanner sc= new Scanner(System.in); //Use for take user input
		
		System.out.print("Enter A: ");
		a=sc.nextInt();
		
		System.out.print("Enter B: ");
		b=sc.nextInt();
		
		System.out.print("Enter C: ");
		c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is MAX");
			}
			
			else
			{
				System.out.println("C is max");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B is Max");
			}
			else
			{
				System.out.println("C is Max");
			}
		}
	}

}
