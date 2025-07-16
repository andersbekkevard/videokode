package p6_funksjonell_programmering.s4_streams.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * This class contains a series of tasks designed to teach first-year university
 * students
 * about Java's Comparator interface, particularly the functional style using
 * Comparator.comparing(), thenComparing(), and reversed().
 *
 * Each task is an empty method shell that students need to implement.
 * The main method contains calls to test each task's implementation.
 */
public class NewTasks {

	// --- Data Classes for Tasks ---
	// region Data Classes
	/**
	 * Represents a person with a name and an age. Used in Task 5.
	 */
	public record Person(String name, int age) {
	}

	/**
	 * Represents a book with title, author, publication year, and number of pages.
	 * Used in Tasks 6 and 7.
	 */
	public record Book(String title, String author, int yearPublished, int pages) {
	}

	/**
	 * Represents a department in a company. Used in Tasks 8, 9, and 10.
	 */
	public enum Department {
		SALES, ENGINEERING, MARKETING, HR
	}

	/**
	 * Represents an employee with a name, department, salary, and years of service.
	 * Used in Tasks 8, 9, and 10.
	 */
	public record Employee(String name, Department department, int salary, int yearsOfService) {
	}
	// endregion

	// region Tasks for Students to Implement

	/**
	 * TASK 1:
	 * Sort a list of strings by their length in ascending order.
	 * The shortest string should come first.
	 *
	 * HINT: Use Comparator.comparing() with a method reference to String::length.
	 *
	 * @param words A list of strings. The method should sort this list in-place or
	 *              return a new sorted list.
	 * @return The sorted list of strings.
	 */
	public static List<String> task1(List<String> words) {
		// TODO: Implement the sorting logic here.
		throw new UnsupportedOperationException("Task 1 is not implemented yet.");
	}

	/**
	 * TASK 2:
	 * Sort a list of strings by their length in descending order.
	 * The longest string should come first.
	 *
	 * HINT: Build on your solution for Task 1 and use the .reversed() method.
	 *
	 * @param words A list of strings.
	 * @return The sorted list of strings.
	 */
	public static List<String> task2(List<String> words) {
		// TODO: Implement the sorting logic here.
		throw new UnsupportedOperationException("Task 2 is not implemented yet.");
	}

	/**
	 * TASK 3:
	 * Find the longest string in a list.
	 *
	 * HINT: Use the .max() method on a stream, along with a Comparator.
	 * Remember that .max() returns an Optional.
	 *
	 * @param words A list of strings.
	 * @return The string with the greatest length. Return null if the list is
	 *         empty.
	 */
	public static String task3(List<String> words) {
		// TODO: Implement the logic here.
		throw new UnsupportedOperationException("Task 3 is not implemented yet.");
	}

	/**
	 * TASK 4:
	 * Sort a list of integers by their absolute value in ascending order.
	 *
	 * HINT: Comparator.comparing() can take a lambda expression, e.g.,
	 * Comparator.comparing(n -> Math.abs(n)).
	 *
	 * @param numbers A list of integers.
	 * @return The sorted list of integers.
	 */
	public static List<Integer> task4(List<Integer> numbers) {
		// TODO: Implement the sorting logic here.
		throw new UnsupportedOperationException("Task 4 is not implemented yet.");
	}

	/**
	 * TASK 5:
	 * Sort a list of Person objects by their age in ascending order.
	 *
	 * HINT: Use Comparator.comparingInt() with a method reference to the 'age'
	 * field.
	 *
	 * @param people A list of Person objects.
	 * @return The sorted list of people.
	 */
	public static List<Person> task5(List<Person> people) {
		// TODO: Implement the sorting logic here.
		throw new UnsupportedOperationException("Task 5 is not implemented yet.");
	}

	/**
	 * TASK 6:
	 * Sort a list of Book objects. The primary sort key is the year of publication
	 * (ascending).
	 * If two books were published in the same year, the secondary sort key is the
	 * title (alphabetical).
	 *
	 * HINT: Chain .thenComparing() after your primary comparator.
	 *
	 * @param books A list of Book objects.
	 * @return The sorted list of books.
	 */
	public static List<Book> task6(List<Book> books) {
		// TODO: Implement the sorting logic here.
		throw new UnsupportedOperationException("Task 6 is not implemented yet.");
	}

