package StringPalindrom;

import java.util.Scanner;

public class palindrom 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print ("Enter a string: ");

		String input = scanner.nextLine();

		String cleanInput = input.replaceAll("\\s", "").toLowerCase();

		String reversedInput = new StringBuilder(cleanInput).reverse().toString();

		if (cleanInput.equals(reversedInput))
		{

			System.out.println("string in a palindrome.");
		}
		else
		{

			System.out.println("string is not a palindrome.");
	}
	}

}
