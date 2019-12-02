/*
 * 1. char charAt(int index)
2. int length()
3. boolean equals(Object anObject):
• Compara dos cadenas
• Compara tres cadenas
4. int codePointAt(int index)
5. int compareTo(String anotherString)
6. int compareToIgnoreCase(String str)
7. String concat(String str)
8. boolean endsWith(String suffix)
9. boolean equals(Object anObject)
10. boolean equalsIgnoreCase(String anotherString)
11. int indexOf(int ch)
12. int indexOf(int ch, int fromIndex)
IES Saladillo. CFGS DAM. Programación. Eva Peralta Macías
13. boolean isEmpty()
14. int lastIndexOf(int ch)
15. int lastIndexOf(int ch, int fromIndex)
16. String replace(char oldChar, char newChar)
17. String toUpperCase()
18. String trim()

 */
package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		String str = "Eustaquio", str1 = "Tragabuche" , str2 = "Bandolero";
		char r=str1.charAt(5), p=str1.charAt(0);
		System.out.println("1) " + (str.charAt(3)));
		System.out.println("2) " + (str.length()));
		System.out.println("3.1) " + (str.equals(str1)));
		System.out.println("3.2) " + (str.equals(str1) && str1.equals(str2)));
		System.out.println("4) " + (str.compareTo(str2)));
		System.out.println("5) " + (str.compareToIgnoreCase(str1)));
		System.out.println("6) " + (str1.concat(str2)));
		System.out.println("7) " + (str.endsWith(str1)));
		System.out.println("8) " + (str.equals(str)));
		System.out.println("9) " + (str.indexOf(str2)));
		System.out.println("10) " + (str.indexOf(str1, 2)));
		System.out.println("11) " + (str1.replace(r, p)));
		System.out.println("12) " + (str2.toUpperCase()));
		System.out.println("13) " + (str.trim()));
	}

}
