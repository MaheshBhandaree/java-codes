import java.util.Scanner;

public class Reversesentance 
{
	public String reverseString(String str)
	{
		int i= str.length()-1;
		String ans = "";
		while(i>=0){
			while(i>=0 && str.charAt(i)==' ') i--;
				int j=i;
				
				if(i<0) break;
				while(i>=0 && str.charAt(i) !=' ')  i--;
					if(ans.isEmpty())
						{
							ans=ans.concat(str.substring(i+1, j+1));
						}
					else
						{
							ans=ans.concat(" "+str.substring(i+1, j+1));
						}
					}
				return ans;
		}

	public static void main(String[] args)
	{
		String a =" ";
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter String");
		String str = sc.nextLine();
		
		Reversesentance s = new Reversesentance();
		 a =s.reverseString(str);
		 //System.out.println("Hello");
		 System.out.println("the reversed string is:"+a);
		

	}

}
