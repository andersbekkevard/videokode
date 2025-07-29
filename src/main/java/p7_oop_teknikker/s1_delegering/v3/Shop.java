package p7_oop_teknikker.s1_delegering.v3;

import java.util.HashMap;
import java.util.Map;

/**
 * Shop demonstrates the delegation pattern by delegating responsibilities to
 * specialized classes:
 * - PriceCalculator: handles all price calculations and currency conversion
 * - InventoryPrinter: handles all inventory display and formatting
 * 
 * Shop focuses on inventory management and business logic, delegating pricing
 * and display concerns to the appropriate experts.
 */
public class Shop {
	private Map<Item, Integer> inventory = new HashMap<>();
	private PriceCalculator priceCalculator;
	private InventoryPrinter inventoryPrinter;

	/**
	 * Creates a shop that displays prices in the specified currency.
	 * DELEGATION: Creates both PriceCalculator and InventoryPrinter with
	 * the specified display currency.
	 * 
	 * @param displayCurrency the currency to display prices in
	 */
	public Shop(Currency displayCurrency) {
		this.priceCalculator = new PriceCalculator(displayCurrency);
		this.inventoryPrinter = new InventoryPrinter(displayCurrency);
	}

	/**
	 * Adds items to the shop inventory
	 * 
	 * @param item     the item to add
	 * @param quantity the quantity to add
	 */
	public void addItem(Item item, int quantity) {
		inventory.put(item, inventory.getOrDefault(item, 0) + quantity);
	}

	/**
	 * Calculates the total value of the shop's inventory
	 * DELEGATION: Shop doesn't know how to calculate prices - it asks
	 * PriceCalculator
	 * 
	 * @return the total value in the shop's display currency
	 */
	public double getInventoryValue() {
		return priceCalculator.calculateTotalPrice(inventory);
	}

	/**
	 * Calculates the price for a specific item and quantity
	 * DELEGATION: Shop delegates pricing to PriceCalculator
	 * 
	 * @param item     the item to price
	 * @param quantity the quantity
	 * @return the total price
	 */
	public double getItemPrice(Item item, int quantity) {
		return priceCalculator.calculatePrice(item, quantity);
	}

	/**
	 * Gets the display currency of this shop
	 * 
	 * @return the display currency
	 */
	public Currency getDisplayCurrency() {
		return priceCalculator.getTargetCurrency();
	}

	/**
	 * Gets the inventory of this shop
	 * 
	 * @return the inventory map
	 */
	public Map<Item, Integer> getInventory() {
		return new HashMap<>(inventory);
	}

	/**
	 * Prints the shop's inventory with prices in the display currency
	 * DELEGATION: Shop delegates display logic to InventoryPrinter
	 */
	public void printInventory() {
		inventoryPrinter.printInventory(inventory, priceCalculator);
	}

	public static void main(String[] args) {
		// Create a shop that displays prices in USD
		Shop usdShop = new Shop(Currency.USD);

		// Add items with different currencies
		usdShop.addItem(new Item("Apple", 1.0, Currency.USD), 100);
		usdShop.addItem(new Item("Banana", 2.0, Currency.GBP), 200);
		usdShop.addItem(new Item("Cherry", 3.0, Currency.NOK), 300);

		usdShop.printInventory();

		System.out.println("\n" + "=".repeat(50) + "\n");

		// Create a shop that displays prices in NOK
		Shop nokShop = new Shop(Currency.NOK);
		nokShop.addItem(new Item("Apple", 1.0, Currency.USD), 100);
		nokShop.addItem(new Item("Banana", 2.0, Currency.GBP), 200);
		nokShop.addItem(new Item("Cherry", 3.0, Currency.NOK), 300);

		// Same items, different display currency - delegation handles the conversion
		nokShop.printInventory();
	}
}
