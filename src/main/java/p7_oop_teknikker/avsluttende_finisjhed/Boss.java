package p7_oop_teknikker.avsluttende;

/**
 * A Boss that manages workers and distributes order processing tasks.
 * 
 * The Boss acts as both an observer (of WebShop orders) and a delegator (to
 * Workers).
 * When the Boss receives an order notification, it assigns the order to the
 * next
 * available worker in a round-robin fashion, ensuring work is distributed
 * evenly.
 * 
 * @see OrderListener
 * @see Worker
 * @see WebShop
 */
public class Boss implements OrderListener {

    // TODO Add necessary private instance fields here

    /**
     * Constructs a Boss with no initial workers.
     * The Boss starts with an empty worker list and turn counter at 0.
     */
    public Boss() {
        // TODO Implement the constructor
    }

    /**
     * Adds a worker to the Boss's team.
     * 
     * @param worker the Worker to add to the team, must not be null
     * @throws IllegalArgumentException if worker is null
     */
    public void addWorker(Worker worker) {
        // TODO Implement the method addWorker
    }

    /**
     * Removes a worker from the Boss's team.
     * 
     * If the worker is not in the team, this method does nothing.
     * 
     * @param worker the Worker to remove from the team, may be null
     */
    public void removeWorker(Worker worker) {
        // TODO Implement the method removeWorker
    }

    /**
     * Updates the turn counter to the next worker in round-robin fashion.
     * 
     * This method advances the turn counter and wraps it back to 0 when
     * it reaches the end of the worker list, ensuring even distribution
     * of work among all available workers.
     */
    public void updateTurn() {
        // TODO Implement the method updateTurn
    }

    /**
     * Implementation of OrderListener interface.
     * 
     * This method is called by the WebShop when an order is placed. The Boss
     * delegates the order to the next worker in the round-robin sequence.
     * 
     * @param item   the name of the item being ordered
     * @param amount the quantity being ordered
     */
    @Override
    public void orderPlaced(String item, int amount) {
        // TODO Implement the method orderPlaced
    }

}