package p6_funksjonell_programmering.s3_comparator_iterator.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class DumbList implements Iterator<String> {

	private String string1 = "a";
	private String string2 = "b";
	private String string3 = "c";

	private int index = 1;

	@Override
	public boolean hasNext() {
		return index < 5;
	}

	@Override
	public String next() {
		if (index == 1) {
			index++;
			return string1;
		} else if (index == 2) {
			index++;
			return string2;
		} else if (index == 3) {
			index++;
			return string3;
		} else {
			throw new NoSuchElementException("No more elements");
		}
	}

	public static void main(String[] args) {
		List<String> list = List.of("a", "b", "c");
		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
