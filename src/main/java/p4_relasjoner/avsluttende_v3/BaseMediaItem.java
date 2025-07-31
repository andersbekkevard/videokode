package p4_relasjoner.avsluttende_v3;

import java.time.Year;

/**
 * An abstract base class that provides a skeletal implementation of the MediaItem interface.
 * This class handles the common state and behavior, such as title, year, and rental status,
 * reducing redundancy in the concrete subclasses (Book, Movie, Game).
 *
 * Students are expected to:
 * 1. Understand how an abstract class can implement an interface.
 * 2. See how to provide a base implementation for common methods.
 * 3. Recognize that abstract methods from the interface can be passed down to be implemented
 *    by concrete subclasses.
 */
public abstract class BaseMediaItem implements MediaItem {

    protected String title;
    protected int year;
    private boolean isRented;

    /**
     * Constructs a new BaseMediaItem.
     *
     * @param title The title of the item.
     * @param year The release year of the item.
     * @throws IllegalArgumentException if title is invalid or year is in the future.
     */
    public BaseMediaItem(String title, int year) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or blank.");
        }
        if (year > Year.now().getValue()) {
            throw new IllegalArgumentException("Year cannot be in the future.");
        }
        this.title = title;
        this.year = year;
        this.isRented = false; // Items are not rented by default
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean isRented() {
        return isRented;
    }

    @Override
    public void rent() {
        if (isRented) {
            throw new IllegalStateException("This item is already rented.");
        }
        this.isRented = true;
    }

    @Override
    public void returnItem() {
        this.isRented = false;
    }

    /**
     * Provides a default display string. Subclasses are expected to override this
     * to provide more specific information.
     *
     * @return A string with the item's details and rental status.
     */
    @Override
    public String displayInfo() {
        return String.format("'%s' (%d) - Price: $%.2f - Status: %s",
                title, year, getRentalPrice(), isRented ? "Rented" : "Available");
    }

    // Note: getRentalPrice() and calculateLateFee() are still abstract
    // and must be implemented by the concrete subclasses.
}
