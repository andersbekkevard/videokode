package p7_oop_teknikker.s1_delegering.v4.cook;

public class Chef {
	private Oven oven;

	public Chef() {
		this.oven = new Oven();
	}

	public Recipe makePizzaRecipe() {
		System.out.println("Chef is preparing pizza ingredients...");
		System.out.println("Mixing dough, adding toppings...");
		return new Recipe("Pizza", 220, 15);
	}

	public Recipe makeCakeRecipe() {
		System.out.println("Chef is preparing cake batter...");
		System.out.println("Mixing flour, eggs, sugar...");
		return new Recipe("Chocolate Cake", 180, 45);
	}

	public Recipe makeBreadRecipe() {
		System.out.println("Chef is preparing bread dough...");
		System.out.println("Kneading dough, letting it rise...");
		return new Recipe("Fresh Bread", 200, 30);
	}

	public void serveDish(Recipe recipe) {
		System.out.println("Chef has prepared: " + recipe.getDishName());
		System.out.println("Chef delegates cooking to Oven...");
		oven.cook(recipe);
		System.out.println("Chef presents the finished " + recipe.getDishName());
	}
}