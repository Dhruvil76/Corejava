package com.learn;

public class jumpingstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
//		for(i=0;i<10;i++)
//		{
//			if(i==5)
//			{
//				break;
//			}
//			else
//			{
//				System.out.println("I: "+i);
//			}
//		}
		
//		for(i=0;i<10;i++)
//		{
//			if(i==5)
//			{
//				continue;
//			}
//			else
//			{
//				System.out.println("I: "+i);
//			}
//		}
		for(i=0;i<10;i++)
		{
			if(i==5 || i==1)
			{
				continue;
			}
			else
			{
				System.out.println("I: "+i);
			}
		}
	}

}
