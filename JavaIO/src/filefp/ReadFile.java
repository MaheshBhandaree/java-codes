package filefp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadFile 
{
	public static void main(String[] args) throws IOException
	{
		Scanner s = new Scanner(System.in);
		String inputfileName;
		System.out.println("Input file name");
		inputfileName = s.nextLine().trim()	;
		File file = new File(inputfileName);
		FileInputStream fileStream = new FileInputStream(file); 
       /* InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); */
		BufferedReader br =new BufferedReader(new InputStreamReader(fileStream));
        String line;
        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;
        //read line until Read line until null is returnd
        while((line = br.readLine())!= null) 
        {
        	if(!(line.equals(""))) 
            { 
                  
                characterCount = characterCount+ line.length(); 
                  
                // \\s+ is the space delimiter in java 
                String[] wordList = line.split("\\s+"); 
                  
                countWord += wordList.length;    
                // [!?.:]+ is the sentence delimiter in java 
                String[] sentenceList = line.split("[!?.:]+"); 
                  
                sentenceCount += sentenceList.length; 
            } 
        }	
       
        System.out.println(" characterCount:"+ characterCount);
        System.out.println("countWord :"+countWord);
        System.out.println(" sentenceCount :"+ sentenceCount);
        	
        
	}
}	