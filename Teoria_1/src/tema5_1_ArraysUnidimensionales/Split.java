package tema5_1_ArraysUnidimensionales;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		
		String string="Esto:es:una:cadena:dividida:por:split";
		String stringArray[]=string.split(":");
		System.out.println(Arrays.toString(stringArray));//[Esto, es, una, cadena, dividida, por, split]

	}

}
