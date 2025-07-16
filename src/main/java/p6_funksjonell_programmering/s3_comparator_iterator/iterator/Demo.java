package p6_funksjonell_programmering.s3_comparator_iterator.iterator;

import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// Steg 1
		List<String> list = List.of("a", "b", "c");
		Iterator<String> iterator = list.iterator();

		// Steg 2
		System.out.println(iterator.hasNext());
		System.out.println(iterator.next());

		// Steg 3
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Steg 4
		for (String s : list) {
			System.out.println(s);
		}
	}
}
