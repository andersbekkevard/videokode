package p2_intro_oop.avsluttende;

/**
 * A simple Book class representing a book in a library system.
 * This class is a simple data carrier with just title and author.
 * 
 * This class is provided as a complete implementation for use with the Library exercise.
 */
public class Book {
    
    private String title;
    private String author;
    
    /**
     * Constructs a Book with the specified title and author.
     *
     * @param title the title of the book, must not be null or blank
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
     * Checks if this book equals another object.
     * Two books are equal if they have the same title and author (case-sensitive).
     *
     * @param obj the object to compare with
     * @return true if the books are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author);
    }
    
    /**
     * Returns a hash code for this book based on its title and author.
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode();
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