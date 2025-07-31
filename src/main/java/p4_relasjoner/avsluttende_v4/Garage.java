package p4_relasjoner.avsluttende_v4;

import java.util.List;

/**
 * Represents a garage that can store different types of vehicles.
 * This class demonstrates polymorphism by managing a collection of Vehicle
 * objects.
 */
public class Garage {

    /**
     * Constructs a new Garage with a given capacity.
     *
     * @param capacity The maximum number of vehicles the garage can hold.
     */
    public Garage(int capacity) {
        // TODO: Implement the constructor.
    }

    /**
     * Adds a vehicle to the garage.
     *
     * @param vehicle The vehicle to add.
     * @return true if the vehicle was added successfully, false if the garage is
     *         full.
     */
    public boolean addVehicle(Vehicle vehicle) {
        // TODO: Implement this method.
        return false;
    }

    /**
     * Removes a vehicle from the garage based on its registration number.
     *
     * @param registrationNumber The registration number of the vehicle to remove.
     * @return The removed vehicle, or null if no vehicle with the given
     *         registration number is found.
     */
    public Vehicle removeVehicle(String registrationNumber) {
        // TODO: Implement this method.
        return null;
    }

    /**
     * Finds a vehicle in the garage by its registration number.
     *
     * @param registrationNumber The registration number to search for.
     * @return The vehicle with the given registration number, or null if not found.
     */
    public Vehicle findVehicle(String registrationNumber) {
        // TODO: Implement this method.
        return null;
    }

    /**
     * Returns a list of all vehicles currently in the garage.
     *
     * @return A list of all vehicles.
     */
    public List<Vehicle> getVehicles() {
        // TODO: Implement this method.
        return null;
    }

    /**
     * Calculates the total carbon footprint of all vehicles in the garage.
     *
     * @return The total carbon footprint.
     */
    public double calculateTotalCarbonFootprint() {
        // TODO: Implement this method.
        return 0.0;
    }

    /**
     * Returns a string representation of the garage, listing all the vehicles it
     * contains.
     *
     * @return A string describing the garage and its contents.
     */
    @Override
    public String toString() {
        // TODO: Implement this method.
        // Example: "Garage{vehicles=[
        // Car{registrationNumber='EL67890', numDoors=4},
        // Motorcycle{registrationNumber='MC54321', engineDisplacement=750}
        // ]}"
        return "";
    }
}
