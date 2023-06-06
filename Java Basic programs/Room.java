package com.harsh;

public class Room {
     public
     double length;
     double breadth;
     double area;
     double extendedArea;
       Room(double length,double breadth)
       {
    	   this.length=length;
    	   this.breadth=breadth;
       }
       Room(double length)
       {
    	   this.length=length;
    	   this.breadth=length;
       }
       void calcArea()
       {
    	   this.area=(this.length)*(this.breadth);
       }
       void calcArea(double l)
       {
    	   this.extendedArea=(this.length)*(this.breadth)+l;
       }
       void displayArea()
       {
    	   System.out.println("Area="+this.area);
    	   System.out.println("Extended area="+this.extendedArea);
       }
}
