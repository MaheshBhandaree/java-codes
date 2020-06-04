package bom;

public  class Sbi extends Bank
{static int loanrate;
	static
	{
	 loanrate = 4;
	}
	public int getLoanrate() 
	{ 
		return loanrate ;
	}


	@Override
	public int getIntersert() {
		// TODO Auto-generated method stub
		return 7+loanrate/100;
	}

}
