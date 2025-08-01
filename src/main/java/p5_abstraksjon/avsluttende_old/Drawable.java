package p5_abstraksjon.avsluttende_old;

/**
 * Interface representing objects that can be drawn.
 * 
 * This interface demonstrates the key concepts from p5_abstraksjon:
 * - Interfaces with abstract methods (implicitly public and abstract)
 * - Default methods in interfaces (concrete methods with default
 * implementation)
 * - Static methods in interfaces
 * - Multiple inheritance through interfaces
 * 
 * This exercise focuses specifically on p5_abstraksjon interface concepts:
 * - Interface declaration
 * - Abstract methods in interfaces (implicitly public abstract)
 * - Default methods (shared implementation)
 * - Static methods in interfaces
 * - Interface implementation in concrete classes
 * 
 * @see Shape
 * @see Circle
 * @see Rectangle
 * @see Triangle
 */
public interface Drawable {

    /**
     * Abstract method to draw the object.
     * All implementing classes must provide their own implementation.
     * Note: Interface methods are implicitly public and abstract.
     */
    void draw();

    /**
     * Abstract method to get drawing coordinates.
     * Returns a string representation of where the object should be drawn.
     * Format: "(x, y)" where x and y are the coordinates.
     *
     * @return the drawing coordinates as a string
     */
    String getDrawingCoordinates();

    /**
     * Default method that provides a standard way to prepare for drawing.
     * This demonstrates default methods in interfaces - concrete methods
     * that provide shared functionality to all implementing classes.
     * 
     * Implementing classes can override this method if they need custom behavior.
     *
     * @return a preparation message
     */
    default String prepareForDrawing() {
        // TODO Implement the default method prepareForDrawing
        return "Preparing to draw...";
    }

    /**
     * Default method that provides post-drawing cleanup.
     * This demonstrates another default method that implementing classes
     * can use as-is or override if needed.
     *
     * @return a cleanup message
     */
    default String finishDrawing() {
        // TODO Implement the default method finishDrawing
        return "Drawing completed.";
    }

    /**
     * Default method that performs the complete drawing process.
     * This demonstrates the template method pattern in interfaces using default
     * methods.
     * It calls the abstract methods that must be implemented by concrete classes.
     *
     * @return a complete drawing report
     */
    default String performCompleteDrawing() {
        // TODO Implement the default method performCompleteDrawing
        // Use the template method pattern: prepareForDrawing(), draw(), finishDrawing()
        return null;
    }

    /**
     * Static method that validates drawing coordinates.
     * This demonstrates static methods in interfaces.
     * Static methods in interfaces belong to the interface, not to implementing
     * classes.
     *
     * @param coordinates the coordinates string to validate (format: "(x, y)")
     * @return true if coordinates are in valid format, false otherwise
     */
    static boolean isValidCoordinateFormat(String coordinates) {
        // TODO Implement the static method isValidCoordinateFormat
        // Check if the string matches the pattern "(x, y)" where x and y are numbers
        return false;
    }

    /**
     * Static method that creates a default coordinate string.
     * This demonstrates another static utility method in interfaces.
     *
     * @param x the x coordinate
     * @param y the y coordinate
     * @return a formatted coordinate string "(x, y)"
     */
    static String formatCoordinates(double x, double y) {
        // TODO Implement the static method formatCoordinates
        return null;
    }
}