package com.Comparator;

public class Demo1 {

	
		static void test()throws ClassNotFoundException
		{
			Class.forName("com.Comparator.DemoClass");
		}
		static void test2()throws ClassNotFoundException
		{
			test();
		}
        public static void main(String[] args)
        {
        	try
        	{
        		test2();
        	}
        	catch(ClassNotFoundException e)
        	{
        		System.out.println("Running catch block");
        	}
        }
	

}
