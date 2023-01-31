public class Quad {
	public static void main(String[] Args) {
		quadratic(1, 3, 2);
	}
		public static void quadratic(double a, double b, double c) {
			double first_root = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			double second_root = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/ (2 * a);
			System.out.println("first root = " + first_root);
			System.out.println("second root = " + second_root);
		}
	}
//如果遇到无根怎么办？
//可能方法：加if解决