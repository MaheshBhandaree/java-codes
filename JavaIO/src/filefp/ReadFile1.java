package filefp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadFile1 {
	
    public static void main(String[] args) throws IOException 
    { 
    	Scanner user = new Scanner( System.in ); 
    	String  inputFileName;
    	System.out.print("Input File Name: ");
    	inputFileName = user.nextLine().trim();
        File file = new File(inputFileName);
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
        String line; 
        int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0; 
          
        // Reading line by line from the  
        // file until a null is returned 
       while((line = reader.readLine()) != null) 
        { 
            if(!(line.equals(""))) 
            { 
                  
                characterCount += line.length(); 
                  
                // \\s+ is the space delimiter in java 
                String[] wordList = line.split("\\s+"); 
                  
                countWord += wordList.length;    
                // [!?.:]+ is the sentence delimiter in java 
                String[] sentenceList = line.split("[!?.:]+"); 
                  
                sentenceCount += sentenceList.length; 
            } 
        } 
          
        System.out.println("Total word count = " + countWord); 
        System.out.println("Total number of sentences = " + sentenceCount); 
        System.out.println("Total number of characters = " + characterCount); 
    } 


}



