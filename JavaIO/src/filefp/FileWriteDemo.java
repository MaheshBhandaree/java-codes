package filefp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo
{
	public static void main(String[] args) {
	
		String S = "hello Write Something in this file";
		String S1 = "hiii Whats up ";
		String S2 =	"hello make INDIA Great again";
	
		FileOutputStream fos = null;
		FileWriter fw = null;
		try {
			/*fos = new FileOutputStream("D:\\C assignment\\mb.txt");
			fos = new FileOutputStream("D:\\C assignment\\mb.txt",true);
			for(int i=0; i<S.length();i++)
				fos.write(S.charAt(i));
				fos.write(S1.getBytes());
				fos.write(S2.getBytes());*/
				fw = new FileWriter("D:\\C assignment\\mb.txt",true);
				fw.write(S);
				fw.write(S1);
				fw.write(S2);
			
			}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				//fos.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}

