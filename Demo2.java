package com.Comparator;

public class Demo2 {

	public static void main(String[] args) {
		int a=10;
		int b=-1;
		try
		{
			Myclass.sub(a, b);
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}

	}

}
