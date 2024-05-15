package com.learn;

import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n,sum=0;
//		@SuppressWarnings("resource")
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter value of N: ");				
//		n=sc.nextInt();
//		
//		for(n=0;n<10;n++)
//		{
//			sum=sum+n;
//			System.out.println("Sum: "+sum);
//		}
		
		int i, n, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of N: ");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}System.out.println("Sum: "+sum);
	}

}
