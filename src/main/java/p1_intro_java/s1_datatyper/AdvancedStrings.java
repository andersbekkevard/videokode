package p1_intro_java.s1_datatyper;

public class AdvancedStrings {
	public static void main(String[] args) {

		// Grove String-metoder i Java

		// Hente ut en del av en streng
		String email = "obama@stud.ntnu.no";
		String name = email.substring(0, email.indexOf("@"));
		System.out.println(name);

		// Hente ut en del midt i strengen
		String domain = email.substring(email.indexOf("@") + 1);
		System.out.println(domain);

		// Hente ut en del midt i strengen
		String ntnu = email.substring(email.indexOf("n"), email.lastIndexOf("."));
		System.out.println(ntnu);

		// string.split()
		String[] parts = email.split("@");
		System.out.println(parts[0]);
		System.out.println(parts[1]);

		// String.format() spesifikatorer:
		// %s - String
		// %d - Decimal integer
		// %f - Floating point
		// (...)

		// Eksempler:
		System.out.println(String.format("String: %s", "Hello"));
		System.out.println(String.format("Integer: %d", 42));

		// Med float kan vi legge til .2 for å få 2 desimaler
		System.out.println(String.format("Float: %.2f", 3.14159));

		// String.format() med flere parametre
		String formatted = String.format("Hei %s, hva er eposten din? %s", name, email);
		System.out.println(formatted);
	}
	
}
