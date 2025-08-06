# Document.java

package p7_oop_teknikker.s1_delegering.actual.write;

public class Document {
	private String title;
	private String content;
	private String format;

	public Document(String title, String content, String format) {
		this.title = title;
		this.content = content;
		this.format = format;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getFormat() {
		return format;
	}

	@Override
	public String toString() {
		return "Document: " + title + " (" + format + ")";
	}
}

# FancyPrinter.java

package p7_oop_teknikker.s1_delegering.actual.write;

import java.util.ArrayList;
import java.util.List;

public class FancyPrinter implements IPrinter {

	private static final int BOX_WIDTH = 60;
	private static final int INNER_WIDTH = BOX_WIDTH - 2;

	@Override
	public void print(Document doc) {
		topBorder();
		centeredLine(doc.getTitle().toUpperCase());
		separator('═');
		keyValueLine("Format", doc.getFormat());
		separator('─');

		keyLine("Content");
		for (String paragraph : doc.getContent().split("\n")) {
			for (String row : wrap(paragraph, INNER_WIDTH - 2)) {
				indentedLine(row);
			}
		}
		separator('─');

		keyValueLine("Printed by", "FancyPrinter 3000");
		bottomBorder();
		System.out.println();
	}

	private void topBorder() {
		border('╔', '═', '╗');
	}

	private void bottomBorder() {
		border('╚', '═', '╝');
	}

	private void separator(char fill) {
		border('╠', fill, '╣');
	}

	private void border(char left, char fill, char right) {
		System.out.print(left);
		System.out.print(String.valueOf(fill).repeat(INNER_WIDTH));
		System.out.println(right);
	}

	private void centeredLine(String text) {
		text = truncate(text, INNER_WIDTH);
		int leftPadding = (INNER_WIDTH - text.length()) / 2;
		printLine(" ".repeat(leftPadding) + text);
	}

	private void keyLine(String key) {
		printLine(key + ":");
	}

	private void keyValueLine(String key, String value) {
		printLine(String.format("%-9s %s", key + ":", value));
	}

	private void indentedLine(String text) {
		printLine("  " + text);
	}

	private void printLine(String body) {
		body = truncate(body, INNER_WIDTH);
		System.out.printf("║%-" + INNER_WIDTH + "s║%n", body);
	}

	private static String truncate(String txt, int max) {
		return txt.length() > max ? txt.substring(0, max - 3) + "..." : txt;
	}

	private static List<String> wrap(String text, int max) {
		List<String> out = new ArrayList<>();
		for (int i = 0; i < text.length(); i += max) {
			out.add(text.substring(i, Math.min(text.length(), i + max)));
		}
		if (out.isEmpty())
			out.add("");
		return out;
	}
}


# IPrinter.java

package p7_oop_teknikker.s1_delegering.actual.write;

public interface IPrinter {
	void print(Document document);
}


# Printer.java

package p7_oop_teknikker.s1_delegering.actual.write;

public class Printer implements IPrinter {

	@Override
	public void print(Document document) {
		System.out.println("\n--- Document ---");
		System.out.println("Title: " + document.getTitle());
		System.out.println("Content: " + document.getContent());
		System.out.println("Format: " + document.getFormat());
		System.out.println("--- End of Document ---\n");
	}
}

# Writer.java

package p7_oop_teknikker.s1_delegering.actual.write;

public class Writer {
	private IPrinter printer;

	public Writer() {
		this.printer = new Printer();
	}

	public Document writeArticle(String title, String content) {
		System.out.println("Writer is creating article: " + title);
		return new Document(title, content, "TEXT");
	}

	public Document writeReport(String title, String content) {
		System.out.println("Writer is creating report: " + title);
		return new Document(title, content, "PDF");
	}

	public Document writeLetter(String title, String content) {
		System.out.println("Writer is creating letter: " + title);
		return new Document(title, content, "WORD");
	}

	public void publishDocument(Document document) {
		System.out.println("Writer wants to publish: " + document.getTitle());
		System.out.println("Writer delegates printing to Printer...");
		printer.print(document);
	}

	// Method to switch printer implementation
	public void setPrinter(IPrinter printer) {
		this.printer = printer;
	}
}

# WriterDemo.java

package p7_oop_teknikker.s1_delegering.actual.write;

public class WriterDemo {

