import java.util.Scanner;

public class distance3_11 {
	public static void main(String[] Args) {
		Scanner Cartesian = new Scanner(System.in);
		System.out.print("Please input x1: ");
		int x1 = Cartesian.nextInt();
		System.out.print("Please input y1: ");
		int y1 = Cartesian.nextInt();
		System.out.print("Please input x2: ");
		int x2 = Cartesian.nextInt();
		System.out.print("Please input y2: ");
		int y2 = Cartesian.nextInt();
		
		double result = distance(x1, y1, x2, y2);
		
		System.out.print("the Nth digit is " + result);
	}
		public static double distance(int x1, int y1, int x2, int y2) {
			double value = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
			return(value);
		}
	}

/*为什么此处要用return结构？
*distance() 接 value = 接 return value，可把该distance()的值返回main中的result=distance()语句中，从而使得result可以print
*另一种方法是在下方用public static void做，不用return而在下方method内用print，
*在main中直接distance(); call出method。但是这样在practice中有报错可能，因此不用
*/