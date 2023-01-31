
public class IJK2_16 {
	public static void main(String[] Arg) {
	int i = 2;
	int j = 3;
	int k = 4;
	int x = i + j + k;
	
	i = x - i - j;
	j = x - j - k;
	k = x - i - k;
	
	System.out.println(x);
	System.out.println(i);
	System.out.println(j);
	System.out.println(k);
	}
}

//每一步改变了ijk的值，对x的值并无影响，因此k=9-i'-k = 9-4-4 = 1