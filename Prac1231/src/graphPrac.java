import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;

public class graphPrac {
	public static void main(String[] Args) {
		
		DrawingPanel AAA = new DrawingPanel(220, 150);
		AAA.setBackground(Color.YELLOW);
		Graphics g = AAA.getGraphics();

		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);
		g.fillOval(130, 25, 40, 40);
		
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);
		
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 150, 85);
		
	}
}

