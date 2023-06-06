package com.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(new Student(5,"Ben"));
		al.add(new Student(1,"Harsh"));
		Collections.sort(al);
		for(Student s:al)
		{
			System.out.println(s);
		}

	}

}
