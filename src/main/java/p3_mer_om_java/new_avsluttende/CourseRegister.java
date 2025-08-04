package p3_mer_om_java.new_avsluttende;

import java.util.*;

/**
 * A simple class that represents course registrations.
 * Allows adding and retrieving students per course.
 */
public class CourseRegister {

    /*
     * map for
     */
    private Map<String, List<String>> courses;

    /**
     * Constructs a new empty course register.
     */
    public CourseRegister() {
        courses = new HashMap<>();
    }

    /**
     * Registers a student to a course. If the course does not exist, it will be created.
     *
     * @param courseName  the name of the course
     * @param studentName the name of the student
     */
    public void registerStudent(String courseName, String studentName) {
        courses.putIfAbsent(courseName, new ArrayList<>());
        courses.get(courseName).add(studentName);
    }

    /**
     * Returns a list of students registered in a given course.
     *
     * @param courseName the course to look up
     * @return a list of student names, or empty list if course doesn't exist
     */
    public List<String> getStudents(String courseName) {
        return courses.getOrDefault(courseName, new ArrayList<>());
    }

    /**
     * Returns the number of students registered in a given course.
     *
     * @param courseName the course to check
     * @return the number of students
     */
    public int countStudents(String courseName) {
        return getStudents(courseName).size();
    }

    /**
     * Prints all courses and their registered students.
     */
    public void printAllCourses() {
        for (String course : courses.keySet()) {
            System.out.println("Course: " + course);
            for (String student : courses.get(course)) {
                System.out.println("  - " + student);
            }
        }
    }

    /**
     * Removes a student from a given course.
     * If the course becomes empty, it is removed from the map.
     *
     * @param courseName  the course from which the student will be removed
     * @param studentName the student to remove
     * @return true if the student was removed, false otherwise
     */
    public boolean removeStudent(String courseName, String studentName) {
        List<String> students = courses.get(courseName);
        if (students == null) return false;
        boolean removed = students.remove(studentName);
        if (students.isEmpty()) {
            courses.remove(courseName);
        }
        return removed;
    }

    /**
     * Finds and returns all courses that a given student is registered in.
     *
     * @param studentName the student to search for
     * @return a list of course names where the student is registered
     */
    public List<String> getCoursesOfStudent(String studentName) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            if (entry.getValue().contains(studentName)) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
