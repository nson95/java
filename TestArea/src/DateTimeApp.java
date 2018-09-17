import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateTimeApp {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		
		LocalDate halloween = LocalDate.of(2018, 10, 31);
		System.out.println(halloween);
		
		LocalDate christmas = LocalDate.of(2018, 12, 25);
		System.out.println(christmas);
		
		
		
		LocalDateTime thanksgiving = LocalDateTime.of(2018, 11, 22, 13, 00, 00);
		System.out.println("Thanksgiving falls on a: " +thanksgiving.getDayOfWeek());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		System.out.println(dtf.format(thanksgiving));
		if (halloween.isBefore(christmas)) {
			
			System.out.println("true");
			
			LocalDate feb29 = halloween.plus(1, ChronoUnit.DAYS);
			System.out.println(feb29);
		}
		
		
		
	}

}
