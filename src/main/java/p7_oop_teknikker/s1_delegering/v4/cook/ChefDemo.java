package p7_oop_teknikker.s1_delegering.v4.cook;

public class ChefDemo {

	public static void main(String[] args) {
		System.out.println("=== DELEGATION PATTERN: CHEF/OVEN ===\n");

		Chef chef = new Chef();

		System.out.println("1. Chef prepares different dishes:");
		Recipe pizza = chef.makePizzaRecipe();
		Recipe cake = chef.makeCakeRecipe();
		Recipe bread = chef.makeBreadRecipe();

		System.out.println("\n2. Chef focuses on preparation, delegates cooking:");
		System.out.println("Notice: Chef doesn't control temperature or timing - that's Oven's job!\n");

		chef.serveDish(pizza);
		chef.serveDish(cake);
		chef.serveDish(bread);

		System.out.println("=== DELEGATION EXPLAINED ===");
		System.out.println("- Chef: Focuses on food preparation and presentation");
		System.out.println("- Oven: Handles all cooking logic, temperature, and timing");
		System.out.println("- Recipe: Simple data carrier with cooking instructions");
		System.out.println("\nKey point: Chef delegates cooking to Oven!");
		System.out.println("Chef doesn't need to know cooking details - just WHO to ask!");
	}
}