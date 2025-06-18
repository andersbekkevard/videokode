package p0_oppsett;

import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		Predicate<String> p = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() > 10;
			}
		};
	}
}
