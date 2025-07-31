package p5_abstraksjon.avsluttende;

/**
 * Implement a concrete class representing a rectangle called Rectangle
 * 
 * The expected methods for this class and their behaviour is detailed
 * in the below JavaDoc
 * 
 * The Rectangle class must be in the package p5_abstraksjon.avsluttende
 * 
 * This exercise focuses specifically on p5_abstraksjon concepts:
 * - Extending abstract classes (inheritance from Shape)
 * - Implementing abstract methods from the parent class
 * - Implementing interfaces (Drawable)
 * - Method overriding with @Override annotation
 * - Using super() to call parent constructors
 * - Polymorphism (Rectangle can be treated as Shape or Drawable)
 * 
 * The Rectangle class should:
 * - Extend the Shape abstract class
 * - Implement the Drawable interface
 * - Override all abstract methods from Shape
 * - Implement all abstract methods from Drawable
 * - Use the default methods from Drawable (no need to override unless custom behavior needed)
 * 
 * @see Shape
 * @see Drawable
 * @see RectangleTests
 */
public class Rectangle extends Shape implements Drawable {

    // TODO Add any necessary private instance fields here
    // Hint: A rectangle needs width, height, and coordinates for drawing

    /**
     * Constructs a Rectangle with the specified name, color, dimensions, and drawing position.
     *
     * @param name the name of the rectangle, must not be null or blank
     * @param color the color of the rectangle, must not be null or blank
     * @param width the width of the rectangle, must be positive
     * @param height the height of the rectangle, must be positive
     * @param x the x-coordinate for drawing
     * @param y the y-coordinate for drawing
     * @throws IllegalArgumentException if name or color is null/blank, or if width or height is not positive
     */
    public Rectangle(String name, String color, double width, double height, double x, double y) {
        // TODO Implement the constructor using super() to call parent constructor
    }

    /**
     * Returns the width of the rectangle.
     *
     * @return the width
     */
    public double getWidth() {
        // TODO Implement the method getWidth
        return 0.0;
    }

    /**
     * Returns the height of the rectangle.
     *
     * @return the height
     */
    public double getHeight() {
        // TODO Implement the method getHeight
        return 0.0;
    }

    /**
     * Sets the width of the rectangle.
     *
     * @param newWidth the new width, must be positive
     * @throws IllegalArgumentException if newWidth is not positive
     */
    public void setWidth(double newWidth) {
        // TODO Implement the method setWidth
    }

    /**
     * Sets the height of the rectangle.
     *
     * @param newHeight the new height, must be positive
     * @throws IllegalArgumentException if newHeight is not positive
     */
    public void setHeight(double newHeight) {
        // TODO Implement the method setHeight
    }

    /**
     * Returns the x-coordinate for drawing.
     *
     * @return the x-coordinate
     */
    public double getX() {
        // TODO Implement the method getX
        return 0.0;
    }

    /**
     * Returns the y-coordinate for drawing.
     *
     * @return the y-coordinate
     */
    public double getY() {
        // TODO Implement the method getY
        return 0.0;
    }

    /**
     * Sets the drawing position.
     *
     * @param newX the new x-coordinate
     * @param newY the new y-coordinate
     */
    public void setPosition(double newX, double newY) {
        // TODO Implement the method setPosition
    }

    /**
     * Checks if this rectangle is a square (width equals height).
     * Uses a small tolerance (0.001) for floating-point comparison.
     *
     * @return true if the rectangle is a square, false otherwise
     */
    public boolean isSquare() {
        // TODO Implement the method isSquare with tolerance for floating-point comparison
        return false;
    }

    // Abstract methods from Shape that must be implemented:

    /**
     * Calculates the area of the rectangle.
     * Formula: width * height
     *
     * @return the area of the rectangle
     */
    @Override
    public double calculateArea() {
        // TODO Implement the method calculateArea
        return 0.0;
    }

    /**
     * Calculates the perimeter of the rectangle.
     * Formula: 2 * (width + height)
     *
     * @return the perimeter of the rectangle
     */
    @Override
    public double calculatePerimeter() {
        // TODO Implement the method calculatePerimeter
        return 0.0;
    }

    /**
     * Gets a description of the rectangle's specific properties.
     * Format: "Rectangle with width X.X and height Y.Y"
     * Special case: If it's a square, format: "Square with side X.X"
     *
     * @return a description of the rectangle's properties
     */
    @Override
    public String getShapeDescription() {
        // TODO Implement the method getShapeDescription
        // Check if it's a square using isSquare() method
        return null;
    }

    /**
     * Scales the rectangle by the specified factor.
     * This scales both width and height by the factor.
     *
     * @param scaleFactor the factor to scale by, must be positive
     * @throws IllegalArgumentException if scaleFactor is not positive
     */
    @Override
    public void scale(double scaleFactor) {
        // TODO Implement the method scale
    }

    /**
     * Creates a scaled copy of this rectangle.
     * The original rectangle remains unchanged.
     *
     * @param scaleFactor the factor to scale by, must be positive
     * @return a new scaled copy of this rectangle
     * @throws IllegalArgumentException if scaleFactor is not positive
     */
    @Override
    public Shape createScaledCopy(double scaleFactor) {
        // TODO Implement the method createScaledCopy
        return null;
    }

    // Abstract methods from Drawable interface that must be implemented:

    /**
     * Draws the rectangle.
     * Should print a message indicating the rectangle is being drawn.
     */
    @Override
    public void draw() {
        // TODO Implement the method draw
        // Print something like: "Drawing Blue Rectangle with width 4.0 and height 3.0 at (5.0, 10.0)"
    }

    /**
     * Gets the drawing coordinates of the rectangle.
     * Format: "(x, y)"
     *
     * @return the drawing coordinates as a string
     */
    @Override
    public String getDrawingCoordinates() {
        // TODO Implement the method getDrawingCoordinates
        // Use Drawable.formatCoordinates() static method
        return null;
    }

    // Note: This class uses the default methods from Drawable interface
    // (prepareForDrawing, finishDrawing, performCompleteDrawing)
    // No need to override them unless you want custom behavior
}