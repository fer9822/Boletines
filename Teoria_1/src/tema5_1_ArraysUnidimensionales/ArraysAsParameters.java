package tema5_1_ArraysUnidimensionales;

import java.util.Arrays;

public class ArraysAsParameters {

	public static void main(String[] args) {
		
		int array[]={3,4,5,6,7,8};
		System.out.println(Arrays.toString(array));//[3, 4, 5, 6, 7, 8]
		method(array);
		System.out.println(Arrays.toString(array));//[6, 8, 10, 12, 14, 16]

	}
	public static void method(int array[]) {
		
		for(int i=0;i<array.length;i++) {			
			array[i]*=2;			
		}
		
	}

}
