package p6_funksjonell_programmering.s4_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsExercisesFinished {

	/**
	 * Oppgave 1: Skriv ut alle tall større enn 7
	 *
	 * Gitt en liste med heltall, skriv ut hvert tall som er større enn 7.
	 * Tallene skal skrives ut til konsollen.
	 *
	 * @param list listen med heltall som skal filtreres og skrives ut
	 */
	public static void Task1(List<Integer> list) {
		list.stream().filter(x -> x > 7).forEach(System.out::println);
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
		return list.stream().filter(x -> x.length() > 5).collect(Collectors.toList());
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
		return list.stream().map(x -> x * 2).collect(Collectors.toList());
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
		return list.stream().max(Integer::compareTo).get();
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
		return list.stream().allMatch(x -> x > 0);
	}

	/**
	 * Oppgave 6: Generer tall fra 0 til 20
	 *
	 * Returner en liste med heltall fra 0 til og med 20.
	 *
	 * @return en liste med tall fra 0 til 20
	 */
	public static List<Integer> Task6() {
		return IntStream.range(0, 21).boxed().collect(Collectors.toList());
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
		return list.stream().filter(x -> x % 2 == 0).limit(10).collect(Collectors.toList());
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
		return Arrays.stream(array).sorted().boxed().collect(Collectors.toList());
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
		return list.stream().collect(Collectors.joining(", "));
	}

	/**
	 * Oppgave 10: Filtrer voksne personer
	 *
	 * Gitt en liste med personer, returner en ny liste med alle personer som er
	 * eldre enn 18 år.
	 *
	 * @param list listen med personer
	 * @return en ny liste med personer som er over 18 år
	 */
	public static List<Person> Task10(List<Person> list) {
		return list.stream().filter(x -> x.getAge() > 18).collect(Collectors.toList());
	}
}