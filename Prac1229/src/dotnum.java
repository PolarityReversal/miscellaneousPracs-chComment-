public class dotnum {
	public static void main(String[] Args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (-1 * i + 5); j++) {//每行产出i-1个数的点
				System.out.print(".");//同行用print
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);//末尾附加数字并换行
			}
			System.out.println();
		}
	}
}
