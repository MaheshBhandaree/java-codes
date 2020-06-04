package ptsdemo;

import pts.Color_points;
import pts.Point;

public class PointDemo 
{public static void main(String[] args) {
	Point p = new Point(10,15);
		p.display();
		Point p2 = new Color_points(10,15,"yellow");
		p2.display();
		
}

}