	public static void main(String[] args) {
		System.out.println("STEP 1: Creating documents...");
		System.out.println("========================================\n");

		Writer writer = new Writer();

		System.out.println("Writer creates different types of documents:");
		Document article = writer.writeArticle("Java Basics", "Java is a programming language...");
		Document report = writer.writeReport("Sales Report Q1", "Sales increased by 15% this quarter...");
		Document letter = writer.writeLetter("Thank You", "Thank you for your business...");

		// Bruker først standard printer
		System.out.println("\n" + "=".repeat(60));
		System.out.println("STEP 2: Using Simple Printer (Default)");
		System.out.println("=".repeat(60));

		writer.publishDocument(article);
		writer.publishDocument(report);
		writer.publishDocument(letter);

		// Bytter til fancy printer
		System.out.println("\n" + "=".repeat(60));
		System.out.println("STEP 3: Switching to FancyPrinter");
		System.out.println("=".repeat(60));

		writer.setPrinter(new FancyPrinter());

		writer.publishDocument(article);
		writer.publishDocument(report);
		writer.publishDocument(letter);
	}
}

# DumbPerson.java

package p7_oop_teknikker.s1_delegering.v1;

import java.util.ArrayList;
import java.util.List;

public class DumbPerson {
	private String name;
	private DumbPerson friend1;
	private DumbPerson friend2;
	private DumbPerson friend3;
	private DumbPerson friend4;

	public DumbPerson(String name) {
		this.name = name;
	}

	public void addFriend(DumbPerson friend) {
		if (friend1 == null) {
			friend1 = friend;
		} else if (friend2 == null) {
			friend2 = friend;
		} else if (friend3 == null) {
			friend3 = friend;
		} else if (friend4 == null) {
			friend4 = friend;
		} else {
			throw new IllegalArgumentException("Personen har allerede fire venner");
		}
	}

	public String getName() {
		return name;
	}

	public List<DumbPerson> getFriends() {
		List<DumbPerson> friends = new ArrayList<>();
		if (friend1 != null) {
			friends.add(friend1);
		}
		if (friend2 != null) {
			friends.add(friend2);
		}
		if (friend3 != null) {
			friends.add(friend3);
		}
		if (friend4 != null) {
			friends.add(friend4);
		}
		return friends;
	}

	public static void main(String[] args) {
		DumbPerson Kristian = new DumbPerson("Kristian");
		DumbPerson Anne = new DumbPerson("Anne");

		Kristian.addFriend(Anne);
		Anne.addFriend(Kristian);

		System.out.println(Kristian.getFriends());
		System.out.println(Anne.getFriends());
	}

	@Override
	public String toString() {
		return name;
	}
}

# SmartPerson.java

package p7_oop_teknikker.s1_delegering.v1;

import java.util.ArrayList;
import java.util.List;

public class SmartPerson {
	private String name;
	private List<SmartPerson> friends = new ArrayList<>();

	public SmartPerson(String name) {
		this.name = name;
	}

	public void addFriend(SmartPerson friend) {
		friends.add(friend);
		friend.friends.add(this);
	}

	public String getName() {
		return name;
	}

	public List<SmartPerson> getFriends() {
		return friends;
	}

	public static void main(String[] args) {
		SmartPerson Kristian = new SmartPerson("Kristian");
		SmartPerson Anne = new SmartPerson("Anne");

		Kristian.addFriend(Anne);
		Anne.addFriend(Kristian);

		System.out.println(Kristian.getFriends());
		System.out.println(Anne.getFriends());
	}

	@Override
	public String toString() {
		return name;
	}
}

# Teori.java

package p7_oop_teknikker.s1_delegering.v1;

public class Teori {
	public static void main(String[] args) {
		// Delegering = Teknikk for å løse problemer ved å dele dem inn i mindre deler

		// Med delegering
		System.out.println("\n--------------------------------");
		System.out.println("Med delegering:");
		SmartPerson smarteFredrik = new SmartPerson("Fredrik");
		SmartPerson smarteAnne = new SmartPerson("Anne");

		smarteFredrik.addFriend(smarteAnne);
		smarteAnne.addFriend(smarteFredrik);

		System.out.println("Fredrik's venner: " + smarteFredrik.getFriends());
		System.out.println("Anne's venner: " + smarteAnne.getFriends());

		// Uten delegering
		System.out.println("\n--------------------------------");
		System.out.println("Uten delegering:");
		DumbPerson dummeFredrik = new DumbPerson("Fredrik");
		DumbPerson dummeAnne = new DumbPerson("Anne");

		dummeFredrik.addFriend(dummeAnne);
		dummeAnne.addFriend(dummeFredrik);

		System.out.println("Fredrik's venner: " + dummeFredrik.getFriends());
		System.out.println("Anne's venner: " + dummeAnne.getFriends());

		/*
		 * Legg merke til at fra utsiden er oppførselen identisk; det er bare
		 * innvendig at objektene oppfører seg annerledes.
		 */
	}
}


# Currency.java

package p7_oop_teknikker.s1_delegering.v2;

public enum Currency {
	USD, GBP, NOK
}


# DelegationDemo.java

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

# Item.java

package p7_oop_teknikker.s1_delegering.v2;

public class Item {
	private String name;
	private double price;
	private Currency currency;

