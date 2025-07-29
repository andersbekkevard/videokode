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
