import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;

public class POLY {
	
	public static void main(String[] Args) {
		DrawingPanel A = new DrawingPanel(600, 200);
		Graphics B = A.getGraphics();
		A.setBackground(Color.YELLOW);
		B.setColor(Color.BLUE);
		       
		for (int n = 0; n <= 5; n++){
			Polygon C = new Polygon();
		    C.addPoint(0 + n * 15, 0 + n * 10);
		    C.addPoint(600 - n * 15, 0 + n * 10);
		    C.addPoint(300, 200);
		    B.drawPolygon(C);
		}     
	}    
}
//为什么poly 和 poly2码一样但是会报错