package p4_relasjoner.avsluttende_v5;

import java.util.ArrayList;
import java.util.List;

/**
 * A main class to demonstrate the use of Person, Student, and Teacher classes.
 *
 * This class shows how to:
 * 1. Create instances of a concrete superclass and its subclasses.
 * 2. Use polymorphism by storing subclass objects in a list of the superclass type.
 * 3. Call overridden methods, demonstrating dynamic method dispatch.
 */
public class Main {
    public static void main(String[] args) {
        // Create a generic Person instance
        Person person = new Person("Alex", 30);

        // Create instances of the subclasses
        Student student = new Student("Bella", 20, "S12345");
        Teacher teacher = new Teacher("Carl", 45, "History");

        System.out.println("--- Individual Objects ---");
        System.out.println(person.getInfo());
        System.out.println(student.getInfo());
        System.out.println(teacher.getInfo());

        System.out.println("\n--- Polymorphism in a List ---");
        // Create a list that can hold Person objects (and its subclasses)
        List<Person> people = new ArrayList<>();
        people.add(person);
        people.add(student);
        people.add(teacher);

        // Iterate through the list and call getInfo() on each object
        for (Person p : people) {
            System.out.println(p.getInfo());
            // The correct getInfo() method is called for each object type
        }
    }
}
