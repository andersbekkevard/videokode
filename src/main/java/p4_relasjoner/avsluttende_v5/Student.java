package p4_relasjoner.avsluttende_v5;

/**
 * Represents a Student, which is a specialized type of Person.
 * This class extends Person and adds student-specific information.
 *
 * Students are expected to:
 * 1. Understand how to use the `extends` keyword to inherit from a superclass.
 * 2. Implement a constructor that calls the superclass constructor using `super()`.
 * 3. Override methods from the superclass to provide specialized behavior.
 * 4. Add new methods and fields that are specific to the subclass.
 */
public class Student extends Person {

    private String studentId;

    /**
     * Constructs a new Student with the specified name, age, and student ID.
     *
     * @param name      The name of the student.
     * @param age       The age of the student.
     * @param studentId The student ID.
     */
    public Student(String name, int age, String studentId) {
        // TODO: Implement this constructor.
        // - Call the superclass constructor.
        // - Validate that studentId is not null or blank.
        // - Initialize the instance field.
        super(name, age); // Placeholder to avoid compilation error
    }

    /**
     * Returns the student ID.
     *
     * @return The student ID.
     */
    public String getStudentId() {
        // TODO: Implement this method.
        return null;
    }

    /**
     * Overrides the getInfo method to include student-specific information.
     *
     * @return A string in the format: "Student: [name], Age: [age], ID: [studentId]".
     */
    @Override
    public String getInfo() {
        // TODO: Implement this method.
        return null;
    }
}