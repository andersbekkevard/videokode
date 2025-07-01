package p1_intro_java.s3_metoder;

public class Input {
	// Metoder med inputparametre
	public static void scream(String sentence) {
		System.out.println(sentence.toUpperCase() + "!!!");
	}

	// Som også returnerer en verdi
	public static int sum(int a, int b) {
		return a + b;
	}

	// Metoden overloading
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	// Må fortsatt returnere int
	public static int sum(String a, String b) {
		return a.length() + b.length();
	}

	/*
	 * Ettersom vi definerer alle datatypene til parametrene, lar java oss gjøre
	 * noe kult
	 * 
	 * Vi kan definere den samme metoden flere ganger, så lenge hver av dem tar inn
	 * forskjellige kombinasjoner av datatyper
	 * 
	 * Når vi kaller metoden, vil java velge den varianten som passer til
	 * parametrene vi har gitt inn
	 * 
	 * Dette kalles "method overloading"
	 * 
	 * For at det skal gi mening at vi bruker metoden senere, og tilordner den til
	 * variabler, må hver variant av metoden returnere den samme datatypen. Vi kan
	 * for eksempel ikke lage en sum(String ...) som slår sammen strenger, men vi
	 * kan lage en som summerer lengdene til strengene
	 * 
	 */

	public static void main(String[] args) {
		scream("hjelp meg");
		int number = sum(1, 2);
		System.out.println(number);
		int length = sum("hjelp", "meg");
	}
}
