package Write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	
	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\Users\\Jai\\eclipse-workspace\\Write_textFile_13_september\\write.txt");
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		
		String contentTowrite = "\nthe new line is added\n";
		
	    br.write(contentTowrite);
	    
	    br.close();
	    fr.close();
	    file=null;
		
		
		
	}
}
