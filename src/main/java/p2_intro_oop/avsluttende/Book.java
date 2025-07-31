package p2_intro_oop.avsluttende;

/**
 * A simple Book class representing a book in a library system.
 * This class is a simple data carrier with just title and author.
 * 
 * This class is provided as a complete implementation for use with the Library
 * exercise.
 */
public class Book {

    private String title;
    private String author;

    /**
     * Constructs a Book with the specified title and author.
     *
     * @param title  the title of the book, must not be null or blank
     * @param author the author of the book, must not be null or blank
     * @throws IllegalArgumentException if title or author is invalid
     */
    public Book(String title, String author) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or blank");
        }

        this.title = title.trim();
        this.author = author.trim();
    }

    /**
     * Returns the title of the book.
     *
     * @return the book title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the author of the book.
     *
     * @return the book author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns a string representation of the book.
     *
     * @return a formatted string with book details
     */
    @Override
    public String toString() {
        return String.format("Book[title='%s', author='%s']", title, author);
    }
}