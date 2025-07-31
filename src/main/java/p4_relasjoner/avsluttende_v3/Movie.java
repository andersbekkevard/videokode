package p4_relasjoner.avsluttende_v3;

/**
 * Represents a movie, which is another specific type of MediaItem.
 * This class extends MediaItem and provides a concrete implementation
 * for calculating the rental price based on the movie's duration.
 *
 * Students are expected to:
 * 1. Further practice extending abstract classes.
 * 2. Implement the same abstract method with different logic.
 * 3. Reinforce the concept of polymorphism.
 */
public class Movie extends MediaItem {

    private int durationMinutes;

    /**
     * Constructs a new Movie with the specified title, year, and duration.
     *
     * @param title The title of the movie.
     * @param year The year the movie was released.
     * @param durationMinutes The duration of the movie in minutes.
     * @throws IllegalArgumentException if durationMinutes is not positive.
     */
    public Movie(String title, int year, int durationMinutes) {
        super(title, year);
        // TODO: Implement this constructor.
        // - Call the superclass constructor.
        // - Validate and initialize the durationMinutes field.
    }

    /**
     * Returns the duration of the movie in minutes.
     *
     * @return The duration in minutes.
     */
    public int getDurationMinutes() {
        // TODO: Implement this method.
        return 0;
    }

    /**
     * Calculates the rental price of the movie.
     * The price is calculated as $0.05 per minute.
     * For example, a 120-minute movie would cost $6.00 to rent.
     *
     * @return The rental price of the movie.
     */
    @Override
    public double getRentalPrice() {
        // TODO: Implement this method based on the duration.
        return 0.0;
    }

    /**
     * Overrides the displayInfo method to include movie-specific information.
     *
     * @return A string in the format: "Movie: [Title] ([Year]), [Duration] minutes - Rental Price: $[Price]"
     */
    @Override
    public String displayInfo() {
        // TODO: Implement this method to include the duration.
        return null;
    }
}
