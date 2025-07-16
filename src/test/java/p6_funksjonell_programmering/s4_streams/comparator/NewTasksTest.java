package p6_funksjonell_programmering.s4_streams.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import p6_funksjonell_programmering.s4_streams.comparator.NewTasks.Book;
import p6_funksjonell_programmering.s4_streams.comparator.NewTasks.Department;
import p6_funksjonell_programmering.s4_streams.comparator.NewTasks.Employee;
import p6_funksjonell_programmering.s4_streams.comparator.NewTasks.Person;

@DisplayName("Comparator Tasks - Test Suite")
class NewTasksTest {

	@Test
	@DisplayName("Task 1: Sort strings by length (ascending)")
	void testTask1() {
		List<String> input = new ArrayList<>(Arrays.asList("Java", "is", "fun", "and", "powerful"));
		List<String> expected = Arrays.asList("is", "fun", "and", "Java", "powerful");

		List<String> actual = NewTasks.task1(input);
		assertEquals(expected, actual, "List should be sorted by string length, ascending.");
	}

	@Test
	@DisplayName("Task 2: Sort strings by length (descending)")
	void testTask2() {
		List<String> input = new ArrayList<>(Arrays.asList("Java", "is", "fun", "and", "powerful"));
		List<String> expected = Arrays.asList("powerful", "Java", "fun", "and", "is");

		List<String> actual = NewTasks.task2(input);
		assertEquals(expected, actual, "List should be sorted by string length, descending.");
	}

	@Test
	@DisplayName("Task 3: Find longest string")
	void testTask3() {
		List<String> input = Arrays.asList("The", "quick", "brown", "fox", "jumps");
		String expected = "jumps";
		String actual = NewTasks.task3(input);
		assertEquals(expected, actual, "Should return the longest string.");

		// Test empty list
		assertNull(NewTasks.task3(Collections.emptyList()), "Should return null for an empty list.");
	}

	@Test
	@DisplayName("Task 4: Sort integers by absolute value")
	void testTask4() {
		List<Integer> input = new ArrayList<>(Arrays.asList(-5, 1, 4, -2, 3));
		List<Integer> expected = Arrays.asList(1, -2, 3, 4, -5);

		List<Integer> actual = NewTasks.task4(input);
		assertEquals(expected, actual, "List should be sorted by absolute value.");
	}

	@Test
	@DisplayName("Task 5: Sort People by age")
	void testTask5() {
		List<Person> input = new ArrayList<>(Arrays.asList(
				new Person("Alice", 30),
				new Person("Bob", 25),
				new Person("Charlie", 35)));
		List<Person> expected = Arrays.asList(
				new Person("Bob", 25),
				new Person("Alice", 30),
				new Person("Charlie", 35));

		List<Person> actual = NewTasks.task5(input);
		assertEquals(expected, actual, "List of People should be sorted by age.");
	}

	@Test
	@DisplayName("Task 6: Sort Books by year, then title")
	void testTask6() {
		List<Book> input = new ArrayList<>(Arrays.asList(
				new Book("The Hobbit", "Tolkien", 1937, 310),
				new Book("A Game of Thrones", "Martin", 1996, 694),
				new Book("The Fellowship of the Ring", "Tolkien", 1954, 423),
				new Book("1984", "Orwell", 1949, 328)));
		List<Book> expected = Arrays.asList(
				new Book("The Hobbit", "Tolkien", 1937, 310),
				new Book("1984", "Orwell", 1949, 328),
				new Book("The Fellowship of the Ring", "Tolkien", 1954, 423),
				new Book("A Game of Thrones", "Martin", 1996, 694));

		List<Book> actual = NewTasks.task6(input);
		assertEquals(expected, actual, "Books should be sorted by year, then title.");
	}

