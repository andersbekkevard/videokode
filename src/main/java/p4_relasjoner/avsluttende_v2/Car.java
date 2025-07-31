package p4_relasjoner.avsluttende_v2;

/**
 * Represents a car, which is a specific type of Vehicle.
 * This class extends the Vehicle class, inheriting its properties and methods.
 *
 * Students are expected to:
 * 1. Understand how to use the 'extends' keyword to create a subclass.
 * 2. Implement a constructor that calls the superclass constructor using
 * 'super()'.
 * 3. Add a new property specific to this subclass (numberOfDoors).
 * 4. Override a method from the superclass (@Override) to provide a more
 * specific implementation.
 */
public class Car extends Vehicle {

    // TODO: Define a private instance field for the number of doors (int).

    /**
     * Constructs a new Car with the specified brand, model, and number of doors.
     *
     * @param brand         The brand of the car.
     * @param model         The model of the car.
     * @param numberOfDoors The number of doors the car has.
     * @throws IllegalArgumentException if numberOfDoors is not positive.
     */
    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        // TODO: Implement this constructor.
    }

    /**
     * Returns the number of doors the car has.
     *
     * @return The number of doors.
     */
    public int getNumberOfDoors() {
        // TODO: Implement this method.
        return 0;
    }

    /**
     * Overrides the displayInfo method from the Vehicle class to include
     * car-specific information.
     *
     * @return A string in the format: "Car: [brand] [model] with [numberOfDoors]
     *         doors."
     */
    @Override
    public String displayInfo() {
        // TODO: Implement this method to override the superclass method.
        // - It should call the superclass's displayInfo() method or access fields
        // directly.
        return null;
    }
}
