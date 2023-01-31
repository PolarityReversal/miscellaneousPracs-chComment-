public class Mystery {
	public static void main(String[] Args) {
	
	int x =	4;
	int y = 5;
	
	x = mystery(x, y);//return目标点，mystery(x,y)实际上是mystery(4,5)，做mystery中关于x的运算
	//after this, x = 4*3 = 12, y = 5
	
	System.out.print(x + " " +	y); 
	
	y = mystery(x, x);//在上一个mystery运算中，x被重新赋值为12，此时即y=mystery(12, 12)
	//after this, x = 12不变，y = 12 * 3 = 36
			
	System.out.print(" " + x + " " + y);
	}
	
	public static int mystery(int x, int y) {
		
		x *= 3;
		y = x / y;
		return x;
			}
}

//  mystery function将int x和y 的值update, return回到main，造成的结果是print中会有 2 + 2 的四个数字
//	int取整，因此例如x/y = 12/5会被近似为2
//  实际上，根本原因在于 mystery(x,y)或者mystery(x,x)或者其他什么，它们其实都是mystery(~~) = return ##, return 的值会变为上方的mystery()