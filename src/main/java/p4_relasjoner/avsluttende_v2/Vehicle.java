package p4_relasjoner.avsluttende_v2;

/**
 * Represents a generic vehicle. This class serves as the superclass
 * for more specific types of vehicles like Car and Motorcycle.
 *
 * The purpose of this class is to define common properties and behaviors
 * that all vehicles share, such as having a brand and a model.
 *
 * Students are expected to:
 * 1. Understand the role of a superclass in an inheritance hierarchy.
 * 2. Implement the constructor to initialize the instance fields.
 * 3. Implement the getter methods to provide access to the private fields.
 * 4. Implement the displayInfo method to return a basic description of the
 * vehicle.
 */
public class Vehicle {

    protected String brand;
    protected String model;

    /**
     * Constructs a new Vehicle with the specified brand and model.
     *
     * @param brand The brand of the vehicle (e.g., "Toyota").
     * @param model The model of the vehicle (e.g., "Corolla").
     * @throws IllegalArgumentException if brand or model is null or empty.
     */
    public Vehicle(String brand, String model) {
        // TODO: Implement this constructor.
        // - Validate that brand and model are not null or blank.
        // - Initialize the instance fields.
    }

    /**
     * Returns the brand of the vehicle.
     *
     * @return The brand of the vehicle.
     */
    public String getBrand() {
        // TODO: Implement this method.
        return null;
    }

    /**
     * Returns the model of the vehicle.
     *
     * @return The model of the vehicle.
     */
    public String getModel() {
        // TODO: Implement this method.
        return null;
    }

    /**
     * Returns a string with information about the vehicle.
     * This method is intended to be overridden by subclasses.
     *
     * @return A string in the format: "Vehicle: [brand] [model]".
     */
    public String displayInfo() {
        // TODO: Implement this method.
        return null;
    }
}
