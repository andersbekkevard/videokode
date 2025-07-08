package p3_mer_om_java.s3_testing.ramsay;

import java.util.ArrayList;
import java.util.List;

/**
 * Vi vil lage så stor burger som mulig, men må følge reglene:
 * 1. En burger må inneholde noe kjøtt
 * 2. En burger må ha brød på toppen og bunnen
 * 3. En burger kan maksimalt ha 750 kalorier
 */
public class RamsaysKitchen {
	private static final String NO_PATTY_MESSAGE = "There's no burger patty! Are you a vegetarian now?";
	private static final String NO_PROPER_BUNS_MESSAGE = "No proper buns? Congratulations, you've just made an idiot sandwich!";
	private static final String PERFECT_BURGER_MESSAGE = "Finally, a burger worthy of my taste buds! Congratulations, you've avoided total embarrassment.";
	private static final String TOO_MANY_CALORIES_MESSAGE = "This burger has more calories than a deep-fried cheesecake! Are you trying to serve a heart attack on a plate?";

	private static final List<Ingredient> ingredients = List.of(
			new Ingredient("Bun", false, 100),
			new Ingredient("Patty", false, 200),
			new Ingredient("Cheese", false, 300),
			new Ingredient("Tomato", false, 400),
			new Ingredient("Lettuce", true, 50),
			new Ingredient("Bun", false, 100),
			new Ingredient("Onion", true, 60),
			new Ingredient("Bacon", false, 70),
			new Ingredient("Sauce", false, 80));

	/**
	 * Gordon Ramsay critiques your sorry excuse for a burger.
	 *
	 * I’ll go through every miserable layer to make sure you follow the rules
	 *
	 * And listen carefully: DO NOT TOUCH THIS METHOD.
	 * This is my kitchen. You mess with this, and I’ll personally throw your burger
	 * in the bin.
	 *
	 * @param burger the tragic stack of ingredients you dare call a burger
	 */
	public static void critiqueBurger(List<Ingredient> burger) {
		boolean isPerfect = true;

		if (!(burger.get(0).getName().equals("Bun") && burger.get(burger.size() - 1).getName().equals("Bun"))) {
			System.out.println(NO_PROPER_BUNS_MESSAGE);
			isPerfect = false;
		}

		int calories = 0;
		for (Ingredient ingredient : burger) {
			calories += ingredient.getCalories();
		}

		if (calories > 750) {
			System.out.println(TOO_MANY_CALORIES_MESSAGE);
			isPerfect = false;
		}

		boolean hasMeat = false;
		for (Ingredient ingredient : burger) {
			if (!ingredient.isVegetarian()) {
				hasMeat = true;
				break;
			}
		}

		if (!hasMeat) {
			System.out.println(NO_PATTY_MESSAGE);
			isPerfect = false;
		}

		if (isPerfect) {
			System.out.println(PERFECT_BURGER_MESSAGE);
		}
	}

	public static List<Ingredient> makeBurger(List<Ingredient> shuffled) {

		Ingredient bottomBun = null;
		Ingredient topBun = null;
		Ingredient patty = null;
		List<Ingredient> toppings = new ArrayList<>();

		for (Ingredient ingredient : shuffled) {
			if ("Bun".equals(ingredient.getName())) {
				if (bottomBun == null) {
					bottomBun = ingredient;
				} else if (topBun == null) {
					topBun = ingredient;
				}
			} else if (!ingredient.isVegetarian() && patty == null) {
				patty = ingredient;
			} else {
				toppings.add(ingredient); // Legger i egen liste hvis ikke kjøtt eller brød
			}
		}

		// (MULIG FJERN)
		if (bottomBun == null || topBun == null) {
			throw new IllegalStateException("Need two buns to hold the burger together!");
		}
		if (patty == null) {
			throw new IllegalStateException("Every burger needs a meat patty!");
		}

		// Setter sammen burger
		int calories = 0;
		List<Ingredient> burger = new ArrayList<>();
		burger.add(bottomBun);
		calories += bottomBun.getCalories();
		burger.add(patty);
		calories += patty.getCalories();

		// Legger til siste brødet, da det må med uansett
		calories += topBun.getCalories();

		for (Ingredient topping : toppings) {
			if (calories + topping.getCalories() > 750) {
				break;
			}
			burger.add(topping);
			calories += topping.getCalories();
		}
		burger.add(topBun);
		return burger;
	}

	public static void main(String[] args) {
		List<Ingredient> burger = makeBurger(ingredients);
		critiqueBurger(burger);
	}
}