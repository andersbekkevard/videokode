package p4_relasjoner.avsluttende_v5;

/**
 * Represents a generic Person. This class serves as a concrete superclass
 * for more specific types of people like Student and Teacher.
 *
 * The purpose of this class is to define common properties and behaviors
 * that all people share, such as having a name and an age. This example
 * demonstrates direct inheritance without the use of abstract classes.
 *
 * Students are expected to:
 * 1. Understand the role of a superclass in an inheritance hierarchy.
 * 2. See how a superclass can be instantiated directly.
 * 3. Understand how subclasses extend its functionality.
 */
public class Person {

    protected String name;
    protected int age;

    /**
     * Constructs a new Person with the specified name and age.
     *
     * @param name The name of the person.
     * @param age The age of the person.
     */
    public Person(String name, int age) {
        // TODO: Implement this constructor.
        // - Validate that name is not null or blank.
        // - Validate that age is positive.
        // - Initialize the instance fields.
    }

    /**
     * Returns the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        // TODO: Implement this method.
        return null;
    }

    /**
     * Returns the age of the person.
     *
     * @return The age of the person.
     */
    public int getAge() {
        // TODO: Implement this method.
        return 0;
    }

    /**
     * Returns a string with information about the person.
     * This method is intended to be overridden by subclasses.
     *
     * @return A string in the format: "Person: [name], Age: [age]".
     */
    public String getInfo() {
        // TODO: Implement this method.
        return null;
    }
}