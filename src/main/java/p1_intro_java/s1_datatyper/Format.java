package p1_intro_java.s1_datatyper;

public class Format {
	public static void main(String[] args) {

		// Formatere Strings i Java

		String name = "obama";
		String email = "%s@stud.ntnu.no".formatted(name);
		System.out.println(email);

		String email2 = String.format("%s@stud.ntnu.no", name);
		System.out.println(email2);

		// Vi kan også bruke flere parametre
		String organization = "stud.ntnu";
		String countryCode = "no";
		String email3 = String.format("%s@%s.%s", name, organization, countryCode);
		System.out.println(email3);

		// String.format() spesifikatorer:
		// %s - String
		// %d - Decimal integer
		// %f - Floating point
		// (...)
		// *Demonstrer feilmelding ved %d og %f på email*

		// Med float kan vi legge til .2 for å få 2 desimaler
		// Bruker følgende syntax: %.2f

		double pi = 3.141592;
		String piFormatted = String.format("Pi: %.2f", pi);
		System.out.println(piFormatted);

		// String.format() med flere parametre
		String formatted = String.format("Hei %s, hva er eposten din? %s", name, email);
		System.out.println(formatted);
	}
}
