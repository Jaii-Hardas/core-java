package binomialexpansion;

import java.util.Scanner;

public class quadexpansion {
	public static void main(String[]args)
	   {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= a*a*a*a+4*a*a*a*b+6*a*a*b*b+4*a*b*b*b+b*b*b*b;
		
	    System.out.println("quade expansion is "+c);
		
		}
}
