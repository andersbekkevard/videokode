package p7_oop_teknikker.s1_delegering.v4.cook;

public class Recipe {
	private String dishName;
	private int temperature;
	private int cookingTime;

	public Recipe(String dishName, int temperature, int cookingTime) {
		this.dishName = dishName;
		this.temperature = temperature;
		this.cookingTime = cookingTime;
	}

	public String getDishName() {
		return dishName;
	}

	public int getTemperature() {
		return temperature;
	}

	public int getCookingTime() {
		return cookingTime;
	}

	@Override
	public String toString() {
		return dishName + " (" + temperature + "°C for " + cookingTime + " minutes)";
	}
}