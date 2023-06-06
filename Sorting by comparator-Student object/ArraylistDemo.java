package com.Comparator;
import java.util.ArrayList;
public class ArraylistDemo {
    public static void main(String[] args)
    {
    	ArrayList al=new ArrayList();
    	al.add("Hello");
    	al.add(10);
    	al.add(20);
    	al.add(21.5);
    	System.out.println("Size of the List"+al.size());
    	for(int i=0;i<al.size();i++)
    	{
    		System.out.println(al.get(i));
    	}
    	for(Object l:al)
    	{
    		System.out.println(l);
    	}
    }
}

