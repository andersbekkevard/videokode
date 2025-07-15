package p6_funksjonell_programmering.s3_comparator_iterator.comparator;

import java.util.Comparator;

public class ClownComparator implements Comparator<Clown> {

	@Override
	public int compare(Clown o1, Clown o2) {
		return o1.getHumorLevel() - o2.getHumorLevel();
	}
}
