package p1_intro_java.avsluttende;

/**
 * Implement a class that analyzes names in a list called NameAnalyzer
 * 
 * The expected methods for this class and their behaviour is detailed
 * in the below JavaDoc
 * 
 * 
 * @see NameAnalyzerTests
 */
public class NameAnalyzer {

    // TODO Add any necessary fields here

    /**
     * Constructs the NameAnalyzer object.
     *
     * @param names             the array of names to analyze, of type
     *                          {@link String}[]
     * @param minimumNameLength the minimum length a name must have to be considered
     *                          valid, of type int
     * @throws IllegalArgumentException is thrown if minimumNameLength is less than
     *                                  1
     *                                  or if the names array is null
     */
    public NameAnalyzer(String[] names, int minimumNameLength) {
        // TODO Implement the constructor
    }

    /**
     * Returns the array of names being analyzed.
     *
     * @return the array of names being analyzed
     */
    public String[] getNames() {
        // TODO Implement the method getNames
        return null;
    }

    /**
     * Returns the minimum name length requirement.
     *
     * @return the minimum name length requirement, of type int
     */
    public int getMinimumNameLength() {
        // TODO Implement the method getMinimumNameLength
        return 0;
    }

    /**
     * Counts the total number of names in the array.
     *
     * @return the total number of names, of type int
     */
    public int getTotalNameCount() {
        // TODO Implement the method getTotalNameCount
        return 0;
    }

    /**
     * Counts how many names meet the minimum length requirement.
     * A valid name has length >= minimumNameLength.
     *
     * @return the number of valid names, of type int
     */
    public int getValidNameCount() {
        // TODO Implement the method getValidNameCount
        return 0;
    }

    /**
     * Finds the longest name in the array.
     * If multiple names have the same longest length, return the first one found.
     * If the array is empty, return null.
     *
     * @return the longest name, of type {@link String}
     */
    public String getLongestName() {
        // TODO Implement the method getLongestName
        return null;
    }

    /**
     * Finds the shortest name in the array.
     * If multiple names have the same shortest length, return the first one found.
     * If the array is empty, return null.
     *
     * @return the shortest name, of type {@link String}
     */
    public String getShortestName() {
        // TODO Implement the method getShortestName
        return null;
    }

    /**
     * Calculates the average length of all names in the array.
     * The average should be calculated as a double value.
     * If the array is empty, return 0.0.
     *
     * @return the average name length, of type double
     */
    public double getAverageNameLength() {
        // TODO Implement the method getAverageNameLength
        return 0.0;
    }

    /**
     * Counts how many names start with the specified letter (case-insensitive).
     * For example, if letter is 'A', it should count names starting with 'A' or
     * 'a'.
     *
     * @param letter the letter to search for, of type char
     * @return the number of names starting with the specified letter, of type int
     */
    public int countNamesStartingWith(char letter) {
        // TODO Implement the method countNamesStartingWith
        return 0;
    }

    /**
     * Checks if a specific name exists in the array (case-sensitive).
     *
     * @param name the name to search for, of type {@link String}
     * @return true if the name exists, false otherwise, of type boolean
     */
    public boolean containsName(String name) {
        // TODO Implement the method containsName
        return false;
    }

    /**
     * Returns all names converted to uppercase.
     * The original array should not be modified.
     *
     * @return a new array with all names in uppercase, of type {@link String}[]
     */
    public String[] getNamesInUpperCase() {
        // TODO Implement the method getNamesInUpperCase
        return null;
    }

    /**
     * Replaces all occurrences of oldChar with newChar in all names.
     * The original array should not be modified.
     * Use the String replace method.
     *
     * @param oldChar the character to replace, of type char
     * @param newChar the character to replace with, of type char
     * @return a new array with characters replaced, of type {@link String}[]
     */
    public String[] replaceCharacterInNames(char oldChar, char newChar) {
        // TODO Implement the method replaceCharacterInNames
        return null;
    }

    /**
     * Counts the total number of characters across all names.
     * This should sum up the length of each name in the array.
     *
     * @return the total character count, of type int
     */
    public int getTotalCharacterCount() {
        // TODO Implement the method getTotalCharacterCount
        return 0;
    }

    /**
     * Checks if all names in the array meet the minimum length requirement.
     *
     * @return true if all names are valid, false otherwise, of type boolean
     */
    public boolean areAllNamesValid() {
        // TODO Implement the method areAllNamesValid
        return false;
    }

    /**
     * Counts how many names contain the specified substring (case-insensitive).
     * Use String methods like toLowerCase() and indexOf() to implement this.
     *
     * @param substring the substring to search for, of type {@link String}
     * @return the number of names containing the substring, of type int
     */
    public int countNamesContaining(String substring) {
        // TODO Implement the method countNamesContaining
        return 0;
    }

    /**
     * Returns the name at the specified index.
     * This method demonstrates array access with bounds checking.
     *
     * @param index the index of the name to retrieve, of type int
     * @return the name at the specified index, of type {@link String}
     * @throws IndexOutOfBoundsException if index is less than 0 or >= array length
     */
    public String getNameAtIndex(int index) {
        // TODO Implement the method getNameAtIndex
        return null;
    }
}