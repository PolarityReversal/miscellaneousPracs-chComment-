public class ReturnPrac1 {
	
	public static void main(String[] Args) {
		double result = AAA(1, 2, 3);
		System.out.print("the result is " + result);
	}
		public static double AAA(int x, int y, int z) {
			double a = 1 + x;
			double b = y + z;
			return a * b;
		
		}
	}

//static void main: 赋值g
//static double AAA:定义算式AAA，当被赋值时进行如下运算，返回value（AAA的value）