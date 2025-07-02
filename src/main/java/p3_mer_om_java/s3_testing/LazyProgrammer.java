package p3_mer_om_java.s3_testing;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * A LazyProgrammer class that represents the typical behavior of a
 * procrastinating developer.
 * This class showcases common programming habits with a humorous twist.
 */
public class LazyProgrammer {
	private String name;
	private int coffeeCount;
	private boolean isMonday;
	private Random random;

	// List of excuses for why code doesn't work
	private final List<String> excuses = Arrays.asList(
			"It works on my machine",
			"That's not a bug, it's a feature",
			"The client changed the requirements",
			"It's a hardware problem",
			"Solar flares must be interfering");

	public LazyProgrammer(String name) {
		this.name = name;
		this.coffeeCount = 0;
		this.isMonday = false;
		this.random = new Random();
	}

	public LazyProgrammer(String name, boolean isMonday) {
		this(name);
		this.isMonday = isMonday;
	}

	/**
	 * Estimates time to complete a task. Always underestimates because of optimism
	 * bias.
	 * 
	 * @param actualTimeHours the real time needed
	 * @return estimated time (always less than actual)
	 */
	public double estimateTime(double actualTimeHours) {
		if (actualTimeHours <= 0) {
			throw new IllegalArgumentException("Time cannot be negative or zero");
		}

		// Always underestimate by at least 50%
		double optimismFactor = isMonday ? 0.2 : 0.5; // Even more optimistic on Mondays
		return actualTimeHours * optimismFactor;
	}

	/**
	 * Drinks coffee to boost productivity
	 * 
	 * @return current coffee count after drinking
	 */
	public int drinkCoffee() {
		coffeeCount++;
		return coffeeCount;
	}

	/**
	 * Attempts to write code. Quality depends on coffee intake and day of week.
	 * 
	 * @param feature the feature to implement
	 * @return the "implemented" code
	 */
	public String writeCode(String feature) {
		if (feature == null || feature.trim().isEmpty()) {
			throw new IllegalArgumentException("Feature cannot be null or empty");
		}

		if (coffeeCount == 0) {
			return "// TODO: Implement " + feature + " after coffee";
		}

		if (isMonday && coffeeCount < 3) {
			return "console.log('It is Monday my dudes'); // Will implement " + feature + " tomorrow";
		}

		if (coffeeCount >= 5) {
			return "// Copy-pasted from Stack Overflow - " + feature + " (probably works)";
		}

		return "public void " + feature.toLowerCase().replace(" ", "") + "() {\n" +
				"    // Actual implementation here\n" +
				"    System.out.println(\"" + feature + " is working!\");\n" +
				"}";
	}

	/**
	 * Debugs code using advanced techniques
	 * 
	 * @return debugging strategy used
	 */
	public String debugCode() {
		String[] strategies = {
				"Added more print statements",
				"Turned it off and on again",
				"Rubber duck debugging",
				"Blamed the compiler",
				"Asked on Stack Overflow"
		};

		return strategies[random.nextInt(strategies.length)];
	}

	/**
	 * Takes a lunch break. Always longer than planned.
	 * 
	 * @param plannedMinutes intended lunch duration
	 * @return actual lunch duration (always longer)
	 */
	public int takeLunchBreak(int plannedMinutes) {
		if (plannedMinutes < 0) {
			throw new IllegalArgumentException("Lunch time cannot be negative");
		}

		// Lunch always takes at least 50% longer, sometimes up to double
		double multiplier = 1.5 + (random.nextDouble() * 0.5);
		return (int) (plannedMinutes * multiplier);
	}

	/**
	 * Provides an excuse for why something isn't working
	 * 
	 * @return a creative excuse
	 */
	public String makeExcuse() {
		return excuses.get(random.nextInt(excuses.size()));
	}

	/**
	 * Checks if the programmer is productive based on various factors
	 * 
	 * @return true if productive, false otherwise
	 */
	public boolean isProductive() {
		if (isMonday)
			return false;
		if (coffeeCount == 0)
			return false;
		if (coffeeCount > 6)
			return false; // Too much coffee causes jitters
		return true;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public int getCoffeeCount() {
		return coffeeCount;
	}

	public void setCoffeeCount(int coffeeCount) {
		if (coffeeCount < 0) {
			throw new IllegalArgumentException("Coffee count cannot be negative");
		}
		this.coffeeCount = coffeeCount;
	}

	public boolean isMonday() {
		return isMonday;
	}

	public void setMonday(boolean monday) {
		isMonday = monday;
	}

	// For testing purposes - allows setting custom random for predictable results
	public void setRandom(Random random) {
		this.random = random;
	}
}