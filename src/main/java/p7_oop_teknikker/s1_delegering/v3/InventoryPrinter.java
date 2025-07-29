package p7_oop_teknikker.s1_delegering.v3;

import java.util.Map;
import java.util.Map.Entry;

/**
 * InventoryPrinter demonstrates the delegation pattern by handling all
 * inventory display logic. It's the expert on formatting and printing
 * inventory information.
 * 
 * This class focuses solely on presentation concerns, not on business logic
 * or price calculations.
 */
public class InventoryPrinter {
	private Currency displayCurrency;

	/**
	 * Creates an inventory printer that displays prices in the specified currency
	 * 
	 * @param displayCurrency the currency to display prices in
	 */
	public InventoryPrinter(Currency displayCurrency) {
		this.displayCurrency = displayCurrency;
	}

	/**
	 * Prints the shop's inventory with prices in the display currency
	 * DELEGATION: This method handles all display formatting, delegating
	 * price calculations to the provided PriceCalculator
	 * 
	 * @param inventory       the inventory to print
	 * @param priceCalculator the calculator to use for price calculations
	 */
	public void printInventory(Map<Item, Integer> inventory, PriceCalculator priceCalculator) {
		System.out.println("Shop Inventory (prices in " + displayCurrency + "):");
		System.out.println("==========================================");

		for (Entry<Item, Integer> entry : inventory.entrySet()) {
			Item item = entry.getKey();
			int quantity = entry.getValue();
			double totalPrice = priceCalculator.calculatePrice(item, quantity);
			System.out.printf("%s: %d units = %.2f %s%n",
					item.getName(), quantity, totalPrice, displayCurrency);
		}

		System.out.println("==========================================");
		double totalValue = priceCalculator.calculateTotalPrice(inventory);
		System.out.printf("Total inventory value: %.2f %s%n",
				totalValue, displayCurrency);
	}

	/**
	 * Gets the display currency of this printer
	 * 
	 * @return the display currency
	 */
	public Currency getDisplayCurrency() {
		return displayCurrency;
	}
}