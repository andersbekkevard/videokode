package p1_intro_java.s1_datatyper;

public class VidBasicStrings {

	// Enkle String-metoder i Java

	public static void main(String[] args) {

		String adresse = "Sluppenveien 14";

		// int length = adresse.length();
		// System.out.println(length);

		// char thirdChar = adresse.charAt(2);
		// System.out.println(thirdChar);

		// int indexOfV = adresse.indexOf("v");
		// System.out.println(indexOfV);

		// String upperCase = adresse.toUpperCase();
		// System.out.println(upperCase);
		// System.out.println(adresse);

		// String lowerCase = adresse.toLowerCase();
		// System.out.println(lowerCase);

		// String trimmedText = adresse.trim();
		// System.out.println(trimmedText);
		// System.out.println(adresse);

		// String newAdress = adresse.replaceAll("veien", "gaten");
		// System.out.println(newAdress);

		// String shortAdress = adresse.replace("Sluppen", "");
		// System.out.println(shortAdress);

		String streng1 = "hei";
		String streng2 = "Hei";
		boolean erLike = streng1.equalsIgnoreCase(streng2);
		System.out.println(erLike);
	}
}
