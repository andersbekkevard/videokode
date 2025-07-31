package p4_relasjoner.inheritance_v2;

/**
 * Represents a generic vehicle. This class serves as the base class for specific
 * types of vehicles.
 *
 * This exercise tests knowledge from p4_relasjoner, specifically s2_arv (inheritance).
 *
 * This class should be abstract, meaning it cannot be instantiated directly.
 * It provides common attributes and methods that all vehicles share.
 */
public abstract class Vehicle {

    /**
     * Returns the registration number of the vehicle.
     *
     * @return The registration number.
     */
    public abstract String getRegistrationNumber();

    /**
     * Calculates the vehicle's carbon footprint.
     * This method should be implemented by each subclass.
     *
     * @return The carbon footprint in kg CO2 per year.
     */
    public abstract double calculateCarbonFootprint();

    /**
     * Returns a string representation of the vehicle.
     *
     * @return A string describing the vehicle.
     */
    @Override
    public String toString() {
        // TODO: Implement this method to return a descriptive string for the vehicle.
        // Example: "Vehicle{registrationNumber='AB12345'}"
        return "";
    }
}
