import java.util.*;

public class cumulative_sum_problem_receipt {
	// This program enhances our Receipt program using a cumulative sum.
	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);//call scanner
		double subtotal = meals(console);//
		results(subtotal);//
	}

	//method#1 prompt导入吃饭人数，然后print出相应的ask每人吃饭花钱数量的prompts，然后将输入的结果加入subtotal中
		public static double meals(Scanner console) {
			System.out.print("How many people ate? ");//prompt
			int people = console.nextInt();//输入
			double subtotal = 0.0;//设定空的subtotal，用于之后的for loop放置

			for (int i = 1; i <= people; i++) {//对i个吃饭的人提问
			System.out.print("Person #" + i + ": How much did your dinner cost? ");//prompt
			double personCost = console.nextDouble();//每个人吃饭的花钱数
			subtotal = subtotal + personCost;//加入subtotal
	}
	return subtotal;//将subtotal返还main
	}

	public static void results(double subtotal) {
		double tax = subtotal * .08;//
		double tip = subtotal * .15;//
		double total = subtotal + tax + tip;//
		System.out.printf("Subtotal: $%6.2f\n", subtotal);//
		System.out.printf("Tax: $%6.2f\n", tax);//
		System.out.printf("Tip: $%6.2\n", tip);//
		System.out.printf("Total: $%6.2f\n", total);//
}
}