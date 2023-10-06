package binomialexpansion;

import java.util.Scanner;

public class pentaexpansion {
	public static void main(String[]args)
	   {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= a*a*a*a*a+5*a*a*a*a*b+10*a*a*a*b*b+10*a*a*b*b*b+5*a*b*b*b*b+b*b*b*b*b;
		
	    System.out.println("penta expansion is "+c);
		
		}
}
