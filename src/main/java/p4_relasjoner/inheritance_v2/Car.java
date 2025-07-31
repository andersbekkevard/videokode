package p4_relasjoner.inheritance_v2;

/**
 * Represents a car, which is a specific type of Vehicle.
 * This class extends Vehicle and adds properties specific to cars.
 */
public class Car extends Vehicle {

    /**
     * Constructs a new Car with the given registration number and number of doors.
     *
     * @param registrationNumber The registration number of the car.
     * @param numDoors The number of doors the car has.
     */
    public Car(String registrationNumber, int numDoors) {
        // TODO: Implement the constructor.
    }

    /**
     * Returns the number of doors the car has.
     *
     * @return The number of doors.
     */
    public int getNumDoors() {
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
        // TODO: Implement this method. Assume a car emits 1500.0 kg CO2 per year.
        return 0.0;
    }

    @Override
    public String toString() {
        // TODO: Implement this method to return a descriptive string for the car.
        // Example: "Car{registrationNumber='EL67890', numDoors=4}"
        return "";
    }
}
