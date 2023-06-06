package com.labprograms;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
        int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		try{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by Zero error");
			e.printStackTrace();
		}

	}

}
