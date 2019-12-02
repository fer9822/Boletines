package tema5_4_ArraysClass;

import java.util.Arrays;

public class Equals {

	public static void main(String[] args) {

		int array1[] = { 3, 4, 5, 6, 7, 8 };
		int array2[] = { 3, 4, 5, 6, 7, 8 };
		int array3[] = { 3, 4, 5, 6, 7, 8, 9 };

		System.out.printf("%s y %s %s iguales\n",Arrays.toString(array1),Arrays.toString(array2),Arrays.equals(array1, array2)?"son":"no son");
		System.out.printf("%s y %s %s iguales\n",Arrays.toString(array1),Arrays.toString(array3),Arrays.equals(array1, array3)?"son":"no son");
		System.out.printf("%s y %s %s iguales en el rango 1-5",Arrays.toString(array1),Arrays.toString(array3),Arrays.equals(array1,1,6,array3,1,6)?"son":"no son");

	}

}
