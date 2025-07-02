package p3_mer_om_java.s3_testing;

// JUnit 5 imports - these are the core testing framework imports
import java.util.Random;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

/**
 * Comprehensive JUnit test class demonstrating various testing features and
 * best practices.
 * This test class covers the LazyProgrammer class and showcases different JUnit
 * annotations
 * and assertion methods.
 */
@DisplayName("LazyProgrammer Tests") // Custom display name for better test reporting
class LazyProgrammerTest {

	// Test instance variables - these will be reused across multiple tests
	private LazyProgrammer programmer;
	private LazyProgrammer mondayProgrammer;

	/**
	 * @BeforeEach runs before EVERY test method
	 *             Use this to set up fresh test data for each test
	 *             This ensures test isolation - each test starts with a clean state
	 */
	@BeforeEach
	void setUp() {
		programmer = new LazyProgrammer("Alice");
		mondayProgrammer = new LazyProgrammer("Bob", true);

		// For tests involving random behavior, we can set a fixed seed
		// This makes random tests predictable and repeatable
		programmer.setRandom(new Random(42));
		mondayProgrammer.setRandom(new Random(42));
	}

	/**
	 * @AfterEach runs after EVERY test method
	 *            Use this for cleanup operations (closing files, database
	 *            connections, etc.)
	 *            In this simple example, we don't need cleanup, but it's good to
	 *            show the pattern
	 */
	@AfterEach
	void tearDown() {
		// In a real application, you might:
		// - Close database connections
		// - Delete temporary files
		// - Reset static variables
		programmer = null;
		mondayProgrammer = null;
	}

	/**
	 * @Test is the basic annotation for a test method
	 *       Test method names should be descriptive and explain what is being
	 *       tested
	 */
	@Test
	@DisplayName("Constructor should create programmer with correct initial state")
	void constructor_ShouldCreateProgrammerWithCorrectInitialState() {
		// Arrange & Act (constructor called in setUp)

		// Assert - multiple assertions can be grouped using assertAll
		// This ensures ALL assertions are checked, even if some fail
		assertAll("Constructor validation",
				() -> assertEquals("Alice", programmer.getName(), "Name should be set correctly"),
				() -> assertEquals(0, programmer.getCoffeeCount(), "Coffee count should start at 0"),
				() -> assertFalse(programmer.isMonday(), "Default should not be Monday"),
				() -> assertFalse(programmer.isProductive(), "Should not be productive without coffee"));
	}

	/**
	 * Testing the overloaded constructor with Monday parameter
	 */
	@Test
	@DisplayName("Constructor with Monday parameter should set Monday correctly")
	void constructorWithMonday_ShouldSetMondayCorrectly() {
		// Assert
		assertAll("Monday constructor validation",
				() -> assertEquals("Bob", mondayProgrammer.getName()),
				() -> assertTrue(mondayProgrammer.isMonday(), "Should be Monday"),
				() -> assertFalse(mondayProgrammer.isProductive(), "Should not be productive on Monday"));
	}

	/**
	 * Testing time estimation with multiple different values
	 * Demonstrates testing the same behavior with different inputs
	 */
	@Test
	@DisplayName("Time estimation should always underestimate")
	void estimateTime_ShouldAlwaysUnderestimate() {
		// Test multiple time values to ensure consistent underestimation
		double[] testValues = { 1.0, 2.5, 5.0, 10.0, 24.0 };

		for (double actualTime : testValues) {
			// Act
			double estimatedTime = programmer.estimateTime(actualTime);

			// Assert - estimated time should always be less than actual time
			assertTrue(estimatedTime < actualTime,
					"Estimated time (" + estimatedTime + ") should be less than actual time (" + actualTime + ")");
		}
	}

	/**
	 * Testing exception throwing using assertThrows
	 * This is the proper way to test that methods throw expected exceptions
	 */
	@Test
	@DisplayName("Time estimation should throw exception for invalid input")
	void estimateTime_ShouldThrowExceptionForInvalidInput() {
		// Act & Assert - assertThrows checks that the lambda throws the expected
		// exception
		IllegalArgumentException exception = assertThrows(
				IllegalArgumentException.class,
				() -> programmer.estimateTime(-1.0),
				"Should throw IllegalArgumentException for negative time");

		// We can also verify the exception message
		assertTrue(exception.getMessage().contains("Time cannot be negative or zero"));
	}

