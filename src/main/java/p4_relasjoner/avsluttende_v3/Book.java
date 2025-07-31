package p4_relasjoner.avsluttende_v3;

/**
 * Represents a book, a specific type of MediaItem.
 * This class extends the BaseMediaItem abstract class, inheriting common functionality
 * and providing its own specific implementation for rental prices and late fees.
 *
 * Students are expected to:
 * 1. Extend an abstract base class that implements an interface.
 * 2. Implement the remaining abstract methods (getRentalPrice, calculateLateFee).
 * 3. Use fields from the superclass within the subclass logic.
 * 4. Override methods to provide more specific behavior.
 */
public class Book extends BaseMediaItem {

    private int numberOfPages;
    private static final double PRICE_PER_PAGE = 0.01;
    private static final double MINIMUM_PRICE = 3.0;
    private static final double LATE_FEE_PER_DAY = 0.25;


    /**
     * Constructs a new Book.
     *
     * @param title The title of the book.
     * @param year The year the book was published.
     * @param numberOfPages The number of pages in the book.
     * @throws IllegalArgumentException if numberOfPages is not positive.
     */
    public Book(String title, int year, int numberOfPages) {
        super(title, year);
        // TODO: Implement the validation for numberOfPages.
        this.numberOfPages = numberOfPages;
    }

    /**
     * Returns the number of pages in the book.
     *
     * @return The number of pages.
     */
    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    /**
     * Calculates the rental price of the book.
     * The price is $0.01 per page, but with a minimum price of $3.00.
     *
     * @return The calculated rental price.
     */
    @Override
    public double getRentalPrice() {
        // TODO: Implement this method.
        // The price is the higher of (PRICE_PER_PAGE * numberOfPages) or MINIMUM_PRICE.
        // Use Math.max() for a concise implementation.
        return 0.0;
    }

    /**
     * Calculates the late fee for a book.
     * The fee is a flat rate of $0.25 per day late.
     *
     * @param daysLate The number of days the item is overdue.
     * @return The total late fee.
     */
    @Override
    public double calculateLateFee(int daysLate) {
        // TODO: Implement this method.
        // The fee is simply LATE_FEE_PER_DAY * daysLate.
        // Return 0 if daysLate is not positive.
        return 0.0;
    }

    /**
     * Overrides the displayInfo method to provide book-specific details.
     *
     * @return A formatted string including the book's page count and rental status.
     *         Example: "Book: 'The Hobbit' (1937), 310 pages - Price: $3.10 - Status: Available"
     */
    @Override
    public String displayInfo() {
        // TODO: Implement this method.
        // It should be in the format: "Book: '[Title]' ([Year]), [Pages] pages - Price: $[Price] - Status: [Status]"
        // Use the getRentalPrice() method and the isRented() status from the superclass.
        return null;
    }
}
