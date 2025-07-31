package p4_relasjoner.avsluttende_v3;

/**
 * Represents a movie, a specific type of MediaItem.
 * This class demonstrates more complex pricing logic based on the item's age.
 *
 * Students are expected to:
 * 1. Implement methods with conditional logic (if/else).
 * 2. Use static methods from an interface (MediaItem.getAge).
 * 3. Combine superclass properties with subclass logic to determine behavior.
 */
public class Movie extends BaseMediaItem {

    private int durationMinutes;
    private static final double BASE_PRICE = 4.0;
    private static final double NEW_RELEASE_SURCHARGE = 2.0; // Extra charge for movies released in the last year
    private static final double LATE_FEE_PER_DAY = 0.50;
    private static final double NEW_RELEASE_LATE_FEE_MULTIPLIER = 2.0; // Late fees are doubled for new releases

    /**
     * Constructs a new Movie.
     *
     * @param title The title of the movie.
     * @param year The year the movie was released.
     * @param durationMinutes The duration of the movie in minutes.
     * @throws IllegalArgumentException if duration is not positive.
     */
    public Movie(String title, int year, int durationMinutes) {
        super(title, year);
        // TODO: Implement validation for durationMinutes.
        this.durationMinutes = durationMinutes;
    }

    /**
     * Returns the duration of the movie in minutes.
     *
     * @return The duration.
     */
    public int getDurationMinutes() {
        return this.durationMinutes;
    }

    /**
     * Calculates the rental price of the movie.
     * The price is higher for new releases (released within the last year).
     *
     * @return The calculated rental price.
     */
    @Override
    public double getRentalPrice() {
        // TODO: Implement this method.
        // - Use the static MediaItem.getAge() method to find the movie's age.
        // - If the age is 0 (i.e., released this year), the price is BASE_PRICE + NEW_RELEASE_SURCHARGE.
        // - Otherwise, the price is just BASE_PRICE.
        return 0.0;
    }

    /**
     * Calculates the late fee for a movie.
     * The fee is higher for new releases.
     *
     * @param daysLate The number of days the item is overdue.
     * @return The total late fee.
     */
    @Override
    public double calculateLateFee(int daysLate) {
        // TODO: Implement this method.
        // - If daysLate is not positive, return 0.
        // - Calculate the base fee: LATE_FEE_PER_DAY * daysLate.
        // - If the movie is a new release (age is 0), multiply the base fee by NEW_RELEASE_LATE_FEE_MULTIPLIER.
        // - Otherwise, return the base fee.
        return 0.0;
    }

    /**
     * Overrides the displayInfo method to provide movie-specific details.
     *
     * @return A formatted string including the movie's duration and rental status.
     *         Example: "Movie: 'Dune' (2021), 155 minutes - Price: $6.00 - Status: Rented"
     */
    @Override
    public String displayInfo() {
        // TODO: Implement this method.
        // Format: "Movie: '[Title]' ([Year]), [Duration] minutes - Price: $[Price] - Status: [Status]"
        return null;
    }
}
