package read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile 
{
	public static void main(String[] args) throws IOException
	{
		File file =new File("C:\\Users\\Jai\\eclipse-workspace\\Readtext_file_11_september\\src\\read\\UserDB.txt");
		
		FileReader fr=new FileReader(file);
		
		BufferedReader br=new BufferedReader(fr);
		
		String line="";
		
		while((line=br.readLine())!=null) 
		{
			System.out.println(line);
		}
		
	}

}