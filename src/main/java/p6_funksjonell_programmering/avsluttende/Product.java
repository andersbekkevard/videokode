package p6_funksjonell_programmering.avsluttende;

/**
 * A helper class representing a product for use in functional programming exercises.
 * 
 * This class provides a concrete type to work with in the DataProcessor exercises,
 * demonstrating how functional programming concepts work with custom objects.
 * 
 * The Product class includes various properties that can be used for filtering,
 * mapping, sorting, and grouping operations.
 */
public class Product {

    // TODO Add any necessary private instance fields here
    // Hint: A product typically has name, price, category, rating, and inStock status

    /**
     * Constructs a Product with the specified properties.
     *
     * @param name the name of the product, must not be null or blank
     * @param price the price of the product, must be non-negative
     * @param category the category of the product, must not be null or blank
     * @param rating the rating of the product (1-5), must be between 1 and 5 inclusive
     * @param inStock whether the product is in stock
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Product(String name, double price, String category, int rating, boolean inStock) {
        // TODO Implement the constructor with validation
    }

    /**
     * Returns the name of the product.
     *
     * @return the product name
     */
    public String getName() {
        // TODO Implement the method getName
        return null;
    }

    /**
     * Returns the price of the product.
     *
     * @return the product price
     */
    public double getPrice() {
        // TODO Implement the method getPrice
        return 0.0;
    }

    /**
     * Returns the category of the product.
     *
     * @return the product category
     */
    public String getCategory() {
        // TODO Implement the method getCategory
        return null;
    }

    /**
     * Returns the rating of the product.
     *
     * @return the product rating (1-5)
     */
    public int getRating() {
        // TODO Implement the method getRating
        return 0;
    }

    /**
     * Returns whether the product is in stock.
     *
     * @return true if in stock, false otherwise
     */
    public boolean isInStock() {
        // TODO Implement the method isInStock
        return false;
    }

    /**
     * Sets the price of the product.
     *
     * @param newPrice the new price, must be non-negative
     * @throws IllegalArgumentException if newPrice is negative
     */
    public void setPrice(double newPrice) {
        // TODO Implement the method setPrice
    }

    /**
     * Sets the stock status of the product.
     *
     * @param inStock the new stock status
     */
    public void setInStock(boolean inStock) {
        // TODO Implement the method setInStock
    }

    /**
     * Checks if the product is expensive (price > 100.0).
     * This method can be used with method references in functional operations.
     *
     * @return true if the product is expensive, false otherwise
     */
    public boolean isExpensive() {
        // TODO Implement the method isExpensive
        return false;
    }

    /**
     * Checks if the product is highly rated (rating >= 4).
     * This method can be used with method references in functional operations.
     *
     * @return true if the product is highly rated, false otherwise
     */
    public boolean isHighlyRated() {
        // TODO Implement the method isHighlyRated
        return false;
    }

    /**
     * Returns a discounted price (90% of original price).
     * This method can be used in mapping operations.
     *
     * @return the discounted price
     */
    public double getDiscountedPrice() {
        // TODO Implement the method getDiscountedPrice
        return 0.0;
    }

    /**
     * Returns the first letter of the product name in uppercase.
     * This method can be used for grouping operations.
     *
     * @return the first letter of the name in uppercase
     */
    public String getFirstLetter() {
        // TODO Implement the method getFirstLetter
        return null;
    }

    /**
     * Static method that creates a predicate for filtering by category.
     * This demonstrates creating predicates with static methods.
     *
     * @param category the category to filter by
     * @return a predicate that tests if a product belongs to the category
     * @throws IllegalArgumentException if category is null
     */
    public static java.util.function.Predicate<Product> inCategory(String category) {
        // TODO Implement the static method inCategory returning a lambda
        return null;
    }

    /**
     * Static method that creates a predicate for filtering by minimum price.
     * This demonstrates creating predicates with static methods.
     *
     * @param minPrice the minimum price threshold
     * @return a predicate that tests if a product costs at least minPrice
     * @throws IllegalArgumentException if minPrice is negative
     */
    public static java.util.function.Predicate<Product> costsAtLeast(double minPrice) {
        // TODO Implement the static method costsAtLeast returning a lambda
        return null;
    }

    /**
     * Static method that creates a function for applying discounts.
     * This demonstrates creating functions with static methods.
     *
     * @param discountPercent the discount percentage (0-100)
     * @return a function that applies the discount to a product's price
     * @throws IllegalArgumentException if discountPercent is not between 0 and 100
     */
    public static java.util.function.Function<Product, Double> applyDiscount(double discountPercent) {
        // TODO Implement the static method applyDiscount returning a lambda
        return null;
    }

    /**
     * Returns true if this product equals another object.
     * Two products are equal if they have the same name and category.
     *
     * @param other the object to compare with
     * @return true if the products are equal, false otherwise
     */
    @Override
    public boolean equals(Object other) {
        // TODO Implement the equals method
        return false;
    }

    /**
     * Returns a hash code for this product.
     * The hash code should be consistent with equals().
     *
     * @return a hash code for this product
     */
    @Override
    public int hashCode() {
        // TODO Implement the hashCode method
        return 0;
    }

    /**
     * Returns a string representation of the product.
     * Format: "Product[name=NAME, price=PRICE, category=CATEGORY, rating=RATING, inStock=STOCK]"
     *
     * @return a string representation of this product
     */
    @Override
    public String toString() {
        // TODO Implement the toString method
        return null;
    }
}