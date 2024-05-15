package com.learn;

import java.util.Scanner;

public class whilellop {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*While loop is knowns as Entery Control loop*/
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of I: ");
		i=sc.nextInt();
		
		do
		{
			sum=sum+i;
			i--;
		}while(i>0);
			{
				System.out.println("Sum: "+sum);
			}
			

	}

}
