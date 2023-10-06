package passenger;

import java.util.Scanner;

public class passenger1 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name:");
			String name= sc.nextLine();
			System.out.println("Enter the age:");
			int age= sc.nextInt();
			
			if(age<5)
			{
				System.out.println("this passenger has no ticket");
			}
			else if(age<10)
			{
				System.out.println("this passenger has half ticket");
			}
			else if(age<50)
			{
				System.out.println("this passenger has full ticket");
			}
			else if(age>=50)
			{
				System.out.println("this passenger has half ticket");
			}
			
		}

}
