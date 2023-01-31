import java.awt.Graphics;
import java.awt.Color;

public class GraphicsInitiation {

		public static void main(String[] Args) {
		DrawingPanel A = new DrawingPanel(100, 100);
		A.setBackground(Color.BLUE);
		Graphics B = A.getGraphics();
	}
	}

//pre加载graphics及color，定义drawingpanel A，及Graphics B。
//background与A绑定，因此A.setBackground; graphics与B绑定，因此B.draw/fillRect,B.setColor