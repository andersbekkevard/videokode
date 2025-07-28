package p6_funksjonell_programmering.s4_streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OldStreams {
	/**
	 * Filter
	 * map
	 * flatMap
	 * distinct
	 * sorted
	 * limit
	 * skip
	 * forEach
	 * toArray
	 * collect
	 * min, max, count, anyMatch, allMatch, noneMatch, findFirst, findAny.
	 * toList
	 * collect(Collectors.toCollection(ArrayList::new))
	 * sum
	 * reduc
	 */

	public static List<Integer> Task1(List<Integer> list, Predicate<Integer> predicate) {
		return list.stream().filter(predicate).collect(Collectors.toList());
	}

	public static List<Integer> Task2(List<Integer> list) {
		return list.stream().map(x -> x * 2).collect(Collectors.toList());
	}

	public static Integer Task3(List<Integer> list) {
		return list.stream().reduce((a, b) -> a + b).orElse(0);
	}

	public static int sum(int[] array) {
		return Arrays.stream(array).sum();
	}

	public static int smartum(int... num) {
		return Arrays.stream(num).sum();
	}

	public static void main(String[] args) {
		int n = sum(new int[] { 1, 2, 3, 4, 5 });
		int m = smartum(1, 2, 3, 4, 5);
	}
}