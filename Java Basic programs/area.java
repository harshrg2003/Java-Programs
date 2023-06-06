package vowelconsonant;

class Room
{
	float len;
	float breadth;
	float area;
	
	public
	Room(float len,float breadth)
	{
		this.len=len;
		this.breadth=breadth;
	}
	
	Room(float len)
	{
		this.len=len;
		this.breadth=len;
	}
	float calculateArea()
	{
		 area=len*breadth;
		return area;
	}
}

public class area {

	public static void main(String[] args) {
		Room rectangle=new Room(20.5f,10.6f);
		float Arearectangle=rectangle.calculateArea();
		System.out.println("The area of rectangle is "+Arearectangle);
		
		

	}

}
