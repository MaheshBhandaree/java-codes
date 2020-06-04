package NineApr;

import java.util.Scanner;

public class DACStudent extends Student
{
	private int avg;
	
	
	
	
	public DACStudent(String name, int prn, String qualifiacation, int avg) {
		super(name, prn, qualifiacation);
		this.avg = avg;
	}

	static String[] subject;
	static
	{
		subject =new String[4];
		subject[0]= "C";
		subject[1]="C++";
		subject[2]="java";
		subject[3]="dotnet";
		
		
	}
	int k ;
	int [] marks;
	
/*	public void display()
	{
		for (int i=0;i<4;i++)
		System.out.println(subject[i]+" ");
		System.out.println("enter subject");
		//System.out.println(subject);
	}

	
	public void display1()
	{
		System.out.println("NAME"+name+"\tPRN"+prn+"\tQUALIFICATION"+qualifiacation);
	}*/

public DACStudent(String name, int prn, String qualifiacation, int m1,int m2,int m3,int m4) {
		super(name, prn, qualifiacation);
		this.name= name;
		this.prn = prn;
		this.qualifiacation = qualifiacation;
				this.marks = new int[4];
		this.marks[0]=m1;
		this.marks[1]=m2;
		this.marks[2]=m3;
		this.marks[3]=m4;
		//System.out.println(DACStudent.subject);
		/*System.out.println("Enter the marks");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) 
	{
		System.out.println(arr[i]);
	}
		int sum =0;
		int avg = 0;
		int i ;
		for(i=0;i<arr.length;i++)
		{
			sum +=arr[i];
			avg = sum/arr.length;
		}
		
		*/
	}

void display() {
	System.out.println("DAC Student");
	System.out.println();
	System.out.println("Name :"+name+"\tPRN :"+prn+"\tQualification :"+qualifiacation);
	System.out.println();
	System.out.println("Subjects\tMarks");
	for(k=0;k<marks.length;k++)
	{	
		System.out.print(subject[k]+"\t:\t");
		System.out.print(marks[k]);
		System.out.println();
	}
	
}
@Override
public String calGrade() {
	// TODO Auto-generated method stub
	int sum=0,p;
	for(int i=0;i<marks.length;i++)
	{
		sum+=marks[i];
	}
	p=(sum*100/200);
	String s="";
	if(p>85)
		s="EXCELENT";
	else if(p>70 && p<85)
		s="VERY GOOD";
	else if(p>60 && p<70)
		s="GOOD!";
	else if(p>=40 && p<60)
		s="AVERAGE";
	else if(p<40)
		s="FAIL";
	return s;
}
	
		
}



