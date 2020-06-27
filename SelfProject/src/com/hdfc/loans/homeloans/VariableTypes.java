package com.hdfc.loans.homeloans;

public class VariableTypes 
{
	// primitive variable
	int x=100;  // insatance (or) non-static  (or) instance-global variable
	static float sal = 8.5f;  // static (or) static-global
	static VariableTypes obj;
	
	void m1()
	{
		int x=200;  // local variable
		//System.out.println(y);
		System.out.println(this.x);
		System.out.println(sal);
	}
	
	static void m2()
	{
		obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(sal);
	}
	
	
	public static void main(String[] args) 
	{
		obj = new VariableTypes();  //Reference Variable (or) Non-primitive
		System.out.println(obj.x);
		System.out.println(VariableTypes.sal);
		//obj.m1();
	}

}
