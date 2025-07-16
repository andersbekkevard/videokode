package p6_funksjonell_programmering.s3_comparator_iterator.iterator;

import java.util.Iterator;

public class TwoNumbers implements Iterable<Integer> {
	private int a;
	private int b;

	public TwoNumbers(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Range(a, b, 1);
	}

	public static void main(String[] args) {
		TwoNumbers twoNumbers = new TwoNumbers(1, 10);
		for (int i : twoNumbers) {
			System.out.println(i);
		}
	}

}
