package algebra;

public class Binomial {
	public static void main(String [] args)
	{
		System.out.println("START");
		int p = expansion(7,5);
		System.out.println(p);
		int q = squareexpansion(6,4);
		System.out.println(q);
		int r = cubeexpansion(4,2);
		System.out.println(r);
		int s = quadeexpansion(6,4);
		System.out.println(s);
		int t = pentaexpansion(6,4);
		System.out.println(s);
		
		System.out.println("END");
	}
	public static int expansion(int a,int b)
	{
		return a+b;
	}
	public static int squareexpansion(int a,int b)
	{
		return a*a+2*a*b+b*b;
	}
	public static int cubeexpansion(int a,int b)
	{
		return a*a*a+3*a*a*b+3*a*b*b+b*b*b;
	}
	public static int quadeexpansion(int a,int b)
	{
		return a*a*a*a+4*a*a*a*b+6*a*a*b*b+4*a*b*b*b+b*b*b*b;
	}
	public static int pentaexpansion(int a,int b)
	{
		return a*a*a*a*a+5*a*a*a*a*b+10*a*a*a*b*b+10*a*a*b*b*b+5*a*b*b*b*b+b*b*b*b*b;
	}
}
