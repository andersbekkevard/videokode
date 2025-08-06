package p3_mer_om_java.s1_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {

	public static void main(String[] args) {

		// Maps på formatet key: value
		// Hvor key brukes for å finne values: Keyen må være unik, value kan gjentas

		Map<String, Character> grades = new HashMap<>();

		// karakterer {(n1, k1), (n2, k2), (n3, k3) ... }

		grades.put("Anne", 'A');
		grades.put("Bjørg", 'B');

		if (grades.containsKey("Anne")) {
			System.out.println("Annes karakter er registrert");
		}

		// Siden keys må være unike overskriver dette valuen som stod fra før
		grades.put("Anne", 'C');

		// INNEHOLDER IKKE ANNE A OG ANNE C BARE SISTE OPPFØRING

		if (grades.containsValue('F')) {
			System.out.println("Noen har fått F");
		}

		System.out.println("Anne fikk " + grades.get("Anne"));

		// Kan legge til en antakelse om at om key ikke finnes
		System.out.println("Frode fikk " + grades.getOrDefault("Frode", 'F'));

		System.out.println("\nRegistrerte navn:");
		for (String s : grades.keySet()) {
			System.out.println(s);
		}

		System.out.println("\nRegistrerte karakterer:");
		for (Character c : grades.values()) {
			System.out.println(c);
		}

		grades.remove("Bjørg");

		System.out.println("\nUtskrift:");
		for (Entry<String, Character> e : grades.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		// Man kan også ha en liste i et map.
		Map<String, List<Integer>> leaderboardTracker = new HashMap<>();
		List<Integer> ottosRankings = new ArrayList<>(Arrays.asList(5, 2, 7));
		List<Integer> annasRankings = new ArrayList<>();

		leaderboardTracker.put("Otto", ottosRankings);
		leaderboardTracker.put("Anna", annasRankings);

		annasRankings.add(1);

		System.out.println(leaderboardTracker.get("Otto"));
		System.out.println(leaderboardTracker.get("Anna"));
	}
}

public class Maps {

	public static void main(String[] args) {

		// Map<T, S> varName = new HashMap<>();
		Map<String, Character> grades = new HashMap<>();
		// karakterer {(n1, k1), (n2, k2), (n3, k3) ... }

		grades.put("Anne", 'A');
		grades.put("Bjørg", 'B');
		// System.out.println(grades);

		if (grades.containsKey("Anne")) {
			// System.out.println("Anne er registrert");
		}

		grades.put("Anne", 'C');
		// System.out.println(grades);

		if (grades.containsValue('F')) {
			// System.out.println("Noen har fått F");
		}

		// System.out.println("Frode fikk " + grades.getOrDefault("Frode", 'F'));

		// System.out.println("Registrerte navn:");
		for (String s : grades.keySet()) {
			// System.out.println(s);
		}

		// System.out.println("Registrerte karakterer:");
		for (Character c : grades.values()) {
			// System.out.println(c);
		}

		// System.out.println("Utskrift:");
		for (Entry<String, Character> e : grades.entrySet()) {
			// System.out.println(e.getKey() + ":" + e.getValue());
		}

		Map<String, List<Integer>> leaderboardTracker = new HashMap<>();
		List<Integer> ottosPlacements = new ArrayList<>(Arrays.asList(2, 5, 7));
		List<Integer> annasPlacements = new ArrayList<>();

		leaderboardTracker.put("Otto", ottosPlacements);
		leaderboardTracker.put("Anna", annasPlacements);

		annasPlacements.add(1);
		leaderboardTracker.get("Anna").add(10);

		System.out.println(leaderboardTracker.get("Otto"));
		System.out.println(leaderboardTracker.get("Anna"));

	}

}