	public Item(String name, double price, Currency currency) {
		this.name = name;
		this.price = price;
		this.currency = currency;
	}

	/**
	 * Gets the name of this item
	 * 
	 * @return the item name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the price of this item in its original currency
	 * 
	 * @return the item price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Gets the currency of this item
	 * 
	 * @return the item's currency
	 */
	public Currency getCurrency() {
		return currency;
	}

	@Override
	public String toString() {
		return name + " (" + price + " " + currency + ")";
	}
}


# PriceCalculator.java

package p7_oop_teknikker.s1_delegering.v2;

import java.util.HashMap;
import java.util.Map;

/**
 * PriceCalculator demonstrates the delegation pattern by being the expert
 * that Shop delegates all price calculations to.
 * 
 * The calculator handles all currency conversion and pricing logic internally.
 */
public class PriceCalculator {
	private Currency targetCurrency;
	private Map<Currency, Double> exchangeRates = new HashMap<>();

	/**
	 * Creates a PriceCalculator that calculates prices in the specified currency
	 * 
	 * @param targetCurrency the currency to calculate prices in
	 */
	public PriceCalculator(Currency targetCurrency) {
		this.targetCurrency = targetCurrency;
		initializeExchangeRates();
	}

	/**
	 * Initializes exchange rates for currency conversion
	 */
	private void initializeExchangeRates() {
		// Exchange rates to USD (base currency)
		exchangeRates.put(Currency.USD, 1.0);
		exchangeRates.put(Currency.GBP, 0.79); // 1 GBP = 0.79 USD
		exchangeRates.put(Currency.NOK, 0.095); // 1 NOK = 0.095 USD
	}

	/**
	 * Calculates the total price for a given quantity of an item
	 * Handles all currency conversion internally
	 * 
	 * @param item     the item to calculate price for
	 * @param quantity the quantity of the item
	 * @return the total price in the target currency
	 */
	public double calculatePrice(Item item, int quantity) {
		// Get the item's price and currency
		double itemPrice = item.getPrice();
		Currency itemCurrency = item.getCurrency();

		// Convert to target currency
		double convertedPrice = convertCurrency(itemPrice, itemCurrency, targetCurrency);

		// Calculate total
		return convertedPrice * quantity;
	}

	/**
	 * Calculates the total price for multiple items
	 * 
	 * @param items the items and their quantities
	 * @return the total price in the target currency
	 */
	public double calculateTotalPrice(Map<Item, Integer> items) {
		double total = 0.0;
		for (Map.Entry<Item, Integer> entry : items.entrySet()) {
			total += calculatePrice(entry.getKey(), entry.getValue());
		}
		return total;
	}

	/**
	 * Converts an amount from one currency to another
	 * 
	 * @param amount       the amount to convert
	 * @param fromCurrency the source currency
	 * @param toCurrency   the target currency
	 * @return the converted amount
	 */
	private double convertCurrency(double amount, Currency fromCurrency, Currency toCurrency) {
		if (fromCurrency == toCurrency) {
			return amount;
		}

		// Convert to USD first, then to target currency
		double amountInUSD = amount / exchangeRates.get(fromCurrency);
		return amountInUSD * exchangeRates.get(toCurrency);
	}

	/**
	 * Gets the target currency of this calculator
	 * 
	 * @return the target currency
	 */
	public Currency getTargetCurrency() {
		return targetCurrency;
	}
}


# Shop.java

package p7_oop_teknikker.s1_delegering.v2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Shop demonstrates the delegation pattern by delegating all price calculations
 * to PriceCalculator, which is the expert on pricing and currency conversion.
 * 
 * Shop focuses on inventory management and business logic, not on pricing
 * details.
 */
public class Shop {
	private Map<Item, Integer> inventory = new HashMap<>();
	private PriceCalculator priceCalculator;

