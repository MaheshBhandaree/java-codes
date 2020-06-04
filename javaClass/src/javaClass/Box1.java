package javaClass;

public class Box1 
	{
		double width;
		double height;
		double depth;
		//creating Method
		double volume() {
	return width*height*depth;
		}
	}
class BoxDemo2
{
	public static void main(String[] args)
	{	Box1 mybox1 = new Box1();
		Box1 mybox2 = new Box1();
		double vol;
	
		mybox1.depth = 19;
		mybox1.height=15;
		mybox1.width = 16;
		mybox2.depth =17;
		mybox2.height =12;
		mybox2.width = 15;
	// call method
		vol = mybox1.volume();
		System.out.println("Volume"+vol);
		vol = mybox2.volume();
		System.out.println("volume"+vol);
	
	}
}



