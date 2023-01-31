//pg30 of topic3 practice problem -- 画图
public class DrawPrac {
	public static void main(String[] Arg){
		up1();
		lower1();
		System.out.println();
		lower1();
		line();
		System.out.println();
		System.out.println();
		up1();
		stop();
		lower1();
		System.out.println();
		System.out.println();
		up1();
		line();
}

//hexagon upper，注意括号数量，\\合法，/\不合法，双引号合法,画图的套路
	public static void up1() {
		System.out.println("  ______");
		System.out.println(" /      \\");
		System.out.println("/        \\");
	}


//hexagon lower
	public static void lower1() {
		System.out.println("\\        /");
		System.out.println(" \\______/");
	}

//dotted line
	public static void line() {
		System.out.println("+--------+");
	}

//stop sign
	public static void stop() {
		System.out.println("|  stop  |");
	}
}

//另一解法可用拆分每个component into一个method来做