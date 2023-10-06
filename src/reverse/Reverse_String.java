package reverse;

public class Reverse_String {
	
	public static void main(String[] args) 
	{
		String input = "Pune";
        String reversed = reversestring(input);
		System.out.println("original: " + input);
	    System.out.println("Reversed: " +reversed);
	}
    public static String reversestring (String str)
    {
    	char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

		while (left < right) 
		{
			char temp = charArray[left]; 
			charArray[left] = charArray[right]; 
			charArray[right] = temp;
			left++;
			right--;
		}
			return new String (charArray);
		}
}
