package p1_intro_java.s1_datatyper;

public class DeleStrenger {
	public static void main(String[] args) {
		// Metoder for å dele opp strenger

		// Hente ut en del av en streng
		String email = "obama@stud.ntnu.no";
		String end = email.substring(6);
		System.out.println(end);

		// Hente ut en del med start og slutt indeks
		String name = email.substring(0, email.indexOf("@"));
		System.out.println(name);

		// Kan også gjøre dette på en annen måte
		String[] parts = email.split("@");
		System.out.println(parts[0]);

	}
}
