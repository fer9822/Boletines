package tema5_4_ArraysClass;

import java.util.Arrays;

public class CopyOf {

	public static void main(String[] args) {
		
		int array1[] = { 3, 4, 5, 6, 7, 8, 9, 10 };
		int array2[]=Arrays.copyOf(array1, 5);
		int array3[]=Arrays.copyOf(array1, 10);
		
		System.out.println(Arrays.toString(array2));//[3, 4, 5, 6, 7]
		System.out.println(Arrays.toString(array3));//[3, 4, 5, 6, 7, 8, 9, 10, 0, 0]
		
	}
	
}
