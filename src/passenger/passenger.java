package passenger;

import java.util.Scanner;

public class passenger {
   public static void main(String[] args) 
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name---->");
	String name=sc.nextLine();
	System.out.println("Enter any Age---->");
	int age=sc.nextInt();
	
	if(age<5) 
	{
		System.out.println("This has Passenger no Ticket");
	}
	else if(age>=5) 
	{
	    System.out.println("This has Passenger half Ticket");
	}
	else if(age>=10) 
	{
	    System.out.println("This has Passenger Full Ticket");
	}
	else if (age>=50) 
	{
		System.out.println("This has Passenger half Ticket");
				
	}
			
	}
}