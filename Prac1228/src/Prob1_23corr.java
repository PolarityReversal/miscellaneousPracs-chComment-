public class Prob1_23corr {
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
