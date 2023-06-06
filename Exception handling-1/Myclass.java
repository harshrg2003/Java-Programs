package com.Comparator;

public class Myclass {
  static void sub(int a,int b)throws MyException
  {
	if(b>=0)
	{
		System.out.println("The result is"+(a-b));
	}
	else
	{
		throw new MyException(a,b);
	}
  }
}
