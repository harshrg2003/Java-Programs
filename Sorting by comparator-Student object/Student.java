package com.Comparator;

public class Student implements Comparable<Student> {
   int rank;
   String name;
   public Student(int rank,String name)
   {
	   this.rank=rank;
	   this.name=name;
   }
   public int compareTo(Student s2)
   {
	   if(this.rank>s2.rank)
	   {
		  return 1; 
	   }
	   else
		   return -1;
   }
   public String toString()
   {
	   return "Student name:"+name+"rank"+rank;
   }
}
