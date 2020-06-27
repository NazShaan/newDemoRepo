package com.hdfc.loans.personalloans;

import com.hdfc.loans.homeloans.A;
import com.hdfc.loans.homeloans.B;

public class C extends A
{

	public  void m1()
	   {
		   System.out.println("iam m1 overriden  from ClassC");
	   }
	
	public void m3()
	{
		System.out.println("iam m3 from ClassC");
	}
	
	public static void main(String[] args) 
	{
		A a  = new A();
		a.m1();
		System.out.println(a.x);
		
		C c = new C();
		c.m1();
		c.m3();
		System.out.println(c.x);

	}

}
