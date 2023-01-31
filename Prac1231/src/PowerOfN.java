public class PowerOfN {
	public static void main(String[] Args) {
		printPowersOfN(4, 3);
		printPowersOfN(5, 6);
		printPowersOfN(-2, 8);
	}
		
		public static void printPowersOfN(int base, int power) {
			int a = 1;
			int b = base;
			for (int n = 1; n <= (power + 1); n++) {
				System.out.print(a + " ");
				a = b;
				b = b * base;
			}
			System.out.println();
		}
	}
//注意power+1