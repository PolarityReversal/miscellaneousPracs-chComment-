import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] Args) {
		Scanner number = new Scanner(System.in);
		System.out.print("Test if the entry is perfect: ");
		int divider = number.nextInt();
		
		//测试数字是否PERFECT
		//以
		
		int divisor = 2;
		int adder = 1;
		
		for (int counter = 1; counter <= (divider / 2); counter++) {
		if (divider % divisor == 0 && divider != 1) {
			adder += divisor;
			divisor += 1;
		}
		else 
			divisor += 1;{
		}
		}
		
		System.out.print("sum of divisors = " + adder);
		System.out.println();
		
		if (adder > divider) {
			System.out.print("this number is deficient.");
		}	else if (adder < divider) {
			System.out.print("this number is excessive");
		}
		else	{
			System.out.print("this number is perfect");
			}
		
		}
	}
