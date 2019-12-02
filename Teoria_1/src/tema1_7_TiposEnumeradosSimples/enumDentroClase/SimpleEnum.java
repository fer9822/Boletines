package tema1_7_TiposEnumeradosSimples.enumDentroClase;

public class SimpleEnum {
	
	public enum DayOfWeek {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args) {

		DayOfWeek d;
		d = DayOfWeek.MONDAY;
		System.out.println(d == DayOfWeek.MONDAY ? true:false);
		d = DayOfWeek.SUNDAY;
		System.out.println(d == DayOfWeek.MONDAY ? true:false);
		
	}

}
