package filefp;

import java.io.File;
import java.util.Scanner;

public class FileInfo {

	public static void main(String[] args) 
	{System.out.println("Enter the path of file :");
		Scanner  sc = new Scanner(System.in);
		String Filename =sc.next();
		File file = new File(Filename);
		//check File Exist or not
		boolean exist = file.exists();
		if(exist== true)
		{
			System.out.println("filePath :"+file.getPath());
			System.out.println("Path: "+file.getPath());
        	System.out.println("File Size: "+file.length());
        	System.out.println("last modified: "+file.lastModified());
            System.out.println("Executable: " + file.canExecute()); 
            System.out.println("Readable: " + file.canRead()); 
            System.out.println("Writable: "+ file.canWrite());
		}
		else
			System.out.println("file no exist");
		
		

	}

}
