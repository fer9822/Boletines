package tema5_2_ArraysMultidimensionales;

public class ArraysForEach {

	public static void main(String[] args) {
		
		//Array de dos dimensiones [3][5]
		int twoDimensions[][]= { {0, 1, 2, 3, 4}, 
	 			 				 {5, 6, 7, 8, 9},
	 			 				 {10, 11, 12, 13, 14} };

		for(int i:twoDimensions[1]) {//Recorro el segundo array unidimensional del array bidimensional
			System.out.println(i);
		}
		
	}

}
