package p4_relasjoner.avsluttende_v3;

/**
 * Represents a video game, a specific type of MediaItem.
 * This class demonstrates pricing and fee logic that depends on the item's age,
 * showing a different kind of conditional calculation.
 *
 * Students are expected to:
 * 1. Implement logic based on the age of an item.
 * 2. Handle multi-tiered calculations (e.g., for late fees).
 * 3. Solidify their understanding of extending an abstract base class.
 */
public class Game extends BaseMediaItem {

    private static final double BASE_PRICE = 5.00;
    private static final double OLD_GAME_PRICE = 3.00;
    private static final int OLD_GAME_AGE_THRESHOLD = 10; // Games older than 10 years are cheaper

    private static final double STANDARD_LATE_FEE_PER_DAY = 1.00;
    private static final double HIGH_LATE_FEE_PER_DAY = 2.00;
    private static final int HIGH_LATE_FEE_THRESHOLD_DAYS = 7;


    /**
     * Constructs a new Game.
     *
     * @param title The title of the game.
     * @param year The year the game was released.
     */
    public Game(String title, int year) {
        super(title, year);
    }

    /**
     * Calculates the rental price of the game.
     * The price is lower for older games.
     *
     * @return The calculated rental price.
     */
    @Override
    public double getRentalPrice() {
        // TODO: Implement this method.
        // - Use MediaItem.getAge() to find the game's age.
        // - If the age is greater than OLD_GAME_AGE_THRESHOLD, return OLD_GAME_PRICE.
        // - Otherwise, return BASE_PRICE.
        return 0.0;
    }

    /**
     * Calculates the late fee for a game.
     * The fee per day increases after the first week.
     *
     * @param daysLate The number of days the item is overdue.
     * @return The total late fee.
     */
    @Override
    public double calculateLateFee(int daysLate) {
        // TODO: Implement this method.
        // - If daysLate is not positive, return 0.
        // - If daysLate is 7 or less, the fee is STANDARD_LATE_FEE_PER_DAY * daysLate.
        // - If daysLate is more than 7, the fee is:
        //   (STANDARD_LATE_FEE_PER_DAY * 7) + (HIGH_LATE_FEE_PER_DAY * (daysLate - 7)).
        return 0.0;
    }

    /**
     * Overrides the displayInfo method to provide game-specific details.
     *
     * @return A formatted string including the game's rental status.
     *         Example: "Game: 'Elden Ring' (2022) - Price: $5.00 - Status: Available"
     */
    @Override
    public String displayInfo() {
        // TODO: Implement this method.
        // Format: "Game: '[Title]' ([Year]) - Price: $[Price] - Status: [Status]"
        return null;
    }
}
