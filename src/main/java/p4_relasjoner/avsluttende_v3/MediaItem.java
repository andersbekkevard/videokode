package p4_relasjoner.avsluttende_v3;

/**
 * Represents a generic item in a media rental store. This is an abstract class
 * that cannot be instantiated directly. It serves as a foundation for specific
 * media types like Book, Movie, and Game.
 *
 * The purpose of this class is to enforce a common structure for all media items,
 * including shared properties like title and year, and a common behavior for
 * calculating rental prices, which must be defined by each subclass.
 *
 * Students are expected to:
 * 1. Understand the concept of an abstract class and why it's used.
 * 2. Implement the constructor and getter methods for the common fields.
 * 3. Understand the purpose of an abstract method (getRentalPrice).
 * 4. See how a concrete method (displayInfo) can use both concrete and abstract parts of the class.
 */
public abstract class MediaItem {

    protected String title;
    protected int year;

    /**
     * Constructs a new MediaItem with the specified title and year.
     *
     * @param title The title of the media item.
     * @param year The year the media item was released.
     * @throws IllegalArgumentException if the title is null or blank, or if the year is in the future.
     */
    public MediaItem(String title, int year) {
        // TODO: Implement this constructor.
        // - Validate the title and year.
        // - Initialize the instance fields.
    }

    /**
     * Returns the title of the media item.
     *
     * @return The title.
     */
    public String getTitle() {
        // TODO: Implement this method.
        return null;
    }

    /**
     * Returns the release year of the media item.
     *
     * @return The release year.
     */
    public int getYear() {
        // TODO: Implement this method.
        return 0;
    }

    /**
     * An abstract method to calculate the rental price of the media item.
     * Each subclass must provide its own implementation of this method,
     * defining how its rental price is determined.
     *
     * @return The calculated rental price as a double.
     */
    public abstract double getRentalPrice();

    /**
     * Returns a string with general information about the media item.
     * This method calls the abstract getRentalPrice() method, demonstrating polymorphism.
     *
     * @return A formatted string with the title, year, and rental price.
     */
    public String displayInfo() {
        // TODO: Implement this method.
        // Format: "[Title] ([Year]) - Rental Price: $[Price]"
        // Example: "The Lord of the Rings (1954) - Rental Price: $4.5"
        return null;
    }
}
