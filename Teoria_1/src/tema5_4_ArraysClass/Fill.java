package tema5_4_ArraysClass;

import java.util.Arrays;

public class Fill {

	public static void main(String[] args) {

		int array[] = new int[6];
		Arrays.fill(array,1);
		System.out.println(Arrays.toString(array));//[1, 1, 1, 1, 1, 1]
		Arrays.fill(array,2,5,0);
		System.out.println(Arrays.toString(array));//[1, 1, 0, 0, 0, 1]
	}

}