	/**
	 * @Nested classes help organize related tests
	 *         This creates a hierarchical structure in test reports
	 */
	@Nested
	@DisplayName("Coffee Consumption Tests")
	class CoffeeTests {

		@Test
		@DisplayName("Drinking coffee should increment counter")
		void drinkCoffee_ShouldIncrementCounter() {
			// Arrange
			int initialCount = programmer.getCoffeeCount();

			// Act
			int newCount = programmer.drinkCoffee();

			// Assert
			assertEquals(initialCount + 1, newCount, "Coffee count should increment by 1");
			assertEquals(newCount, programmer.getCoffeeCount(), "Internal state should match returned value");
		}

		@Test
		@DisplayName("Multiple coffee drinks should accumulate")
		void multipleCoffees_ShouldAccumulate() {
			// Act
			programmer.drinkCoffee();
			programmer.drinkCoffee();
			programmer.drinkCoffee();

			// Assert
			assertEquals(3, programmer.getCoffeeCount(), "Should have 3 coffees after drinking 3 times");
		}

		@Test
		@DisplayName("Coffee count setter should validate input")
		void setCoffeeCount_ShouldValidateInput() {
			// Act & Assert
			assertThrows(IllegalArgumentException.class,
					() -> programmer.setCoffeeCount(-1),
					"Should not allow negative coffee count");
		}
	}

	/**
	 * @Nested class for testing code writing behavior
	 */
	@Nested
	@DisplayName("Code Writing Tests")
	class CodeWritingTests {

		@Test
		@DisplayName("Writing code without coffee should return TODO comment")
		void writeCode_WithoutCoffee_ShouldReturnTodo() {
			// Arrange
			String feature = "User Authentication";

			// Act
			String result = programmer.writeCode(feature);

			// Assert
			assertTrue(result.contains("TODO"), "Should contain TODO without coffee");
			assertTrue(result.contains(feature), "Should mention the feature name");
		}

		@Test
		@DisplayName("Writing code on Monday without enough coffee should defer work")
		void writeCode_OnMondayWithoutEnoughCoffee_ShouldDeferWork() {
			// Arrange
			mondayProgrammer.drinkCoffee(); // Only 1 coffee, needs 3 on Monday

			// Act
			String result = mondayProgrammer.writeCode("Bug Fixes");

			// Assert
			assertTrue(result.contains("Monday"), "Should reference Monday");
			assertTrue(result.contains("tomorrow"), "Should defer to tomorrow");
		}

		/**
		 * Testing code writing with multiple feature names
		 * Demonstrates testing different combinations of inputs and expected outputs
		 */
		@Test
		@DisplayName("Code writing should handle various feature names")
		void writeCode_WithEnoughCoffee_ShouldGenerateCode() {
			// Arrange
			programmer.drinkCoffee();
			programmer.drinkCoffee();

			// Test data: feature name and expected method name
			Object[][] testCases = {
					{ "User Login", "userlogin" },
					{ "Data Export", "dataexport" },
					{ "Bug Fix", "bugfix" }
			};

			for (Object[] testCase : testCases) {
				String feature = (String) testCase[0];
				String expectedMethodName = (String) testCase[1];

				// Act
				String result = programmer.writeCode(feature);

				// Assert
				assertTrue(result.contains(expectedMethodName),
						"Should contain method name derived from feature: " + expectedMethodName);
				assertTrue(result.contains("public void"), "Should be a proper Java method");
			}
		}

		@Test
		@DisplayName("Writing code should throw exception for null or empty feature")
		void writeCode_WithNullOrEmptyFeature_ShouldThrowException() {
			// Test null input
			assertThrows(IllegalArgumentException.class,
					() -> programmer.writeCode(null),
					"Should throw exception for null feature");

			// Test empty string
			assertThrows(IllegalArgumentException.class,
					() -> programmer.writeCode(""),
					"Should throw exception for empty feature");

			// Test whitespace-only string
			assertThrows(IllegalArgumentException.class,
					() -> programmer.writeCode("   "),
					"Should throw exception for whitespace-only feature");
		}
	}

