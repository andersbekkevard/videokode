package p2_intro_oop.avsluttende;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Library simplified tests")
public class LibraryTest {

    private Library library;
    private Library smallLibrary;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @BeforeEach
    void setUp() {
        library = new Library("Main Library", 100);
        smallLibrary = new Library("Small Library", 3);

        book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        book3 = new Book("1984", "George Orwell");
        book4 = new Book("Animal Farm", "George Orwell");
    }

    // Constructors

    @Test
    void ctor_valid() {
        Library lib = new Library("City Library", 50);
        assertEquals("City Library", lib.getLibraryName());
        assertEquals(50, lib.getMaxCapacity());
        assertEquals(0, lib.getCurrentBookCount());
    }

    @Test
    void ctor_overloaded_defaultCapacity() {
        Library lib = new Library("Public Library");
        assertEquals("Public Library", lib.getLibraryName());
        assertEquals(100, lib.getMaxCapacity());
        assertEquals(0, lib.getCurrentBookCount());
    }

    @Test
    void ctor_invalidName_throws() {
        assertThrows(IllegalArgumentException.class, () -> new Library(null, 10));
        assertThrows(IllegalArgumentException.class, () -> new Library("", 10));
        assertThrows(IllegalArgumentException.class, () -> new Library("   ", 10));
    }

    @Test
    void ctor_invalidCapacity_throws() {
        assertThrows(IllegalArgumentException.class, () -> new Library("X", 0));
        assertThrows(IllegalArgumentException.class, () -> new Library("X", -1));
    }

    // Basic info

    @Test
    void setLibraryName_updates_and_rejects_invalid() {
        library.setLibraryName("Updated");
        assertEquals("Updated", library.getLibraryName());
        assertThrows(IllegalArgumentException.class, () -> library.setLibraryName(null));
        assertThrows(IllegalArgumentException.class, () -> library.setLibraryName(""));
        assertThrows(IllegalArgumentException.class, () -> library.setLibraryName("   "));
    }

    @Test
    void getters_basic() {
        assertEquals("Main Library", library.getLibraryName());
        assertEquals(100, library.getMaxCapacity());
        assertEquals(3, smallLibrary.getMaxCapacity());
    }

    // Book management

