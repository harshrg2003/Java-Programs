package com.harshu;

public class Singleton {
  static Singleton sref=null;
  private int i;
  private Singleton(int i)
  {
	  this.i=i;
	  System.out.println("Running Constructor");
  }
  public static Singleton myMethod(int i)
  {
	  if(sref==null)
		  return sref=new Singleton(i);
	  else
	  {
		  System.out.println("2nd time onwards");
		  return sref;
	  }
  }
  public void display()
  {
	  System.out.println("I= "+i);
  }

	public static void main(String[] args) {
		Singleton sref1=Singleton.myMethod(3);
		sref1.display();
		Singleton sref2=Singleton.myMethod(4);
		sref2.display();


	}

}
