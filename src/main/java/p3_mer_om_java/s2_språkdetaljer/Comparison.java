package p3_mer_om_java.s2_språkdetaljer;

import java.time.LocalDate;

public class Comparison {
	public static void main(String[] args) {
		// Sammenligning av primitive datatyper
		int x = 10;
		int y = 10;
		System.out.println(x == y);

		// Sammenligning av objekter
		LocalDate date1 = LocalDate.of(2025, 1, 1);
		LocalDate date2 = LocalDate.of(2025, 1, 1);
		System.out.println(date1 == date2);
		System.out.println(date1.equals(date2));

		// Går ikke ann å bruke .equals på primitive datatyper
		// System.out.println(x.equals(y));
		// Kun med wrapperklasser
		Integer x2 = 10;
		Integer y2 = 10;
		System.out.println(x2.equals(y2));

	}
}
