package com.harshrg;

public class Person {
   String name;
   int age;
   String gender;
     Person(String name,int age,String gender)
     {
    	 this.name=name;
    	 this.age=age;
    	 this.gender=gender;
    	 
     }
     public void display()
     {
    	 System.out.println("Name="+name);
    	 System.out.println("Age="+age);
    	 System.out.println("Gender="+gender);
     }
}
