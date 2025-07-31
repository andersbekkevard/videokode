package p4_relasjoner.avsluttende_v3;

/**
 * Represents a book, which is a specific type of MediaItem.
 * This class extends MediaItem and provides a concrete implementation
 * for calculating the rental price based on the number of pages.
 *
 * Students are expected to:
 * 1. Implement a subclass that extends an abstract class.
 * 2. Provide a concrete implementation for an abstract method.
 * 3. Use the 'super' keyword to call the superclass constructor.
 * 4. Add subclass-specific properties and logic.
 */
public class Book extends MediaItem {

    private int numberOfPages;

    /**
     * Constructs a new Book with the specified title, year, and number of pages.
     *
     * @param title The title of the book.
     * @param year The year the book was published.
     * @param numberOfPages The number of pages in the book.
     * @throws IllegalArgumentException if numberOfPages is not positive.
     */
    public Book(String title, int year, int numberOfPages) {
        super(title, year);
        // TODO: Implement this constructor.
        // - Call the superclass constructor.
        // - Validate and initialize the numberOfPages field.
    }

    /**
     * Returns the number of pages in the book.
     *
     * @return The number of pages.
     */
    public int getNumberOfPages() {
        // TODO: Implement this method.
        return 0;
    }

    /**
     * Calculates the rental price of the book.
     * The price is calculated as $0.01 per page.
     * For example, a 300-page book would cost $3.00 to rent.
     *
     * @return The rental price of the book.
     */
    @Override
    public double getRentalPrice() {
        // TODO: Implement this method based on the number of pages.
        return 0.0;
    }

    /**
     * Overrides the displayInfo method to include book-specific information.
     *
     * @return A string in the format: "Book: [Title] ([Year]), [Pages] pages - Rental Price: $[Price]"
     */
    @Override
    public String displayInfo() {
        // TODO: Implement this method to include the number of pages.
        // Hint: You can call the superclass's displayInfo() or build the string from scratch.
        return null;
    }
}
