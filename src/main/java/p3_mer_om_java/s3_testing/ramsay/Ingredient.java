package p3_mer_om_java.s3_testing.ramsay;

import java.util.Objects;

public class Ingredient {
	private String name;
	private boolean isVegetarian;
	private int calories;

	public Ingredient(String name, boolean isVegetarian, int calories) {
		this.name = name;
		this.isVegetarian = isVegetarian;
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return isVegetarian;
	}

	public int getCalories() {
		return calories;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Ingredient that = (Ingredient) obj;
		return Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return name + " (" + (isVegetarian ? "vegetarian" : "non-vegetarian") + ", " + calories + " calories)";
	}
}
