package com.labprograms;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random r=new Random();
		//Random number genetor class(inbuilt) 
	int val=(-1);
	
	Square t1 = new Square();
	Cube t2=new Cube();
	//create objects of Subthread's class
	
	t1.start();
	t2.start();
	// start running subthreads
	
	while(true)
	{
		val=r.nextInt(100);
		//Creating random number between 1 and 100
		
		t1.setval(val);
		t2.setval(val);
		//passing the generated value to Square and Cube Thread for calculation of square and Cube
		
		System.out.println("\nNumber: "+val);//Print thr random number
		
	
		try 
		{
			Thread.sleep(1000);//Required Delay between each Number Generation, in milliseconds 
		} 
		catch (InterruptedException e) {}
	}
	}

}
