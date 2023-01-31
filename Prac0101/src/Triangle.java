import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;

public class Triangle {
	public static void main(String[] Args) {
		DrawingPanel A = new DrawingPanel(600, 200);
		Graphics B = A.getGraphics();
		A.setBackground(Color.YELLOW);
		B.setColor(Color.BLUE);
		
		Polygon C = new Polygon();
		C.addPoint(0, 0);
		C.addPoint(600, 0);
		C.addPoint(300, 200);
		B.drawPolygon(C);
		
		B.setColor(Color.YELLOW);
		B.drawLine(1, 0, 600, 0);
		//抹去顶上蓝线
		
		B.setColor(Color.BLUE);
		//调回颜色
		for (int n = 0; n <= 50; n++) {
			B.drawLine(15 + 15 * n, 10 + 10 * n, 585 - 15 * n, 10 + 10 * n);
		}
}
}

//为什么要这样做 - 因为需求的图片顶上没有横线，要用黄线抹掉蓝线，并在最左侧留一点