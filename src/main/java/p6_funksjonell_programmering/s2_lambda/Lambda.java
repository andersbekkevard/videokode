package p6_funksjonell_programmering.s2_lambda;

import java.util.Comparator;
import java.util.function.Predicate;

public class Lambda {
	public static void main(String[] args) {
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		};

		Comparator<String> c2 = (String o1, String o2) -> {
			return o1.length() - o2.length();
		};

		Comparator<String> c3 = (String o1, String o2) -> o1.length() - o2.length();

		Comparator<String> c4 = (o1, o2) -> o1.length() - o2.length();

		Predicate<String> p = s -> s.length() > 0;
	}
}
