package com.learn;

class Box
{
	double width,height,depth;
	
	void volume()
	{
		System.out.println("Volume : "+(width*height*depth));
	}
	
	Box()
	{
		System.out.println("Default Constructor Called");
		width=3;
		height=4;
		depth=5;
	}
	
	Box(double w, double h, double d)
	{
		System.out.println("Parameterized Constructor Called");
		width=w;
		height=h;
		depth=d;
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b1=new Box();
		b1.volume();
		
		Box b2=new Box(4,5,6);
		b2.volume();

	}

}
