package p3_mer_om_java.s3_testing.ramsay;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RamsaysKitchenTest {

	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	private final PrintStream standardOut = System.out;

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@AfterEach
	public void tearDown() {
		System.setOut(standardOut);
	}

	private List<Ingredient> createPerfectBurger() {
		return Arrays.asList(
				new Ingredient("Bun"),
				new Ingredient("Sauce"),
				new Ingredient("Lettuce"),
				new Ingredient("Patty"),
				new Ingredient("Cheese"),
				new Ingredient("Bacon"),
				new Ingredient("Tomato"),
				new Ingredient("Onion"),
				new Ingredient("Bun"));
	}

	private List<Ingredient> createShuffledIngredients() {
		List<Ingredient> shuffled = new ArrayList<>(Arrays.asList(
				new Ingredient("Bun"),
				new Ingredient("Sauce"),
				new Ingredient("Lettuce"),
				new Ingredient("Patty"),
				new Ingredient("Cheese"),
				new Ingredient("Bacon"),
				new Ingredient("Tomato"),
				new Ingredient("Onion"),
				new Ingredient("Bun")));
		Collections.shuffle(shuffled);
		return shuffled;
	}

	// Tests for critiqueBurger method

	@Test
	public void testCritiquePerfectBurger() {
		List<Ingredient> perfectBurger = createPerfectBurger();

		RamsaysKitchen.critiqueBurger(perfectBurger);

		String output = outputStreamCaptor.toString();
		assertTrue(output.contains("Finally, a burger worthy of my taste buds"));
		assertTrue(output.contains("avoided total embarrassment"));
	}

	@Test
	public void testCritiqueBurgerWithoutBottomBun() {
		List<Ingredient> noBunBurger = Arrays.asList(
				new Ingredient("Sauce"),
				new Ingredient("Lettuce"),
				new Ingredient("Patty"),
				new Ingredient("Cheese"),
				new Ingredient("Bacon"),
				new Ingredient("Tomato"),
				new Ingredient("Onion"),
				new Ingredient("Bun"));

		RamsaysKitchen.critiqueBurger(noBunBurger);

		String output = outputStreamCaptor.toString();
		assertTrue(output.contains("No bottom bun"));
	}

	@Test
	public void testCritiqueBurgerWithoutPatty() {
		List<Ingredient> noPattyBurger = Arrays.asList(
				new Ingredient("Bun"),
				new Ingredient("Sauce"),
				new Ingredient("Lettuce"),
				new Ingredient("Cheese"),
				new Ingredient("Bacon"),
				new Ingredient("Tomato"),
				new Ingredient("Onion"),
				new Ingredient("Bun"));

		RamsaysKitchen.critiqueBurger(noPattyBurger);

		String output = outputStreamCaptor.toString();
		assertTrue(output.contains("There's no burger patty"));
		assertTrue(output.contains("vegetarian"));
	}

	@Test
	public void testCritiqueBurgerWithCheeseBeforePatty() {
		List<Ingredient> cheeseFirstBurger = Arrays.asList(
				new Ingredient("Bun"),
				new Ingredient("Sauce"),
				new Ingredient("Lettuce"),
				new Ingredient("Cheese"),
				new Ingredient("Patty"),
				new Ingredient("Bacon"),
				new Ingredient("Tomato"),
				new Ingredient("Onion"),
				new Ingredient("Bun"));

		RamsaysKitchen.critiqueBurger(cheeseFirstBurger);

		String output = outputStreamCaptor.toString();
		assertTrue(output.contains("cheese mattress"));
	}

	@Test
	public void testCritiqueBurgerWithDoubleTomatoes() {
		List<Ingredient> doubleTomatoBurger = Arrays.asList(
				new Ingredient("Bun"),
				new Ingredient("Sauce"),
				new Ingredient("Lettuce"),
				new Ingredient("Patty"),
				new Ingredient("Cheese"),
				new Ingredient("Bacon"),
				new Ingredient("Tomato"),
				new Ingredient("Tomato"),
				new Ingredient("Onion"),
				new Ingredient("Bun"));

		RamsaysKitchen.critiqueBurger(doubleTomatoBurger);

		String output = outputStreamCaptor.toString();
		assertTrue(output.contains("Two layers of tomatoes"));
		assertTrue(output.contains("bloody garden"));
	}

	@Test
	public void testCritiqueBurgerWithoutBacon() {
		List<Ingredient> noBaconBurger = Arrays.asList(
				new Ingredient("Bun"),
				new Ingredient("Sauce"),
				new Ingredient("Lettuce"),
				new Ingredient("Patty"),
				new Ingredient("Cheese"),
				new Ingredient("Tomato"),
				new Ingredient("Onion"),
				new Ingredient("Bun"));

		RamsaysKitchen.critiqueBurger(noBaconBurger);

		String output = outputStreamCaptor.toString();
		assertTrue(output.contains("Where's the bacon"));
	}

	@Test
	public void testCritiqueBurgerWithoutTopBun() {
		List<Ingredient> noTopBunBurger = Arrays.asList(
				new Ingredient("Bun"),
				new Ingredient("Sauce"),
				new Ingredient("Lettuce"),
				new Ingredient("Patty"),
				new Ingredient("Cheese"),
				new Ingredient("Bacon"),
				new Ingredient("Tomato"),
				new Ingredient("Onion"));

		RamsaysKitchen.critiqueBurger(noTopBunBurger);

		String output = outputStreamCaptor.toString();
		assertTrue(output.contains("idiot sandwich"));
	}

	@Test
	public void testCritiqueBurgerWithMultipleProblems() {
		List<Ingredient> terribleBurger = Arrays.asList(
				new Ingredient("Sauce"),
				new Ingredient("Cheese"),
				new Ingredient("Tomato"),
				new Ingredient("Tomato"));

		RamsaysKitchen.critiqueBurger(terribleBurger);

		String output = outputStreamCaptor.toString();
		assertTrue(output.contains("No bottom bun"));
		assertTrue(output.contains("no burger patty"));
		assertTrue(output.contains("Two layers of tomatoes"));
		assertTrue(output.contains("Where's the bacon"));
		assertFalse(output.contains("Finally, a burger worthy"));
	}

	// Tests for makeBurger method

	@Test
	public void testMakeBurgerWithShuffledIngredients() {
		List<Ingredient> shuffledIngredients = createShuffledIngredients();

		List<Ingredient> result = RamsaysKitchen.makeBurger(shuffledIngredients);

		assertEquals(9, result.size());
		assertEquals("Bun", result.get(0).getName());
		assertEquals("Sauce", result.get(1).getName());
		assertEquals("Lettuce", result.get(2).getName());
		assertEquals("Patty", result.get(3).getName());
		assertEquals("Cheese", result.get(4).getName());
		assertEquals("Bacon", result.get(5).getName());
		assertEquals("Tomato", result.get(6).getName());
		assertEquals("Onion", result.get(7).getName());
		assertEquals("Bun", result.get(8).getName());
	}

	@Test
	public void testMakeBurgerWithCorrectOrder() {
		List<Ingredient> orderedIngredients = createPerfectBurger();

		List<Ingredient> result = RamsaysKitchen.makeBurger(orderedIngredients);

		assertEquals(9, result.size());
		for (int i = 0; i < result.size(); i++) {
			assertEquals(orderedIngredients.get(i).getName(), result.get(i).getName());
		}
	}

	@Test
	public void testMakeBurgerWithReverseOrder() {
		List<Ingredient> reversedIngredients = createPerfectBurger();
		Collections.reverse(reversedIngredients);

		List<Ingredient> result = RamsaysKitchen.makeBurger(reversedIngredients);

		assertEquals(9, result.size());
		assertEquals("Bun", result.get(0).getName());
		assertEquals("Bun", result.get(8).getName());
		assertEquals("Patty", result.get(3).getName());
		assertEquals("Cheese", result.get(4).getName());
	}

	@Test
	public void testMakeBurgerProducesPerfectBurger() {
		List<Ingredient> shuffledIngredients = createShuffledIngredients();

		List<Ingredient> result = RamsaysKitchen.makeBurger(shuffledIngredients);

		// Test that Gordon would approve of this burger
		RamsaysKitchen.critiqueBurger(result);
		String output = outputStreamCaptor.toString();
		assertTrue(output.contains("Finally, a burger worthy"));
	}

	@Test
	public void testMakeBurgerHandlesEmptyList() {
		List<Ingredient> emptyIngredients = new ArrayList<>();

		assertThrows(RuntimeException.class, () -> {
			RamsaysKitchen.makeBurger(emptyIngredients);
		});
	}

	@Test
	public void testMakeBurgerWithMissingIngredient() {
		List<Ingredient> incompleteIngredients = Arrays.asList(
				new Ingredient("Bun"),
				new Ingredient("Lettuce"),
				new Ingredient("Patty"),
				new Ingredient("Cheese"),
				new Ingredient("Bacon"),
				new Ingredient("Tomato"),
				new Ingredient("Onion"),
				new Ingredient("Bun"));

		assertThrows(RuntimeException.class, () -> {
			RamsaysKitchen.makeBurger(incompleteIngredients);
		});
	}

	@Test
	public void testCritiqueBurgerWithSingleBun() {
		List<Ingredient> singleBunBurger = Arrays.asList(new Ingredient("Bun"));

		RamsaysKitchen.critiqueBurger(singleBunBurger);

		String output = outputStreamCaptor.toString();
		assertTrue(output.contains("no burger patty"));
		assertTrue(output.contains("Where's the bacon"));
		// Single bun satisfies both start and end bun check since burger.get(0) ==
		// burger.get(0)
		assertFalse(output.contains("Finally, a burger worthy"));
	}

	@Test
	public void testCritiqueBurgerWithOnlyPattyAndBacon() {
		List<Ingredient> minimalBurger = Arrays.asList(
				new Ingredient("Bun"),
				new Ingredient("Patty"),
				new Ingredient("Bacon"),
				new Ingredient("Bun"));

		RamsaysKitchen.critiqueBurger(minimalBurger);

		String output = outputStreamCaptor.toString();
		assertTrue(output.contains("Finally, a burger worthy"));
	}

	@Test
	public void testIngredientEqualityInBurgerLogic() {
		List<Ingredient> burger = Arrays.asList(
				new Ingredient("Bun"),
				new Ingredient("Patty"),
				new Ingredient("Bacon"),
				new Ingredient("Bun"));

		// Test that ingredient equality works correctly in contains() calls
		assertTrue(burger.contains(new Ingredient("Patty")));
		assertTrue(burger.contains(new Ingredient("Bacon")));
		assertFalse(burger.contains(new Ingredient("Cheese")));
	}

	@Test
	public void testBurgerIndexLogic() {
		List<Ingredient> burger = Arrays.asList(
				new Ingredient("Bun"),
				new Ingredient("Cheese"),
				new Ingredient("Patty"),
				new Ingredient("Bun"));

		int pattyIndex = burger.indexOf(new Ingredient("Patty"));
		int cheeseIndex = burger.indexOf(new Ingredient("Cheese"));

		assertEquals(2, pattyIndex);
		assertEquals(1, cheeseIndex);
		assertTrue(cheeseIndex < pattyIndex);
	}

	@Test
	public void testMakeBurgerPreservesIngredientObjects() {
		List<Ingredient> ingredients = createShuffledIngredients();
		List<Ingredient> originalCopy = new ArrayList<>(ingredients);

		List<Ingredient> result = RamsaysKitchen.makeBurger(new ArrayList<>(ingredients));

		// The makeBurger method modifies the input list, so we pass a copy
		// Result should contain all original ingredients
		assertEquals(originalCopy.size(), result.size());

		// Verify the result burger has the correct structure
		assertEquals("Bun", result.get(0).getName());
		assertEquals("Bun", result.get(result.size() - 1).getName());
	}
}