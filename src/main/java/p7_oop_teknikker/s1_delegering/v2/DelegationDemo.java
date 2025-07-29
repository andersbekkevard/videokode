package p7_oop_teknikker.s1_delegering.v2;

/**
 * DelegationDemo demonstrates the delegation pattern step by step
 * for educational purposes.
 * 
 * Delegation means that an object doesn't do a task itself,
 * but instead asks another object to do it.
 */
public class DelegationDemo {

	public static void main(String[] args) {
		System.out.println("=== DELEGATION PATTERN DEMONSTRATION ===\n");

		// Step 1: Create items with different currencies
		Item apple = new Item("Apple", 1.0, Currency.USD);
		Item banana = new Item("Banana", 2.0, Currency.GBP);
		Item cherry = new Item("Cherry", 3.0, Currency.NOK);

		System.out.println("Items created (simple data carriers):");
		System.out.println("- " + apple);
		System.out.println("- " + banana);
		System.out.println("- " + cherry);
		System.out.println();

		// Step 2: Demonstrate that Currency is just a plain enum
		System.out.println("=== CURRENCY IS JUST AN ENUM ===");
		System.out.println("Currency is a simple enum with no logic:");
		System.out.println("Currency.USD = " + Currency.USD);
		System.out.println("Currency.GBP = " + Currency.GBP);
		System.out.println("Currency.NOK = " + Currency.NOK);
		System.out.println();

		// Step 3: Demonstrate that Item is a dumb data carrier
		System.out.println("=== ITEM IS A DUMB DATA CARRIER ===");
		System.out.println("Item objects just hold data, no logic:");
		System.out.println("Apple name: " + apple.getName());
		System.out.println("Apple price: " + apple.getPrice());
		System.out.println("Apple currency: " + apple.getCurrency());
		System.out.println();

		// Step 4: Demonstrate delegation in PriceCalculator
		System.out.println("=== PRICECALCULATOR IS THE EXPERT ===");
		PriceCalculator usdCalculator = new PriceCalculator(Currency.USD);
		PriceCalculator nokCalculator = new PriceCalculator(Currency.NOK);

		System.out.println("PriceCalculator handles ALL the logic internally:");
		System.out.printf("100 apples in USD: %.2f%n", usdCalculator.calculatePrice(apple, 100));
		System.out.printf("100 apples in NOK: %.2f%n", nokCalculator.calculatePrice(apple, 100));
		System.out.printf("200 bananas in USD: %.2f%n", usdCalculator.calculatePrice(banana, 200));
		System.out.printf("200 bananas in NOK: %.2f%n", nokCalculator.calculatePrice(banana, 200));
		System.out.println();

		// Step 5: Demonstrate delegation in Shop
		System.out.println("=== SHOP DELEGATES TO PRICECALCULATOR ===");
		Shop usdShop = new Shop(Currency.USD);
		usdShop.addItem(apple, 100);
		usdShop.addItem(banana, 200);
		usdShop.addItem(cherry, 300);

		System.out.println("Shop delegates ALL price calculations to PriceCalculator:");
		System.out.printf("Total inventory value: %.2f USD%n", usdShop.getInventoryValue());
		System.out.println();

		// Step 6: Show the delegation chain
		System.out.println("=== DELEGATION CHAIN ===");
		System.out.println("When Shop.getInventoryValue() is called:");
		System.out.println("1. Shop asks PriceCalculator to calculate total price");
		System.out.println("2. PriceCalculator handles all currency conversion internally");
		System.out.println("3. PriceCalculator reads data from Item objects (no delegation)");
		System.out.println("4. PriceCalculator returns the result to Shop");
		System.out.println();
		System.out.println("Each object has a single responsibility:");
		System.out.println("- Shop: Manages inventory and business logic");
		System.out.println("- PriceCalculator: Handles ALL pricing and currency conversion");
		System.out.println("- Item: Simple data carrier (name, price, currency)");
		System.out.println("- Currency: Simple enum (no logic)");
		System.out.println();
		System.out.println("Key point: Shop doesn't know HOW to calculate prices,");
		System.out.println("it just knows WHO to ask (PriceCalculator)!");
	}
}