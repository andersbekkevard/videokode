package p7_oop_teknikker.eksempel_unfinished;

/**
 * A Worker that handles order processing tasks.
 * 
 * This class demonstrates key OOP concepts from p7_oop_teknikker:
 * - DELEGATION: Workers are delegated tasks by the Boss
 * - ENCAPSULATION: Worker has private state (id) and public behavior
 * - SINGLE RESPONSIBILITY: Worker's only job is to handle assigned orders
 * 
 * Workers are the actual processors in the system. They don't observe orders
 * directly but receive them through delegation from a Boss. Each worker has
 * a unique ID for identification and tracking purposes.
 * 
 * The Worker class is designed to be simple and focused - it receives an order
 * and processes it (in this case, by printing a message). In a real system,
 * this might involve updating databases, calling APIs, or other business logic.
 * 
 * @see Boss
 * @see OrderListener
 */
public class Worker {

    // TODO Add necessary private instance fields here
    // Hint: You need an integer ID to identify this worker

    /**
     * Constructs a Worker with the specified ID.
     * 
     * The ID is used to identify this worker when handling orders and for
     * debugging/logging purposes. Each worker should have a unique ID.
     * 
     * @param id the unique identifier for this worker, should be positive
     * @throws IllegalArgumentException if id is less than or equal to 0
     */
    public Worker(int id) {
        // TODO Implement the constructor
        // Validate that id is positive
        // Store the id in the instance field
    }

    /**
     * Returns the ID of this worker.
     * 
     * @return the worker's unique ID
     */
    public int getId() {
        // TODO Implement the method getId
        return 0;
    }

    /**
     * Handles an order by processing the specified item and amount.
     * 
     * This method represents the core work that a Worker performs. In this
     * implementation, it simply prints a message indicating which worker
     * is handling which order. In a real system, this might involve:
     * - Updating inventory systems
     * - Generating shipping labels
     * - Coordinating with suppliers
     * - Logging the transaction
     * 
     * The method assumes that the parameters are valid (validation is done
     * by the WebShop before orders reach workers).
     * 
     * @param item the name of the item being ordered
     * @param amount the quantity being ordered
     */
    public void handleOrder(String item, int amount) {
        // TODO Implement the method handleOrder
        // Print a message in the format: "Ansatt nr [ID] håndterer bestilling: [amount] stk [item]"
        // For example: "Ansatt nr 1 håndterer bestilling: 2 stk Fotballdrakt"
    }

    /**
     * Checks if this worker equals another object.
     * Two workers are equal if they have the same ID.
     * 
     * @param obj the object to compare with
     * @return true if the workers have the same ID, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        // TODO Implement the equals method
        // Check if obj is this worker (reference equality)
        // Check if obj is null or not a Worker
        // Compare worker IDs
        return false;
    }

    /**
     * Returns a hash code for this worker based on its ID.
     * 
     * @return the hash code
     */
    @Override
    public int hashCode() {
        // TODO Implement the hashCode method
        // Return a hash code based on the worker ID
        return 0;
    }

    /**
     * Returns a string representation of this worker.
     * Format: "Worker[id=ID]"
     * 
     * @return a string representation of this worker
     */
    @Override
    public String toString() {
        // TODO Implement the toString method
        return null;
    }
}