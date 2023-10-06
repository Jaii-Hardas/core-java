package class_array;

public class class_array {
	public static void main(String[] args)
	{
        Student[] student = new Student[10];
		
		for(int i=0;i<10;i++)
		{
			student[i] = new Student();
			student[i].rollnumber = 100+i;
			student[i].name = "Jaii"+i;
			student[i].email ="jaihardas@gmail.com"+i;
			student[i].address ="karad"+i;
			student[i].mobile_number ="5625351278"+i;
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("Rollnumber:"+student[i].rollnumber +" "
		+"Name:"+student[i].name+" address:"+student[i].address+"email:"
				+ ""+student[i].email+"mobile number:"+student[i].mobile_number);
		}
	}

}
