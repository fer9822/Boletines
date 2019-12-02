package tema1_7_TiposEnumeradosSimples.enumClaseIndependiente;

public class SimpleEnum {
	
	public static void main(String[] args) {

		DayOfWeek d;
		d = DayOfWeek.MONDAY;
		System.out.println(d == DayOfWeek.MONDAY ? true:false);
		d = DayOfWeek.SUNDAY;
		System.out.println(d == DayOfWeek.MONDAY ? true:false);
		
	}

}
