package p6_funksjonell_programmering.s4_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorTasks {

	/**
	 * Task 1: Sort a list of strings alphabetically
	 * 
	 * Sort the given list of strings in alphabetical order (A-Z).
	 * The sorting should follow natural string ordering where "apple" comes before
	 * "banana".
	 * 
	 * Example: ["banana", "apple", "cherry"] should become ["apple", "banana",
	 * "cherry"]
	 * 
	 * @param strings the list of strings to sort
	 * @return a new sorted list containing the same strings in alphabetical order
	 */
	public static List<String> task1(List<String> strings) {
		// TODO: Implement this method
		return null;
	}

	/**
	 * Task 2: Return the number of strings longer than 3 characters
	 * 
	 * Example: ["hello", "hi", "world"] should return 2
	 * 
	 * @param strings the list of strings to sort
	 * @return the number of strings longer than 3 characters
	 */
	public static int task2(List<String> strings) {
		// TODO: Implement this method
		return 0;
	}

	/**
	 * Task 3: Sort people by age
	 * 
	 * Sort people by age (youngest first).
	 * 
	 * Example: From [Person("Alice", 25), Person("Bob", 30)] return
	 * [Person("Alice", 25), Person("Bob", 30)]
	 * 
	 * @param people the list of people to sort
	 * @return a new sorted list with people ordered by age
	 */
	public static List<Person> task3(List<Person> people) {
		// TODO: Implement this method
		return null;
	}

	/**
	 * Task 4: Find the person with the highest age
	 * 
	 * Find and return the person with the highest age from the given list.
	 * If multiple people have the same highest age, return any one of them.
	 * 
	 * Example: From [Person("Alice", 25), Person("Bob", 30)] return Person("Bob",
	 * 30)
	 * 
	 * @param people the list of people to search through
	 * @return the person with the highest age
	 */
	public static Person task4(List<Person> people) {
		// TODO: Implement this method
		return null;
	}

	/**
	 * Task 5: Sort people by age, then by name
	 * 
	 * Sort people first by age (youngest first), then by name (alphabetically)
	 * for people with the same age.
	 * 
	 * Example: [Person("Bob", 25), Person("Alice", 25)] should become
	 * [Person("Alice", 25), Person("Bob", 25)]
	 * 
	 * @param people the list of people to sort
	 * @return a new sorted list with people ordered by age, then name
	 */
	public static List<Person> task5(List<Person> people) {
		// TODO: Implement this method
		return null;
	}

	/**
	 * Task 6: Sort people by name in reverse alphabetical order
	 * 
	 * Sort people by their names in reverse alphabetical order (Z to A).
	 * "Zebra" should come before "Apple" in this ordering.
	 * 
	 * Example: [Person("Alice", 25), Person("Bob", 30)] should become
	 * [Person("Bob", 30), Person("Alice", 25)]
	 * 
	 * @param people the list of people to sort
	 * @return a new sorted list with people ordered by name in reverse alphabetical
	 *         order
	 */
	public static List<Person> task6(List<Person> people) {
		// TODO: Implement this method
		return null;
	}

	/**
	 * Task 7: Find the oldest student in a specific course
	 * 
	 * Find the oldest student who is enrolled in the specified course.
	 * Only consider students who are taking the exact course name provided.
	 * 
	 * @param students the list of students to search through
	 * @param course   the course name to filter by
	 * @return the oldest student in the specified course, or null if no students
	 *         are enrolled in that course
	 */
	public static Student task7(List<Student> students, String course) {
		// TODO: Implement this method
		return null;
	}

	/* ========================================================================== */
	/* ============================= Difficult Tasks ============================ */
	/* ========================================================================== */

	/**
	 * Task 8: Sort nested lists of strings by their total length
	 * 
	 * Sort the given list of string lists by the total character count of all
	 * strings
	 * in each sublist (ascending order). The sublist with the fewest total
	 * characters
	 * should come first.
	 * 
	 * Example: [["hello", "world"], ["a"], ["foo", "bar", "baz"]] should become
	 * [["a"], ["hello", "world"], ["foo", "bar", "baz"]] because:
	 * - ["a"] has 1 character total
	 * - ["hello", "world"] has 10 characters total
	 * - ["foo", "bar", "baz"] has 9 characters total
	 * 
	 * @param nestedLists the list of string lists to sort
	 * @return a new sorted list ordered by total character count of each sublist
	 */
	public static List<List<String>> task8(List<List<String>> nestedLists) {
		// TODO: Implement this method
		return null;
	}

	/**
	 * Task 9: Sort departments by total salary of all employees
	 * 
	 * Sort departments by the sum of all employee salaries in each department
	 * (ascending order). The department with the lowest total salary should come
	 * first.
	 * You will need to flatten the employee lists to calculate totals.
	 * 
	 * Example: Department A with employees earning [50000, 60000] and Department B
	 * with employees earning [70000] should be ordered as [Department A, Department
	 * B]
	 * because A has total salary 110000 and B has total salary 70000.
	 * 
	 * @param departments the list of departments to sort
	 * @return a new sorted list ordered by total salary per department
	 */
	public static List<Department> task9(List<Department> departments) {
		// TODO: Implement this method
		return null;
	}

	/**
	 * Task 10: Sort departments by multiple criteria with nested employee data
	 * 
	 * Sort departments using the following criteria in order:
	 * 1. First by number of employees (ascending - fewest employees first)
	 * 2. Then by average salary of employees (ascending - lowest average first)
	 * 3. Finally by department name (alphabetical)
	 * 
	 * You will need to flatten employee data to calculate averages and apply
	 * multiple
	 * sorting criteria to the nested structure.
	 * 
	 * @param departments the list of departments to sort
	 * @return a new sorted list ordered by size, average salary, then name
	 */
	public static List<Department> task10(List<Department> departments) {
		// Ikke best practice å bruke flere .sorted() etter hverandre,
		// men for å gi en enklere forklaring for hvert steg kan man det.
		// Sorterer vi først på de siste kriteriene vi skulle sortere på,
		// forblir denne sorteringen når vi senere sorterer på "viktigere"
		// kriterier.

		// return departments.stream()
		// .sorted(Comparator.comparing(Department::getName)) // sorterer på 
		// .sorted(Comparator.comparingDouble(d -> d.getEmployees().stream()
        //                                .mapToDouble(Employee::getSalary)
        //                                .average()
        //                                .orElse(0.0)))
		// .sorted((a,b) -> a.getEmployees().size() - b.getEmployees().size())
		// .toList();

		return departments.stream()
        .sorted(Comparator
            .comparingInt((Department d) -> d.getEmployees().size())
            .thenComparingDouble(d -> d.getEmployees().stream()
                                       .mapToDouble(Employee::getSalary)
                                       .average()
                                       .orElse(0.0))
            .thenComparing(Department::getName))
        .toList();
	}

	// region Test methods
	public static void testTask1() {
		System.out.println("=== Task 1: Sort strings alphabetically ===");
		List<String> input = Arrays.asList("banana", "apple", "cherry", "date");
		List<String> expected = Arrays.asList("apple", "banana", "cherry", "date");

		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expected);

		List<String> result = task1(input);
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println("Try using: strings.stream().sorted().toList()");
		}
		System.out.println();
	}

	public static void testTask2() {
		System.out.println("=== Task 2: Count strings longer than 3 characters ===");
		List<String> input = Arrays.asList("hello", "hi", "world", "a", "programming");
		int expected = 3; // "hello", "world", "programming" are longer than 3 characters

		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expected);

		int result = task2(input);
		System.out.println("Result:   " + result);

		boolean success = expected == result;
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println("Try using: strings.stream().filter(s -> s.length() > 3).count()");
		}
		System.out.println();
	}

	public static void testTask3() {
		System.out.println("=== Task 3: Sort people by age ===");
		List<Person> input = Arrays.asList(
				new Person("Bob", 30),
				new Person("Alice", 25),
				new Person("Charlie", 20));
		List<Person> expected = Arrays.asList(
				new Person("Charlie", 20),
				new Person("Alice", 25),
				new Person("Bob", 30));

		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expected);

		List<Person> result = task3(input);
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println("Try using: Comparator.comparing(Person::getAge)");
		}
		System.out.println();
	}

	public static void testTask4() {
		System.out.println("=== Task 4: Find oldest person ===");
		List<Person> input = Arrays.asList(
				new Person("Alice", 25),
				new Person("Bob", 30),
				new Person("Charlie", 20));
		Person expected = new Person("Bob", 30);

		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expected);

		Person result = task4(input);
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println("Try using: stream().max(Comparator.comparing(Person::getAge)).get()");
		}
		System.out.println();
	}

	public static void testTask5() {
		System.out.println("=== Task 5: Sort by age, then name ===");
		List<Person> input = Arrays.asList(
				new Person("Bob", 25),
				new Person("Alice", 25),
				new Person("Charlie", 30));
		List<Person> expected = Arrays.asList(
				new Person("Alice", 25),
				new Person("Bob", 25),
				new Person("Charlie", 30));

		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expected);

		List<Person> result = task5(input);
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println("Try using: Comparator.comparing(Person::getAge).thenComparing(Person::getName)");
		}
		System.out.println();
	}

	public static void testTask6() {
		System.out.println("=== Task 6: Sort by name (reverse alphabetical) ===");
		List<Person> input = Arrays.asList(
				new Person("Alice", 25),
				new Person("Bob", 30),
				new Person("Charlie", 20));
		List<Person> expected = Arrays.asList(
				new Person("Charlie", 20),
				new Person("Bob", 30),
				new Person("Alice", 25));

		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expected);

		List<Person> result = task6(input);
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println("Try using: Comparator.comparing(Person::getName).reversed()");
		}
		System.out.println();
	}

	public static void testTask7() {
		System.out.println("=== Task 7: Find oldest student in Math course ===");
		List<Student> input = Arrays.asList(
				new Student("Alice", 20, 85.5, "Math"),
				new Student("Bob", 21, 92.0, "Physics"),
				new Student("Charlie", 22, 88.0, "Math"));
		Student expected = new Student("Charlie", 22, 88.0, "Math");

		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expected);

		Student result = task7(input, "Math");
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println("Try using: filter by course, then max by age");
		}
		System.out.println();
	}

	public static void testTask8() {
		System.out.println("=== Task 8: Sort nested lists by total length ===");
		List<List<String>> input = Arrays.asList(
				Arrays.asList("hello", "world"),
				Arrays.asList("a"),
				Arrays.asList("foo", "bar", "baz"));
		List<List<String>> expected = Arrays.asList(
				Arrays.asList("a"),
				Arrays.asList("foo", "bar", "baz"),
				Arrays.asList("hello", "world"));

		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expected);

		List<List<String>> result = task8(input);
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println("Try calculating total character length for each sublist");
		}
		System.out.println();
	}

	public static void testTask9() {
		System.out.println("=== Task 9: Sort departments by total salary ===");
		List<Department> input = Arrays.asList(
				new Department("Engineering", Arrays.asList(
						new Employee("Alice", "Engineering", 80000),
						new Employee("Bob", "Engineering", 85000))),
				new Department("Sales", Arrays.asList(
						new Employee("Charlie", "Sales", 60000))),
				new Department("Marketing", Arrays.asList(
						new Employee("Diana", "Marketing", 70000),
						new Employee("Eve", "Marketing", 65000))));
		List<Department> expected = Arrays.asList(
				new Department("Sales", Arrays.asList(
						new Employee("Charlie", "Sales", 60000))),
				new Department("Marketing", Arrays.asList(
						new Employee("Diana", "Marketing", 70000),
						new Employee("Eve", "Marketing", 65000))),
				new Department("Engineering", Arrays.asList(
						new Employee("Alice", "Engineering", 80000),
						new Employee("Bob", "Engineering", 85000))));

		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expected);

		List<Department> result = task9(input);
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println("Try summing all employee salaries in each department");
		}
		System.out.println();
	}

	public static void testTask10() {
		System.out.println("=== Task 10: Complex nested department sorting ===");
		List<Department> input = Arrays.asList(
				new Department("Engineering", Arrays.asList(
						new Employee("Alice", "Engineering", 80000),
						new Employee("Bob", "Engineering", 90000))),
				new Department("Sales", Arrays.asList(
						new Employee("Charlie", "Sales", 60000),
						new Employee("Diana", "Sales", 70000))),
				new Department("Marketing", Arrays.asList(
						new Employee("Eve", "Marketing", 75000))));
		List<Department> expected = Arrays.asList(
				new Department("Marketing", Arrays.asList(
						new Employee("Eve", "Marketing", 75000))),
				new Department("Sales", Arrays.asList(
						new Employee("Charlie", "Sales", 60000),
						new Employee("Diana", "Sales", 70000))),
				new Department("Engineering", Arrays.asList(
						new Employee("Alice", "Engineering", 80000),
						new Employee("Bob", "Engineering", 90000))));

		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expected);

		List<Department> result = task10(input);
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println("Try sorting by: 1) employee count, 2) average salary (asc), 3) name");
		}
		System.out.println();
	}
	// endregion

	public static void main(String[] args) {
		// testTask1();
		// testTask2();
		// testTask3();
		// testTask4();
		// testTask5();
		// testTask6();
		// testTask7();
		// testTask8();
		// testTask9();
		testTask10();
	}
}