	@Test
	@DisplayName("Task 7: Sort Books by author, then pages descending")
	void testTask7() {
		List<Book> input = new ArrayList<>(Arrays.asList(
				new Book("The Hobbit", "Tolkien", 1937, 310),
				new Book("A Game of Thrones", "Martin", 1996, 694),
				new Book("The Two Towers", "Tolkien", 1954, 352),
				new Book("The Return of the King", "Tolkien", 1955, 416)));
		List<Book> expected = Arrays.asList(
				new Book("A Game of Thrones", "Martin", 1996, 694),
				new Book("The Return of the King", "Tolkien", 1955, 416),
				new Book("The Two Towers", "Tolkien", 1954, 352),
				new Book("The Hobbit", "Tolkien", 1937, 310));

		List<Book> actual = NewTasks.task7(input);
		assertEquals(expected, actual, "Books should be sorted by author, then pages descending.");
	}

	@Test
	@DisplayName("Task 8: Sort Employees by Dept, Salary (desc), Name")
	void testTask8() {
		List<Employee> input = new ArrayList<>(Arrays.asList(
				new Employee("Dave", Department.ENGINEERING, 110000, 5),
				new Employee("Bob", Department.SALES, 95000, 4),
				new Employee("Alice", Department.ENGINEERING, 120000, 8),
				new Employee("Charlie", Department.ENGINEERING, 110000, 10)));
		List<Employee> expected = Arrays.asList(
				new Employee("Bob", Department.SALES, 95000, 4),
				new Employee("Alice", Department.ENGINEERING, 120000, 8),
				new Employee("Charlie", Department.ENGINEERING, 110000, 10),
				new Employee("Dave", Department.ENGINEERING, 110000, 5));

		List<Employee> actual = NewTasks.task8(input);
		assertIterableEquals(expected, actual,
				"Employees should be sorted by department, then salary (desc), then name.");
	}

	@Test
	@DisplayName("Task 9: Find highest paid engineer")
	void testTask9() {
		List<Employee> input = new ArrayList<>(Arrays.asList(
				new Employee("Dave", Department.ENGINEERING, 110000, 5),
				new Employee("Bob", Department.SALES, 125000, 4),
				new Employee("Alice", Department.ENGINEERING, 120000, 8)));
		Employee expected = new Employee("Alice", Department.ENGINEERING, 120000, 8);

		Employee actual = NewTasks.task9(input);
		assertEquals(expected, actual, "Should find the engineer with the highest salary.");

		assertNull(NewTasks.task9(List.of(new Employee("Bob", Department.SALES, 125000, 4))));
	}

	@Test
	@DisplayName("Task 10: Dynamic Employee Sort")
	void testTask10() {
		List<Employee> input = new ArrayList<>(Arrays.asList(
				new Employee("Frank", Department.HR, 70000, 5),
				new Employee("Eve", Department.MARKETING, 80000, 2),
				new Employee("Grace", Department.HR, 75000, 5),
				new Employee("Hank", Department.HR, 70000, 5) // Same years and salary as Frank
		));

		// Test ascending by years
		List<Employee> expectedAsc = Arrays.asList(
				new Employee("Eve", Department.MARKETING, 80000, 2),
				new Employee("Grace", Department.HR, 75000, 5),
				new Employee("Frank", Department.HR, 70000, 5),
				new Employee("Hank", Department.HR, 70000, 5));
		List<Employee> actualAsc = NewTasks.task10(new ArrayList<>(input), true);
		assertIterableEquals(expectedAsc, actualAsc, "Should sort by years (asc), then salary (desc), then name.");

		// Test descending by years
		List<Employee> expectedDesc = Arrays.asList(
				new Employee("Grace", Department.HR, 75000, 5),
				new Employee("Frank", Department.HR, 70000, 5),
				new Employee("Hank", Department.HR, 70000, 5),
				new Employee("Eve", Department.MARKETING, 80000, 2));
		List<Employee> actualDesc = NewTasks.task10(new ArrayList<>(input), false);
		assertIterableEquals(expectedDesc, actualDesc, "Should sort by years (desc), then salary (desc), then name.");
	}
}