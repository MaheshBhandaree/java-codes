package EightApr;

public class Ass1 
{
	private String name;
	private int age;
	private int rollno;
	
	
	public Ass1(String name, int age, int rollno) {
		super();
		this.name = name;
		this.age = age;
		this.rollno = rollno;
	}


	public void display()
	{
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("rollno "+rollno);
	}

}
