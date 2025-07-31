package p4_relasjoner.avsluttende;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Implement a helper class that represents a project called Project
 * 
 * This class is used in conjunction with the Employee class to demonstrate
 * many-to-many associations.
 * 
 * The Project class must be in the package p4_relasjoner.avsluttende
 * 
 * This class demonstrates many-to-many associations where multiple employees
 * can work on multiple projects.
 */
public class Project {

    // TODO Add any necessary private instance fields here

    /**
     * Constructs a Project with the specified name and start date.
     *
     * @param projectName the name of the project, must not be null or blank
     * @param startDate the start date of the project, must not be null
     * @throws IllegalArgumentException if projectName is null or blank, or if startDate is null
     */
    public Project(String projectName, LocalDate startDate) {
        // TODO Implement the constructor
    }

    /**
     * Returns the project name.
     *
     * @return the project name
     */
    public String getProjectName() {
        // TODO Implement the method getProjectName
        return null;
    }

    /**
     * Returns the project start date.
     *
     * @return the project start date
     */
    public LocalDate getStartDate() {
        // TODO Implement the method getStartDate
        return null;
    }

    /**
     * Returns a collection of all employees working on this project.
     *
     * @return a collection of employees
     */
    public Collection<Employee> getEmployees() {
        // TODO Implement the method getEmployees
        return null;
    }

    /**
     * Adds an employee to this project (many-to-many association).
     * This should maintain bidirectional consistency.
     * The project should be added to the employee's project list.
     *
     * @param employee the employee to add to the project, must not be null
     * @throws IllegalArgumentException if employee is null
     */
    public void addEmployee(Employee employee) {
        // TODO Implement the method addEmployee with proper bidirectional consistency
    }

    /**
     * Removes an employee from this project (many-to-many association).
     * This should maintain bidirectional consistency.
     * The project should be removed from the employee's project list.
     *
     * @param employee the employee to remove from the project
     * @return true if the employee was removed, false if they were not on the project
     */
    public boolean removeEmployee(Employee employee) {
        // TODO Implement the method removeEmployee with proper bidirectional consistency
        return false;
    }

    /**
     * Checks if an employee is working on this project.
     *
     * @param employee the employee to check
     * @return true if the employee is on the project, false otherwise
     */
    public boolean hasEmployee(Employee employee) {
        // TODO Implement the method hasEmployee
        return false;
    }

    /**
     * Returns the number of employees working on this project.
     *
     * @return the number of employees
     */
    public int getEmployeeCount() {
        // TODO Implement the method getEmployeeCount
        return 0;
    }

    /**
     * Returns a string representation of the project.
     * Format: "Project[name=NAME, startDate=DATE, employees=COUNT]"
     *
     * @return a string representation of this project
     */
    @Override
    public String toString() {
        // TODO Implement the toString method
        return null;
    }
}