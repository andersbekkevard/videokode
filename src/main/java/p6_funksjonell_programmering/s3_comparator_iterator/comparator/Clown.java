package p6_funksjonell_programmering.s3_comparator_iterator.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 1. Forklar Clown-klassen
 * 2. Skriv og forklar ClownComparator-klassen
 * 3. Demonstrer bruk av .compare()
 * 4. Demonstrer bruk av .sort()
 * 5. Implementer Comparable<Clown> i Clown-klassen
 */
public class Clown implements Comparable<Clown> {
	private String name;
	private int humorLevel;

	public Clown(String name, int humorLevel) {
		this.name = name;
		this.humorLevel = humorLevel;
	}

	public int getHumorLevel() {
		return humorLevel;
	}

	@Override
	public String toString() {
		return name + " (" + humorLevel + ")";
	}

	public static void main(String[] args) {
		Clown krusty = new Clown("Krusty the Clown", 8);
		Clown pennywise = new Clown("Pennywise", 1);
		Clown ronald = new Clown("Ronald McDonald", 5);

		Comparator<Clown> c = new ClownComparator();
		System.out.println(c.compare(krusty, pennywise));

		List<Clown> clowns = new ArrayList<>();
		clowns.add(krusty);
		clowns.add(pennywise);
		clowns.add(ronald);
		System.out.println(clowns);
		clowns.sort(c);

		// kan erstattes med disse to:
		// clowns.sort(null);
		// Collections.sort(clowns);

		System.out.println(clowns);
	}

	// Dette er steg 5: "Implementer Comparable<Clown> i Clown-klassen"
	@Override
	public int compareTo(Clown o) {
		return this.humorLevel - o.humorLevel;
	}

}
