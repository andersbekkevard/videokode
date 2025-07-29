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
