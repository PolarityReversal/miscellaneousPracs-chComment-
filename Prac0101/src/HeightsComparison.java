import java.util.Scanner;

public class HeightsComparison {
	// first为第一个人的身高, second为第二个人的身高,分别用feet+inches来计量
	// input两人身高，判断各自属于short/medium/tall,然后比较
	public static void main(String[] Args) {
		Scanner first = new Scanner(System.in);
		System.out.print("first height(ft_in): ");
		int feet1 = first.nextInt();
		int inche1 = first.nextInt();
		
		//如果feet小于5, 如果feet=5且inch<=3
		//如果feet=5且inch>=3且inch<=11
		//如果feet>=6
		//else if 可以 没有else
		
		if (feet1 < 5 || (feet1 == 5 && inche1 <= 3)) {
			System.out.println("short");
		}	else if (feet1 == 5 && inche1 >= 3 && inche1 <= 11) {
				System.out.println("medium");
			}	else if(feet1 >= 6) {
					System.out.println("tall");
			}
	
		System.out.println();
		
		Scanner second = new Scanner(System.in);
		System.out.print("second height(ft_in): ");
		int feet2 = second.nextInt();
		int inche2 = second.nextInt();

		if (feet2 < 5 || (feet2 == 5 && inche2 <= 3)) {
		System.out.println("short");
		}	else if (feet2 == 5 && inche2 >= 3 && inche2 <= 11) {
			System.out.println("medium");
			}		else if(feet2 >= 6) {
				System.out.println("tall");
			}
		
		System.out.println();
		
		if (feet1 > feet2 || (feet1 == feet2 && inche1 > inche2)) {
			System.out.print("person 1 is taller than person 2");
		}	else if (feet1 == feet2 && inche1 == inche2) {
			System.out.print("they have equal heights");
		}	else {
			System.out.print("person 2 is taller than person 1");
			}
			
		
	}
}
		
		
