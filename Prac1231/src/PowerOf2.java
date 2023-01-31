public class PowerOf2 {
	public static void main(String[] Args){
	    printPowersOf2(3);
	    printPowersOf2(10);
	}
	    
	    public static void printPowersOf2(int counter){
	        int a = 1;
	        int b = 2;
	    	for (int n = 1; n <= (counter + 1); n++) {
	            System.out.print(a + " ");
	            a = b;
	            b *= 2;
	        }
	        System.out.println();
	    }
}
//a b 分别定义，和n counter脱钩，达成2次方的效果