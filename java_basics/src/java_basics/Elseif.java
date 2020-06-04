package java_basics;

import java.util.Scanner;

public class Elseif 
{public static void main(String[] args) {
	System.out.println("enter the month");
	Scanner sc = new Scanner(System.in);
	int month = sc.nextInt();
			
	String season = null;
	if(month==12||month== 1||month==2||month==3)
		season="winter";
	else if(month==7||month== 4||month==5||month==6)
		season = "summer";
		else if(month==8||month== 9||month==10||month==11)
			season = "rainy";
	System.out.println("enter the month:"+month);
	System.out.println("the season is: "+season);
	}
}


