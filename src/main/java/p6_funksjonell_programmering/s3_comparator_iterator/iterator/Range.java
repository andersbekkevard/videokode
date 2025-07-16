package p6_funksjonell_programmering.s3_comparator_iterator.iterator;

import java.util.Iterator;

public class Range implements Iterator<Integer> {

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
