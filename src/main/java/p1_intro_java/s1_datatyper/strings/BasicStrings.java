package p1_intro_java.s1_datatyper.strings;

public class BasicStrings {

	public static void main(String[] args) {

		// Enkle String-metoder i Java

		String address = "Sluppenveien 14";

		// Henter ut lengden av teksten
		int length = address.length();
		System.out.println(length);

		// Henter ut en bokstav på en gitt indeks
		char thirdChar = address.charAt(2);
		System.out.println(thirdChar);

		// Henter ut indeksen til en bokstav
		int indexOfV = address.indexOf("v");
		System.out.println(indexOfV);

		// Konverterer til store bokstaver
		String upperCase = address.toUpperCase();
		System.out.println(upperCase);

		// Konverterer til små bokstaver
		String lowerCase = address.toLowerCase();
		System.out.println(lowerCase);

		// *Legg inn mellomrom før og etter teksten*
		// Trimmer bort mellomrom før og etter teksten
		String trimmed = address.trim();
		System.out.println(trimmed);

		// Erstatt alle p med t
		String replaced = address.replace("p", "t");
		System.out.println(replaced);

		// Kan også bytte ut flere bokstaver på en gang
		String replaced2 = address.replace("veien", "gaten");
		System.out.println(replaced2);

		// Kan bruke til å fjerne deler av teksten
		String withoutSluppen = address.replace("Sluppen", "");
		System.out.println(withoutSluppen);

		// IsEmpty og isBlank, legger til og fjerner mellomrom
		String emptyString = "  ";
		System.out.println(emptyString.isEmpty());
		System.out.println(emptyString.isBlank());

		// Sjekker om to strenger er like
		String streng1 = "Hei";
		String streng2 = "hei";
		System.out.println(streng1.equals(streng2));

		// Sjekker om to strenger er like, ignorerer små og store bokstaver
		System.out.println(streng1.equalsIgnoreCase(streng2));
	}
}
