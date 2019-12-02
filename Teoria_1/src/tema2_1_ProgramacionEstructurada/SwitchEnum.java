package tema2_1_ProgramacionEstructurada;

public class SwitchEnum {
	
	public enum DayOfWeek {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args) {
	
		DayOfWeek d=DayOfWeek.MONDAY;
		switch (d) {
		case MONDAY:
			System.out.println("Lunes");
			break;
		case TUESDAY:
			System.out.println("Martes");
			break;
		case WEDNESDAY:
			System.out.println("Miércoles");
			break;
		case THURSDAY:
			System.out.println("Jueves");
			break;
		case FRIDAY:
			System.out.println("Viernes");
			break;
		case SATURDAY:
			System.out.println("Sábado");
			break;
		case SUNDAY:
			System.out.println("Domingo");
			break;
		}		

	}

}
