package StringBuilder;


public class StringBuilder {
	public static void main(String [] args)
	{
		String input = "jaii";
		java.lang.StringBuilder st = new java.lang.StringBuilder();

		
		for (int i = 0; i < input.length(); i++)
		{
			char currentchar = input.charAt(i);
			if(i % 2 == 0)
			{
				st.append(Character.toUpperCase(currentchar));
			}
			else
			{
				st.append(currentchar);
			}
		}
		System.out.println(st.toString());
	}		
}
