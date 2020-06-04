package filefp;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriteDemo {

	public static void main(String[] args) throws IOException 
	{	
		BufferedWriter br = new BufferedWriter(new FileWriter("D:\\C assignment\\mb.txt"));
		br.write("Write in this file");
		br.newLine();
		br.write("hello i am not so Busy");
		br.newLine();
		br.write("hii.....");
		br.flush();
		// TODO Auto-generated method stub

	}

}
