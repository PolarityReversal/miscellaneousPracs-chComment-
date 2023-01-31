public class onetwothree {
	public static void main(String[] Args) {
	for (int i = 1; i <= 5; i++) {//外圈LOOP，i=1~5
		for (int j = 1; j <= i ; j++) {//内层LOOP，counter，第一行一个，第二行两个，跟i一起增长
		System.out.print(i);//内层loop执行，第一层执行print一次，第二层print两次
		}
		System.out.println();//外层loop执行，在每一外层的内层loop结束后换行,println用于换行
		}
}
}