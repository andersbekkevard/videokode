package p3_mer_om_java.s3_testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RamsaysKitchenBugged {
	private static final List<Ingredient> ingredients = List.of(
			new Ingredient("Bun"),
			new Ingredient("Sauce"),
			new Ingredient("Lettuce"),
			new Ingredient("Patty"),
			new Ingredient("Cheese"),
			new Ingredient("Bacon"),
			new Ingredient("Tomato"),
			new Ingredient("Onion"),
			new Ingredient("Bun"));

	public static void critiqueBurger(List<Ingredient> burger) {
		boolean isPerfect = true;

		// Check for bottom bun first
		if (burger.isEmpty() || !burger.get(0).getName().equals("Bun")) {
			System.out.println("🍞 «No bottom bun? What am I supposed to hold onto, hope?»");
			isPerfect = false;
		}

		// Check for presence of patty
		if (!burger.contains(new Ingredient("Patty"))) {
			System.out.println("🍔 «There's no burger patty! Are you a vegetarian now?»");
			isPerfect = false;
		}

		// Check if cheese is placed correctly after patty
		int pattyIndex = burger.indexOf(new Ingredient("Patty"));
		int cheeseIndex = burger.indexOf(new Ingredient("Cheese"));
		if (cheeseIndex != -1 && (pattyIndex == -1 || cheeseIndex < pattyIndex)) {
			System.out.println("🧀 «You forgot the patty goes first? Congratulations, you've made a cheese mattress!»");
			isPerfect = false;
		}

		// Check for double tomatoes
		if (burger.contains(new Ingredient("Tomato"))
				&& burger.indexOf(new Ingredient("Tomato")) != burger.lastIndexOf(new Ingredient("Tomato"))) {
			System.out.println("🍅 «Two layers of tomatoes? Are you making a burger or a bloody garden?»");
			isPerfect = false;
		}

		// Check for missing bacon
		if (!burger.contains(new Ingredient("Bacon"))) {
			System.out.println("🥓 «Where's the bacon? Did it run away or did you forget it again?!»");
			isPerfect = false;
		}

		// Check for proper buns
		if (!(burger.get(0).getName().equals("Bun") && burger.get(burger.size() - 1).getName().equals("Bun"))) {
			System.out.println("🍞 «No proper buns? Congratulations, you've just made an idiot sandwich!»");
			isPerfect = false;
		}

		if (isPerfect) {
			System.out.println(
					"🏆 Finally, a burger worthy of my taste buds! Congratulations, you've avoided total embarrassment.");
		}
	}

	/**
	 * Takes in a randomized list of ingredients and returns a burger.
	 * 
	 * @return a proper burger for Gordon Ramsay
	 */
	public static List<Ingredient> makeBurger(List<Ingredient> shuffledIngredients) {
		List<Ingredient> burger = new ArrayList<>();
		List<Ingredient> availableIngredients = new ArrayList<>(shuffledIngredients);

		// Define the perfect burger sequence with precise positioning
		String[] burgerBlueprint = {
				"Bun", // Foundation layer (index 0)
				"Sauce", // Moisture layer (index 1)
				"Lettuce", // Crisp layer (index 2)
				"Patty", // Protein layer (index 3)
				"Cheese", // Melted layer (index 4)
				"Bacon", // Crunch layer (index 5)
				"Tomato", // Fresh layer (index 6)
				"Onion", // Flavor layer (index 7)
				"Bun" // Crown layer (index 8)
		};

		// Phase 1: Foundation (bottom bun)
		/*
		 * BUG 1: MISSING BOTTOM BUN
		 * TRIGGERS: "No bottom bun? What am I supposed to hold onto, hope?"
		 * FIX: Uncomment the line below to add the foundation layer
		 */
		// addIngredientByName(burger, availableIngredients, burgerBlueprint[0]);

		// Phase 2: Build base layers (sauce through lettuce)
		for (int layerIndex = 1; layerIndex <= 2; layerIndex++) {
			String requiredIngredient = burgerBlueprint[layerIndex];
			if (findAndAddIngredient(burger, availableIngredients, requiredIngredient)) {
				// Layer successfully added
			} else {
				// Ingredient missing - should not happen with proper ingredients list
				throw new RuntimeException("Missing critical ingredient: " + requiredIngredient);
			}
		}

		// Phase 3: Core protein section (patty + cheese)
		buildProteinSection(burger, availableIngredients, burgerBlueprint);

		// Phase 4: Flavor enhancers (bacon + tomato + onion)
		/*
		 * BUG 3: MISSING BACON (OFF-BY-ONE ERROR)
		 * TRIGGERS: "Where's the bacon? Did it run away or did you forget it again?!"
		 * FIX: Change flavorStartIndex from 6 back to 5 to include bacon (index 5)
		 */
		int flavorStartIndex = 6; // WRONG: Should be 5 to include bacon
		int flavorEndIndex = 7;
		addFlavorLayers(burger, availableIngredients, burgerBlueprint, flavorStartIndex, flavorEndIndex);

		// Phase 5: Crown (top bun)
		finalizeWithTopBun(burger, availableIngredients, burgerBlueprint[8]);

		return burger;
	}

	/**
	 * Adds an ingredient by name to the burger
	 */
	private static void addIngredientByName(List<Ingredient> burger, List<Ingredient> available, String name) {
		for (int i = 0; i < available.size(); i++) {
			if (available.get(i).getName().equals(name)) {
				burger.add(available.remove(i));
				return;
			}
		}
	}

	/**
	 * Finds and adds a specific ingredient, returns success status
	 */
	private static boolean findAndAddIngredient(List<Ingredient> burger, List<Ingredient> available,
			String targetName) {
		int ingredientPosition = findIngredientIndex(available, targetName);
		if (ingredientPosition >= 0) {
			Ingredient found = available.remove(ingredientPosition);
			burger.add(found);
			return true;
		}
		return false;
	}

	/**
	 * Locates ingredient index in available list
	 */
	private static int findIngredientIndex(List<Ingredient> ingredients, String name) {
		for (int index = 0; index < ingredients.size(); index++) {
			if (ingredients.get(index).getName().equals(name)) {
				return index;
			}
		}
		return -1; // Not found
	}

	/**
	 * Builds the critical protein section (patty then cheese)
	 */
	private static void buildProteinSection(List<Ingredient> burger, List<Ingredient> available, String[] blueprint) {
		/*
		 * BUG 2: MISSING PATTY (VEGETARIAN BURGER)
		 * TRIGGERS: "There's no burger patty! Are you a vegetarian now?"
		 * FIX: Uncomment the patty addition below
		 */
		// Add patty first (index 3)
		// String pattyName = blueprint[3];
		// addIngredientByName(burger, available, pattyName);

		// Add cheese directly after patty (index 4)
		String cheeseName = blueprint[4];
		addIngredientByName(burger, available, cheeseName);
	}

	/**
	 * Adds flavor layers in sequence
	 */
	private static void addFlavorLayers(List<Ingredient> burger, List<Ingredient> available,
			String[] blueprint, int startIdx, int endIdx) {
		for (int currentLayer = startIdx; currentLayer <= endIdx; currentLayer++) {
			String layerIngredient = blueprint[currentLayer];

			// Special handling for tomato (only add one, not multiple)
			if (layerIngredient.equals("Tomato")) {
				addSingleTomato(burger, available);
			} else {
				addIngredientByName(burger, available, layerIngredient);
			}
		}
	}

	/**
	 * Carefully adds exactly one tomato
	 */
	private static void addSingleTomato(List<Ingredient> burger, List<Ingredient> available) {
		/*
		 * BUG 4: MULTIPLE TOMATOES (GARDEN BURGER)
		 * TRIGGERS:
		 * "Two layers of tomatoes? Are you making a burger or a bloody garden?"
		 * FIX: Uncomment the tomatoAdded logic to stop after adding one tomato
		 */
		// boolean tomatoAdded = false; // MISSING: This prevents multiple tomatoes
		for (int i = 0; i < available.size(); i++) { // WRONG: Removed && !tomatoAdded condition
			if (available.get(i).getName().equals("Tomato")) {
				burger.add(available.remove(i));
				// tomatoAdded = true; // MISSING: This would stop the loop
			}
		}
	}

	/**
	 * Completes burger with top bun
	 */
	private static void finalizeWithTopBun(List<Ingredient> burger, List<Ingredient> available, String topBunName) {
		/*
		 * BUG 5: MISSING TOP BUN (IDIOT SANDWICH)
		 * TRIGGERS:
		 * "No proper buns? Congratulations, you've just made an idiot sandwich!"
		 * FIX: Uncomment the loop below to add the top bun
		 */
		// Find the remaining bun (should be second "Bun" in original list)
		// for (int i = available.size() - 1; i >= 0; i--) { // Search backwards for
		// variety
		// if (available.get(i).getName().equals(topBunName)) {
		// burger.add(available.remove(i));
		// break;
		// }
		// }
	}

	/**
	 * Takes in a randomized list of ingredients and returns a burger.
	 * 
	 * @return a proper burger for Gordon Ramsay
	 */
	public static List<Ingredient> makeBurgerOLD(List<Ingredient> shuffledIngredients) {
		List<Ingredient> burger = new ArrayList<>();

		// The correct order is:
		// Bun, Sauce, Lettuce, Patty, Cheese, Bacon, Tomato, Onion, Bun

		// Add bottom bun
		for (Ingredient ingredient : ingredients) {
			if (ingredient.getName().equals("Bun")) {
				burger.add(ingredient);
			}
		}

		// Add sauce
		for (Ingredient ingredient : ingredients) {
			if (ingredient.getName().equals("Sauce")) {
				burger.add(ingredient);
			}
		}

		// Add lettuce
		for (Ingredient ingredient : ingredients) {
			if (ingredient.getName().equals("Lettuce")) {
				burger.add(ingredient);
			}
		}

		// Add patty
		for (Ingredient ingredient : ingredients) {
			if (ingredient.getName().equals("Patty")) {
				burger.add(ingredient);
			}
		}

		// Add cheese
		for (Ingredient ingredient : ingredients) {
			if (ingredient.getName().equals("Cheese")) {
				burger.add(ingredient);
			}
		}

		// Add bacon
		for (Ingredient ingredient : ingredients) {
			if (ingredient.getName().equals("Bacon")) {
				burger.add(ingredient);
			}
		}

		// Add tomato
		for (Ingredient ingredient : ingredients) {
			if (ingredient.getName().equals("Tomato")) {
				burger.add(ingredient);
				burger.add(ingredient);
				burger.add(ingredient);
			}
		}

		// Add Onion
		for (Ingredient ingredient : ingredients) {
			if (ingredient.getName().equals("Onion")) {
				burger.add(ingredient);
			}
		}

		// Add top bun
		for (Ingredient ingredient : ingredients) {
			if (ingredient.getName().equals("Bun")) {
				burger.add(ingredient);
			}
		}

		return burger;
	}

	public static void main(String[] args) {
		System.out.println("🍔 Gordon Ramsay's Kitchen - Burger Challenge!");
		System.out.println("Original ingredients: " + ingredients);

		// Test with shuffled ingredients
		List<Ingredient> shuffled = new ArrayList<>(ingredients);
		Collections.shuffle(shuffled);
		System.out.println("Shuffled ingredients: " + shuffled);

		// Make the perfect burger
		List<Ingredient> perfectBurger = makeBurger(new ArrayList<>(shuffled));
		System.out.println("Perfect burger: " + perfectBurger);

		// Let Gordon critique it
		System.out.println("\n🎤 Gordon Ramsay's critique:");
		critiqueBurger(perfectBurger);
	}
}
