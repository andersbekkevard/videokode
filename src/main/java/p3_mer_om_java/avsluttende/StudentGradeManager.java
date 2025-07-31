package p3_mer_om_java.avsluttende;

import java.util.List;
import java.util.Set;

/**
 * Implement a class that manages student grades called StudentGradeManager
 * 
 * The expected methods for this class and their behaviour is detailed
 * in the below JavaDoc
 * 
 * 
 * @see StudentGradeManagerTests
 */
public class StudentGradeManager {

    // TODO Add any necessary private instance fields here

    // TODO Add any necessary static fields here

    /**
     * Constructs a StudentGradeManager with the specified course name and maximum
     * students.
     *
     * @param courseName  the name of the course, must not be null or blank
     * @param maxStudents the maximum number of students allowed, must be greater
     *                    than 0
     * @throws IllegalArgumentException if courseName is null or blank, or if
     *                                  maxStudents is less than or equal to 0
     */
    public StudentGradeManager(String courseName, int maxStudents) {
        // TODO Implement the constructor
    }

    /**
     * Constructs a StudentGradeManager with the specified course name and a default
     * capacity of 50 students.
     *
     * @param courseName the name of the course, must not be null or blank
     * @throws IllegalArgumentException if courseName is null or blank
     */
    public StudentGradeManager(String courseName) {
        // TODO Implement the constructor (use constructor chaining with 'this')
    }

    /**
     * Returns the course name.
     *
     * @return the course name
     */
    public String getCourseName() {
        // TODO Implement the method getCourseName
        return null;
    }

    /**
     * Returns the maximum number of students allowed.
     *
     * @return the maximum number of students
     */
    public int getMaxStudents() {
        // TODO Implement the method getMaxStudents
        return 0;
    }

    /**
     * Returns the current number of registered students.
     *
     * @return the current number of students
     */
    public int getCurrentStudentCount() {
        // TODO Implement the method getCurrentStudentCount
        return 0;
    }

    /**
     * Adds a student to the course with an initial grade.
     * Student names must be unique (case-sensitive).
     * 
     * @param studentName the name of the student, must not be null or blank
     * @param grade       the initial grade for the student, must be between 0.0 and
     *                    100.0 (inclusive)
     * @throws IllegalArgumentException if studentName is null or blank, or if grade
     *                                  is not between 0.0 and 100.0
     * @throws IllegalStateException    if the course is at maximum capacity or if
     *                                  student already exists
     */
    public void addStudent(String studentName, double grade) {
        // TODO Implement the method addStudent
    }

    /**
     * Updates the grade for an existing student.
     *
     * @param studentName the name of the student
     * @param newGrade    the new grade, must be between 0.0 and 100.0 (inclusive)
     * @throws IllegalArgumentException if newGrade is not between 0.0 and 100.0
     * @throws IllegalStateException    if student does not exist
     */
    public void updateGrade(String studentName, double newGrade) {
        // TODO Implement the method updateGrade
    }

    /**
     * Returns the grade for the specified student.
     *
     * @param studentName the name of the student
     * @return the student's grade
     * @throws IllegalStateException if student does not exist
     */
    public double getGrade(String studentName) {
        // TODO Implement the method getGrade
        return 0.0;
    }

    /**
     * Returns a Set containing all student names.
     *
     * @return a Set of all student names
     */
    public Set<String> getAllStudentNames() {
        // TODO Implement the method getAllStudentNames
        return null;
    }

    /**
     * Returns a List of all grades in the order students were added.
     *
     * @return a List of all grades
     */
    public List<Double> getAllGrades() {
        // TODO Implement the method getAllGrades
        return null;
    }

    /**
     * Removes a student from the course.
     *
     * @param studentName the name of the student to remove
     * @return true if student was removed, false if student was not found
     */
    public boolean removeStudent(String studentName) {
        // TODO Implement the method removeStudent
        return false;
    }

    /**
     * Calculates the average grade of all students.
     * If no students are registered, return 0.0.
     *
     * @return the average grade
     */
    public double getAverageGrade() {
        // TODO Implement the method getAverageGrade
        return 0.0;
    }

