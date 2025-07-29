package p7_oop_teknikker.s1_delegering.v4.cook;

public class Oven {

	public void cook(Recipe recipe) {
		System.out.println("=== OVEN COOKING ===");
		preheat(recipe.getTemperature());
		startCooking(recipe);
		monitor(recipe.getCookingTime());
		finish(recipe.getDishName());
		System.out.println("=== COOKING COMPLETE ===\n");
	}

	private void preheat(int temperature) {
		System.out.println("Oven preheating to " + temperature + "°C...");
		System.out.println("Preheat complete!");
	}

	private void startCooking(Recipe recipe) {
		System.out.println("Cooking " + recipe.getDishName() + " at " + recipe.getTemperature() + "°C");
	}

	private void monitor(int cookingTime) {
		System.out.println("Timer set for " + cookingTime + " minutes");
		System.out.println("Monitoring temperature and timing...");
	}

	private void finish(String dishName) {
		System.out.println("*DING* " + dishName + " is ready!");
	}
}