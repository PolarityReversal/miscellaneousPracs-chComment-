public class trialFindNth {
	public static void main(String[] Args) {
	
	int integer = 12453445;
	int digit = 6;
	
	int NUMofDIGITS = 1;
	
	for (int digitCounter = integer; digitCounter >= 10; digitCounter /= 10) {
		NUMofDIGITS += 1;
	}
	
	int pointer = NUMofDIGITS - digit + 1;
	
	double result = Math.floor((integer % Math.pow(10, pointer)) / Math.pow(10, pointer - 1));
	
	int resultint = (int) result;
	
	System.out.println(NUMofDIGITS);
	System.out.print(resultint);
}
}
