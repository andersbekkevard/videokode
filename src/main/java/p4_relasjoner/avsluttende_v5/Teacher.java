package p4_relasjoner.avsluttende_v5;

/**
 * Represents a Teacher, another specialized type of Person.
 * This class extends Person and adds teacher-specific information.
 *
 * Students are expected to:
 * 1. See another example of a class extending a common superclass.
 * 2. Understand that different subclasses can extend the same superclass
 *    in different ways.
 */
public class Teacher extends Person {

    private String subject;

    /**
     * Constructs a new Teacher with the specified name, age, and subject.
     *
     * @param name    The name of the teacher.
     * @param age     The age of the teacher.
     * @param subject The subject the teacher teaches.
     */
    public Teacher(String name, int age, String subject) {
        // TODO: Implement this constructor.
        // - Call the superclass constructor.
        // - Validate that subject is not null or blank.
        // - Initialize the instance field.
        super(name, age); // Placeholder to avoid compilation error
    }

    /**
     * Returns the subject the teacher teaches.
     *
     * @return The subject.
     */
    public String getSubject() {
        // TODO: Implement this method.
        return null;
    }

    /**
     * Overrides the getInfo method to include teacher-specific information.
     *
     * @return A string in the format: "Teacher: [name], Age: [age], Subject: [subject]".
     */
    @Override
    public String getInfo() {
        // TODO: Implement this method.
        return null;
    }
}