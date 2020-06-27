package com.hdfc.loans.personalloans;

public class MethodOverloading 
{

	/*
	 * public void m1(int i) { System.out.println(i); }
	 */
	
	/*
	 * public void m1(float i) { System.out.println(i); }
	 */
	
	/*
	 * public void m1(String i) { System.out.println(i); }
	 */
	
	/*
	 * public void m1(Integer i) { System.out.println(i); }
	 */
	
	/*
	 * public void m1(Number i) { System.out.println(i); }
	 */
	
	public void m1(Object i)
	{
		System.out.println(i);
	}
	
	
	public static void main(String[] args) 
	{
		MethodOverloading obj = new MethodOverloading();
		obj.m1(100);
		obj.m1(23.45f);
		obj.m1("ravilella");
		obj.m1(1000);
		obj.m1(34.45f);
		obj.m1("sai");
	}
}
