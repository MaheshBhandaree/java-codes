package EightApr;

public class Ass3Demo 
{
	public static void main(String[] args)
{
		Ass3 q = new Ass3();//Default ConStructor
		System.out.println(q);
		Ass3 b = new Ass3(1001,"Mahesh",10000);//parameterised Constructor
		System.out.println(b);
		Ass3 b2 = new Ass3(b);//copy Constructor
		System.out.println(b2);
		
	
}

}
