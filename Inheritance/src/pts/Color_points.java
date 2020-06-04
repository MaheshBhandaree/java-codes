package pts;

public class Color_points extends Point
{
 private String colors;
 static String[] color;
// int flag= 0;
 static {
	 color = new String[3];
	color[0]= "blue";
	color[1]="red";
	color[2]="black";
	
 }
public Color_points() {
	super();
}
public Color_points(int x, int y, String colors) {
	super(x, y);
//	this.colors = colors;
//	this.flag = flag;
	boolean flag = false;
	for(int i=0;i<color.length;i++)
	{	if(color[i].equals(colors))
		{
		this.colors=colors;
		flag=true;
		break;
		}
	}
	if(flag==false)
	{
		this.colors="white";
	}
}
 public void display()
 {
	 super.display();
	 System.out.println(colors);
 }
 
}
