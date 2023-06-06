package com.labprograms;

public class Cube extends Thread {
	public int val;
	public int flag;
	public void setval(int i)// to get randomised value from Number generating Thread
	{
		this.val=i;
		this.flag=1;
	}
	public void run() {
		while(true)
		{
			try {
				Thread.sleep(300);// Small Delay to prevent Race condition 
			} catch (InterruptedException e) {}
			
			
			if(flag==1) //can print once when flag==1 
			{
				System.out.println("Cube: "+val*val*val);// prints Cube value
				flag=0;
			}
		}
	}
	
}
