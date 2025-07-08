package p3_mer_om_java.s3_testing.old;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Simple JUnit test demonstrating basic testing concepts.
 * This test covers the TemperamentalCoffeeMachine class and shows:
 * - Basic test structure
 * - Setup with @BeforeEach
 * - Common assertion methods
 * - Exception testing
 */
class TemperamentalCoffeeMachineTest {

	// This will hold our coffee machine for each test
	private TemperamentalCoffeeMachine machine;

	/**
	 * @BeforeEach runs before every test method.
	 *             Use this to create fresh objects for each test.
	 *             This ensures tests don't interfere with each other.
	 */
	@BeforeEach
	void setUp() {
		machine = new TemperamentalCoffeeMachine();
	}

	/**
	 * @Test marks a method as a test.
	 *       Test method names should describe what they're testing.
	 */
	@Test
	void newMachine_ShouldStartWithZeroWaterAndBeHappy() {
		// Check initial state using assertEquals and assertTrue
		assertEquals(0, machine.getWaterLevel(), "New machine should have no water");
		assertEquals(0, machine.getCoffeesMade(), "New machine should have made no coffee");
		assertTrue(machine.isHappy(), "New machine should be happy");
	}

	@Test
	void addWater_ShouldIncreaseWaterLevel() {
		// Act - perform the action we want to test
		int newLevel = machine.addWater(200);

		// Assert - check that it worked correctly
		assertEquals(200, newLevel, "Should return the new water level");
		assertEquals(200, machine.getWaterLevel(), "Water level should be updated");
	}

	@Test
	void addWater_WithEnoughWater_ShouldMakeMachineHappy() {
		// Machine becomes happy when water level reaches 200ml
		machine.addWater(200);

		assertTrue(machine.isHappy(), "Machine should be happy with enough water");
	}

	/**
	 * Testing exception handling with assertThrows.
	 * This is the correct way to test that methods throw exceptions.
	 */
	@Test
	void addWater_WithNegativeAmount_ShouldThrowException() {
		// assertThrows checks that the lambda expression throws the expected exception
		IllegalArgumentException exception = assertThrows(
				IllegalArgumentException.class,
				() -> machine.addWater(-50),
				"Should throw exception for negative water");

		// We can also check the exception message
		assertTrue(exception.getMessage().contains("negative"));
	}

	@Test
	void addWater_WithTooMuchAtOnce_ShouldThrowExceptionAndMakeMachineUnhappy() {
		// Try to add too much water (more than 500ml)
		assertThrows(IllegalArgumentException.class,
				() -> machine.addWater(600),
				"Should throw exception for too much water");

		// Machine should also become unhappy
		assertFalse(machine.isHappy(), "Machine should be unhappy after drowning");
	}

	@Test
	void brewCoffee_WithoutEnoughWater_ShouldComplainAndMakeMachineUnhappy() {
		// Try to brew without enough water (needs 100ml minimum)
		String result = machine.brewCoffee();

		// Check the complaint message and machine state
		assertTrue(result.contains("Not enough water"), "Should complain about water");
		assertFalse(machine.isHappy(), "Machine should be unhappy");
		assertEquals(0, machine.getCoffeesMade(), "Should not have made any coffee");
	}

	@Test
	void brewCoffee_WithEnoughWater_ShouldMakeCoffeeSuccessfully() {
		// Setup - add enough water
		machine.addWater(200);

		// Act - brew coffee
		String result = machine.brewCoffee();

		// Assert - check everything worked
		assertTrue(result.contains("Perfect coffee"), "Should make perfect coffee");
		assertEquals(100, machine.getWaterLevel(), "Should use 100ml of water");
		assertEquals(1, machine.getCoffeesMade(), "Should have made 1 coffee");
		assertTrue(machine.isHappy(), "Machine should still be happy");
	}

	@Test
	void brewCoffee_WhenUnhappy_ShouldRefuseToWork() {
		// Setup - make machine unhappy by trying to add too much water
		try {
			machine.addWater(600); // This will make it unhappy
		} catch (IllegalArgumentException e) {
			// Expected exception, continue with test
		}

		// Add proper amount of water but machine is still unhappy
		machine.addWater(200);

		// Act
		String result = machine.brewCoffee();

		// Assert
		assertTrue(result.contains("too grumpy"), "Should refuse when grumpy");
		assertEquals(0, machine.getCoffeesMade(), "Should not make coffee when grumpy");
	}

	@Test
	void brewCoffee_AfterManyUses_ShouldGetTiredAndGrumpy() {
		// Setup - add lots of water and make many coffees
		machine.addWater(500);

		// Make 5 coffees (machine gets tired after 5)
		for (int i = 0; i < 4; i++) {
			machine.brewCoffee();
			machine.addWater(100); // Add more water between brews
		}

		// The 5th coffee should make it tired
		String result = machine.brewCoffee();

		assertTrue(result.contains("getting tired"), "Should be tired after 5 coffees");
		assertFalse(machine.isHappy(), "Should be unhappy when tired");
		assertEquals(5, machine.getCoffeesMade(), "Should have made 5 coffees");
	}

	@Test
	void reset_ShouldMakeMachineHappyAgainAndResetCoffeeCount() {
		// Setup - make machine unhappy and tired
		machine.addWater(500);
		for (int i = 0; i < 5; i++) {
			machine.brewCoffee();
			machine.addWater(100);
		}

		// Verify machine is unhappy
		assertFalse(machine.isHappy(), "Machine should be unhappy before reset");

		// Act - reset the machine
		machine.reset();

		// Assert - machine should be happy and coffee count reset
		assertTrue(machine.isHappy(), "Machine should be happy after reset");
		assertEquals(0, machine.getCoffeesMade(), "Coffee count should be reset");
	}
}