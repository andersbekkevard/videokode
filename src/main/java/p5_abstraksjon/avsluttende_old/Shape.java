package p5_abstraksjon.avsluttende_old;

/**
 * Abstract base class representing a geometric shape.
 * 
 * This abstract class demonstrates the key concepts from p5_abstraksjon:
 * - Abstract classes with abstract methods
 * - Concrete methods in abstract classes
 * - Template method pattern (concrete methods using abstract methods)
 * 
 * This exercise focuses specifically on p5_abstraksjon concepts:
 * - Abstract classes (abstract keyword)
 * - Abstract methods (must be implemented by subclasses)
 * - Concrete methods in abstract classes (shared behavior)
 * - Template method pattern (concrete methods calling abstract methods)
 * - Polymorphism through abstract classes
 * 
 * Students should implement concrete subclasses that extend this abstract
 * class.
 * 
 * @see Circle
 * @see Rectangle
 * @see Triangle
 * @see ShapeTests
 */
public abstract class Shape {

    // TODO Add any necessary protected instance fields here
    // Note: Use protected visibility so subclasses can access them directly

    /**
     * Constructs a Shape with the specified name and color.
     *
     * @param name  the name of the shape, must not be null or blank
     * @param color the color of the shape, must not be null or blank
     * @throws IllegalArgumentException if name or color is null or blank
     */
    public Shape(String name, String color) {
        // TODO Implement the constructor
    }

    /**
     * Returns the name of the shape.
     *
     * @return the shape name
     */
    public String getName() {
        // TODO Implement the method getName
        return null;
    }

    /**
     * Returns the color of the shape.
     *
     * @return the shape color
     */
    public String getColor() {
        // TODO Implement the method getColor
        return null;
    }

    /**
     * Sets the color of the shape.
     *
     * @param newColor the new color, must not be null or blank
     * @throws IllegalArgumentException if newColor is null or blank
     */
    public void setColor(String newColor) {
        // TODO Implement the method setColor
    }

    /**
     * Abstract method to calculate the area of the shape.
     * Each concrete subclass must implement this method.
     *
     * @return the area of the shape
     */
    public abstract double calculateArea();

    /**
     * Abstract method to calculate the perimeter of the shape.
     * Each concrete subclass must implement this method.
     *
     * @return the perimeter of the shape
     */
    public abstract double calculatePerimeter();

    /**
     * Abstract method to get a description of the shape's specific properties.
     * Each concrete subclass must implement this method.
     * For example: "Circle with radius 5.0" or "Rectangle with width 4.0 and height
     * 3.0"
     *
     * @return a description of the shape's properties
     */
    public abstract String getShapeDescription();

    /**
     * Concrete method that provides a full description of the shape.
     * This demonstrates the template method pattern - a concrete method
     * that uses abstract methods to provide complete functionality.
     * 
     * Format: "Color ShapeDescription - Area: X.XX, Perimeter: Y.YY"
     * Example: "Red Circle with radius 5.0 - Area: 78.54, Perimeter: 31.42"
     *
     * @return a complete description of the shape
     */
    public String getFullDescription() {
        // TODO Implement the method getFullDescription using the template method
        // pattern
        // Use String.format() for proper decimal formatting (2 decimal places)
        return null;
    }

    /**
     * Concrete method that checks if this shape has a larger area than another
     * shape.
     * This demonstrates how concrete methods in abstract classes can provide
     * useful functionality using abstract methods.
     *
     * @param other the other shape to compare with
     * @return true if this shape has a larger area, false otherwise
     * @throws IllegalArgumentException if other is null
     */
    public boolean hasLargerAreaThan(Shape other) {
        // TODO Implement the method hasLargerAreaThan
        return false;
    }

    /**
     * Concrete method that checks if this shape has the same area as another shape.
     * Uses a small tolerance (0.001) for floating-point comparison.
     *
     * @param other the other shape to compare with
     * @return true if the shapes have approximately the same area, false otherwise
     * @throws IllegalArgumentException if other is null
     */
    public boolean hasSameAreaAs(Shape other) {
        // TODO Implement the method hasSameAreaAs with tolerance for floating-point
        // comparison
        return false;
    }

    /**
     * Concrete method that calculates the area-to-perimeter ratio.
     * This demonstrates how concrete methods can combine abstract methods.
     *
     * @return the ratio of area to perimeter
     * @throws IllegalStateException if perimeter is zero (to avoid division by
     *                               zero)
     */
    public double getAreaToPerimeterRatio() {
        // TODO Implement the method getAreaToPerimeterRatio
        return 0.0;
    }

    /**
     * Concrete method that checks if the shape is "compact" (area-to-perimeter
     * ratio > 1.0).
     * This demonstrates concrete methods building on other methods.
     *
     * @return true if the shape is compact, false otherwise
     */
    public boolean isCompact() {
        // TODO Implement the method isCompact
        return false;
    }

    /**
     * Abstract method to scale the shape by a factor.
     * Each concrete subclass must implement this method to resize appropriately.
     * For example, a circle would scale its radius, a rectangle would scale width
     * and height.
     *
     * @param scaleFactor the factor to scale by, must be positive
     * @throws IllegalArgumentException if scaleFactor is not positive
     */
    public abstract void scale(double scaleFactor);

    /**
     * Concrete method that creates a scaled copy of the shape.
     * This demonstrates the template method pattern with object creation.
     * 
     * Note: This method creates a copy, scales it, and returns the copy.
     * The original shape remains unchanged.
     *
     * @param scaleFactor the factor to scale by, must be positive
     * @return a new scaled copy of this shape
     * @throws IllegalArgumentException if scaleFactor is not positive
     */
    public abstract Shape createScaledCopy(double scaleFactor);

    /**
     * Returns a string representation of the shape.
     * Uses the getFullDescription() method to provide consistent formatting.
     *
     * @return a string representation of this shape
     */
    @Override
    public String toString() {
        // TODO Implement the toString method using getFullDescription()
        return null;
    }
}