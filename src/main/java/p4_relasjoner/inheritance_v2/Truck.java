package p4_relasjoner.inheritance_v2;

/**
 * Represents a truck, which is a specific type of Vehicle.
 * This class extends Vehicle and adds properties specific to trucks.
 */
public class Truck extends Vehicle {

    /**
     * Constructs a new Truck with the given registration number and cargo capacity.
     *
     * @param registrationNumber The registration number of the truck.
     * @param cargoCapacity The cargo capacity in kilograms.
     */
    public Truck(String registrationNumber, double cargoCapacity) {
        // TODO: Implement the constructor.
    }

    /**
     * Returns the cargo capacity of the truck.
     *
     * @return The cargo capacity in kilograms.
     */
    public double getCargoCapacity() {
        // TODO: Implement this method.
        return 0.0;
    }

    @Override
    public String getRegistrationNumber() {
        // TODO: Implement this method.
        return null;
    }

    @Override
    public double calculateCarbonFootprint() {
        // TODO: Implement this method. Assume a truck emits 3000.0 kg CO2 per year.
        return 0.0;
    }

    @Override
    public String toString() {
        // TODO: Implement this method to return a descriptive string for the truck.
        // Example: "Truck{registrationNumber='TR98765', cargoCapacity=5000.0}"
        return "";
    }
}
