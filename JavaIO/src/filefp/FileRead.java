package filefp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class FileRead {

	public static void main(String[] args) throws IOException 
	{
		File f = new File("D:\\C assignment\\mb.txt");
		System.out.println("Path : "+f.getAbsolutePath());
		System.out.println("Size : "+f.length());
		System.out.println("readable : "+f.canRead());
		System.out.println("writable : "+f.canWrite());
		System.out.println("execuatable : "+f.canExecute());
		Date d = new Date(f.lastModified());
		System.out.println("Modified date : "+d);
		System.out.println("exists : "+f.exists());
		
		if(f.exists())
		{
			if(f.canRead())
			{
				FileReader fr = new FileReader(f);
				int i;
				while((i=fr.read()) != -1)
					System.out.println((char)i);
				fr.close();
			}
		}
		
	}
}
