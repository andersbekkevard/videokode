package p2_intro_oop.avsluttende;

/**
 * Implement a class that represents a library management system called Library
 * 
 * Library manages a fixed-size collection of Book objects.
 * It lets you add or remove books (up to a max capacity), check if a book is
 * present, list the stored books and their titles, search by title or author
 * (case-insensitive), count simple matches, and get basic title stats (longest,
 * shortest, average length). It also exposes the library name, capacity, and
 * current count, reports full/empty, and returns a readable summary string.
 *
 * 
 * 
 * This class uses the Book class to demonstrate proper object composition
 * and working with custom objects rather than just primitive types.
 * 
 * @see LibraryTests
 * @see Book
 */
public class Library {

    // TODO Add any necessary private instance fields here

    // TODO Add any necessary static fields here

    /**
     * Constructs a Library object with the specified name and maximum capacity.
     * The library starts with 0 books.
     *
     * @param libraryName the name of the library, must not be null or blank
     * @param maxCapacity the maximum number of books the library can hold, must be
     *                    greater than 0
     * @throws IllegalArgumentException if libraryName is null or blank, or if
     *                                  maxCapacity is less than or equal to 0
     */
    public Library(String libraryName, int maxCapacity) {
        // TODO Implement the constructor
    }

    /**
     * Constructs a Library object with the specified name and a default capacity of
     * 20 books.
     * This demonstrates constructor overloading.
     *
     * @param libraryName the name of the library, must not be null or blank
     * @throws IllegalArgumentException if libraryName is null or blank
     */
    public Library(String libraryName) {
        // TODO Implement the constructor (use constructor chaining with 'this')
    }

    /**
     * Returns the name of the library.
     *
     * @return the name of the library
     */
    public String getLibraryName() {
        // TODO Implement the method getLibraryName
        return null;
    }

    /**
     * Returns the maximum capacity of the library.
     *
     * @return the maximum capacity of the library
     */
    public int getMaxCapacity() {
        // TODO Implement the method getMaxCapacity
        return 0;
    }

    /**
     * Returns the current number of books in the library.
     *
     * @return the current number of books
     */
    public int getCurrentBookCount() {
        // TODO Implement the method getCurrentBookCount
        return 0;
    }

    /**
     * Returns an array containing all Book objects currently in the library.
     * The returned array should be a defensive copy to prevent external
     * modification.
     *
     * @return an array of Book objects
     */
    public Book[] getBooks() {
        // TODO Implement the method getBooks
        // Hint: Return a defensive copy of your books array
        return null;
    }

    /**
     * Returns an array containing all book titles currently in the library.
     * The returned array should have the same length as the current number of
     * books.
     *
     * @return an array of book titles
     */
    public String[] getBookTitles() {
        // TODO Implement the method getBookTitles
        // Hint: Iterate through your Book array and extract titles
        return null;
    }

    /**
     * Adds a book to the library using a Book object.
     * 
     * @param book the Book object to add, must not be null
     * @throws IllegalArgumentException if book is null
     * @throws IllegalStateException    if the library is at maximum capacity
     */
    public void addBook(Book book) {
        // TODO Implement the method addBook
    }

    /**
     * Removes a specific Book object from the library.
     * If the book is not found, this method should return false.
     *
     * @param book the Book object to remove
     * @return true if the book was removed, false if not found
     */
    public boolean removeBook(Book book) {
        // TODO Implement the method removeBook with Book parameter
        // Hint: Use the Book's equals method for comparison
        return false;
    }

    /**
     * Checks if the library contains the specified Book object.
     *
     * @param book the Book object to search for
     * @return true if the book is found, false otherwise
     */
    public boolean hasBook(Book book) {
        // TODO Implement the method hasBook with Book parameter
        // Hint: Use the Book's equals method for comparison
        return false;
    }

    /**
     * Checks if the library is full (at maximum capacity).
     *
     * @return true if the library is full, false otherwise
     */
    public boolean isFull() {
        // TODO Implement the method isFull
        return false;
    }

    /**
     * Checks if the library is empty (contains no books).
     *
     * @return true if the library is empty, false otherwise
     */
    public boolean isEmpty() {
        // TODO Implement the method isEmpty
        return false;
    }

    /**
     * Returns the percentage of capacity currently used (as a double between 0.0
     * and 100.0).
     * For example, if the library has 25 books and max capacity is 100, this
     * returns 25.0.
     *
     * @return the percentage of capacity used
     */
    public double getCapacityUsagePercentage() {
        // TODO Implement the method getCapacityUsagePercentage
        return 0.0;
    }

    /**
     * Counts how many books have titles starting with the specified letter
     * (case-insensitive).
     *
     * @param letter the letter to search for
     * @return the number of books with titles starting with the specified letter
     */
    public int countBooksStartingWith(char letter) {
        // TODO Implement the method countBooksStartingWith
        return 0;
    }

    /**
     * Counts how many books are written by the specified author
     * (case-insensitive).
     *
     * @param author the author name to search for
     * @return the number of books by the specified author
     */
    public int countBooksByAuthor(String author) {
        // TODO Implement the method countBooksByAuthor
        return 0;
    }

    /**
     * Returns the longest book title in the library.
     * If multiple titles have the same longest length, return the first one found.
     * If the library is empty, return null.
     *
     * @return the longest book title, or null if library is empty
     */
    public String getLongestBookTitle() {
        // TODO Implement the method getLongestBookTitle
        return null;
    }

    /**
     * Returns the shortest book title in the library.
     * If multiple titles have the same shortest length, return the first one found.
     * If the library is empty, return null.
     *
     * @return the shortest book title, or null if library is empty
     */
    public String getShortestBookTitle() {
        // TODO Implement the method getShortestBookTitle
        return null;
    }

    /**
     * Calculates the average length of all book titles.
     * If the library is empty, return 0.0.
     *
     * @return the average length of book titles
     */
    public double getAverageBookTitleLength() {
        // TODO Implement the method getAverageBookTitleLength
        return 0.0;
    }

    /**
     * Changes the name of the library.
     * 
     * @param newName the new name for the library, must not be null or blank
     * @throws IllegalArgumentException if newName is null or blank
     */
    public void setLibraryName(String newName) {
        // TODO Implement the method setLibraryName
    }

    /**
     * Searches for books containing the specified substring in their titles
     * (case-insensitive).
     * Returns an array of matching Book objects.
     *
     * @param searchTerm the substring to search for
     * @return an array of Book objects with titles containing the search term
     */
    public Book[] searchBooks(String searchTerm) {
        // TODO Implement the method searchBooks
        return null;
    }

    /**
     * Searches for books by author name (case-insensitive).
     * Returns an array of Book objects written by the specified author.
     *
     * @param author the author name to search for
     * @return an array of Book objects by the specified author
     */
    public Book[] searchBooksByAuthor(String author) {
        // TODO Implement the method searchBooksByAuthor
        return null;
    }

    /**
     * Static method that returns the total number of Library objects created.
     * This should be incremented each time a Library constructor is called.
     *
     * @return the total number of Library objects created
     */
    public static int getTotalLibrariesCreated() {
        // TODO Implement the static method getTotalLibrariesCreated
        return 0;
    }

    /**
     * Static utility method that validates if a string is a valid library name.
     * A valid library name is not null and not blank (after trimming whitespace).
     *
     * @param name the name to validate
     * @return true if the name is valid, false otherwise
     */
    public static boolean isValidLibraryName(String name) {
        // TODO Implement the static method isValidLibraryName
        return false;
    }
}