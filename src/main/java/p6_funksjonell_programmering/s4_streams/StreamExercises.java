package p6_funksjonell_programmering.s4_streams;

import java.util.Arrays;
import java.util.List;

public class StreamExercises {

	/**
	 * Oppgave 1: Skriv ut alle tall større enn 7
	 *
	 * Gitt en liste med heltall, skriv ut hvert tall som er større enn 7.
	 * Tallene skal skrives ut til konsollen.
	 *
	 * @param list listen med heltall som skal filtreres og skrives ut
	 */
	public static void Task1(List<Integer> list) {
		// TODO
	}

	/**
	 * Oppgave 2: Filtrer lange ord
	 *
	 * Gitt en liste med tekststrenger, returner en ny liste som kun inneholder
	 * ordene som er lengre enn 5 tegn.
	 *
	 * @param list listen med ord
	 * @return en ny liste med ord som har mer enn 5 tegn
	 */
	public static List<String> Task2(List<String> list) {
		// TODO
		return null;
	}

	/**
	 * Oppgave 3: Multipliser alle tall med 2
	 *
	 * Gitt en liste med heltall, returner en ny liste hvor hvert tall er
	 * multiplisert med 2.
	 *
	 * @param list listen med heltall
	 * @return en ny liste med tall som er doblet
	 */
	public static List<Integer> Task3(List<Integer> list) {
		// TODO
		return null;
	}

	/**
	 * Oppgave 4: Finn det største tallet
	 *
	 * Gitt en liste med heltall, returner det største tallet i listen.
	 *
	 * @param list listen med heltall
	 * @return det største tallet i listen
	 */
	public static int Task4(List<Integer> list) {
		// TODO
		return 0;
	}

	/**
	 * Oppgave 5: Sjekk om alle tall er positive
	 *
	 * Gitt en liste med heltall, returner true dersom alle tallene er større enn 0,
	 * ellers returner false.
	 *
	 * @param list listen med heltall
	 * @return true hvis alle tall er større enn 0, ellers false
	 */
	public static boolean Task5(List<Integer> list) {
		// TODO
		return false;
	}

	/**
	 * Oppgave 6: Generer tall fra 0 til 20
	 *
	 * Returner en liste med heltall fra 0 til og med 20.
	 *
	 * @return en liste med tall fra 0 til 20
	 */
	public static List<Integer> Task6() {
		// TODO
		return null;
	}

	/**
	 * Oppgave 7: Hent de 10 første partallene
	 *
	 * Gitt en liste med heltall, returner en ny liste med de første 10 partallene.
	 * Hvis listen inneholder færre enn 10 partall, returneres alle tilgjengelige.
	 *
	 * @param list listen med heltall
	 * @return en liste med de 10 første partallene
	 */
	public static List<Integer> Task7(List<Integer> list) {
		// TODO
		return null;
	}

	/**
	 * Oppgave 8: Sorter array
	 *
	 * Gitt et array av heltall, returner en ny sortert liste med tallene i stigende
	 * rekkefølge.
	 *
	 * @param array arrayet som skal sorteres
	 * @return en sortert liste med tallene fra arrayet
	 */
	public static List<Integer> Task8(int[] array) {
		// TODO
		return null;
	}

	/**
	 * Oppgave 9: Slå sammen ord med komma
	 *
	 * Gitt en liste med tekststrenger, slå dem sammen til én enkelt streng
	 * der hvert ord er atskilt med komma og mellomrom.
	 *
	 * @param list listen med ord
	 * @return en enkelt streng med ordene separert med ", "
	 */
	public static String Task9(List<String> list) {
		// TODO
		return null;
	}

	/**
	 * Oppgave 10: Finn voksne personer
	 *
	 * Gitt en liste med personer, returner en ny liste med alle personer som er
	 * eldre enn 18 år.
	 *
	 * @param list listen med personer
	 * @return en ny liste med personer som er over 18 år
	 */
	public static List<Person> Task10(List<Person> list) {
		// TODO
		return null;
	}

	public static void main(String[] args) {
		// testTask1();
		// testTask2();
		// testTask3();
		// testTask4();
		// testTask5();
		// testTask6();
		// testTask7();
		// testTask8();
		// testTask9();
		testTask10();
	}

	public static void testTask1() {
		System.out.println("=== Task 1: Skriv ut alle tall større enn 7 ===");
		List<Integer> list = Arrays.asList(1, 5, 8, 10, 3, 7, 9);
		Task1(list);
		System.out.println();
	}

	public static void testTask2() {
		System.out.println("=== Task 2: Filtrer lange ord (> 5 tegn) ===");
		List<String> list = Arrays.asList("banan", "appelsin", "kiwi", "drue", "vannmelon");
		List<String> result = Task2(list);
		System.out.println("Resultat: " + result);
		System.out.println();
	}

	public static void testTask3() {
		System.out.println("=== Task 3: Multipliser alle tall med 2 ===");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> result = Task3(list);
		System.out.println("Resultat: " + result);
		System.out.println();
	}

	public static void testTask4() {
		System.out.println("=== Task 4: Finn det største tallet ===");
		List<Integer> list = Arrays.asList(12, 34, 9, 56, 87, 23);
		int result = Task4(list);
		System.out.println("Største tall: " + result);
		System.out.println();
	}

	public static void testTask5() {
		System.out.println("=== Task 5: Sjekk om alle tall er positive ===");
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(-1, 0, 3, 4);
		System.out.println("Alle positive (liste 1): " + Task5(list1));
		System.out.println("Alle positive (liste 2): " + Task5(list2));
		System.out.println();
	}

	public static void testTask6() {
		System.out.println("=== Task 6: Generer tall fra 0 til 20 ===");
		List<Integer> result = Task6();
		System.out.println("Resultat: " + result);
		System.out.println();
	}

	public static void testTask7() {
		System.out.println("=== Task 7: Hent de 10 første partallene ===");
		List<Integer> list = Arrays.asList(1, 4, 3, 5, 2, 6, 8, 10, 3, 12, 14, 16, 18, 20, 22);
		List<Integer> result = Task7(list);
		System.out.println("Resultat: " + result);
		System.out.println();
	}

	public static void testTask8() {
		System.out.println("=== Task 8: Sorter array ===");
		int[] array = { 7, 3, 1, 9, 4, 6 };
		List<Integer> result = Task8(array);
		System.out.println("Sortert liste: " + result);
		System.out.println();
	}

	public static void testTask9() {
		System.out.println("=== Task 9: Slå sammen ord med komma ===");
		List<String> list = Arrays.asList("eple", "banan", "appelsin", "kiwi");
		String result = Task9(list);
		System.out.println("Resultat: " + result);
		System.out.println();
	}

	public static void testTask10() {
		System.out.println("=== Task 10: Finn voksne personer (alder > 18) ===");
		List<Person> list = Arrays.asList(
				new Person("Anna", 17),
				new Person("Jonas", 21),
				new Person("Kari", 30),
				new Person("Petter", 15));
		List<Person> result = Task10(list);
		result.forEach(p -> System.out.println(p.getName() + " (" + p.getAge() + ")"));
		System.out.println();
	}

}