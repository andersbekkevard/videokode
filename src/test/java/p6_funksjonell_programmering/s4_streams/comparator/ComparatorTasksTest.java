package p6_funksjonell_programmering.s4_streams.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

import p6_funksjonell_programmering.s4_streams.comparator.ComparatorTasks.Department;
import p6_funksjonell_programmering.s4_streams.comparator.ComparatorTasks.Employee;
import p6_funksjonell_programmering.s4_streams.comparator.ComparatorTasks.Person;
import p6_funksjonell_programmering.s4_streams.comparator.ComparatorTasks.Student;

class ComparatorTasksTest {

	@Test
	void testTask1() {
		List<String> input = new ArrayList<>(Arrays.asList("banana", "apple", "cherry", "date"));
		List<String> expected = Arrays.asList("apple", "banana", "cherry", "date");

		List<String> result = ComparatorTasks.task1(input);

		assertEquals(expected, result, "Task 1 should sort strings alphabetically");
	}

	@Test
	void testTask2() {
		List<Integer> input = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6));
		List<Integer> expected = Arrays.asList(1, 1, 2, 3, 4, 5, 6, 9);

		List<Integer> result = ComparatorTasks.task2(input);

		assertEquals(expected, result, "Task 2 should sort integers numerically");
	}

	@Test
	void testTask3() {
		List<String> input = new ArrayList<>(Arrays.asList("hello", "hi", "world", "a", "programming"));
		List<String> expected = Arrays.asList("a", "hi", "hello", "world", "programming");

		List<String> result = ComparatorTasks.task3(input);

		assertEquals(expected, result, "Task 3 should sort strings by length");
	}

	@Test
	void testTask4() {
		List<Person> input = Arrays.asList(
				new Person("Alice", 25),
				new Person("Bob", 30),
				new Person("Charlie", 20));
		Person expected = new Person("Bob", 30);

		Person result = ComparatorTasks.task4(input);

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

		List<Person> result = ComparatorTasks.task5(input);

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

		List<Person> result = ComparatorTasks.task6(input);

		assertEquals(expected, result, "Task 6 should sort by name in reverse alphabetical order");
	}

	@Test
	void testTask7() {
		List<Student> input = new ArrayList<>(Arrays.asList(
				new Student("Alice", 20, 85.5, "Math"),
				new Student("Bob", 21, 92.0, "Physics"),
				new Student("Charlie", 19, 85.5, "Math")));
		List<Student> expected = Arrays.asList(
				new Student("Bob", 21, 92.0, "Physics"),
				new Student("Alice", 20, 85.5, "Math"),
				new Student("Charlie", 19, 85.5, "Math"));

		List<Student> result = ComparatorTasks.task7(input);

		assertEquals(expected, result, "Task 7 should sort by grade (desc), then name");
	}

	@Test
	void testTask8() {
		List<Student> input = Arrays.asList(
				new Student("Alice", 20, 85.5, "Math"),
				new Student("Bob", 21, 92.0, "Physics"),
				new Student("Charlie", 22, 88.0, "Math"));
		Student expected = new Student("Charlie", 22, 88.0, "Math");

		Student result = ComparatorTasks.task8(input, "Math");

		assertEquals(expected, result, "Task 8 should find oldest student in Math course");
	}

	@Test
	void testTask8NoStudentsInCourse() {
		List<Student> input = Arrays.asList(
				new Student("Alice", 20, 85.5, "Math"),
				new Student("Bob", 21, 92.0, "Physics"));

		Student result = ComparatorTasks.task8(input, "Chemistry");

		assertNull(result, "Task 8 should return null when no students in specified course");
	}

	@Test
	void testTask9() {
		List<Employee> input = new ArrayList<>(Arrays.asList(
				new Employee("Alice", "IT", 75000),
				new Employee("Bob", "HR", 65000),
				new Employee("Charlie", "IT", 80000),
				new Employee("Diana", "HR", 70000)));
		List<Employee> expected = Arrays.asList(
				new Employee("Diana", "HR", 70000),
				new Employee("Bob", "HR", 65000),
				new Employee("Charlie", "IT", 80000),
				new Employee("Alice", "IT", 75000));

		List<Employee> result = ComparatorTasks.task9(input);

		assertEquals(expected, result, "Task 9 should sort by department, salary (desc), name");
	}

	@Test
	void testTask10() {
		List<Employee> input = new ArrayList<>(Arrays.asList(
				new Employee("Alice", "IT", 75000),
				new Employee("Bob", "IT", 75000),
				new Employee("Charlie", "HR", 80000),
				new Employee("Diana", "HR", 70000)));
		List<Employee> expected = Arrays.asList(
				new Employee("Charlie", "HR", 80000),
				new Employee("Diana", "HR", 70000),
				new Employee("Bob", "IT", 75000),
				new Employee("Alice", "IT", 75000));

		List<Employee> result = ComparatorTasks.task10(input);

		assertEquals(expected, result, "Task 10 should sort by department, salary (desc), name (desc)");
	}

	@Test
	void testTask1EmptyList() {
		List<String> input = new ArrayList<>();
		List<String> expected = Arrays.asList();

		List<String> result = ComparatorTasks.task1(input);

		assertEquals(expected, result, "Task 1 should handle empty list");
	}

	@Test
	void testTask2SingleElement() {
		List<Integer> input = new ArrayList<>(Arrays.asList(42));
		List<Integer> expected = Arrays.asList(42);

		List<Integer> result = ComparatorTasks.task2(input);

		assertEquals(expected, result, "Task 2 should handle single element");
	}

	@Test
	void testTask3SameLength() {
		List<String> input = new ArrayList<>(Arrays.asList("cat", "dog", "bat"));
		List<String> expected = Arrays.asList("cat", "dog", "bat");

		List<String> result = ComparatorTasks.task3(input);

		assertEquals(expected, result, "Task 3 should maintain order for same length strings");
	}

	@Test
	void testTask4SinglePerson() {
		List<Person> input = Arrays.asList(new Person("Alice", 25));
		Person expected = new Person("Alice", 25);

		Person result = ComparatorTasks.task4(input);

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

		List<Person> result = ComparatorTasks.task5(input);

		assertEquals(expected, result, "Task 5 should sort by name when ages are equal");
	}

	@Test
	void testTask11() {
		List<List<String>> input = Arrays.asList(
				Arrays.asList("hello", "world"),
				Arrays.asList("a"),
				Arrays.asList("foo", "bar", "baz"));
		List<List<String>> expected = Arrays.asList(
				Arrays.asList("a"),
				Arrays.asList("foo", "bar", "baz"),
				Arrays.asList("hello", "world"));

		List<List<String>> result = ComparatorTasks.task11(input);

		assertEquals(expected, result, "Task 11 should sort nested lists by total character count");
	}

	@Test
	void testTask12() {
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

		List<Department> result = ComparatorTasks.task12(input);

		assertEquals(expected, result, "Task 12 should sort departments by total salary");
	}

	@Test
	void testTask13() {
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
				new Department("Engineering", Arrays.asList(
						new Employee("Alice", "Engineering", 80000),
						new Employee("Bob", "Engineering", 90000))),
				new Department("Sales", Arrays.asList(
						new Employee("Charlie", "Sales", 60000),
						new Employee("Diana", "Sales", 70000))));

		List<Department> result = ComparatorTasks.task13(input);

		assertEquals(expected, result, "Task 13 should sort departments by size, avg salary (desc), then name");
	}

	@Test
	void testTask11EmptyLists() {
		List<List<String>> input = Arrays.asList(
				Arrays.asList(),
				Arrays.asList("hello"),
				Arrays.asList());
		List<List<String>> expected = Arrays.asList(
				Arrays.asList(),
				Arrays.asList(),
				Arrays.asList("hello"));

		List<List<String>> result = ComparatorTasks.task11(input);

		assertEquals(expected, result, "Task 11 should handle empty sublists");
	}

	@Test
	void testTask12SingleEmployeeDepts() {
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

		List<Department> result = ComparatorTasks.task12(input);

		assertEquals(expected, result, "Task 12 should handle single employee departments");
	}

	@Test
	void testTask13SameSizeAndAverage() {
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

		List<Department> result = ComparatorTasks.task13(input);

		assertEquals(expected, result, "Task 13 should sort by name when size and average are equal");
	}
}