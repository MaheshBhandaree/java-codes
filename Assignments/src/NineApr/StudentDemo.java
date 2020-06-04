package NineApr;

public class StudentDemo {

	public static void main(String[] args) 
	{
		DACStudent s1=new DACStudent("mahesh",10002001,"B.E.",39,39,14,60);
		s1.display();
		System.out.println("\nn Grade :"+s1.calGrade()+"\n");
		DBDAStudent s2=new DBDAStudent("raj",10002002,"B.E.",23,22,31,23);
		s2.display();
		System.out.println("\n Grade :"+s2.calGrade()+"\n");
		DACStudent s3=new DACStudent("Nayan",100025551,"B.E.",32,34,35,31);
		s3.display();
		System.out.println("\nGrade :"+s3.calGrade()+"\n");
		/*DBDAstudent s4=new DBDAstudent("Helsinki",10002002,"B.E.",24,30,28,43);
		s2.display();
		System.out.println("\nHelsinki's Grade :"+s4.calGrad()+"\n");*/
		DBDAStudent s5=new DBDAStudent("El Professor",10002665,"B.E.",48,49,47,48);
		s5.display();
		System.out.println("\nEl Professor's Grade :"+s5.calGrade()+"\n");
	}
}
