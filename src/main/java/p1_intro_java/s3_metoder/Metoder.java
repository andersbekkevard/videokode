package p1_intro_java.s3_metoder;

public class Metoder {
	// Funksjoner (Python) = Metoder (Java)

	// Vi har allerede vært borte i main-metoden
	// Enkelt sagt må all kode som skal kjøres stå inne i main-metoden
	// Vi kan fortsatt definere andre metoder utenfor

	// public static void main(String[] args) {
	// }

	// Samme syntaks
	public static String doSomething() {
		/*
		 * Vi skal senere gå gjennom hvorfor vi må skrive public static
		 * Men kort fortalt er dette modifikatorer som bestemmer hvordan man får tilgang
		 * på metoden vår,
		 * og for at den skal oppføre seg som vi er kjent med i Python
		 * er det public static som blir riktig
		 */
		// Vi kan prøve å printe noe i metoden vår
		System.out.println("hello");

		/*
		 * Som vi har lært må java alltid vite hvilken datatype et objekt er
		 * Det er for eksempel derfor vi må skrive
		 */

		String language = "Java";

		// og ikke bare
		// age = 20;

		// Det samme gjelder for metoder; vi må si til java hvilken datatype vi skal
		// returnere, og da må vi returnere den typen.

		// void betyr at vi ikke returnerer noe
		// vi kan for nå prøve å returnere en verdi

		return language; // får error i editor, må bytte void -> String

		/*
		 * Java krever at vi sier hvilken datatype vi skal returnere, men ikke om det
		 * faktisk skal være noe der
		 * Dersom vi aldri gir en verdi til language, vil vi fortsatt få lov til å
		 * returnere language
		 * Men da vil det ikke være noe der, og vi vil returnere ingenting, eller null
		 * som det heter i Java
		 * 
		 * Java betrakter altså denne som en string, selv om det ikke er noe der
		 * 
		 * - Demonstrer at får errors ved å kalle language.length()
		 * 
		 * Dette er det samme som å skrive
		 * String language = null;
		 */
	}

	public static void main(String[] args) {
		// doSomething();

		// Vi kan nå kalle metoden vår i main-metoden
		// String language = doSomething();
		// System.out.println(language);

		// Som vi ser, får vi feil ved å kalle length() på language fordi den ikke
		// finnes
		// System.out.println(language.length());

	}
}
