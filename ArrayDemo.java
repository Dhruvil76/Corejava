package com.learn;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// 1 Dimentional Array demo
		
		int a[]=new int[5];
		int i,temp,j,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+i+" Element : ");
			a[i]=sc.nextInt();
					
		}
		System.out.println("Array Elements are");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]= : "+a[i]);
			sum=sum+a[i];
		}System.out.println("Sum is "+sum);
		
		//Asceding order:
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
	
					}
			}
		}
		System.out.println("Asceding order: ");
		
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]= "+a[i]);
		}
		//Decending order
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
	
					}
			}
		}
		System.out.println("Deceding order: ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]= "+a[i]);
		}
	}

}
