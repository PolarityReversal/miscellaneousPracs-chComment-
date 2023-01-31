public class MethodPrintNum {
	public static void main(String[] Args) {
		printNumbers(15);
		printNumbers(5);
	}
		
	public static void printNumbers(int counter) {
			for (int n = 1; n <= counter; n++) {
				System.out.print("[" + n + "]" + " ");
			}
			System.out.println();
		}
	}
//定义了method printNumbers