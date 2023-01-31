public class LRslash {
	public static void main(String[] Args) {
		for (int head = 1; head <= 11; head++) {
			System.out.print("!!");
		}
		System.out.println();
		for (int counter = 1; counter <= 5; counter++) {
			for (int L = counter; L >= 1; L--) {
				System.out.print("\\");
				System.out.print("\\");
			}
			for (int M = 1; M <= ((6 - counter) * 2 - 1); M++) {
				System.out.print("!!");
				
			}
			for (int R = counter; R >= 1; R--) {
				System.out.print("//");
			}
			System.out.println();
			}
	}
}
// \\!!//
// 6-counter <=5 ++ 和 counter >=1 -- 作用一致
// 注意中央M不能设成counter，会导致第二行开始缺失一对！！