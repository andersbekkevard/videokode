package p3_mer_om_java.s3_testing.ramsay;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RamsaysKitchenTest {

	private List<Ingredient> testIngredients;

	@BeforeEach
	void setUp() {
		testIngredients = new ArrayList<>(List.of(
				new Ingredient("Bun", false, 100),
				new Ingredient("Patty", false, 200),
				new Ingredient("Cheese", false, 300),
				new Ingredient("Tomato", false, 400),
				new Ingredient("Lettuce", true, 50),
				new Ingredient("Bun", false, 100),
				new Ingredient("Onion", true, 60),
				new Ingredient("Bacon", false, 70),
				new Ingredient("Sauce", false, 80)));
	}

	@Test
	@DisplayName("Burger should have proper bun structure")
	void testBurgerHasProperBunStructure() {
		List<Ingredient> burger = RamsaysKitchen.makeBurger(testIngredients);

		assertFalse(burger.isEmpty(), "Burger should not be empty");
		assertEquals("Bun", burger.get(0).getName(), "First ingredient should be a bun");
		assertEquals("Bun", burger.get(burger.size() - 1).getName(), "Last ingredient should be a bun");
	}

	@Test
	@DisplayName("Burger should contain a meat patty")
	void testBurgerContainsPatty() {
		List<Ingredient> burger = RamsaysKitchen.makeBurger(testIngredients);

		boolean hasPatty = burger.stream()
				.anyMatch(ingredient -> "Patty".equals(ingredient.getName()));

		assertTrue(hasPatty, "Burger must contain a patty");
	}

	@Test
	@DisplayName("Burger should not exceed calorie limit")
	void testBurgerDoesNotExceedCalorieLimit() {
		List<Ingredient> burger = RamsaysKitchen.makeBurger(testIngredients);

		int totalCalories = burger.stream()
				.mapToInt(Ingredient::getCalories)
				.sum();

		assertTrue(totalCalories <= 750,
				"Burger calories (" + totalCalories + ") should not exceed 750");
	}

	@Test
	@DisplayName("Burger should have logical ingredient order")
	void testBurgerIngredientOrder() {
		List<Ingredient> burger = RamsaysKitchen.makeBurger(testIngredients);

		// Find positions of buns and patty
		int firstBunIndex = -1;
		int lastBunIndex = -1;
		int pattyIndex = -1;

		for (int i = 0; i < burger.size(); i++) {
			Ingredient ingredient = burger.get(i);
			if ("Bun".equals(ingredient.getName())) {
				if (firstBunIndex == -1) {
					firstBunIndex = i;
				}
				lastBunIndex = i;
			} else if ("Patty".equals(ingredient.getName())) {
				pattyIndex = i;
			}
		}

		assertEquals(0, firstBunIndex, "First bun should be at the beginning");
		assertEquals(burger.size() - 1, lastBunIndex, "Last bun should be at the end");
		assertTrue(pattyIndex > 0 && pattyIndex < burger.size() - 1,
				"Patty should be between the buns, not at the edges");
	}

	@Test
	@DisplayName("Burger should maximize ingredients within calorie limit")
	void testBurgerMaximizesIngredients() {
		List<Ingredient> burger = RamsaysKitchen.makeBurger(testIngredients);

		int totalCalories = burger.stream()
				.mapToInt(Ingredient::getCalories)
				.sum();

		// Should be close to 750 but not over
		assertTrue(totalCalories <= 750, "Should not exceed calorie limit");
		assertTrue(totalCalories >= 400, "Should use a reasonable amount of ingredients");
	}

	@Test
	@DisplayName("Burger should handle vegetarian and non-vegetarian ingredients correctly")
	void testBurgerHandlesVegetarianIngredients() {
		List<Ingredient> burger = RamsaysKitchen.makeBurger(testIngredients);

		// Should have at least one non-vegetarian ingredient (the patty)
		boolean hasNonVegetarian = burger.stream()
				.anyMatch(ingredient -> !ingredient.isVegetarian());

		assertTrue(hasNonVegetarian, "Burger should contain non-vegetarian ingredients");
	}

	@Test
	@DisplayName("Burger construction should be consistent")
	void testBurgerConsistency() {
		// Test multiple times to ensure consistent behavior
		for (int i = 0; i < 5; i++) {
			List<Ingredient> burger = RamsaysKitchen.makeBurger(testIngredients);

			// Basic requirements should always be met
			assertTrue(burger.size() >= 3, "Burger should have at least 3 ingredients (bun, patty, bun)");
			assertEquals("Bun", burger.get(0).getName());
			assertEquals("Bun", burger.get(burger.size() - 1).getName());

			boolean hasPatty = burger.stream()
					.anyMatch(ingredient -> "Patty".equals(ingredient.getName()));
			assertTrue(hasPatty);
		}
	}

	@Test
	@DisplayName("Should handle edge case with minimal ingredients")
	void testMinimalBurger() {
		List<Ingredient> minimalIngredients = List.of(
				new Ingredient("Bun", false, 100),
				new Ingredient("Patty", false, 200),
				new Ingredient("Bun", false, 100));

		List<Ingredient> burger = RamsaysKitchen.makeBurger(minimalIngredients);

		assertEquals(3, burger.size(), "Minimal burger should have exactly 3 ingredients");
		assertEquals("Bun", burger.get(0).getName());
		assertEquals("Patty", burger.get(1).getName());
		assertEquals("Bun", burger.get(2).getName());

		int totalCalories = burger.stream()
				.mapToInt(Ingredient::getCalories)
				.sum();
		assertEquals(400, totalCalories, "Minimal burger should have 400 calories");
	}
}