import java.util.Scanner;

public class TimeForLunch {
	/*time to go out for lunch. Inputs are distance
	to restaurant, average walking speed, time
	required to finish meal, time available,
	expected cost of meal, and money available
}

	times are expressed as whole number of
	minutes
	money is expressed as a double
	*/
	
	public static void main(String[] Args) {
		Scanner lunch = new Scanner(System.in);
		System.out.print("Please input distance/speed/required time/available time/required money/ available money: ");
		double distance = lunch.nextDouble();
		double walking_speed = lunch.nextDouble();
		double time_required = lunch.nextDouble();
		double time_available = lunch.nextDouble();
		int money_required = lunch.nextInt();
		int money_available = lunch.nextInt();
		
		/*构建算式
		 * distance(m)
		 * velocity(m/min)
		 * time(min)
		 * 似乎可以不用计算出required time，直接用t_avail * walk_sped即可
		 */
		
		if (time_available * walking_speed >= distance && money_available >= money_required) {
			System.out.print("We can go to lunch!");
		}	else {
			System.out.print("We cannot go to lunch.");
		}
		// 此处可分隔elseif,理由：时间不够，或者没钱
		
}
}