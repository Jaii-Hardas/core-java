package String_reverse;

public class reverse {
	public static void main(String[] args) {

		String input = "pune";
		String reversed = reverseString(input);

		System.out.println("Original: " + input);
		System.out.println("Reversed: " + reversed);
	}
	public static String reverseString(String str) 
	{
		StringBuilder reversed = new StringBuilder(str);
		reversed.reverse();
		return reversed.toString();
		
	}

}
