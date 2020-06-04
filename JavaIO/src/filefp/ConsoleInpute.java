package filefp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInpute 
	{
	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	/*System.out.println("Enter data of Character/nENter 'q' to Stop");
	int i;
	while((i = br.read()) != 'q')
		System.out.println((char)i);
	
	br.close();*/
	System.out.println("Enter data of Character/nENter quiet to Stop");
	String str;
	//while(!(str = br.readLine()).equals("quiet")))
	while(!((str = br.readLine()).equals("quiet")))
		System.out.println(str);
	
	br.close();
	}
}