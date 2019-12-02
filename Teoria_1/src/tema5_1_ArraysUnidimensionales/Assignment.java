package tema5_1_ArraysUnidimensionales;

import java.util.Arrays;

public class Assignment {

	public static void main(String[] args) {
		
		int a[];
		int b[]={3,4,5,6,7,8};
		a=b;
		System.out.println(Arrays.toString(b));//[3, 4, 5, 6, 7, 8]
		a[0]=1; 
		System.out.println(Arrays.toString(b));//[1, 4, 5, 6, 7, 8]

	}

}
