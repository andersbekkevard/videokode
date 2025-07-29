package p7_oop_teknikker.s1_delegering.v3;

/**
 * Demonstrates the delegation pattern with the new InventoryPrinter.
 * Shows how different components handle their specific responsibilities.
 */
public class DelegationDemo {

	public static void main(String[] args) {
		System.out.println("=== Delegation Pattern Demo ===\n");

		// Create components with different display currencies
		PriceCalculator usdCalculator = new PriceCalculator(Currency.USD);
		PriceCalculator nokCalculator = new PriceCalculator(Currency.NOK);
		InventoryPrinter usdPrinter = new InventoryPrinter(Currency.USD);
		InventoryPrinter nokPrinter = new InventoryPrinter(Currency.NOK);

		// Create some test items
		Item apple = new Item("Apple", 1.0, Currency.USD);
		Item banana = new Item("Banana", 2.0, Currency.GBP);

		// Demonstrate delegation: Shop delegates to specialized components
		System.out.println("1. Shop with USD display (delegates to USD components):");
		Shop usdShop = new Shop(Currency.USD);
		usdShop.addItem(apple, 10);
		usdShop.addItem(banana, 5);
		usdShop.printInventory();

		System.out.println("\n2. Shop with NOK display (delegates to NOK components):");
		Shop nokShop = new Shop(Currency.NOK);
		nokShop.addItem(apple, 10);
		nokShop.addItem(banana, 5);
		nokShop.printInventory();

		System.out.println("\n3. Direct use of InventoryPrinter (shows delegation in action):");
		System.out.println("Using USD printer with NOK calculator:");
		usdPrinter.printInventory(nokShop.getInventory(), nokCalculator);

		System.out.println("\n=== Delegation Benefits ===");
		System.out.println("- Shop focuses on inventory management");
		System.out.println("- PriceCalculator handles all pricing logic");
		System.out.println("- InventoryPrinter handles all display formatting");
		System.out.println("- Each class has a single responsibility");
	}
}