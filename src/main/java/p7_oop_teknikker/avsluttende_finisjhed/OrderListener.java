package p7_oop_teknikker.avsluttende;

/**
 * Interface for listening to order events from a WebShop.
 * 
 * 
 * @see WebShop
 * @see Boss
 */
public interface OrderListener {

    /**
     * Called when an order is placed in the WebShop.
     * 
     * @param item   the name of the item being ordered, guaranteed to be non-null
     *               and non-blank
     * @param amount the quantity being ordered, guaranteed to be greater than 0
     */
    // TODO Implement the method orderPlaced
    public void orderPlaced(String item, int amount);
}