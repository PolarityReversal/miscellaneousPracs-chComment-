import java.util.Scanner;

public class Rain {
	public static void main(String[] Args) {
		Scanner temp = new Scanner(System.in);
		System.out.println("Temperature today in F is ");
		int F = temp.nextInt();
		Scanner rain = new Scanner(System.in);
		System.out.println("Is it raining?(true/false) ");
		boolean R = rain.nextBoolean();
		
		if (F >= 40 && F <= 100 && R == true) {
			System.out.print("Good Weather");
		}	else if(F >= 70 && F <= 110 && R == false) {
			System.out.print("Good Weather");
		}	else {
			System.out.print("Bad Weather");
		}
			
	}
}
//为什么if boolean(boolean == true)单独用不行