	/**
	 * TASK 7:
	 * Sort a list of Book objects. The primary sort key is the author's name
	 * (alphabetical).
	 * The secondary sort key is the number of pages, in descending order (most
	 * pages first).
	 *
	 * HINT: For the secondary sort, you can use
	 * .thenComparing(Comparator.comparingInt(...).reversed()).
	 *
	 * @param books A list of Book objects.
	 * @return The sorted list of books.
	 */
	public static List<Book> task7(List<Book> books) {
		// TODO: Implement the sorting logic here.
		throw new UnsupportedOperationException("Task 7 is not implemented yet.");
	}

	/**
	 * TASK 8:
	 * Sort a list of employees based on multiple criteria:
	 * 1. Department (in the natural order of the enum: SALES, ENGINEERING, etc.)
	 * 2. Salary (descending)
	 * 3. Name (alphabetical)
	 *
	 * HINT: This requires chaining multiple .thenComparing() calls.
	 *
	 * @param employees A list of Employee objects.
	 * @return The sorted list of employees.
	 */
	public static List<Employee> task8(List<Employee> employees) {
		// TODO: Implement the sorting logic here.
		throw new UnsupportedOperationException("Task 8 is not implemented yet.");
	}

	/**
	 * TASK 9:
	 * Find the employee with the highest salary in the ENGINEERING department.
	 *
	 * HINT: First, filter the list to get only engineers. Then, find the maximum
	 * using a stream and a comparator for salary.
	 *
	 * @param employees A list of Employee objects.
	 * @return The Employee object with the highest salary in ENGINEERING. Return
	 *         null if no engineers are found.
	 */
	public static Employee task9(List<Employee> employees) {
		// TODO: Implement the logic here.
		throw new UnsupportedOperationException("Task 9 is not implemented yet.");
	}

	/**
	 * TASK 10:
	 * Create a versatile employee sorter.
	 * This method should sort a list of employees based on their years of service.
	 * A boolean parameter indicates whether the sort should be ascending or
	 * descending.
	 * If two employees have the same years of service, the one with the higher
	 * salary should come first.
	 * If their salaries are also the same, they should be sorted by name
	 * alphabetically.
	 *
	 * HINT: Create a base comparator for years of service. If descending is
	 * requested,
	 * use the .reversed() method. Then, chain .thenComparing() for the other
	 * criteria.
	 *
	 * @param employees            The list of employees to sort.
	 * @param sortByYearsAscending If true, sort by years of service ascending. If
	 *                             false, sort descending.
	 * @return A new list of employees, sorted according to the rules.
	 */
	public static List<Employee> task10(List<Employee> employees, boolean sortByYearsAscending) {
		// TODO: Implement the sorting logic here.
		throw new UnsupportedOperationException("Task 10 is not implemented yet.");
	}
	// endregion

	// region Main Method and Test Runners

	public static void main(String[] args) {
		System.out.println("Welcome to the Comparator tasks! Uncomment the test methods in main to check your work.");

		// --- Uncomment the tasks one by one as you complete them ---
		// testTask1();
		// testTask2();
		// testTask3();
		// testTask4();
		// testTask5();
		// testTask6();
		// testTask7();
		// testTask8();
		// testTask9();
		// testTask10();
	}
	// endregion

	// region Test Helper Methods

	private static void testTask1() {
		List<String> input = new ArrayList<>(Arrays.asList("Java", "is", "fun", "and", "powerful"));
		List<String> expected = Arrays.asList("is", "fun", "and", "Java", "powerful");
		List<String> actual = null;
		try {
			actual = task1(new ArrayList<>(input));
		} catch (UnsupportedOperationException ignored) {
		}
		printTestResult("Task 1: Sort Strings by Length", expected, actual);
	}

