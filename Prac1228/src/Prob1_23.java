public class Prob1_23 {
	public static void first() {
		System.out.println("Inside first method");
	}

	public static void second() {
		System.out.println("Inside the second method");
		first();
	}
	
	public static void third() {
		System.out.println("Inside third method");
		first();
		second();
	}
	
	public static void main(String[] Args) {
		first();
		third();
		second();
		third();
	}
	
}

//如何快速判断code的行数？
/*比如
 * 
 */
