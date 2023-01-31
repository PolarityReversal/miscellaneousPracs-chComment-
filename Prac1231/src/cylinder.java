public class cylinder {
	public static void main(String[] Args) {
		cylinderSurfaceArea(3.0, 4.5);
	}
		
		public static void cylinderSurfaceArea(double r, double h) {
			System.out.println(2 * 3.1415926 * r * (r + h));
		}
	}