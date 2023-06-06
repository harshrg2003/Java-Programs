package com.harsh;

public class Prime {
      int x;
      Prime(int x)
      {
    	  this.x=x;
      }
      public int checkprime()
      {
    	  int i;
    	  boolean isprime=true;
    	  if(this.x==0||this.x==1)
    	  {
    		  isprime=false;
    		  return 1;
    	  }
    	  else
    	  {
    		  for(i=2;i<=(this.x)/2;i++)
    		  {
    			  if(this.x%i==0)
    			  {
    				  isprime=false;
    				  break;
    			  }
    		  }
    		  if(isprime==true)
    			  return 0;
    		  else
    			  return 1;
    	  }
      }
      Prime(){}
}
