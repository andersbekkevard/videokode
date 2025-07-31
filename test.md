<file_map>
/Users/andersbekkevard/dev/java/enkeleksamen/videokode
└── src
    └── main
        └── java
            └── p1_intro_java
                ├── s1_datatyper
                │   ├── Arrays.java *
                │   └── PrimDataTyp_el_Operatorer.java *
                │   ├── strings
                │   │   ├── BasicStrings.java *
                │   │   ├── DeleStrenger.java *
                │   │   ├── Format.java *
                │   │   └── format.py *
                ├── s2_løkker
                │   ├── Loops.java *
                │   └── Loops.py *
                ├── s3_metoder
                │   ├── Input.java *
                │   └── Metoder.java *
                └── s4_password_checker
                    └── PasswordChecker.java *
</file_map>

<file_contents>
File: /Users/andersbekkevard/dev/java/enkeleksamen/videokode/src/main/java/p1_intro_java/s1_datatyper/strings/BasicStrings.java
```java
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

```

File: /Users/andersbekkevard/dev/java/enkeleksamen/videokode/src/main/java/p1_intro_java/s1_datatyper/strings/DeleStrenger.java
```java
package p1_intro_java.s1_datatyper.strings;

public class DeleStrenger {
	public static void main(String[] args) {

		// Metoder for å dele opp strenger

		// Hente ut en del av en streng
		String email = "obama@stud.ntnu.no";
		String end = email.substring(6);
		System.out.println(end);

		// Hente ut en del med start- og slutt-indeks
		String name = email.substring(0, email.indexOf("@"));
		System.out.println(name);

		// Kan også gjøre dette på en annen måte
		String[] parts = email.split("@");
		System.out.println(parts[0]);
		System.out.println(parts[1]);

		// Hva hvis vi vil sette de sammen igjen?
		String fullEmail = parts[0] + "@" + parts[1];
		System.out.println(fullEmail);
	}
}

```

File: /Users/andersbekkevard/dev/java/enkeleksamen/videokode/src/main/java/p1_intro_java/s1_datatyper/strings/Format.java
```java
package p1_intro_java.s1_datatyper.strings;

public class Format {
	public static void main(String[] args) {

		// Formatere Strings i Java - Minner om Python f-strings

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

```

File: /Users/andersbekkevard/dev/java/enkeleksamen/videokode/src/main/java/p1_intro_java/s1_datatyper/strings/format.py
```py
# Med f-strings kan vi bruke variabler direkte i strengen

name = "obama"
email = f"{name}@stud.ntnu.no"
print(email)

```

File: /Users/andersbekkevard/dev/java/enkeleksamen/videokode/src/main/java/p1_intro_java/s1_datatyper/Arrays.java
```java
package p1_intro_java.s1_datatyper;

public class Arrays {

	public static void main(String[] args) {

		// To måter å opprette arrays på

		// Tomt array med plass til 3 tall. Tallet inni klammeparentesene til høyre er størrelsen
		int[] tall = new int[3];
		// [0, 0, 0]
		// Skriver plasseringen til et element i arrayen for å referere til den plassen. Starter på indeks null
		tall[0] = 10;
		tall[1] = 20;
		// [10, 20, 0]

		// Med verdier direkte. Størrelse og verdier gitt ved opprettelse
		int[] andreTall = { 10, 20, 30 };
		// [10, 20, 30]

		System.out.println(tall); // Denne skriver bare ut en id for arrayen, som kan ses på som adressen til arrayen, ikke hva den inneholder
		// Må hente ut en og en verdi
		System.out.println("Tall: " + tall[0] + ", " + tall[1] + ", " + tall[2]);
		// Ser også her at siden vi ikke definerte tall[2] ble den satt til verdien 0
		

		System.out.println(andreTall.length);
		// Er bundet av lengden vi definerte arrayen til i begynnelsen
		// tall[4] = 50;
		// System.out.println(andreTall[3]);

		String[] navn = { "Kari", "Ola" };
		System.out.println("Første navn i lista: " + navn[0]);

	}
}

```

File: /Users/andersbekkevard/dev/java/enkeleksamen/videokode/src/main/java/p1_intro_java/s1_datatyper/PrimDataTyp_el_Operatorer.java
```java
package p1_intro_java.s1_datatyper;

public class PrimDataTyp_el_Operatorer {

	public static void main(String[] args) {

		// Addere heltall
		int epler = 3;
		int bananer = 5;
		System.out.println(epler + bananer);

		// Kan sette sammen regning med tekst for å gjøre utskrift mer lesbar
		int frukt = epler + bananer;
		System.out.println(frukt);
		String info = "Antall frukt: ";
		System.out.println(info + frukt);
		System.out.println("Antall frukt: " + frukt);

		// SÅ IKKE GÅ GJENNOM å samle frukter
		// Bruker paranteser for å sikre rekkefølgen på utførelse
		System.out.println("Antall frukt: " + epler + bananer);
		System.out.println("Antall frukt: " + (epler + bananer));

		// Vi får så plutselig 4 appelsiner til
		frukt = frukt + 4;
		frukt += 4;
		frukt -= 4;
		// antallFrukt *= 2;
		// antallFrukt /= 2;
		frukt += 1;
		frukt++;
		frukt--;
		System.out.println("Antall epler, bananer og appelsiner: " + frukt);

		// Datatypene som inngår påvirker datatypen til resultatet
		int a = 5;
		int b = 3;
		System.out.println("5 + 3 = " + (a + b));

		System.out.println("5 / 3 = " + (a / b));

		double c = 3.0;
		System.out.println("5 / 3.0 = " + (a / c));
		// heltall / desimaltall = desimaltall

	}
}

```

