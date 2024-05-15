package com.learn;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// Switch Case
		
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A: ");
		a=sc.nextInt();
		
		System.out.print("Enter B: ");
		b=sc.nextInt();
		
		System.out.println();
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println();
		System.out.print("Enter your choice: ");
		d=sc.nextInt();
		System.out.println();
		switch(d)
		{
					case 1: 
						c=a+b;
						System.out.println("Addition is "+c);
						break;
					case 2: 
						c=a-b;
						System.out.println("Subtraction is "+c);
						break;
					case 3: 
						c=a*b;
						System.out.println("Multiplication is "+c);
						break;
					case 4: 
						c=a/b;
						System.out.println("Division is "+c);
						break;
					default:
						System.out.println("Invalid Choice");
						break;
		}

	}

}
