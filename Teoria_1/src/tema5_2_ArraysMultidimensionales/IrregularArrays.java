package tema5_2_ArraysMultidimensionales;

import java.util.Arrays;

public class IrregularArrays {

	public static void main(String[] args) {
		
		int irregularArray[][]= { {1, 2, 3}, 
					 			  {4, 5, 6, 7},
					 			  {8, 9} };
		
		System.out.println(Arrays.deepToString(irregularArray));
		//[[1, 2, 3], [4, 5, 6, 7], [8, 9]]
	}

}
