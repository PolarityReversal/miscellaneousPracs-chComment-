import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;

public class graphPrac2 {
	public static void main(String[] Args) {
		
		DrawingPanel panel = new DrawingPanel(200, 200);
		Graphics g = panel.getGraphics();
		
		for (int a = 0; a <= 3; a++) {
		
			g.drawRect(20 * (1 + a), 20 * (1 + a), 160 - (40 * a), 160 - (40 * a));
		}
	}
}