package p7_oop_teknikker.eksempel_unfinished;

import java.util.List;

/**
 * A WebShop that sells items and notifies listeners when orders are placed.
 * 
 * The WebShop has a fixed inventory of available items and validates orders
 * before notifying listeners. This ensures that observers only receive
 * notifications for valid orders.
 * 
 * 
 * @see OrderListener
 * @see Boss
 */
public class WebShop {

    // TODO Add necessary private instance fields here
    // Hints: You'll need:
    // - A static final list of available items (use List.of("Fotballdrakt", "Sko",
    // "Genser"))
    // - A list to store OrderListener observers

    /**
     * Adds an OrderListener to be notified of order events.
     * 
     * This method implements the observer registration mechanism. Listeners
     * are only added if they're not already in the list to prevent duplicate
     * notifications.
     * 
     * @param listener the OrderListener to add, must not be null
     * @throws IllegalArgumentException if listener is null
     */
    public void addListener(OrderListener listener) {
        // TODO Implement the method addListener
        // Validate that listener is not null
        // Add listener to the list only if not already present
    }

    /**
     * Removes an OrderListener from the notification list.
     * 
     * This method implements the observer deregistration mechanism. If the
     * listener is not in the list, this method does nothing.
     * 
     * @param listener the OrderListener to remove, may be null
     */
    public void removeListener(OrderListener listener) {
        // TODO Implement the method removeListener
        // Remove the listener from the list (handle null gracefully)
    }

    /**
     * Returns the list of available items in the shop.
     * 
     * @return a list containing the available items
     */
    public static List<String> getAvailableOrders() {
        // TODO Implement the method getAvailableOrders
        // Return the static list of available items
        return null;
    }

    /**
     * Returns the number of registered listeners.
     * 
     * @return the count of registered OrderListener objects
     */
    public int getListenerCount() {
        // TODO Implement the method getListenerCount
        return 0;
    }

    /**
     * Places an order for the specified item and quantity.
     * 
     * This method validates the order parameters and, if valid, notifies all
     * registered observers. This is the core method that triggers the observer
     * pattern notification chain.
     * 
     * Validation rules:
     * - item must not be null or blank
     * - amount must be greater than 0
     * - item must be in the available items list
     * 
     * If validation passes, all registered OrderListener objects will have their
     * orderPlaced method called with the same parameters.
     * 
     * @param item   the name of the item to order, must be valid and available
     * @param amount the quantity to order, must be greater than 0
     * @throws IllegalArgumentException if item is null, blank, not available, or
     *                                  amount <= 0
     */
    public void placeOrder(String item, int amount) {
        // TODO Implement the method placeOrder
    }

    /**
     * Checks if the specified item is available in the shop.
     * 
     * @param item the item name to check
     * @return true if the item is available, false otherwise
     */
    public boolean isItemAvailable(String item) {
        // TODO Implement the method isItemAvailable
        return false;
    }

    /**
     * Removes all listeners from the notification list.
     * 
     * This method can be useful for cleanup or testing purposes.
     */
    public void clearAllListeners() {
        // TODO Implement the method clearAllListeners
    }

    /**
     * Returns a string representation of the WebShop.
     * Format: "WebShop[listeners=COUNT, availableItems=ITEM_COUNT]"
     * 
     * @return a string representation of this WebShop
     */
    @Override
    public String toString() {
        // TODO Implement the toString method
        return null;
    }
}