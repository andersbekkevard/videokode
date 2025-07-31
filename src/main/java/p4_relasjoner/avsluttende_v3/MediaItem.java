package p4_relasjoner.avsluttende_v3;

import java.time.Year;

/**
 * Defines the contract for any item that can be rented from the media store.
 * An interface is used here to establish a strict contract for what it means
 * to be a "MediaItem" without providing any implementation details.
 *
 * Students are expected to:
 * 1. Understand the role of an interface in defining a contract.
 * 2. Implement this interface in an abstract base class to provide shared functionality.
 * 3. See how interfaces can include static helper methods.
 */
public interface MediaItem {

    /**
     * Returns the title of the media item.
     *
     * @return The title.
     */
    String getTitle();

    /**
     * Returns the release year of the media item.
     *
     * @return The release year.
     */
    int getYear();

    /**
     * Calculates the current rental price of the media item.
     * The logic for this will vary between different types of media.
     *
     * @return The rental price.
     */
    double getRentalPrice();

    /**
     * Marks the item as rented.
     *
     * @throws IllegalStateException if the item is already rented.
     */
    void rent();

    /**
     * Marks the item as returned.
     */
    void returnItem();

    /**
     * Checks if the item is currently rented.
     *
     * @return true if the item is rented, false otherwise.
     */
    boolean isRented();

    /**
     * Calculates the late fee for this item.
     * The formula for the late fee depends on the type of media.
     *
     * @param daysLate The number of days the item is overdue.
     * @return The calculated late fee.
     */
    double calculateLateFee(int daysLate);

    /**
     * Provides a display string for the item, including its rental status.
     *
     * @return A string with the item's details.
     */
    String displayInfo();

    /**
     * A static helper method to calculate the age of a media item based on its release year.
     * This demonstrates how interfaces can contain utility methods.
     *
     * @param releaseYear The year the item was released.
     * @return The age of the item in years.
     */
    static int getAge(int releaseYear) {
        return Year.now().getValue() - releaseYear;
    }
}
