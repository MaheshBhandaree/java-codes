package NineApr;

public class CheackAge implements Age {

	@Override
	public void Checkage(int age) 
		{
			if(age<18)
			{
			throw new ArithmeticException("not valid for voting");
			}
			else
			{
				System.out.println("Access is Granted for voting");
			}
			
		}

	}
