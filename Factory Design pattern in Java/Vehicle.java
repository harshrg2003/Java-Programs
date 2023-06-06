//program to demonstrate factory design pattern in java
package com.harshurg;


public class Vehicle {
      int speed;
      Vehicle(int getspeed)
      {
    	  this.speed=getspeed;
      }
      public int getData()
      {
    	  System.out.println("Speed"+speed);																									
    	   return speed-1;
      }


  
	public static Vehicle getspeed(int speed)
	{
		return new bike(speed);
	}
}
