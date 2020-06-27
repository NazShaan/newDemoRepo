package com.hdfc.loans.carloans;

public abstract class FirstAbstract 
{
	
	int x=100;
	
	void m1()
	{
		System.out.println("iam m1 concrete from FirstAbstract Class");
	}
	
	abstract void m2();
	
	
	public static void main(String[] args) 
	{
		//FirstAbstract obj1 = new FirstAbstract();
		
		FirstAbstract obj ;
		
		obj = new ChildClass();
		obj.m1();
		obj.m2();
		
	}

}
