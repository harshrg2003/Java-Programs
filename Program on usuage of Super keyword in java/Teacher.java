package com.harshrg;

public class Teacher extends Person {
    String qualification;
    String department;
    int Experience;
     Teacher(String name,int age,String gender,String qualification,String department,int Experience)
     {
    	 super(name,age,gender);
    	 this.qualification=qualification;
    	 this.department=department;
    	 this.Experience=Experience;
     }
     public void display()
     {
    	 super.display();
    	 System.out.println("Qualification: "+qualification);
    	 System.out.println("Department= "+department);
    	 System.out.println("Experience= "+Experience);
     }
}
