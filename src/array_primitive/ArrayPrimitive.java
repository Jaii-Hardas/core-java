package array_primitive;

public class ArrayPrimitive {

	public static void main(String[] args) {
		int[] rollnumber = new int[10];
		
		for(int i=0;i<10;i++)
		{
			rollnumber[i] = i+100;//0+100
		}
		
		String[] names = new String[10];
		names[0]="pratiksha";
		names[1]="rohit";
		names[2]="amol";
		names[3]="abhijeet";
		names[4]="ganesh";
		names[5]="govind";
		names[6]="gaurav";
		names[7]="nikita";
		names[8]="gayatri";
		names[9]="samrudhi";
		
		String[] address = new String[10];
		address[0]="solhapur";
		address[1]="beed";
		address[2]="pune";
		address[3]="nashik";
		address[4]="nagar";
		address[5]="parbhani";
		address[6]="nagpur";
		address[7]="mumbai";
		address[8]="buldhana";
		address[9]="satara";
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Rollnumber:"+rollnumber[i]+" "
		+"Name:"+names[i]+" address:"+address[i]);
		}
	}
}