	private static void testTask2() {
		List<String> input = new ArrayList<>(Arrays.asList("Java", "is", "fun", "and", "powerful"));
		List<String> expected = Arrays.asList("powerful", "Java", "fun", "and", "is");
		List<String> actual = null;
		try {
			actual = task2(new ArrayList<>(input));
		} catch (UnsupportedOperationException ignored) {
		}
		printTestResult("Task 2: Sort Strings by Length (Reversed)", expected, actual);
	}

	private static void testTask3() {
		List<String> input = Arrays.asList("The", "quick", "brown", "fox", "jumps");
		String expected = "jumps";
		String actual = null;
		try {
			actual = task3(new ArrayList<>(input));
		} catch (UnsupportedOperationException ignored) {
		}
		printTestResult("Task 3: Find Longest String", expected, actual);
	}

	private static void testTask4() {
		List<Integer> input = new ArrayList<>(Arrays.asList(-5, 1, 4, -2, 3));
		List<Integer> expected = Arrays.asList(1, -2, 3, 4, -5);
		List<Integer> actual = null;
		try {
			actual = task4(new ArrayList<>(input));
		} catch (UnsupportedOperationException ignored) {
		}
		printTestResult("Task 4: Sort Integers by Absolute Value", expected, actual);
	}

	private static void testTask5() {
		List<Person> input = new ArrayList<>(
				Arrays.asList(new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 35)));
		List<Person> expected = Arrays.asList(new Person("Bob", 25), new Person("Alice", 30),
				new Person("Charlie", 35));
		List<Person> actual = null;
		try {
			actual = task5(new ArrayList<>(input));
		} catch (UnsupportedOperationException ignored) {
		}
		printTestResult("Task 5: Sort People by Age", expected, actual);
	}

	private static void testTask6() {
		List<Book> input = new ArrayList<>(Arrays.asList(new Book("The Hobbit", "Tolkien", 1937, 310),
				new Book("A Game of Thrones", "Martin", 1996, 694),
				new Book("The Fellowship of the Ring", "Tolkien", 1954, 423), new Book("1984", "Orwell", 1949, 328)));
		List<Book> expected = Arrays.asList(new Book("The Hobbit", "Tolkien", 1937, 310),
				new Book("1984", "Orwell", 1949, 328), new Book("The Fellowship of the Ring", "Tolkien", 1954, 423),
				new Book("A Game of Thrones", "Martin", 1996, 694));
		List<Book> actual = null;
		try {
			actual = task6(new ArrayList<>(input));
		} catch (UnsupportedOperationException ignored) {
		}
		printTestResult("Task 6: Sort Books by Year, then Title", expected, actual);
	}

	private static void testTask7() {
		List<Book> input = new ArrayList<>(Arrays.asList(new Book("The Hobbit", "Tolkien", 1937, 310),
				new Book("A Game of Thrones", "Martin", 1996, 694), new Book("The Two Towers", "Tolkien", 1954, 352),
				new Book("The Return of the King", "Tolkien", 1955, 416)));
		List<Book> expected = Arrays.asList(new Book("A Game of Thrones", "Martin", 1996, 694),
				new Book("The Return of the King", "Tolkien", 1955, 416),
				new Book("The Two Towers", "Tolkien", 1954, 352), new Book("The Hobbit", "Tolkien", 1937, 310));
		List<Book> actual = null;
		try {
			actual = task7(new ArrayList<>(input));
		} catch (UnsupportedOperationException ignored) {
		}
		printTestResult("Task 7: Sort Books by Author, then Pages (Desc)", expected, actual);
	}

	private static void testTask8() {
		List<Employee> input = new ArrayList<>(Arrays.asList(new Employee("Dave", Department.ENGINEERING, 110000, 5),
				new Employee("Bob", Department.SALES, 95000, 4),
				new Employee("Alice", Department.ENGINEERING, 120000, 8),
				new Employee("Charlie", Department.ENGINEERING, 110000, 10)));
		List<Employee> expected = Arrays.asList(new Employee("Bob", Department.SALES, 95000, 4),
				new Employee("Alice", Department.ENGINEERING, 120000, 8),
				new Employee("Charlie", Department.ENGINEERING, 110000, 10),
				new Employee("Dave", Department.ENGINEERING, 110000, 5));
		List<Employee> actual = null;
		try {
			actual = task8(new ArrayList<>(input));
		} catch (UnsupportedOperationException ignored) {
		}
		printTestResult("Task 8: Sort Employees by Dept, Salary, Name", expected, actual);
	}

	private static void testTask9() {
		List<Employee> input = new ArrayList<>(Arrays.asList(new Employee("Dave", Department.ENGINEERING, 110000, 5),
				new Employee("Bob", Department.SALES, 125000, 4),
				new Employee("Alice", Department.ENGINEERING, 120000, 8)));
		Employee expected = new Employee("Alice", Department.ENGINEERING, 120000, 8);
		Employee actual = null;
		try {
			actual = task9(new ArrayList<>(input));
		} catch (UnsupportedOperationException ignored) {
		}
		printTestResult("Task 9: Find Highest Paid Engineer", expected, actual);
	}

	private static void testTask10() {
		List<Employee> input = new ArrayList<>(Arrays.asList(new Employee("Frank", Department.HR, 70000, 5),
				new Employee("Eve", Department.MARKETING, 80000, 2), new Employee("Grace", Department.HR, 75000, 5),
				new Employee("Hank", Department.HR, 70000, 5)));
		// Test ascending
		List<Employee> expectedAsc = Arrays.asList(new Employee("Eve", Department.MARKETING, 80000, 2),
				new Employee("Grace", Department.HR, 75000, 5), new Employee("Frank", Department.HR, 70000, 5),
				new Employee("Hank", Department.HR, 70000, 5));
		List<Employee> actualAsc = null;
		try {
			actualAsc = task10(new ArrayList<>(input), true);
		} catch (UnsupportedOperationException ignored) {
		}
		printTestResult("Task 10: Dynamic Sort (Years Ascending)", expectedAsc, actualAsc);

		// Test descending
		List<Employee> expectedDesc = Arrays.asList(new Employee("Grace", Department.HR, 75000, 5),
				new Employee("Frank", Department.HR, 70000, 5), new Employee("Hank", Department.HR, 70000, 5),
				new Employee("Eve", Department.MARKETING, 80000, 2));
		List<Employee> actualDesc = null;
		try {
			actualDesc = task10(new ArrayList<>(input), false);
		} catch (UnsupportedOperationException ignored) {
		}
		printTestResult("Task 10: Dynamic Sort (Years Descending)", expectedDesc, actualDesc);
	}

	// endregion

	// region Test Helper Methods
	/**
	 * A helper method to visually compare expected and actual results.
	 */
	private static void printTestResult(String taskTitle, Object expected, Object actual) {
		System.out.println("--- " + taskTitle + " ---");
		boolean success;

		if (expected instanceof List && (actual instanceof List || actual == null)) {
			List<?> expectedList = (List<?>) expected;
			List<?> actualList = (List<?>) actual;

			System.out.printf("%-45s | %-45s%n", "EXPECTED", "YOURS");
			System.out.println("-".repeat(94));

			int maxSize = expectedList.size();
			if (actualList != null) {
				maxSize = Math.max(maxSize, actualList.size());
			}

			for (int i = 0; i < maxSize; i++) {
				String exp = i < expectedList.size() ? expectedList.get(i).toString() : "[none]";
				String act = (actualList != null && i < actualList.size()) ? actualList.get(i).toString() : "[none]";
				if (actual == null)
					act = "Not Implemented";
				System.out.printf("%-45s | %-45s%n", exp, act);
			}
			System.out.println("-".repeat(94));
			success = expected.equals(actual);
		} else { // For single objects
			System.out.println("Expected output: " + (expected != null ? expected.toString() : "null"));
			System.out.println("Your output:     " + (actual != null ? actual.toString() : "null"));
			success = Objects.equals(expected, actual);
		}

		if (actual == null) {
			System.out.println("FAILURE: Task is not implemented yet or returns null.");
		} else if (success) {
			System.out.println("SUCCESS: Your implementation is correct!");
		} else {
			System.out.println("FAILURE: Your implementation is incorrect.");
		}
		System.out.println();
	}
	// endregion
}