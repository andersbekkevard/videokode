package p5_abstraksjon.avsluttende_old;

/**
 * Implement a concrete class representing a circle called Circle
 * 
 * The expected methods for this class and their behaviour is detailed
 * in the below JavaDoc
 * 
 * The Circle class must be in the package p5_abstraksjon.avsluttende
 * 
 * This exercise focuses specifically on p5_abstraksjon concepts:
 * - Extending abstract classes (inheritance from Shape)
 * - Implementing abstract methods from the parent class
 * - Implementing interfaces (Drawable)
 * - Method overriding with @Override annotation
 * - Using super() to call parent constructors
 * - Polymorphism (Circle can be treated as Shape or Drawable)
 * 
 * The Circle class should:
 * - Extend the Shape abstract class
 * - Implement the Drawable interface
 * - Override all abstract methods from Shape
 * - Implement all abstract methods from Drawable
 * - Optionally override default methods from Drawable if needed
 * 
 * @see Shape
 * @see Drawable
 * @see CircleTests
 */
public class Circle extends Shape implements Drawable {

    // TODO Add any necessary private instance fields here
    // Hint: A circle needs a radius and coordinates for drawing

    /**
     * Constructs a Circle with the specified name, color, radius, and drawing
     * position.
     *
     * @param name   the name of the circle, must not be null or blank
     * @param color  the color of the circle, must not be null or blank
     * @param radius the radius of the circle, must be positive
     * @param x      the x-coordinate for drawing
     * @param y      the y-coordinate for drawing
     * @throws IllegalArgumentException if name or color is null/blank, or if radius
     *                                  is not positive
     */
    public Circle(String name, String color, double radius, double x, double y) {
        super(name, color);
        // TODO Implement the constructor using super() to call parent constructor
    }

    /**
     * Returns the radius of the circle.
     *
     * @return the radius
     */
    public double getRadius() {
        // TODO Implement the method getRadius
        return 0.0;
    }

    /**
     * Sets the radius of the circle.
     *
     * @param newRadius the new radius, must be positive
     * @throws IllegalArgumentException if newRadius is not positive
     */
    public void setRadius(double newRadius) {
        // TODO Implement the method setRadius
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

    // Abstract methods from Shape that must be implemented:

    /**
     * Calculates the area of the circle.
     * Formula: π * radius²
     *
     * @return the area of the circle
     */
    @Override
    public double calculateArea() {
        // TODO Implement the method calculateArea using Math.PI
        return 0.0;
    }

    /**
     * Calculates the perimeter (circumference) of the circle.
     * Formula: 2 * π * radius
     *
     * @return the perimeter of the circle
     */
    @Override
    public double calculatePerimeter() {
        // TODO Implement the method calculatePerimeter using Math.PI
        return 0.0;
    }

    /**
     * Gets a description of the circle's specific properties.
     * Format: "Circle with radius X.X"
     *
     * @return a description of the circle's properties
     */
    @Override
    public String getShapeDescription() {
        // TODO Implement the method getShapeDescription
        return null;
    }

    /**
     * Scales the circle by the specified factor.
     * This scales the radius by the factor.
     *
     * @param scaleFactor the factor to scale by, must be positive
     * @throws IllegalArgumentException if scaleFactor is not positive
     */
    @Override
    public void scale(double scaleFactor) {
        // TODO Implement the method scale
    }

    /**
     * Creates a scaled copy of this circle.
     * The original circle remains unchanged.
     *
     * @param scaleFactor the factor to scale by, must be positive
     * @return a new scaled copy of this circle
     * @throws IllegalArgumentException if scaleFactor is not positive
     */
    @Override
    public Shape createScaledCopy(double scaleFactor) {
        // TODO Implement the method createScaledCopy
        return null;
    }

    // Abstract methods from Drawable interface that must be implemented:

    /**
     * Draws the circle.
     * Should print a message indicating the circle is being drawn.
     */
    @Override
    public void draw() {
        // TODO Implement the method draw
        // Print something like: "Drawing Red Circle with radius 5.0 at (10.0, 20.0)"
    }

    /**
     * Gets the drawing coordinates of the circle.
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

    // Optional: Override default methods from Drawable if you want custom behavior
    // For example, you might want a custom prepareForDrawing() message for circles

    /**
     * Custom preparation message for drawing circles.
     * This demonstrates overriding a default method from an interface.
     *
     * @return a circle-specific preparation message
     */
    @Override
    public String prepareForDrawing() {
        // TODO Optionally implement custom prepareForDrawing, or remove this method to
        // use default
        return "Preparing to draw circle with radius " + getRadius() + "...";
    }
}