	/**
	 * @RepeatedTest is useful for testing methods that have random behavior
	 *               This runs the same test multiple times to catch intermittent
	 *               issues
	 */
	@RepeatedTest(value = 5, name = "Debugging strategies test {currentRepetition}/{totalRepetitions}")
	@DisplayName("Debug code should return valid debugging strategy")
	void debugCode_ShouldReturnValidStrategy() {
		// Act
		String strategy = programmer.debugCode();

		// Assert
		assertNotNull(strategy, "Strategy should not be null");
		assertFalse(strategy.trim().isEmpty(), "Strategy should not be empty");

		// Check that it's one of the expected strategies
		assertTrue(
				strategy.equals("Added more print statements") ||
						strategy.equals("Turned it off and on again") ||
						strategy.equals("Rubber duck debugging") ||
						strategy.equals("Blamed the compiler") ||
						strategy.equals("Asked on Stack Overflow"),
				"Strategy should be one of the predefined options: " + strategy);
	}

	/**
	 * Testing methods with random behavior by controlling the randomness
	 */
	@Test
	@DisplayName("Lunch break should always take longer than planned")
	void takeLunchBreak_ShouldAlwaysTakeLonger() {
		// Arrange
		int plannedMinutes = 30;

		// Act
		int actualMinutes = programmer.takeLunchBreak(plannedMinutes);

		// Assert
		assertTrue(actualMinutes > plannedMinutes,
				"Actual lunch time (" + actualMinutes + ") should be longer than planned (" + plannedMinutes + ")");
	}

	@Test
	@DisplayName("Lunch break should validate negative input")
	void takeLunchBreak_ShouldValidateNegativeInput() {
		// Act & Assert
		assertThrows(IllegalArgumentException.class,
				() -> programmer.takeLunchBreak(-10),
				"Should throw exception for negative lunch time");
	}

	/**
	 * Testing complex logic with multiple conditions
	 */
	@Test
	@DisplayName("Productivity should depend on coffee and day of week")
	void isProductive_ShouldDependOnCoffeeAndDay() {
		// Test Monday (should never be productive)
		assertFalse(mondayProgrammer.isProductive(), "Should not be productive on Monday");

		// Test with no coffee
		assertFalse(programmer.isProductive(), "Should not be productive without coffee");

		// Test with optimal coffee (should be productive)
		programmer.drinkCoffee();
		programmer.drinkCoffee();
		programmer.drinkCoffee();
		assertTrue(programmer.isProductive(), "Should be productive with 3 coffees");

		// Test with too much coffee
		programmer.setCoffeeCount(7);
		assertFalse(programmer.isProductive(), "Should not be productive with too much coffee");
	}

	/**
	 * Testing that random methods return values from expected sets
	 */
	@Test
	@DisplayName("Make excuse should return a known excuse")
	void makeExcuse_ShouldReturnKnownExcuse() {
		// Act
		String excuse = programmer.makeExcuse();

		// Assert
		assertNotNull(excuse, "Excuse should not be null");

		// Check that it's one of the expected excuses
		boolean isValidExcuse = excuse.equals("It works on my machine") ||
				excuse.equals("That's not a bug, it's a feature") ||
				excuse.equals("The client changed the requirements") ||
				excuse.equals("It's a hardware problem") ||
				excuse.equals("Solar flares must be interfering");

		assertTrue(isValidExcuse, "Should return a predefined excuse: " + excuse);
	}

	/**
	 * @BeforeAll runs once before all tests in the class
	 *            Use for expensive setup operations that can be shared across tests
	 */
	@BeforeAll
	static void beforeAllTests() {
		System.out.println("Starting LazyProgrammer tests...");
		// In real scenarios, you might:
		// - Set up test database
		// - Initialize external services
		// - Load configuration files
	}

	/**
	 * @AfterAll runs once after all tests in the class
	 *           Use for cleanup of shared resources
	 */
	@AfterAll
	static void afterAllTests() {
		System.out.println("All LazyProgrammer tests completed!");
		// In real scenarios, you might:
		// - Clean up test database
		// - Close external service connections
		// - Generate test reports
	}
}