	/**
	 * Creates a shop that displays prices in the specified currency
	 * 
	 * @param displayCurrency the currency to display prices in
	 */
	public Shop(Currency displayCurrency) {
		this.priceCalculator = new PriceCalculator(displayCurrency);
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
	 * Prints the shop's inventory with prices in the display currency
	 */
	public void printInventory() {
		System.out.println("Shop Inventory (prices in " + getDisplayCurrency() + "):");
		System.out.println("==========================================");
		for (Entry<Item, Integer> entry : inventory.entrySet()) {
			Item item = entry.getKey();
			int quantity = entry.getValue();
			double totalPrice = getItemPrice(item, quantity);
			System.out.printf("%s: %d units = %.2f %s%n",
					item.getName(), quantity, totalPrice, getDisplayCurrency());
		}
		System.out.println("==========================================");
		System.out.printf("Total inventory value: %.2f %s%n",
				getInventoryValue(), getDisplayCurrency());
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


# Currency.java

package p7_oop_teknikker.s1_delegering.v3;

public enum Currency {
	USD, GBP, NOK
}


# DelegationDemo.java

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

# InventoryPrinter.java

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

# Item.java

package p7_oop_teknikker.s1_delegering.v3;

public class Item {
	private String name;
	private double price;
	private Currency currency;

	public Item(String name, double price, Currency currency) {
		this.name = name;
		this.price = price;
		this.currency = currency;
	}

	/**
	 * Gets the name of this item
	 * 
	 * @return the item name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the price of this item in its original currency
	 * 
	 * @return the item price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Gets the currency of this item
	 * 
	 * @return the item's currency
	 */
	public Currency getCurrency() {
		return currency;
	}

	@Override
	public String toString() {
		return name + " (" + price + " " + currency + ")";
	}
}


# PriceCalculator.java

package p7_oop_teknikker.s1_delegering.v3;

import java.util.HashMap;
import java.util.Map;

/**
 * PriceCalculator demonstrates the delegation pattern by being the expert
 * that Shop delegates all price calculations to.
 * 
 * The calculator handles all currency conversion and pricing logic internally.
 */
public class PriceCalculator {
	private Currency targetCurrency;
	private Map<Currency, Double> exchangeRates = new HashMap<>();

	/**
	 * Creates a PriceCalculator that calculates prices in the specified currency
	 * 
	 * @param targetCurrency the currency to calculate prices in
	 */
	public PriceCalculator(Currency targetCurrency) {
		this.targetCurrency = targetCurrency;
		initializeExchangeRates();
	}

	/**
	 * Initializes exchange rates for currency conversion
	 */
	private void initializeExchangeRates() {
		// Exchange rates to USD (base currency)
		exchangeRates.put(Currency.USD, 1.0);
		exchangeRates.put(Currency.GBP, 0.79); // 1 GBP = 0.79 USD
		exchangeRates.put(Currency.NOK, 0.095); // 1 NOK = 0.095 USD
	}

	/**
	 * Calculates the total price for a given quantity of an item
	 * Handles all currency conversion internally
	 * 
	 * @param item     the item to calculate price for
	 * @param quantity the quantity of the item
	 * @return the total price in the target currency
	 */
	public double calculatePrice(Item item, int quantity) {
		// Get the item's price and currency
		double itemPrice = item.getPrice();
		Currency itemCurrency = item.getCurrency();

		// Convert to target currency
		double convertedPrice = convertCurrency(itemPrice, itemCurrency, targetCurrency);

		// Calculate total
		return convertedPrice * quantity;
	}

	/**
	 * Calculates the total price for multiple items
	 * 
	 * @param items the items and their quantities
	 * @return the total price in the target currency
	 */
	public double calculateTotalPrice(Map<Item, Integer> items) {
		double total = 0.0;
		for (Map.Entry<Item, Integer> entry : items.entrySet()) {
			total += calculatePrice(entry.getKey(), entry.getValue());
		}
		return total;
	}

	/**
	 * Converts an amount from one currency to another
	 * 
	 * @param amount       the amount to convert
	 * @param fromCurrency the source currency
	 * @param toCurrency   the target currency
	 * @return the converted amount
	 */
	private double convertCurrency(double amount, Currency fromCurrency, Currency toCurrency) {
		if (fromCurrency == toCurrency) {
			return amount;
		}

		// Convert to USD first, then to target currency
		double amountInUSD = amount / exchangeRates.get(fromCurrency);
		return amountInUSD * exchangeRates.get(toCurrency);
	}

	/**
	 * Gets the target currency of this calculator
	 * 
	 * @return the target currency
	 */
	public Currency getTargetCurrency() {
		return targetCurrency;
	}
}


# Shop.java

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


# Chef.java

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

# ChefDemo.java

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

# Oven.java

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

# Recipe.java

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

