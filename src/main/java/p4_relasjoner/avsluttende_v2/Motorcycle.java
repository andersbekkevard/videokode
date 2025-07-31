package p4_relasjoner.avsluttende_v2;

/**
 * Represents a motorcycle, another specific type of Vehicle.
 * This class also extends the Vehicle class.
 *
 * Students are expected to:
 * 1. Reinforce their understanding of inheritance and method overriding.
 * 2. Work with boolean properties in a subclass.
 * 3. See how different classes can extend the same superclass.
 */
public class Motorcycle extends Vehicle {

    // TODO: Define a private instance field for whether the motorcycle has a
    // sidecar (boolean).

    /**
     * Constructs a new Motorcycle with the specified brand, model, and sidecar
     * status.
     *
     * @param brand      The brand of the motorcycle.
     * @param model      The model of the motorcycle.
     * @param hasSidecar True if the motorcycle has a sidecar, false otherwise.
     */
    public Motorcycle(String brand, String model, boolean hasSidecar) {
        super(brand, model);
        // TODO: Implement this constructor.
    }

    /**
     * Returns whether the motorcycle has a sidecar.
     *
     * @return True if it has a sidecar, false otherwise.
     */
    public boolean hasSidecar() {
        // TODO: Implement this method.
        return false;
    }

    /**
     * Overrides the displayInfo method from the Vehicle class to include
     * motorcycle-specific information.
     *
     * @return A string describing the motorcycle, for example:
     *         "Motorcycle: [brand] [model] with a sidecar."
     *         or "Motorcycle: [brand] [model] without a sidecar."
     */
    @Override
    public String displayInfo() {
        // TODO: Implement this method to override the superclass method.
        return null;
    }
}
