package p4_relasjoner.avsluttende_v3;

/**
 * Represents a game, another specific type of MediaItem.
 * This class extends MediaItem and provides a simple, fixed rental price,
 * demonstrating that not all subclasses need complex logic for their implementations.
 *
 * Students are expected to:
 * 1. See a simpler implementation of an abstract method.
 * 2. Understand that different subclasses can have vastly different internal logic
 *    while still conforming to the same superclass contract.
 */
public class Game extends MediaItem {

    private static final double RENTAL_PRICE = 7.00;

    /**
     * Constructs a new Game with the specified title and year.
     *
     * @param title The title of the game.
     * @param year The year the game was released.
     */
    public Game(String title, int year) {
        super(title, year);
        // TODO: Implement this constructor.
        // - Call the superclass constructor.
    }

    /**
     * Calculates the rental price of the game.
     * All games have a fixed rental price of $7.00.
     *
     * @return The fixed rental price for a game.
     */
    @Override
    public double getRentalPrice() {
        // TODO: Implement this method to return the fixed price.
        return 0.0;
    }

    /**
     * Overrides the displayInfo method to identify the item as a Game.
     *
     * @return A string in the format: "Game: [Title] ([Year]) - Rental Price: $[Price]"
     */
    @Override
    public String displayInfo() {
        // TODO: Implement this method.
        return null;
    }
}
