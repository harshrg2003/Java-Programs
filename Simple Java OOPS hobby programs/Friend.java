package inherit;
import java.util.Scanner;
public class Friend {
	Scanner sc=new Scanner(System.in);
	  
      String personality;
      String goal;
      String behaviour;
       public void getData()
       {
    	   System.out.println("Enter what u feel about your friend's personality");
    	   personality=sc.nextLine();
    	   System.out.println("What is his goal?");
    	   goal=sc.nextLine();
    	   System.out.println("How does he behave with other people around him?");
    	   behaviour=sc.nextLine();
       }
       public void displayData()
       {
    	   System.out.println("Personality "+personality);
    	   System.out.println("His goal "+goal);
    	   System.out.println("General Behaviour"+behaviour);
       }
}
