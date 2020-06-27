package com.hdfc.loans.homeloans;

public abstract final class FinalVariable 
{
	int x=10;
	static int y=20;
	
	public final static void m5()
	{
		
	}

	public  static void main(String[] args) 
	{
		 int z=30;
		FinalVariable obj = new FinalVariable();
		System.out.println(obj.x);
		obj.x=100;
		System.out.println(obj.x);
		
		System.out.println(y);
		y=200;
		System.out.println(y);
		
		System.out.println(z);
		z=300;
		System.out.println(z);

	}

}
