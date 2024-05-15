package com.learn;

public class pattern {

	public static void main(String[] args) {
		// Print pattern to use for loop
		
//		int i, j;
//		 for(i=0;i<10;i++)
//		 {
//			 for(j=0;j<=i;j++)
//			 {
//				 System.out.print("*");
//			 }
//			 System.out.println();
//		 }
//		int i, j,k;
//		 for(i=0;i<10;i++)
//		 {
//			 for(k=0;k<10-i;k++)
//			 {
//				 System.out.print(" ");
//			 }
//			 for(j=0;j<=i;j++)
//			 {
//				 System.out.print("*");
//			 }
//			 System.out.println();
//		 }
		
		int i,j,k;
		 for(i=9;i>=0;i--)
		 {
			 for(k=0;k<10-i;k++)
			 {
				 System.out.print(" ");
			 }
			 for(j=0;j<=i;j++)
			 {
				 System.out.print(" *");
			 }
			 System.out.println();
		 }

	}

}