    @Test
    void addBook_success_and_count() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getCurrentBookCount());
        assertTrue(library.hasBook(book1));
        assertTrue(library.hasBook(book2));
    }

    @Test
    void addBook_null_throws() {
        assertThrows(IllegalArgumentException.class, () -> library.addBook(null));
    }

    @Test
    void addBook_whenFull_throws() {
        smallLibrary.addBook(book1);
        smallLibrary.addBook(book2);
        smallLibrary.addBook(book3);
        assertThrows(IllegalStateException.class, () -> smallLibrary.addBook(book4));
    }

    @Test
    void removeBook_success_and_nonexistent() {
        library.addBook(book1);
        library.addBook(book2);
        assertTrue(library.removeBook(book1));
        assertFalse(library.removeBook(book3));
        assertEquals(1, library.getCurrentBookCount());
        assertFalse(library.hasBook(book1));
        assertTrue(library.hasBook(book2));
    }

    @Test
    void hasBook_handlesNull() {
        assertFalse(library.hasBook(null));
    }

    // Capacity

    @Test
    void isEmpty_and_isFull_progression() {
        assertTrue(library.isEmpty());
        library.addBook(book1);
        assertFalse(library.isEmpty());
        assertFalse(smallLibrary.isFull());
        smallLibrary.addBook(book1);
        smallLibrary.addBook(book2);
        smallLibrary.addBook(book3);
        assertTrue(smallLibrary.isFull());
    }

    @Test
    void capacityUsagePercentage_basic_and_full() {
        assertEquals(0.0, library.getCapacityUsagePercentage(), 0.001);
        library.addBook(book1);
        assertEquals(1.0, library.getCapacityUsagePercentage(), 0.001);
        smallLibrary.addBook(book1);
        smallLibrary.addBook(book2);
        smallLibrary.addBook(book3);
        assertEquals(100.0, smallLibrary.getCapacityUsagePercentage(), 0.001);
    }

    // Arrays exposure

    @Test
    void getBooks_defensiveCopy_and_empty() {
        assertEquals(0, library.getBooks().length);
        library.addBook(book1);
        library.addBook(book2);
        Book[] copy = library.getBooks();
        assertEquals(2, copy.length);
        copy[0] = null;
        assertNotNull(library.getBooks()[0]);
    }

    @Test
    void getBookTitles_and_empty() {
        assertEquals(0, library.getBookTitles().length);
        library.addBook(book1);
        library.addBook(book2);
        String[] titles = library.getBookTitles();
        assertArrayEquals(new String[] { "The Great Gatsby", "To Kill a Mockingbird" }, titles);
    }

    // Analysis

    @Test
    void countBooksStartingWith() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(2, library.countBooksStartingWith('T'));
        assertEquals(2, library.countBooksStartingWith('t'));
        assertEquals(1, library.countBooksStartingWith('1'));
        assertEquals(0, library.countBooksStartingWith('Z'));
    }

    @Test
    void countBooksByAuthor_caseInsensitive() {
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(2, library.countBooksByAuthor("George Orwell"));
        assertEquals(2, library.countBooksByAuthor("george orwell"));
        assertEquals(0, library.countBooksByAuthor("Unknown"));
    }

    @Test
    void longest_and_shortest_titles_and_average() {
        library.addBook(book1); // 16
        library.addBook(book2); // 21
        library.addBook(book3); // 4
        library.addBook(book4); // 11
        assertEquals("To Kill a Mockingbird", library.getLongestBookTitle());
        assertEquals("1984", library.getShortestBookTitle());
        assertEquals(13.0, library.getAverageBookTitleLength(), 0.001);
    }

    @Test
    void titleAnalytics_emptyLibrary() {
        Library empty = new Library("Empty", 10);
        assertNull(empty.getLongestBookTitle());
        assertNull(empty.getShortestBookTitle());
        assertEquals(0.0, empty.getAverageBookTitleLength(), 0.001);
    }

    // Search

    @Test
    void searchBooks_byTitleSubstring() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        Book[] results = library.searchBooks("Great");
        assertEquals(1, results.length);
        assertEquals("The Great Gatsby", results[0].getTitle());
        assertEquals(1, library.searchBooks("the").length);
        assertEquals(1, library.searchBooks("19").length);
    }

    @Test
    void searchBooksByAuthor_caseInsensitive() {
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(2, library.searchBooksByAuthor("George Orwell").length);
        assertEquals(2, library.searchBooksByAuthor("george orwell").length);
    }

    @Test
    void search_noMatches_and_nullTerms() {
        library.addBook(book1);
        assertEquals(0, library.searchBooks("zzz").length);
        assertEquals(0, library.searchBooksByAuthor("zzz").length);
        assertEquals(0, library.searchBooks(null).length);
        assertEquals(0, library.searchBooksByAuthor(null).length);
    }

    // Static helpers

    @Test
    void isValidLibraryName_rules() {
        assertTrue(Library.isValidLibraryName("Valid Library"));
        assertFalse(Library.isValidLibraryName(null));
        assertFalse(Library.isValidLibraryName(""));
        assertFalse(Library.isValidLibraryName("   "));
    }

    @Test
    void totalLibrariesCreated_increments() {
        int start = Library.getTotalLibrariesCreated();
        new Library("T1", 5);
        assertEquals(start + 1, Library.getTotalLibrariesCreated());
        new Library("T2");
        assertEquals(start + 2, Library.getTotalLibrariesCreated());
    }

    // Object method

    @Test
    void toString_includes_name_and_counts() {
        String s1 = library.toString();
        assertTrue(s1.contains("Library: Main Library"));
        assertTrue(s1.contains("(0/100 books)"));
        library.addBook(book1);
        String s2 = library.toString();
        assertTrue(s2.contains("(1/100 books)"));
    }

    // Integration sanity

    @Test
    void stateConsistency_afterAddsRemoves_searchStillWorks() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.getCurrentBookCount());
        library.removeBook(book2);
        assertEquals(2, library.getCurrentBookCount());
        Book[] titlesSearch = library.searchBooks("1984");
        assertEquals(1, titlesSearch.length);
        assertTrue(library.hasBook(book1));
        assertFalse(library.hasBook(book2));
        assertTrue(library.hasBook(book3));
    }
}
