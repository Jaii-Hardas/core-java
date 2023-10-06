package algebra;

public class calculator {
	public static void main(String [] args)
	{
		System.out.println("START");
		int p = addition(7,5);
		System.out.println(p);
		int q = substraction(6,4);
		System.out.println(q);
		int r = division(44,2);
		System.out.println(r);
		int s = multiplication(6,4);
		System.out.println(s);
		System.out.println("END");
	}
	public static int addition(int a,int b)
	{
		return a+b;
	}
	public static int substraction(int a,int b)
	{
		return a-b;
	}
	public static int division(int a,int b)
	{
		return a/b;
	}
	public static int multiplication(int a,int b)
	{
		return a*b;
	}

}
