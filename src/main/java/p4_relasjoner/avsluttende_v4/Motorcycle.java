package p4_relasjoner.avsluttende_v4;

/**
 * Represents a motorcycle, which is a specific type of Vehicle.
 * This class extends Vehicle and adds properties specific to motorcycles.
 */
public class Motorcycle extends Vehicle {

    /**
     * Constructs a new Motorcycle with the given registration number and engine
     * displacement.
     *
     * @param registrationNumber The registration number of the motorcycle.
     * @param engineDisplacement The engine displacement in cubic centimeters (cc).
     */
    public Motorcycle(String registrationNumber, int engineDisplacement) {
        // TODO: Implement the constructor.
    }

    /**
     * Returns the engine displacement of the motorcycle.
     *
     * @return The engine displacement in cc.
     */
    public int getEngineDisplacement() {
        // TODO: Implement this method.
        return 0;
    }

    @Override
    public String getRegistrationNumber() {
        // TODO: Implement this method.
        return null;
    }

    @Override
    public double calculateCarbonFootprint() {
        // TODO: Implement this method. Assume a motorcycle emits 800.0 kg CO2 per year.
        return 0.0;
    }

    @Override
    public String toString() {
        // TODO: Implement this method to return a descriptive string for the
        // motorcycle.
        // Example: "Motorcycle{registrationNumber='MC54321', engineDisplacement=750}"
        return "";
    }
}
