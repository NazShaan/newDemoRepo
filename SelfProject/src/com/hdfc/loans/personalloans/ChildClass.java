package com.hdfc.loans.personalloans;


class parentClass
{
	public  Number workHard()
	{
		System.out.println("Parent : wakeup early, goto college...");
		return 0;
	}
	
	public void care()
	{
		System.out.println("Parent : atmost care.....");
	}
}

public class ChildClass extends parentClass
{
	public strictfp Object workHard()
	{
		System.out.println("Child : wakeup anytime, goto bars/parlours...");
		return 0;
	}

	public void love()
	{
		System.out.println("Child : iam in love....");
	}
	
	public static void main(String[] args) 
	{
		ChildClass c = new ChildClass();
		c.workHard();
		c.care();
		c.love();
	}

}
