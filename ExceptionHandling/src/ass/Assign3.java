package ass;

public class Assign3 
{
	static void  Checkage(int age)
	{
		if(age<18)
		{
		throw new ArithmeticException("not valid for voting");
		}
		else
		{
			System.out.println("Access is Granted for age");
		}
	}
	public static void main(String[] args) {
		Checkage(19);
	}

}
