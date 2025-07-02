package p3_mer_om_java.s3_testing;

/**
 * A simple coffee machine with a temperamental personality.
 * Perfect for demonstrating basic JUnit testing concepts.
 */
public class TemperamentalCoffeeMachine {
	private int waterLevel;
	private int coffeesMade;
	private boolean isHappy;

	public TemperamentalCoffeeMachine() {
		this.waterLevel = 0;
		this.coffeesMade = 0;
		this.isHappy = true;
	}

	/**
	 * Adds water to the machine. Gets grumpy if you add too much at once.
	 * 
	 * @param amount water to add in ml
	 * @return new water level
	 */
	public int addWater(int amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Cannot add negative water!");
		}

		if (amount > 500) {
			isHappy = false;
			throw new IllegalArgumentException("Too much water at once! I'm drowning!");
		}

		waterLevel += amount;

		// Machine gets happy when it has enough water
		if (waterLevel >= 200) {
			isHappy = true;
		}

		return waterLevel;
	}

	/**
	 * Attempts to brew coffee. Success depends on water level and machine mood.
	 * 
	 * @return description of what happened
	 */
	public String brewCoffee() {
		if (waterLevel < 100) {
			isHappy = false;
			return "Not enough water! Add more water, you lazy human!";
		}

		if (!isHappy) {
			return "I'm too grumpy to make coffee right now. Try being nicer to me.";
		}

		// Use water and make coffee
		waterLevel -= 100;
		coffeesMade++;

		// Get tired after making too many coffees
		if (coffeesMade >= 5) {
			isHappy = false;
			return "Perfect coffee! But I'm getting tired... maybe give me a break?";
		}

		return "Perfect coffee! ☕ Enjoy your delicious beverage!";
	}

	/**
	 * Resets the machine's mood. Like turning it off and on again.
	 */
	public void reset() {
		isHappy = true;
		coffeesMade = 0;
	}

	// Simple getters
	public int getWaterLevel() {
		return waterLevel;
	}

	public int getCoffeesMade() {
		return coffeesMade;
	}

	public boolean isHappy() {
		return isHappy;
	}
}