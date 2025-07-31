package p7_oop_teknikker.eksempel_unfinished;

/**
 * Interface for listening to order events from a WebShop.
 * 
 * This interface demonstrates the OBSERVER PATTERN from p7_oop_teknikker:
 * - Defines the contract for observers that want to be notified of order events
 * - Allows loose coupling between the WebShop (subject) and its observers
 * - Enables multiple observers to respond to the same event
 * 
 * Classes implementing this interface can register with a WebShop to receive
 * notifications when orders are placed. This allows for flexible event handling
 * where different observers can respond to orders in different ways.
 * 
 * Example usage:
 * - A Boss class might implement this to distribute orders to workers
 * - An InventoryManager might implement this to update stock levels
 * - A Logger might implement this to record order history
 * 
 * @see WebShop
 * @see Boss
 */
public interface OrderListener {
    
    /**
     * Called when an order is placed in the WebShop.
     * 
     * This method is invoked by the WebShop (subject) to notify all registered
     * observers about a new order. Implementing classes should define how they
     * respond to this event.
     * 
     * @param item the name of the item being ordered, guaranteed to be non-null and non-blank
     * @param amount the quantity being ordered, guaranteed to be greater than 0
     */
    // TODO Implement the method orderPlaced
    public void orderPlaced(String item, int amount);
}