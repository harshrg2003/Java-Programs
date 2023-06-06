package com.harshrg;

public class Student extends Person {
        int usn;
        String branch;
        int sem;
         Student(String name,int age,String gender,int usn,String branch,int sem)
         {
        	 super(name,age,gender);
        	 this.usn=usn;
        	 this.branch=branch;
        	 this.sem=sem;
         }
         public void display()
         {
        	 super.display();
        	 System.out.println("USN: "+usn);
        	 System.out.println("branch: "+branch);
        	 System.out.println("Sem= "+sem);
         }
}
