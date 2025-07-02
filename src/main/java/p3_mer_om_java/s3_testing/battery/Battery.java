package p3_mer_om_java.s3_testing.battery;

public class Battery {

	private double maxCapacity; // Maximum charge capacity in mAh
	private double currentCharge; // Current charge level in mAh

	public Battery() {
		this.maxCapacity = 0.0;
		this.currentCharge = 0.0;
	}

	public Battery(double maxCapacity, double currentCharge) {
		if (!this.isValidCapacity(maxCapacity)) {
			throw new IllegalArgumentException("Illegal battery capacity given.");
		}
		this.maxCapacity = maxCapacity;

		if (!this.isValidCharge(currentCharge)) {
			throw new IllegalArgumentException("Illegal charge level given.");
		}
		this.currentCharge = currentCharge;
	}

	private boolean isValidCapacity(double capacity) {
		return capacity >= 0.0;
	}

	public void upgradeBattery(double additionalCapacity) {
		if (this.isValidCapacity(additionalCapacity)) {
			this.maxCapacity += additionalCapacity;
		}
	}

	private boolean isValidCharge(double charge) {
		return charge <= this.maxCapacity && charge >= 0.0;
	}

	private boolean canDrain(double amount) {
		return amount <= this.currentCharge;
	}

	public void drainBattery(double amount) {
		if (!this.isValidCharge(amount) || !this.canDrain(amount)) {
			throw new IllegalArgumentException("Cannot drain that much power from the battery!");
		}

		this.currentCharge -= amount;
	}

	public void chargeBattery(double amount) {
		if (!this.isValidCharge(this.currentCharge + amount)) {
			throw new IllegalArgumentException(
					"Battery overcharged! You just created a fire hazard.");
		}

		this.currentCharge += amount;
	}

	// Getter methods for debugging purposes
	public double getMaxCapacity() {
		return maxCapacity;
	}

	public double getCurrentCharge() {
		return currentCharge;
	}
}