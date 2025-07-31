package p7_oop_teknikker.eksempel_unfinished;

/**
 * Main program demonstrating the Observer and Delegation patterns.
 * 
 * This program showcases the complete p7_oop_teknikker exercise system:
 * 
 * OBSERVER PATTERN demonstration:
 * - WebShop acts as the SUBJECT/OBSERVABLE
 * - Boss acts as the OBSERVER/LISTENER
 * - When orders are placed in WebShop, Boss is automatically notified
 * - This creates loose coupling between WebShop and order processing
 * 
 * DELEGATION PATTERN demonstration:
 * - Boss receives order notifications but doesn't process them directly
 * - Instead, Boss DELEGATES the actual work to Worker objects
 * - Work is distributed in round-robin fashion among available workers
 * - This separates management (Boss) from execution (Worker)
 * 
 * COMPOSITION demonstration:
 * - Boss contains and manages multiple Worker objects
 * - WebShop contains multiple OrderListener objects
 * - Objects are composed to create complex behavior from simple parts
 * 
 * Expected output:
 * When orders are placed, each worker should handle them in turn:
 * - Worker 1 handles first order
 * - Worker 2 handles second order  
 * - Worker 3 handles third order
 * - Worker 1 handles fourth order (round-robin continues)
 * 
 * This demonstrates how design patterns can work together to create
 * flexible, maintainable, and extensible systems.
 */
public class MainProgram {
    
    /**
     * Demonstrates the Observer and Delegation patterns working together.
     * 
     * Setup process:
     * 1. Create WebShop (subject)
     * 2. Create Boss (observer)
     * 3. Create Workers and add them to Boss (delegation targets)
     * 4. Register Boss as listener with WebShop (observer registration)
     * 5. Place orders and observe the delegation pattern in action
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        
        // TODO Implement the main method
        
        // Step 1: Create WebShop instance
        // WebShop ws = new WebShop();
        
        // Step 2: Create Boss instance
        // Boss boss = new Boss();
        
        // Step 3: Create Worker instances with different IDs
        // Worker w1 = new Worker(1);
        // Worker w2 = new Worker(2);
        // Worker w3 = new Worker(3);
        
        // Step 4: Add workers to the boss's team
        // boss.addWorker(w1);
        // boss.addWorker(w2);
        // boss.addWorker(w3);
        
        // Step 5: Register boss as listener with webshop
        // ws.addListener(boss);
        
        // Step 6: Place orders and observe round-robin delegation
        // ws.placeOrder("Fotballdrakt", 2);
        // ws.placeOrder("Sko", 2);
        // ws.placeOrder("Genser", 1);
        // ws.placeOrder("Sko", 4);
        
        // Optional: Print summary information
        // System.out.println("WebShop: " + ws);
        // System.out.println("Boss: " + boss);
        // System.out.println("Available items: " + WebShop.getAvailableOrders());
        
    }

    /**
     * Demonstrates error handling in the system.
     * 
     * This method shows how the system handles invalid inputs:
     * - Invalid item names
     * - Invalid quantities
     * - Orders for unavailable items
     * 
     * Uncomment and call this method from main() to see error handling in action.
     */
    public static void demonstrateErrorHandling() {
        // TODO Implement error handling demonstration
        
        // WebShop ws = new WebShop();
        // Boss boss = new Boss();
        // boss.addWorker(new Worker(1));
        // ws.addListener(boss);
        
        // Try to place invalid orders and catch exceptions:
        
        // try {
        //     ws.placeOrder(null, 1); // Should throw IllegalArgumentException
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Caught expected error: " + e.getMessage());
        // }
        
        // try {
        //     ws.placeOrder("Fotballdrakt", 0); // Should throw IllegalArgumentException
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Caught expected error: " + e.getMessage());
        // }
        
        // try {
        //     ws.placeOrder("InvalidItem", 1); // Should throw IllegalArgumentException
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Caught expected error: " + e.getMessage());
        // }
    }

    /**
     * Demonstrates dynamic listener management.
     * 
     * This method shows how observers can be added and removed dynamically:
     * - Multiple bosses can observe the same WebShop
     * - Listeners can be removed when no longer needed
     * - System continues to work as listeners are modified
     * 
     * Uncomment and call this method from main() to see dynamic management in action.
     */
    public static void demonstrateDynamicListeners() {
        // TODO Implement dynamic listener demonstration
        
        // WebShop ws = new WebShop();
        
        // Boss boss1 = new Boss();
        // boss1.addWorker(new Worker(1));
        // boss1.addWorker(new Worker(2));
        
        // Boss boss2 = new Boss();
        // boss2.addWorker(new Worker(3));
        // boss2.addWorker(new Worker(4));
        
        // System.out.println("Adding first boss...");
        // ws.addListener(boss1);
        // ws.placeOrder("Fotballdrakt", 1);
        
        // System.out.println("Adding second boss...");
        // ws.addListener(boss2);
        // ws.placeOrder("Sko", 1);
        
        // System.out.println("Removing first boss...");
        // ws.removeListener(boss1);
        // ws.placeOrder("Genser", 1);
    }
}