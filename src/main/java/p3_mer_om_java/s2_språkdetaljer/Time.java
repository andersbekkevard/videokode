package p3_mer_om_java.s2_språkdetaljer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {
	public static void main(String[] args) {
		// Dato og Tid i Java
		LocalDate christmas = LocalDate.of(2025, 12, 24);
		System.out.println(christmas);

		// Hent ut dagens dato
		LocalDate date = LocalDate.now();
		System.out.println(date);

		// Hent ut dagens tid
		LocalTime time = LocalTime.now();
		System.out.println(time);

		// Hent ut dagens dato og tid
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		// Kan også slå de sammen
		LocalDateTime dateTime2 = LocalDateTime.of(date, time);
		System.out.println(dateTime2);

		System.out.println(dateTime.equals(dateTime2));

		// Deretter trener vi på dokumentasjonen
		// Ønsker å få til
		// 1. Hente ut året av dagens dato (getYear)
		// 2. Lage en LocalDate som representerer i morgen (plusDays)
		// ^Herunder forklare at immutable
		// 3. Lage en LocalDateTime som er dagens dagens dato men i januar (withYear)
	}
}
