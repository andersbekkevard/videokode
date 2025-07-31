package p7_oop_teknikker.eksempel_unfinished;

import java.util.List;

/**
 * A Boss that manages workers and distributes order processing tasks.
 * 
 * This class demonstrates multiple OOP techniques from p7_oop_teknikker:
 * - OBSERVER PATTERN: Implements OrderListener to observe WebShop events
 * - DELEGATION PATTERN: Delegates order processing tasks to Worker objects
 * - COMPOSITION: Contains and manages a collection of Worker objects
 * - ROUND-ROBIN DISTRIBUTION: Distributes work evenly among available workers
 * 
 * The Boss acts as both an observer (of WebShop orders) and a delegator (to Workers).
 * When the Boss receives an order notification, it assigns the order to the next
 * available worker in a round-robin fashion, ensuring work is distributed evenly.
 * 
 * Key responsibilities:
 * - Register/unregister workers
 * - Receive order notifications from WebShop
 * - Distribute orders fairly among workers
 * - Track which worker should handle the next order
 * 
 * This design demonstrates how the observer pattern can be combined with other
 * patterns to create flexible, maintainable systems.
 * 
 * @see OrderListener
 * @see Worker
 * @see WebShop
 */
public class Boss implements OrderListener {
    
    // TODO Add necessary private instance fields here
    // Hints: You'll need:
    // - A list to store Worker objects
    // - An integer to track the current turn (for round-robin distribution)

    /**
     * Constructs a Boss with no initial workers.
     * 
     * The Boss starts with an empty worker list and turn counter at 0.
     * Workers must be added using addWorker() before the Boss can delegate orders.
     */
    public Boss() {
        // TODO Implement the constructor
        // Initialize the worker list
        // Initialize turn counter to 0
    }

    /**
     * Adds a worker to the Boss's team.
     * 
     * Workers are added to the delegation pool and will receive orders in
     * round-robin fashion. If the worker is already in the team, it won't
     * be added again to prevent duplicate assignments.
     * 
     * @param worker the Worker to add to the team, must not be null
     * @throws IllegalArgumentException if worker is null
     */
    public void addWorker(Worker worker) {
        // TODO Implement the method addWorker
        // Validate that worker is not null
        // Add worker to the list only if not already present
    }

    /**
     * Removes a worker from the Boss's team.
     * 
     * If the worker is not in the team, this method does nothing.
     * After removing a worker, the turn counter is adjusted if necessary
     * to maintain valid round-robin distribution.
     * 
     * @param worker the Worker to remove from the team, may be null
     */
    public void removeWorker(Worker worker) {
        // TODO Implement the method removeWorker
        // Remove the worker from the list
        // Adjust turn counter if it's now out of bounds
    }

    /**
     * Returns the list of workers managed by this Boss.
     * 
     * @return a defensive copy of the worker list to prevent external modification
     */
    public List<Worker> getWorkers() {
        // TODO Implement the method getWorkers
        // Return a defensive copy of the workers list
        return null;
    }

    /**
     * Returns the number of workers in the team.
     * 
     * @return the count of managed workers
     */
    public int getWorkerCount() {
        // TODO Implement the method getWorkerCount
        return 0;
    }

    /**
     * Returns the current turn index for round-robin distribution.
     * 
     * @return the index of the worker who will handle the next order
     */
    public int getCurrentTurn() {
        // TODO Implement the method getCurrentTurn
        return 0;
    }

    /**
     * Updates the turn counter to the next worker in round-robin fashion.
     * 
     * This method advances the turn counter and wraps it back to 0 when
     * it reaches the end of the worker list, ensuring even distribution
     * of work among all available workers.
     * 
     * This method should be called after each order delegation to maintain
     * the round-robin pattern.
     */
    public void updateTurn() {
        // TODO Implement the method updateTurn
        // Increment turn counter
        // If turn equals worker count, reset to 0
    }

    /**
     * Checks if the Boss has any workers available to handle orders.
     * 
     * @return true if there are workers available, false if the team is empty
     */
    public boolean hasAvailableWorkers() {
        // TODO Implement the method hasAvailableWorkers
        return false;
    }

    /**
     * Implementation of OrderListener interface.
     * 
     * This method is called by the WebShop when an order is placed. The Boss
     * delegates the order to the next worker in the round-robin sequence.
     * 
     * The delegation process:
     * 1. Get the current worker based on turn counter
     * 2. Delegate the order to that worker
     * 3. Update turn counter for next order
     * 
     * @param item the name of the item being ordered
     * @param amount the quantity being ordered
     * @throws IllegalStateException if no workers are available to handle the order
     */
    @Override
    public void orderPlaced(String item, int amount) {
        // TODO Implement the method orderPlaced
        // Check if there are workers available
        // Get the worker at current turn index
        // Delegate order to that worker
        // Update turn for next order
    }

    /**
     * Assigns an order to a specific worker (overrides round-robin).
     * 
     * This method allows manual assignment of orders to specific workers,
     * bypassing the normal round-robin distribution. Useful for testing
     * or special circumstances.
     * 
     * @param worker the specific Worker to handle the order
     * @param item the name of the item being ordered
     * @param amount the quantity being ordered
     * @throws IllegalArgumentException if worker is not in the team
     */
    public void assignOrderToWorker(Worker worker, String item, int amount) {
        // TODO Implement the method assignOrderToWorker
        // Check if worker is in the team
        // Delegate order to the specified worker
    }

    /**
     * Returns a string representation of the Boss.
     * Format: "Boss[workers=COUNT, currentTurn=TURN]"
     * 
     * @return a string representation of this Boss
     */
    @Override
    public String toString() {
        // TODO Implement the toString method
        return null;
    }
}