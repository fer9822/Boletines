package tema5_4_ArraysClass;

import java.util.Arrays;

public class DeepToString {

	public static void main(String[] args) {
		
		int array[][]= { {0, 1, 2, 3, 4}, 
							     {5, 6, 7, 8, 9},
							     {10, 11, 12, 13, 14} };
		
		System.out.printf("La información del array es: %s",Arrays.deepToString(array));

	}

}
