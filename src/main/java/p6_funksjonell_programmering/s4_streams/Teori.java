package p6_funksjonell_programmering.s4_streams;

import java.util.Arrays;
import java.util.List;

public class Teori {

	/**
	 * Task 1: Flatten a list of lists into a single list
	 */

	public static void Task1(List<List<Integer>> liste) {

	}

	/**
	 * Task 2: Filter out even numbers
	 */
	public static void Task2() {
		List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		liste.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
	}

	public static void Task3() {
		List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		liste.stream().map(x -> x * 2).forEach(System.out::println);
	}

	public static void Task4() {
		List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		liste.stream().reduce((a, b) -> a + b).ifPresent(System.out::println);
	}

	public static void Task5() {
	}
}