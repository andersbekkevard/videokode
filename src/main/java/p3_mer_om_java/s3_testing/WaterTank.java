package p3_mer_om_java.s3_testing;

/**
 * A simple water tank with capacity management
 * Perfect for demonstrating debugger features:
 * - Set breakpoints on methods
 * - Watch variables change
 * - Step through code execution
 * - Observe state changes
 */
public class WaterTank {
	private double capacity;
	private double currentVolume;

	public WaterTank(double capacity) {
		if (capacity <= 0) {
			throw new IllegalArgumentException("Capacity must be positive");
		}
		this.capacity = capacity;
		this.currentVolume = 0;
		System.out.println("Created tank with capacity: " + capacity + "L");
	}

	/**
	 * Add water to the tank
	 * Set breakpoint here to watch volume changes
	 */
	public boolean addWater(double amount) {
		if (amount <= 0) {
			System.out.println("Cannot add negative or zero water");
			return false;
		}

		double newVolume = currentVolume + amount;

		// Good place for a breakpoint to examine state
		if (newVolume > capacity) {
			double overflow = newVolume - capacity;
			currentVolume = capacity;
			System.out.println("Tank overflow! Added " + (amount - overflow) + "L, " + overflow + "L spilled");
			return false;
		}

		currentVolume = newVolume;
		System.out.println("Added " + amount + "L. Current: " + currentVolume + "L");
		return true;
	}

	/**
	 * Remove water from the tank
	 * Set breakpoint here to watch volume changes
	 */
	public boolean removeWater(double amount) {
		if (amount <= 0) {
			System.out.println("Cannot remove negative or zero water");
			return false;
		}

		// Good place for a breakpoint to examine state
		if (amount > currentVolume) {
			System.out.println("Cannot remove " + amount + "L - only " + currentVolume + "L available");
			return false;
		}

		currentVolume -= amount;
		System.out.println("Removed " + amount + "L. Current: " + currentVolume + "L");
		return true;
	}

	/**
	 * Check if tank is full (useful for conditional breakpoints)
	 */
	public boolean isFull() {
		return currentVolume >= capacity;
	}

	/**
	 * Check if tank is empty (useful for conditional breakpoints)
	 */
	public boolean isEmpty() {
		return currentVolume <= 0;
	}

	/**
	 * Get current fill percentage
	 */
	public double getFillPercentage() {
		return (currentVolume / capacity) * 100;
	}

	// Getters for debugging
	public double getCurrentVolume() {
		return currentVolume;
	}

	public double getCapacity() {
		return capacity;
	}

	/**
	 * Debugging demonstration main method
	 * Perfect for practicing debugger features
	 */
	public static void main(String[] args) {
		// Create a water tank with 100L capacity
		WaterTank tank = new WaterTank(100);

		System.out.println("=== Water Tank Debugging Demo ===");

		// Try adding water - set breakpoint here to watch state changes
		tank.addWater(30);
		tank.addWater(25);

		// Try removing water
		tank.removeWater(15);

		// Try edge cases - good places for breakpoints
		tank.addWater(80); // Should cause overflow
		tank.removeWater(200); // Should prevent underflow

		// Final state
		System.out.println("Final tank state: " + tank.getCurrentVolume() + "L / " + tank.getCapacity() + "L");
	}
}
