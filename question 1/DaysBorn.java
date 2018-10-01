import java.time.*;

public class DaysBorn {
	public static void main(String [] args) {
		boolean DEBUG = true;
		ZonedDateTime today = ZonedDateTime.now();
		ZonedDateTime birthday = ZonedDateTime.parse("1998-07-15T10:00:00+00:00[America/Los_Angeles]");
		if (DEBUG) {
		System.out.println("Today's Local date : " + today);
		System.out.println("Birthday's Local date : " + birthday);
		}
		today.minusYears(birthday.getYear());
		int yearsPassed = today.getYear() - birthday.getYear();
		if (DEBUG) {
		System.out.println("yearsPassed : " + yearsPassed);
		}
		int daysPassed = today.getDayOfYear() - birthday.getDayOfYear();
		if (DEBUG) {
		System.out.println("days passed: " + daysPassed);
		}
		int totalDaysPassed = (yearsPassed * 365) + daysPassed;
		System.out.println("Days elapsed since birth: " + totalDaysPassed);
		
	}
	

}
