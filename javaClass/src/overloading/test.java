package overloading;

public class test 
{
	 private int a,b;

public test(int i, int j) {
	super();
	this.a = i;
	this.b = j;
}
boolean equalTo(test o)
{
	if(o.a == a && o.b == b)
	{
	return true;
	}
	else
	{
	return false;
	}
	
}
}
class Passob{

	public static void main(String[] args) 
	{
		test ob1 = new test(100,22);
		test ob2 = new test (100,22);
		test ob3 = new test (-1,-1);
		System.out.println("hello");
		System.out.println("ob1 == ob2"+ob1.equalTo(ob2));
		System.out.println("ob2 == ob3"+ob2.equalTo(ob3));
	}
}