File: /Users/andersbekkevard/dev/java/enkeleksamen/videokode/src/main/java/p1_intro_java/s2_løkker/Loops.java
```java
package p1_intro_java.s2_løkker;

public class Loops {

	public static void main(String[] args) {

		int poeng = 87;
		poeng++;
		boolean duSkrevAdressenTilSensorIBesvarelsen = true;

		// Uten boolsk først, legg så til
		if (poeng >= 90 || duSkrevAdressenTilSensorIBesvarelsen) {
			System.out.println("Karakter A");
		} else if (poeng >= 80) {
			System.out.println("Karakter B");
		} else if (poeng >= 70) {
			System.out.println("Karakter C");
		} else {
			System.out.println("Du må øve mer");
		}

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		for (int i = 0; i < 10; i += 3) {
			System.out.println(i);
		}

		int n = 0;
		while (true) {
			if (n > 10) {
				break;
			}
			if (n % 2 == 0) {
				System.out.println(n + " er partall");
			}
			n++;
		}

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i + " er et oddetall");
		}

		int x = 10;
		if (x > 6 && x < 15) {
			System.out.println("x er mellom 6 og 15");
		} else if (x == 6 || x == 15) {
			System.out.println("x er 6 eller 15");
		} else {
			System.out.println("x er ikke mellom 6 og 15");
		}


		// For each løkker er også en penere og enklere måte om man kun skal hente ut elementer

		String[] names = { "Ola", "Hans", "Leif" };

		for (String name : names) {
			System.out.println(name);
		}

	}
}
```

File: /Users/andersbekkevard/dev/java/enkeleksamen/videokode/src/main/java/p1_intro_java/s2_løkker/Loops.py
```py
alder = 21

if alder >= 18:
    print("Du er myndig!")

for i in range(10):
    print(i)

n = 0
while n <= 10:
    if n % 2 == 0:
        print(f"{n} er partall")
    n += 1

tall_vi_leter_etter = 5
maks_tall = 10
for i in range(maks_tall):
    if i != tall_vi_leter_etter:
        print("Ikke funnet ennå")
        continue
    print("JIPPI! Jeg fant")
    break

funnet_tall = False
tall_vi_undersoker = 0
while not funnet_tall:
    if tall_vi_undersoker == tall_vi_leter_etter:
        print(f"Vi fant tallet {tall_vi_leter_etter}")
        funnet_tall = True
    tall_vi_undersoker += 1

x = 10
if 6 < x < 12:
    print("x er mellom 5 og 12")
else:
    print("x er ikke mellom 5 og 12")

```

File: /Users/andersbekkevard/dev/java/enkeleksamen/videokode/src/main/java/p1_intro_java/s3_metoder/Input.java
```java
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

```

File: /Users/andersbekkevard/dev/java/enkeleksamen/videokode/src/main/java/p1_intro_java/s3_metoder/Metoder.java
```java
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

```

File: /Users/andersbekkevard/dev/java/enkeleksamen/videokode/src/main/java/p1_intro_java/s4_password_checker/PasswordChecker.java
```java
package p1_intro_java.s4_password_checker;

import java.util.List;

/**
 * PasswordChecker-klasse
 * Hvert passord må:
 * 
 * - Være minst 8 tegn langt
 * 
 * - Inneholde minst én bokstav (a–z eller A–Z)
 * 
 * - Inneholde minst ett siffer (0–9)
 * 
 * - Ikke inneholde mellomrom
 * 
 */

public class PasswordChecker {
	public static final List<String> passwords = List.of(
			"short", // For kort (mindre enn 8 tegn)
			"12345678", // Ingen bokstaver
			"abcdefgh", // Ingen siffer
			"pass word", // Inneholder mellomrom
			"ValidPass123" // Gyldig passord (oppfyller alle kriterier)
	);

	public static final String UPPER_CASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String LOWER_CASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
	public static final String DIGITS = "0123456789";
	public static final String SPACE = " ";

	public static boolean isLongEnough(String password) {
		return password.length() >= 8;
	}

	public static boolean containsLetter(String password) {
		for (char c : password.toCharArray()) {
			if (UPPER_CASE_LETTERS.indexOf(c) != -1 || LOWER_CASE_LETTERS.indexOf(c) != -1) {
				return true;
			}
		}
		return false;
	}

	public static boolean containsDigit(String password) {
		for (char c : password.toCharArray()) {
			if (DIGITS.indexOf(c) != -1) {
				return true;
			}
		}
		return false;
	}

	public static boolean containsWhitespace(String password) {
		return password.contains(SPACE);
	}

	public static boolean isValid(String password) {
		return isLongEnough(password) && containsLetter(password) && containsDigit(password)
				&& !containsWhitespace(password);
	}

	public static void printPasswordValidation(String password) {
		System.out.println("Password: " + password);
		if (isValid(password)) {
			System.out.println("Password is valid");
			return;
		}
		System.out.println("Password is invalid, because:");
		if (!isLongEnough(password)) {
			System.out.println("Password is too short");
		}
		if (!containsLetter(password)) {
			System.out.println("Password does not contain a letter");
		}
		if (!containsDigit(password)) {
			System.out.println("Password does not contain a digit");
		}
		if (containsWhitespace(password)) {
			System.out.println("Password contains whitespace");
		}
		System.out.println("--------------------------------");
	}

	public static void main(String[] args) {
		for (String password : passwords) {
			printPasswordValidation(password);
		}
	}
}
```
</file_contents>
<user_instructions>
Instructions go here
</user_instructions>
