package com.hdfc.loans.homeloans;

public class B extends A  // IsA Relationship
{
	 public  void m1()
	   {
		   System.out.println("iam m1 overriden  from ClassB");
	   }
	
	public void m2()
	{
		System.out.println("iam m2 from ClassB");
	}
	
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		System.out.println(a.x);
		
		B b = new B();
		b.m1();
		b.m2();
		System.out.println(b.x);
	}

}