    /**
     * Returns the highest grade in the course.
     * If no students are registered, return 0.0.
     *
     * @return the highest grade
     */
    public double getHighestGrade() {
        // TODO Implement the method getHighestGrade
        return 0.0;
    }

    /**
     * Returns the lowest grade in the course.
     * If no students are registered, return 100.0.
     *
     * @return the lowest grade
     */
    public double getLowestGrade() {
        // TODO Implement the method getLowestGrade
        return 100.0;
    }

    /**
     * Counts how many students have a grade within the specified range (inclusive).
     *
     * @param minGrade the minimum grade (inclusive)
     * @param maxGrade the maximum grade (inclusive)
     * @return the number of students within the grade range
     * @throws IllegalArgumentException if minGrade > maxGrade or if either is not
     *                                  between 0.0 and 100.0
     */
    public int countStudentsInGradeRange(double minGrade, double maxGrade) {
        // TODO Implement the method countStudentsInGradeRange
        return 0;
    }

    /**
     * Returns a List of student names who have grades above the specified
     * threshold.
     * The list should be sorted alphabetically.
     *
     * @param threshold the grade threshold
     * @return a sorted List of student names with grades above threshold
     * @throws IllegalArgumentException if threshold is not between 0.0 and 100.0
     */
    public List<String> getStudentsAboveThreshold(double threshold) {
        // TODO Implement the method getStudentsAboveThreshold
        return null;
    }

    /**
     * Converts a numeric grade to a letter grade using the following scale:
     * A: 90-100, B: 80-89, C: 70-79, D: 60-69, F: 0-59
     *
     * @param numericGrade the numeric grade to convert
     * @return the corresponding letter grade
     * @throws IllegalArgumentException if numericGrade is not between 0.0 and 100.0
     */
    public static char convertToLetterGrade(double numericGrade) {
        // TODO Implement the static method convertToLetterGrade
        return 'F';
    }

    /**
     * Generates a course summary report using StringBuilder.
     * The report should include:
     * - Course name
     * - Number of students
     * - Average grade (formatted to 1 decimal place)
     * - Highest grade
     * - Lowest grade
     * Example format:
     * "Course: TDT4100
     * Students: 25/50
     * Average Grade: 78.5
     * Highest Grade: 95.0
     * Lowest Grade: 45.0"
     *
     * @return a formatted course summary
     */
    public String generateCourseSummary() {
        // TODO Implement the method generateCourseSummary using StringBuilder
        return null;
    }

    /**
     * Returns a List of student names sorted by their grade in descending order.
     *
     * @return a sorted List of student names by grade (descending)
     */
    public List<String> getStudentsByGradeDescending() {
        // TODO Implement the method getStudentsByGradeDescending
        return null;
    }

    /**
     * Returns a Map showing the distribution of letter grades (A, B, C, D, F).
     *
     * @return a Map where keys are letter grades and values are the count of students with that grade
     */
    public java.util.Map<Character, Integer> getGradeDistribution() {
        // TODO Implement the method getGradeDistribution
        return null;
    }

    /**
     * Records the current date as the last update date for a student's grade.
     *
     * @param studentName the name of the student
     */
    public void recordGradeUpdateDate(String studentName) {
        // TODO Implement the method recordGradeUpdateDate
    }

    /**
     * Returns the last date a student's grade was updated.
     *
     * @param studentName the name of the student
     * @return the last update date, or null if never updated
     */
    public java.util.Date getLastGradeUpdateDate(String studentName) {
        // TODO Implement the method getLastGradeUpdateDate
        return null;
    }

    /**
     * Parses a grade from a string and adds it to a student.
     * This method demonstrates wrapper class parsing methods.
     *
     * @param studentName the name of the student
     * @param gradeString the grade as a string (e.g., "85.5")
     * @throws IllegalArgumentException if gradeString cannot be parsed as a double
     * @throws IllegalStateException    if student does not exist or other
     *                                  validation fails
     */
    public void addGradeFromString(String studentName, String gradeString) {
        // TODO Implement the method addGradeFromString using Double.parseDouble()
    }

}