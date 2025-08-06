package p7_oop_teknikker.avsluttende;

/**
 * A Worker that handles order processing tasks.
 * 
 * @see Boss
 * @see OrderListener
 */
public class Worker {

    // TODO Add necessary private instance fields here

    /**
     * Constructs a Worker with the specified ID.
     * 
     * @param id the unique identifier for this worker, should be positive
     * @throws IllegalArgumentException if id is less than or equal to 0
     */
    public Worker(int id) {
        // TODO Implement the constructor
    }

    /**
     * "Handles" an order by processing the specified item and amount.
     * 
     * Print a message in the format:
     * "Ansatt nr [ID] håndterer bestilling: [amount] stk [item]"
     * 
     * For example:
     * "Ansatt nr 1 håndterer bestilling: 2 stk Fotballdrakt"
     * 
     * The method assumes that the parameters are valid (validation is done
     * by the WebShop before orders reach workers).
     * 
     * @param item   the name of the item being ordered
     * @param amount the quantity being ordered
     */
    public void handleOrder(String item, int amount) {
        // TODO Implement the method handleOrder
    }

}