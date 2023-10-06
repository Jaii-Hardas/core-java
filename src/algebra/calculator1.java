package algebra;

public class calculator1 {
		public static void main(String [] args)
		{
			System.out.println("START");
			
			System.out.println(addition(7,5));
			
			System.out.println(substraction(6,4));
			
			System.out.println(division(44,2));
			
			System.out.println(multiplication(6,4));
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
