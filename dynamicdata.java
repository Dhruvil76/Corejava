package com.learn;

import java.util.Scanner;

public class dynamicdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter A: ");
		a=sc.nextInt();
		System.out.print("Enter B: ");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Result is: \n" );
		System.out.println("Addition : "+c);	
		c=a-b;
		System.out.println("Subtraction : "+c);	
		c=a*b;
		System.out.println("Multiplication : "+c);	
		c=a/b;
		System.out.println("Division : "+c);

	}

}
