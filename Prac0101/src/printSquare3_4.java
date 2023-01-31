public class printSquare3_4 {
	/*第一行12345
	 * 第二行2345+1
	 * 第三行345+12
	 * 45+123
	 * 5+1234
	 */
	
	
	public static void main(String[] Args) {
		printSquare(3, 8);
	}
	public static void printSquare(int min, int max){
			
			int minStorage = min;
		for (int counter = min; counter <= max; counter++) {
			
			for (int valueL = min; valueL <= max; valueL++) {
				System.out.print(valueL);
			}
			min += 1;
			
			for (int valueR = minStorage; valueR <= (min - 2); valueR++) {
				System.out.print(valueR);
			}
			System.out.println();
	}
}
}