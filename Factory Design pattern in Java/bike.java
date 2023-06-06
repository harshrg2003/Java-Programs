package com.harshurg;

public class bike extends Vehicle {
      int bikspeed;
      bike(int speed)
      {
    	  super(speed);
    	  this.bikspeed=speed;
      }
      public int getData()
      {
    	 return bikspeed; 
      }
      public void incrementSpeed()
      {
    	  bikspeed+=1;
      }
      public void decrementSpeed()
      {
    	  bikspeed-=2;
      }
      public String toString()
      {
    	  return "Speed of the bike is"+this.getData();
      }
}
