public class RETURN_PRACCCCCC {
	public static void main(String[] Args) {

		int result = method(1234546, 5);
		System.out.print("the Nth digit is " + result);
		
	}
	
		public static int method(int integer, int nth) {
			
			int digit = 1;
			
			for (int digitCounter = integer; digitCounter >= 10; digitCounter /= 10) {
				digit += 1;
			}
			
			int pointer = digit - nth + 1;
			
			double value = Math.floor((integer % Math.pow(10, pointer)) / Math.pow(10, pointer - 1));
			
			int valueint = (int) value;
			
			return (valueint);
		}
	}


/*–
return the int average of 3 ints - done
–
return the double average of 3 ints - done
–
return the average of a given number of rolls of 2 six sided dice - done
–
calculate and return N factorial (N!). - done
–
return the number of seconds in a given number of years. - done
–
return the Nth digit of a given integer. - 
–
return the distance between two points. - 
*/