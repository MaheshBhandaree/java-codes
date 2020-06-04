package NineApr;

import java.util.Scanner;

public class DBDAStudent extends Student 
{
	private int avg;
	
	static String[] subject;
	static
	{
		subject  = new String[4];
		subject[0]= "java";
		subject[1]="python";
		subject[2]= "linux";
		subject[3]= "Apti";
	}
	int k;
	int marks[];
	/*public void display()
	{
		System.out.println("Name :"+name+"\n PRN NO :"+prn+"\nQualifiaction"+qualifiacation);
	}
	public void display2()
	{
		for(int i=0;i<4;i++)
			
		System.out.println(subject[i]);
	}*/

	public DBDAStudent(String name, int prn, String qualifiacation,int m1,int m2,int m3,int m4)
	{
		super(name, prn, qualifiacation);
		this.name= name;
		this.prn = prn;
		this.qualifiacation = qualifiacation;
		this.marks = new int[4];
		marks[0] = m1;
		marks[1] = m2;
		marks[2] = m3;
		marks[3] = m4;
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
		//System.out.println("enter the subjecrt");
		//System.out.println(subject);
	
	/*	int arr[] = new int[5];
		System.out.println("Enter the marks");
		Scanner sc = new Scanner(System.in);
		for(int i= 0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		for(int i=0;i<arr.length;i++ )
		System.out.println(arr[i]);
		 
	}*/
	
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
	

	


