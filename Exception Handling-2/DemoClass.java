package com.Comparator;

public class DemoClass {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		try
		{
			System.out.println("Running try block");
			a=10/0;
			System.out.println("Exiting try block");
		}
		catch(ClassCastException e)
		{
			System.out.println("Running catch block");
		}
		finally
		{
			System.out.println("The value of a is:"+a);
			System.out.println("The value of b is:"+b);
		}

	}

}
