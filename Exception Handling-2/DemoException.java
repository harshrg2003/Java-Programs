package com.Comparator;
import java.util.Scanner;
public class DemoException {

	public static void main(String[] args) {
		int c;
		System.out.println("The main starts");
		int a=10;
		int b=20;
		try {
       System.out.println("Running try block");
       a=Integer.parseInt("Adarsh");
       System.out.println("Exiting try block");
	}
		catch(ArithmeticException e)
		{
			System.out.println("Catch block");
			e.printStackTrace();
		}
		catch(ClassCastException e)
		{
			System.out.println("Ist catch block");
			e.printStackTrace();
		}
		catch(Throwable e)
		{
			System.out.println("3rd catch block");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		}
}
