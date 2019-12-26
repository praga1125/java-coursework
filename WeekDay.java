public class WeekDay {
	String getWeekDay(int dayNumber) {
		String day = null;
		switch(dayNumber) {
		case 1:
			day = "sunday";
			break;
		case 2:
			day = "monday";
			break;
		case 3:
			day="tuesday";
			break;
		case 4:
			day="wednesday";
			break;
		case 5:
			day="thursday";
			break;
		case 6:
			day="friday";
			break;
		case 7:
			day="saturday";
			break;
		}
		return day;
	}
public static void main(String args[]) {
	WeekDay obj = new WeekDay();
	String day = obj.getWeekDay(1);
	System.out.println(day);
}
}
