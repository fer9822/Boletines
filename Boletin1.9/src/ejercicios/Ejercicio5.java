/*
 * 1. static int compare(double d1, double d2)
2. int compareTo(Double anotherDouble)
3. double doubleValue()
4. boolean equals(Object obj)
5. float floatValue()
6. int intValue()
7. boolean isInfinite()
8. static boolean isInfinite(double v)
9. boolean isNaN()
10. static boolean isNaN(double v)
11. static double max(double a, double b)
12. static double min(double a, double b)
13. static double parseDouble(String s)
14. static double sum(double a, double b)
15. static Double valueOf(double d)
16. static Double valueOf(String s)

 */
package ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {
		Double a=3.2, b=4.1;
		String s = "hola";
		System.out.println("1) " + (Double.compare(a,b)));
		System.out.println("2) " + (a.compareTo(b)));
		System.out.println("3) " + (a.doubleValue()));
		System.out.println("4) " + (a.equals(b)));
		System.out.println("5) " + (b.floatValue()));
		System.out.println("6) " + (b.intValue()));
		System.out.println("7) " + (a.isInfinite()));
		System.out.println("8) " + (Double.isInfinite(a)));
		System.out.println("9) " + (a.isNaN()));
		System.out.println("10) " + (a.isNaN()));
		System.out.println("11) " + (Double.max(a, b)));
		System.out.println("12) " + (Double.min(a, b)));
		//System.out.println("13) " + (Double.parseDouble(s)));
		System.out.println("14) " + (Double.sum(a, b)));
		System.out.println("15) " + (Double.valueOf(b)));
		//System.out.println("16) " + (Double.valueOf(s)));
	}

}
