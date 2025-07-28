package p6_funksjonell_programmering.s4_streams.comparator_tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * ComparatorTasks - Progressive exercises for learning Java Comparator usage
 * 
 * This class contains 10 progressive tasks to help students learn how to use
 * Comparator.comparing(), .thenComparing(), and .reversed() methods
 * effectively.
 * Each task has an accompanying test method for immediate feedback.
 */
public class ComparatorTasks {

	// region Helper classes for complex comparator tasks
	public static class Person {
		private String name;
		private int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		@Override
		public String toString() {
			return name + " (" + age + ")";
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null || getClass() != obj.getClass())
				return false;
			Person person = (Person) obj;
			return age == person.age && name.equals(person.name);
		}
	}

	public static class Student extends Person {
		private double grade;
		private String course;

		public Student(String name, int age, double grade, String course) {
			super(name, age);
			this.grade = grade;
			this.course = course;
		}

		public double getGrade() {
			return grade;
		}

		public String getCourse() {
			return course;
		}

		@Override
		public String toString() {
			return super.toString() + " - " + course + ": " + grade;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null || getClass() != obj.getClass())
				return false;
			if (!super.equals(obj))
				return false;
			Student student = (Student) obj;
			return Double.compare(student.grade, grade) == 0 && course.equals(student.course);
		}
	}

	public static class Employee {
		private String name;
		private String department;
		private double salary;

		public Employee(String name, String department, double salary) {
			this.name = name;
			this.department = department;
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public String getDepartment() {
			return department;
		}

		public double getSalary() {
			return salary;
		}

		@Override
		public String toString() {
			return name + " (" + department + ", " + salary + ")";
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null || getClass() != obj.getClass())
				return false;
			Employee employee = (Employee) obj;
			return Double.compare(employee.salary, salary) == 0 &&
					name.equals(employee.name) &&
					department.equals(employee.department);
		}
	}

	public static class Department {
		private String name;
		private List<Employee> employees;

		public Department(String name, List<Employee> employees) {
			this.name = name;
			this.employees = employees;
		}

		public String getName() {
			return name;
		}

		public List<Employee> getEmployees() {
			return employees;
		}

		public int getSize() {
			return employees.size();
		}

		@Override
		public String toString() {
			return name + " (" + employees.size() + " employees)";
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null || getClass() != obj.getClass())
				return false;
			Department dept = (Department) obj;
			return name.equals(dept.name) && employees.equals(dept.employees);
		}
	}
	// endregion

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
	 * Task 2: Sort a list of integers numerically
	 * 
	 * Sort the given list of integers in ascending numerical order (smallest to
	 * largest).
	 * You do not have to handle equal values.
	 * 
	 * Example: [3, 1, 4, 1, 5] should become [1, 1, 3, 4, 5]
	 * 
	 * @param numbers the list of integers to sort
	 * @return a new sorted list containing the same integers in ascending order
	 */
	public static List<Integer> task2(List<Integer> numbers) {
		// TODO: Implement this method
		return null;
	}

	/**
	 * Task 3: Sort a list of strings by their length
	 * 
	 * Sort strings by their length, with shorter strings appearing first.
	 * If two strings have the same length, their relative order should be
	 * preserved.
	 * 
	 * Example: ["hello", "hi", "world"] should become ["hi", "hello", "world"]
	 * 
	 * @param strings the list of strings to sort
	 * @return a new sorted list containing the same strings ordered by length
	 */
	public static List<String> task3(List<String> strings) {
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
		return people.stream().max(Comparator.comparing(Person::getAge)).get();
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
	 * Task 7: Sort students by grade (descending), then by name
	 * 
	 * Sort students first by grade (highest grade first), then by name
	 * (alphabetically)
	 * for students with the same grade.
	 * 
	 * Example: Students with grades [Alice: 90, Bob: 85, Charlie: 90] should be
	 * ordered as
	 * [Alice: 90, Charlie: 90, Bob: 85] where Alice and Charlie are sorted
	 * alphabetically
	 * since they have the same grade.
	 * 
	 * @param students the list of students to sort
	 * @return a new sorted list with students ordered by grade (desc), then name
	 *         (asc)
	 */
	public static List<Student> task7(List<Student> students) {
		// TODO: Implement this method
		return null;
	}

	/**
	 * Task 8: Find the oldest student in a specific course
	 * 
	 * Find the oldest student who is enrolled in the specified course.
	 * Only consider students who are taking the exact course name provided.
	 * 
	 * @param students the list of students to search through
	 * @param course   the course name to filter by
	 * @return the oldest student in the specified course, or null if no students
	 *         are enrolled in that course
	 */
	public static Student task8(List<Student> students, String course) {
		// TODO: Implement this method
		return null;
	}

	/**
	 * Task 9: Sort employees by department, then by salary (descending), then by
	 * name
	 * 
	 * Sort employees using a three-level sorting criteria:
	 * 1. First by department (alphabetical order)
	 * 2. Then by salary (highest to lowest) within each department
	 * 3. Finally by name (alphabetical order) for employees with same department
	 * and salary
	 * 
	 * @param employees the list of employees to sort
	 * @return a new sorted list with employees ordered by department, salary
	 *         (desc), then name
	 */
	public static List<Employee> task9(List<Employee> employees) {
		// TODO: Implement this method
		return null;
	}

	/* ========================================================================== */
	/* ============================= Difficult Tasks ============================ */
	/* ========================================================================== */

	/**
	 * Task 10: Complex multi-field sorting with mixed ascending/descending
	 * 
	 * Sort employees using a three-level sorting criteria with mixed sort orders:
	 * 1. First by department (alphabetical order A-Z)
	 * 2. Then by salary (highest to lowest) within each department
	 * 3. Finally by name (reverse alphabetical order Z-A) for employees with same
	 * department and salary
	 * 
	 * @param employees the list of employees to sort
	 * @return a new sorted list with employees ordered by the specified mixed
	 *         criteria
	 */
	public static List<Employee> task10(List<Employee> employees) {
		// TODO: Implement this method
		return null;
	}

	/**
	 * Task 11: Sort nested lists of strings by their total length
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
	public static List<List<String>> task11(List<List<String>> nestedLists) {
		// TODO: Implement this method
		return null;
	}

	/**
	 * Task 12: Sort departments by total salary of all employees
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
	public static List<Department> task12(List<Department> departments) {
		// TODO: Implement this method
		return null;
	}

	/**
	 * Task 13: Sort departments by multiple criteria with nested employee data
	 * 
	 * Sort departments using the following criteria in order:
	 * 1. First by number of employees (ascending - fewest employees first)
	 * 2. Then by average salary of employees (descending - highest average first)
	 * 3. Finally by department name (alphabetical)
	 * 
	 * You will need to flatten employee data to calculate averages and apply
	 * multiple
	 * sorting criteria to the nested structure.
	 * 
	 * @param departments the list of departments to sort
	 * @return a new sorted list ordered by size, average salary, then name
	 */
	public static List<Department> task13(List<Department> departments) {
		// TODO: Implement this method
		return null;
	}

	// region Test methods for visual feedback
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
			System.out.println("Try using: Comparator.comparing(String::toString) or natural order");
		}
		System.out.println();
	}

	public static void testTask2() {
		System.out.println("=== Task 2: Sort integers numerically ===");
		List<Integer> input = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6);
		List<Integer> expected = Arrays.asList(1, 1, 2, 3, 4, 5, 6, 9);

		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expected);

		List<Integer> result = task2(input);
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println("Try using: Comparator.comparing(Integer::intValue)");
		}
		System.out.println();
	}

	public static void testTask3() {
		System.out.println("=== Task 3: Sort strings by length ===");
		List<String> input = Arrays.asList("hello", "hi", "world", "a", "programming");
		List<String> expected = Arrays.asList("a", "hi", "hello", "world", "programming");

		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expected);

		List<String> result = task3(input);
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println("Try using: Comparator.comparing(String::length)");
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
			System.out.println("Try using: Collections.max(list, Comparator.comparing(Person::getAge))");
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
		System.out.println("=== Task 7: Sort by grade (desc), then name ===");
		List<Student> input = Arrays.asList(
				new Student("Alice", 20, 85.5, "Math"),
				new Student("Bob", 21, 92.0, "Physics"),
				new Student("Charlie", 19, 85.5, "Math"));
		List<Student> expected = Arrays.asList(
				new Student("Bob", 21, 92.0, "Physics"),
				new Student("Alice", 20, 85.5, "Math"),
				new Student("Charlie", 19, 85.5, "Math"));

		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expected);

		List<Student> result = task7(input);
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println(
					"Try using: Comparator.comparing(Student::getGrade).reversed().thenComparing(Student::getName)");
		}
		System.out.println();
	}

	public static void testTask8() {
		System.out.println("=== Task 8: Find oldest student in Math course ===");
		List<Student> input = Arrays.asList(
				new Student("Alice", 20, 85.5, "Math"),
				new Student("Bob", 21, 92.0, "Physics"),
				new Student("Charlie", 22, 88.0, "Math"));
		Student expected = new Student("Charlie", 22, 88.0, "Math");

		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expected);

		Student result = task8(input, "Math");
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println(
					"Try using: students.stream().filter(s -> course.equals(s.getCourse())).collect(Collectors.toList())");
			System.out.println("Then: Collections.max(filtered, Comparator.comparing(Student::getAge))");
		}
		System.out.println();
	}

	public static void testTask9() {
		System.out.println("=== Task 9: Sort by department, salary (desc), name ===");
		List<Employee> input = Arrays.asList(
				new Employee("Alice", "IT", 75000),
				new Employee("Bob", "HR", 65000),
				new Employee("Charlie", "IT", 80000),
				new Employee("Diana", "HR", 70000));
		List<Employee> expected = Arrays.asList(
				new Employee("Diana", "HR", 70000),
				new Employee("Bob", "HR", 65000),
				new Employee("Charlie", "IT", 80000),
				new Employee("Alice", "IT", 75000));

		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expected);

		List<Employee> result = task9(input);
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println("Try using: Comparator.comparing(Employee::getDepartment)");
			System.out.println("  .thenComparing(Employee::getSalary, Comparator.reverseOrder())");
			System.out.println("  .thenComparing(Employee::getName)");
		}
		System.out.println();
	}

	public static void testTask10() {
		System.out.println("=== Task 10: Complex multi-field sorting ===");
		List<Employee> input = Arrays.asList(
				new Employee("Alice", "IT", 75000),
				new Employee("Bob", "IT", 75000),
				new Employee("Charlie", "HR", 80000),
				new Employee("Diana", "HR", 70000));
		List<Employee> expected = Arrays.asList(
				new Employee("Charlie", "HR", 80000),
				new Employee("Diana", "HR", 70000),
				new Employee("Bob", "IT", 75000),
				new Employee("Alice", "IT", 75000));

		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expected);

		List<Employee> result = task10(input);
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println("Try using: Comparator.comparing(Employee::getDepartment)");
			System.out.println("  .thenComparing(Employee::getSalary, Comparator.reverseOrder())");
			System.out.println("  .thenComparing(Employee::getName, Comparator.reverseOrder())");
		}
		System.out.println();
	}

	public static void testTask11() {
		System.out.println("=== Task 11: Sort nested lists by total length ===");
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

		List<List<String>> result = task11(input);
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println("Try calculating total character length for each sublist");
		}
		System.out.println();
	}

	public static void testTask12() {
		System.out.println("=== Task 12: Sort departments by total salary ===");
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

		List<Department> result = task12(input);
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println("Try summing all employee salaries in each department");
		}
		System.out.println();
	}

	public static void testTask13() {
		System.out.println("=== Task 13: Complex nested department sorting ===");
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

		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expected);

		List<Department> result = task13(input);
		System.out.println("Result:   " + result);

		boolean success = expected.equals(result);
		System.out.println("SUCCESS: " + success);
		if (!success) {
			System.out.println("Try sorting by: 1) employee count, 2) average salary (desc), 3) name");
		}
		System.out.println();
	}
	// endregion

	public static void main(String[] args) {
		System.out.println("ComparatorTasks - Progressive Comparator Learning");
		System.out.println("Uncomment the test methods below to test your implementations:");
		System.out.println();

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
		// testTask11();
		// testTask12();
		// testTask13();
	}
}