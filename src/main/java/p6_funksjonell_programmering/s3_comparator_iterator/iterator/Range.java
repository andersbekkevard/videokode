package p6_funksjonell_programmering.s3_comparator_iterator.iterator;

import java.util.Iterator;

public class Range implements Iterator<Integer> {
	/**
	 * I denne videoen skal vi snakke om iterators
	 * Det er en måte å gå gjennom elementene i en samling på
	 * På samme måte som Comparable og Comparator, så er det to versjoner av dette
	 * mønsteret:
	 * Du har en Iterator, som er et eget objekt for å gå gjennom elementene i en
	 * samling
	 * Dette er litt som en comparator, altså sitt eget objekt
	 * 
	 * I tillegg har du Iterable, som er en interface et objekt kan impelmentere for
	 * å si at "jeg kan lage en iterator meg selv"
	 * Dette er litt som Comparable, altså at logikken ligger i klassen selv
	 * 
	 * Noen av klassene i java Implementerer allerede iterable, som Lister.
	 * * Demonstrer*
	 * for(var x:y), .iterator -> .hasNext og .next
	 * 
	 * -> Dette er alt vi trenger for å kunne gå gjennom en samling
	 * 
	 * Definerer vår egen iterator (Range)
	 * 
	 * 
	 */

	private int stop;
	private int current;
	private int step;

	public Range(int start, int stop, int step) {
		this.current = start;
		this.stop = stop;
		this.step = step;
	}

	@Override
	public boolean hasNext() {
		return current < stop;
	}

	@Override
	public Integer next() {
		int result = current;
		current += step;
		return result;
	}

	public static void main(String[] args) {
		Range range = new Range(0, 10, 2);
		while (range.hasNext()) {
			System.out.println(range.next());
		}
	}
}
