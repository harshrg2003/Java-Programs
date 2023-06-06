package com.harsh;

 class Student  {
	public void receivesPen(Pen p)
	{
		p.openCap();
		p.writing();
		p.closeCap();
	}
}	
 class Pen  {
	public void openCap()
	{
		System.out.println("Opening cap");
	}
	public void writing()
	{
		System.out.println("Pen writing");
	}
	public void closeCap()
	{
		System.out.println("Closing cap");
	}
}

public class Teacher {
	
	 Student s=new Student();
      public void givesPen(Pen p)
    {
    	s.receivesPen(p);
    }
}






