public class PrintDesign {

	public static void main(String[] Args) {
		for (int a = 1; a <= 5; a++) {
			for (int i = (6 - a); i >= 1; i--) {
				System.out.print("-");
			}
			for (int j = 1; j <= (2 * a - 1); j++) {
				System.out.print(a * 2 - 1);
			}
			for (int k = (6 - a); k >= 1; k--) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
}

//13579数列，优雅