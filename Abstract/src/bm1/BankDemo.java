package bm1;

import bom.Bank;
import bom.Icici;
import bom.Sbi;

public class BankDemo {

	public static void main(String[] args) 
	{
		Bank b = new Sbi();
		System.out.println("Rate of Interest of sbi"+b.getIntersert()+"%");
		Bank d = new Icici();
		System.out.println("RAte of interest of icici  "+d.getIntersert()+"%");
				


		

	}

}
