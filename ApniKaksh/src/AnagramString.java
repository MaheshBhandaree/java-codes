
public class AnagramString 
{public static void main(String[] args) {
	String a ="aab";
	String b = "aaa";
	boolean isAnagram=true;
	/*boolean visited[] = new boolean [b.length()];
	if(a.length()==b.length()){	
		for(int i=0;i<a.length();i++){	
			char c = a.charAt(i);
			isAnagram= false;
			for(int j=0;j<b.length();j++) {
				if(b.charAt(j)==c && !visited[j]){
					visited[j]= true;
					isAnagram = true;
					break;
				}
				
			}
				if(!isAnagram)
				{
					
					break;
				}
			}	
		}*/
		int A1[] = new int[256]	;
		//int B1[] = new int[256];
		
		for(char c :a.toCharArray()) 
		{
			int index = (int)c;
			A1[index]++;
		}
		for(char c :b.toCharArray()) 
		{
			int index = (int)c;
			A1[index]--;
		}
		for(int i=0;i<256;i++)
		{
			if(A1[i] !=0)
			{
				isAnagram=false;
				break;
			}
		}
		if(isAnagram)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}
}

