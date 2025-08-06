package p7_oop_teknikker.avsluttende;

/**
 * A WebShop that sells items and notifies listeners when orders are placed.
 * 
 * @see OrderListener
 * @see Boss
 */
public class WebShop {

    // TODO Add necessary private instance fields here

    /**
     * Adds an OrderListener to be notified of order events.
     * 
     * @param listener the OrderListener to add, must not be null
     * @throws IllegalArgumentException if listener is null
     */
    public void addListener(OrderListener listener) {
        // TODO Implement the method addListener
    }

    /**
     * Removes an OrderListener from the notification list.
     * 
     * @param listener the OrderListener to remove, may be null
     */
    public void removeListener(OrderListener listener) {
        // TODO Implement the method removeListener
    }

    /**
     * Places an order for the specified item and quantity.
     * 
     * Validation rules:
     * - item must not be null or blank
     * - amount must be greater than 0
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

}