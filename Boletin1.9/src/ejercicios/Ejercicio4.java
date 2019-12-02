/*
 * 1. byte byteValue()
2. static int compare(int x, int y)
3. int compareTo(Integer anotherInteger)
4. double doubleValue()
5. boolean equals(Object obj)
6. int intValue()
7. static int max(int a, int b)
8. static int min(int a, int b)
9. static int parseInt(String s)
10. static int sum(int a, int b)
11. static Integer valueOf(int i)
12. static Integer valueOf(String s)

 */
package ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		Integer a = 4, b = 6;
		int c = 2, d = 3;
		String str = "12";
		byte bt;
		int i;
		System.out.println("1) " + (bt = a.byteValue()));
		System.out.println("2)" + (Integer.compare(a, b)));
		System.out.println("3)" + (a.compareTo(b)));
		System.out.println("4) " + (a.doubleValue()));
		System.out.println("5) " + (a.equals(b)));
		System.out.println("6) " + (i = b.intValue()));
		System.out.println("7) " + (Integer.max(c, d)));
		System.out.println("8) " + (Integer.min(c, d)));
		System.out.println("9) " + (i = Integer.parseInt(str)));
		System.out.println("10) " + (i = Integer.sum(c, d)));
		System.out.println("11) " + (i = Integer.valueOf(c)));
		System.out.println(("12) " + (i = Integer.valueOf(str))));

	}

}
