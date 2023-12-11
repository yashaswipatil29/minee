package day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateAndTimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating system date time and timestamp
		LocalDate today=LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		LocalDateTime currentTimeStamp = LocalDateTime.now();
		
		
		System.out.println(today);
		System.out.println(currentTime);
		System.out.println(currentTimeStamp );
		
		//customizing the dates
		LocalDate independanceDate = LocalDate.of(1947,8,15);
		System.out.println(independanceDate);
		
		LocalDate nextDate = today.plus(2,ChronoUnit.DAYS);
		System.out.println(nextDate);
	}

}
