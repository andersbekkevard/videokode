package p3_mer_om_java.s2_språkdetaljer;

public class UsingStringBuilder {
	public static void main(String[] args) {

		// StringBuilder er en klasse som kan brukes til å bygge strenger
		// Den er mer effektiv enn å bruke + for å kombinere strenger

		String email = "";
		email = email + "otto";
		email = email + "@";
		email = email + "gmail";
		email = email + ".com";

		System.out.println(email);

		StringBuilder sb = new StringBuilder();
		sb.append("otto");
		sb.append("@");
		sb.append("gmail");
		sb.append(".com");
		// Demonstrer method chaining

		System.out.println(sb.toString());

		// StringBuilderen har også en del praktiske metoder
		// F.eks. insert, delete, replace, reverse, etc.
		sb.insert(4, ".kristiansen");
		System.out.println(sb.toString());

		sb.reverse();
		System.out.println(sb.toString());

	}
}
