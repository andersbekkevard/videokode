package p6_funksjonell_programmering.s4_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ComparatorTasksTest {

	@Test
	void testTask1() {
		List<String> input = new ArrayList<>(Arrays.asList("banana", "apple", "cherry", "date"));
		List<String> expected = Arrays.asList("apple", "banana", "cherry", "date");

		List<String> result = ComparatorTasksSolved.task1(input);

		assertEquals(expected, result, "Task 1 should sort strings alphabetically");
	}

	@Test
	void testTask2() {
		List<String> input = new ArrayList<>(Arrays.asList("hello", "hi", "world", "a", "programming"));
		int expected = 3; // "hello", "world", "programming" are longer than 3 characters

		int result = ComparatorTasksSolved.task2(input);

		assertEquals(expected, result, "Task 2 should count strings longer than 3 characters");
	}

	@Test
	void testTask3() {
		List<Person> input = new ArrayList<>(Arrays.asList(
				new Person("Bob", 30),
				new Person("Alice", 25),
				new Person("Charlie", 20)));
		List<Person> expected = Arrays.asList(
				new Person("Charlie", 20),
				new Person("Alice", 25),
				new Person("Bob", 30));

		List<Person> result = ComparatorTasksSolved.task3(input);

		assertEquals(expected, result, "Task 3 should sort people by age");
	}

	@Test
	void testTask4() {
		List<Person> input = Arrays.asList(
				new Person("Alice", 25),
				new Person("Bob", 30),
				new Person("Charlie", 20));
		Person expected = new Person("Bob", 30);

		Person result = ComparatorTasksSolved.task4(input);

		assertEquals(expected, result, "Task 4 should find the oldest person");
	}

	@Test
	void testTask5() {
		List<Person> input = new ArrayList<>(Arrays.asList(
				new Person("Bob", 25),
				new Person("Alice", 25),
				new Person("Charlie", 30)));
		List<Person> expected = Arrays.asList(
				new Person("Alice", 25),
				new Person("Bob", 25),
				new Person("Charlie", 30));

		List<Person> result = ComparatorTasksSolved.task5(input);

		assertEquals(expected, result, "Task 5 should sort by age, then name");
	}

	@Test
	void testTask6() {
		List<Person> input = new ArrayList<>(Arrays.asList(
				new Person("Alice", 25),
				new Person("Bob", 30),
				new Person("Charlie", 20)));
		List<Person> expected = Arrays.asList(
				new Person("Charlie", 20),
				new Person("Bob", 30),
				new Person("Alice", 25));

		List<Person> result = ComparatorTasksSolved.task6(input);

		assertEquals(expected, result, "Task 6 should sort by name in reverse alphabetical order");
	}

	@Test
	void testTask7() {
		List<Student> input = Arrays.asList(
				new Student("Alice", 20, 85.5, "Math"),
				new Student("Bob", 21, 92.0, "Physics"),
				new Student("Charlie", 22, 88.0, "Math"));
		Student expected = new Student("Charlie", 22, 88.0, "Math");

		Student result = ComparatorTasksSolved.task7(input, "Math");

		assertEquals(expected, result, "Task 7 should find oldest student in Math course");
	}

	@Test
	void testTask7NoStudentsInCourse() {
		List<Student> input = Arrays.asList(
				new Student("Alice", 20, 85.5, "Math"),
				new Student("Bob", 21, 92.0, "Physics"));

		// This will throw an exception since the implementation uses .get() without
		// checking
		// We'll test the exception case separately
		try {
			ComparatorTasksSolved.task7(input, "Chemistry");
			// If we reach here, the test should fail
			assertEquals(false, true, "Task 7 should throw exception when no students in specified course");
		} catch (Exception e) {
			// Expected behavior - the implementation uses .get() which throws when no
			// elements
		}
	}

	@Test
	void testTask8() {
		List<List<String>> input = Arrays.asList(
				Arrays.asList("hello", "world"),
				Arrays.asList("a"),
				Arrays.asList("foo", "bar", "baz"));
		List<List<String>> expected = Arrays.asList(
				Arrays.asList("a"),
				Arrays.asList("foo", "bar", "baz"),
				Arrays.asList("hello", "world"));

		List<List<String>> result = ComparatorTasksSolved.task8(input);

		assertEquals(expected, result, "Task 8 should sort nested lists by total character count");
	}

	@Test
	void testTask9() {
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

		List<Department> result = ComparatorTasksSolved.task9(input);

		assertEquals(expected, result, "Task 9 should sort departments by total salary");
	}

	@Test
	void testTask10() {
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

		List<Department> result = ComparatorTasksSolved.task10(input);

		assertEquals(expected, result, "Task 10 should sort departments by size, avg salary (asc), then name");
	}

	@Test
	void testTask1EmptyList() {
		List<String> input = new ArrayList<>();
		List<String> expected = Arrays.asList();

		List<String> result = ComparatorTasksSolved.task1(input);

		assertEquals(expected, result, "Task 1 should handle empty list");
	}

	@Test
	void testTask2NoLongStrings() {
		List<String> input = new ArrayList<>(Arrays.asList("hi", "a", "no"));
		int expected = 0;

		int result = ComparatorTasksSolved.task2(input);

		assertEquals(expected, result, "Task 2 should return 0 when no strings are longer than 3 characters");
	}

	@Test
	void testTask3SinglePerson() {
		List<Person> input = Arrays.asList(new Person("Alice", 25));
		List<Person> expected = Arrays.asList(new Person("Alice", 25));

		List<Person> result = ComparatorTasksSolved.task3(input);

		assertEquals(expected, result, "Task 3 should handle single person");
	}

	@Test
	void testTask4SinglePerson() {
		List<Person> input = Arrays.asList(new Person("Alice", 25));
		Person expected = new Person("Alice", 25);

		Person result = ComparatorTasksSolved.task4(input);

		assertEquals(expected, result, "Task 4 should handle single person");
	}

	@Test
	void testTask5SameAge() {
		List<Person> input = new ArrayList<>(Arrays.asList(
				new Person("Charlie", 25),
				new Person("Alice", 25),
				new Person("Bob", 25)));
		List<Person> expected = Arrays.asList(
				new Person("Alice", 25),
				new Person("Bob", 25),
				new Person("Charlie", 25));

		List<Person> result = ComparatorTasksSolved.task5(input);

		assertEquals(expected, result, "Task 5 should sort by name when ages are equal");
	}

	@Test
	void testTask6SameNames() {
		List<Person> input = new ArrayList<>(Arrays.asList(
				new Person("Alice", 25),
				new Person("Alice", 30),
				new Person("Alice", 20)));
		List<Person> expected = Arrays.asList(
				new Person("Alice", 25),
				new Person("Alice", 30),
				new Person("Alice", 20));

		List<Person> result = ComparatorTasksSolved.task6(input);

		assertEquals(expected, result, "Task 6 should maintain order when names are identical");
	}

	@Test
	void testTask8EmptyLists() {
		List<List<String>> input = Arrays.asList(
				Arrays.asList(),
				Arrays.asList("hello"),
				Arrays.asList());
		List<List<String>> expected = Arrays.asList(
				Arrays.asList(),
				Arrays.asList(),
				Arrays.asList("hello"));

		List<List<String>> result = ComparatorTasksSolved.task8(input);

		assertEquals(expected, result, "Task 8 should handle empty sublists");
	}

	@Test
	void testTask9SingleEmployeeDepts() {
		List<Department> input = Arrays.asList(
				new Department("A", Arrays.asList(
						new Employee("Alice", "A", 50000))),
				new Department("B", Arrays.asList(
						new Employee("Bob", "B", 60000))));
		List<Department> expected = Arrays.asList(
				new Department("A", Arrays.asList(
						new Employee("Alice", "A", 50000))),
				new Department("B", Arrays.asList(
						new Employee("Bob", "B", 60000))));

		List<Department> result = ComparatorTasksSolved.task9(input);

		assertEquals(expected, result, "Task 9 should handle single employee departments");
	}

	@Test
	void testTask10SameSizeAndAverage() {
		List<Department> input = Arrays.asList(
				new Department("Zebra", Arrays.asList(
						new Employee("Alice", "Zebra", 60000))),
				new Department("Alpha", Arrays.asList(
						new Employee("Bob", "Alpha", 60000))));
		List<Department> expected = Arrays.asList(
				new Department("Alpha", Arrays.asList(
						new Employee("Bob", "Alpha", 60000))),
				new Department("Zebra", Arrays.asList(
						new Employee("Alice", "Zebra", 60000))));

		List<Department> result = ComparatorTasksSolved.task10(input);

		assertEquals(expected, result, "Task 10 should sort by name when size and average are equal");
	}
}