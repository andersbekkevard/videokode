package p6_funksjonell_programmering.s2_lambda;

import java.util.Comparator;

public class SimpleComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}

}
