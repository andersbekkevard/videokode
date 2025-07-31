package p2_intro_oop.avsluttende;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Comprehensive test suite for Library class.
 * 
 * This test suite covers all functionality including:
 * - Constructor validation and overloading
 * - Book management (add, remove, search)
 * - Capacity management
 * - Book analysis (counting, searching, statistics)
 * - Object composition with Book objects
 * - Static method functionality
 * - Exception handling
 * - Edge cases and boundary conditions
 * 
 * The tests demonstrate p2_intro_oop concepts:
 * - Object creation and encapsulation
 * - Constructor overloading
 * - Method overloading
 * - Object composition
 * - Static vs instance methods
 * - Exception handling
 * - Input validation
 */
@DisplayName("Library Tests")
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

    @Nested
    @DisplayName("Constructor Tests")
    class ConstructorTests {

        @Test
        @DisplayName("Should create library with valid name and capacity")
        void testValidConstructor() {
            Library lib = new Library("City Library", 50);
            assertEquals("City Library", lib.getLibraryName());
            assertEquals(50, lib.getMaxCapacity());
            assertEquals(0, lib.getCurrentBookCount());
        }

        @Test
        @DisplayName("Should create library with default capacity using overloaded constructor")
        void testConstructorOverloading() {
            Library lib = new Library("Public Library");
            assertEquals("Public Library", lib.getLibraryName());
            assertEquals(100, lib.getMaxCapacity()); // Default capacity
            assertEquals(0, lib.getCurrentBookCount());
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for null library name")
        void testNullLibraryName() {
            assertThrows(IllegalArgumentException.class, 
                () -> new Library(null, 50));
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for blank library name")
        void testBlankLibraryName() {
            assertThrows(IllegalArgumentException.class, 
                () -> new Library("", 50));
            assertThrows(IllegalArgumentException.class, 
                () -> new Library("   ", 50));
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for invalid max capacity")
        void testInvalidMaxCapacity() {
            assertThrows(IllegalArgumentException.class, 
                () -> new Library("Library", 0));
            assertThrows(IllegalArgumentException.class, 
                () -> new Library("Library", -1));
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for null name in overloaded constructor")
        void testOverloadedConstructorNullName() {
            assertThrows(IllegalArgumentException.class, 
                () -> new Library(null));
            assertThrows(IllegalArgumentException.class, 
                () -> new Library(""));
        }

        @Test
        @DisplayName("Should increment total libraries created counter")
        void testTotalLibrariesCreated() {
            int initialCount = Library.getTotalLibrariesCreated();
            new Library("Test1", 10);
            new Library("Test2");
            assertEquals(initialCount + 2, Library.getTotalLibrariesCreated());
        }
    }

    @Nested
    @DisplayName("Basic Library Information Tests")
    class BasicInformationTests {

        @Test
        @DisplayName("Should return correct library name")
        void testGetLibraryName() {
            assertEquals("Main Library", library.getLibraryName());
        }

        @Test
        @DisplayName("Should return correct max capacity")
        void testGetMaxCapacity() {
            assertEquals(100, library.getMaxCapacity());
            assertEquals(3, smallLibrary.getMaxCapacity());
        }

        @Test
        @DisplayName("Should return correct current book count")
        void testGetCurrentBookCount() {
            assertEquals(0, library.getCurrentBookCount());
            
            library.addBook(book1);
            assertEquals(1, library.getCurrentBookCount());
            
            library.addBook(book2);
            assertEquals(2, library.getCurrentBookCount());
        }

        @Test
        @DisplayName("Should update library name correctly")
        void testSetLibraryName() {
            library.setLibraryName("Updated Library");
            assertEquals("Updated Library", library.getLibraryName());
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for invalid new name")
        void testSetLibraryNameInvalid() {
            assertThrows(IllegalArgumentException.class, 
                () -> library.setLibraryName(null));
            assertThrows(IllegalArgumentException.class, 
                () -> library.setLibraryName(""));
            assertThrows(IllegalArgumentException.class, 
                () -> library.setLibraryName("   "));
        }
    }

    @Nested
    @DisplayName("Book Management Tests")
    class BookManagementTests {

        @Test
        @DisplayName("Should add book successfully")
        void testAddBook() {
            library.addBook(book1);
            assertEquals(1, library.getCurrentBookCount());
            assertTrue(library.hasBook(book1));
        }

        @Test
        @DisplayName("Should add multiple books")
        void testAddMultipleBooks() {
            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);
            
            assertEquals(3, library.getCurrentBookCount());
            assertTrue(library.hasBook(book1));
            assertTrue(library.hasBook(book2));
            assertTrue(library.hasBook(book3));
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for null book")
        void testAddNullBook() {
            assertThrows(IllegalArgumentException.class, 
                () -> library.addBook(null));
        }

        @Test
        @DisplayName("Should throw IllegalStateException when library is full")
        void testAddBookWhenFull() {
            smallLibrary.addBook(book1);
            smallLibrary.addBook(book2);
            smallLibrary.addBook(book3);
            
            assertThrows(IllegalStateException.class, 
                () -> smallLibrary.addBook(book4));
        }

        @Test
        @DisplayName("Should remove book successfully")
        void testRemoveBook() {
            library.addBook(book1);
            library.addBook(book2);
            
            assertTrue(library.removeBook(book1));
            assertEquals(1, library.getCurrentBookCount());
            assertFalse(library.hasBook(book1));
            assertTrue(library.hasBook(book2));
        }

        @Test
        @DisplayName("Should return false when removing non-existent book")
        void testRemoveNonExistentBook() {
            library.addBook(book1);
            assertFalse(library.removeBook(book2));
            assertEquals(1, library.getCurrentBookCount());
        }

        @Test
        @DisplayName("Should handle null book in removeBook")
        void testRemoveNullBook() {
            assertFalse(library.removeBook(null));
        }

        @Test
        @DisplayName("Should check if library has book correctly")
        void testHasBook() {
            assertFalse(library.hasBook(book1));
            
            library.addBook(book1);
            assertTrue(library.hasBook(book1));
            assertFalse(library.hasBook(book2));
        }

        @Test
        @DisplayName("Should handle null book in hasBook")
        void testHasBookNull() {
            assertFalse(library.hasBook(null));
        }
    }

    @Nested
    @DisplayName("Capacity Management Tests")
    class CapacityTests {

        @Test
        @DisplayName("Should identify empty library correctly")
        void testIsEmpty() {
            assertTrue(library.isEmpty());
            
            library.addBook(book1);
            assertFalse(library.isEmpty());
            
            library.removeBook(book1);
            assertTrue(library.isEmpty());
        }

        @Test
        @DisplayName("Should identify full library correctly")
        void testIsFull() {
            assertFalse(smallLibrary.isFull());
            
            smallLibrary.addBook(book1);
            smallLibrary.addBook(book2);
            assertFalse(smallLibrary.isFull());
            
            smallLibrary.addBook(book3);
            assertTrue(smallLibrary.isFull());
        }

        @Test
        @DisplayName("Should calculate capacity usage percentage correctly")
        void testGetCapacityUsagePercentage() {
            assertEquals(0.0, library.getCapacityUsagePercentage(), 0.001);
            
            library.addBook(book1);
            assertEquals(1.0, library.getCapacityUsagePercentage(), 0.001); // 1/100 = 1%
            
            // Add 24 more books to get 25% usage
            for (int i = 0; i < 24; i++) {
                library.addBook(new Book("Book " + i, "Author " + i));
            }
            assertEquals(25.0, library.getCapacityUsagePercentage(), 0.001);
        }

        @Test
        @DisplayName("Should handle 100% capacity correctly")
        void testFullCapacityPercentage() {
            smallLibrary.addBook(book1);
            smallLibrary.addBook(book2);
            smallLibrary.addBook(book3);
            
            assertEquals(100.0, smallLibrary.getCapacityUsagePercentage(), 0.001);
        }
    }

    @Nested
    @DisplayName("Book Array Access Tests")
    class BookArrayTests {

        @Test
        @DisplayName("Should return defensive copy of books array")
        void testGetBooks() {
            library.addBook(book1);
            library.addBook(book2);
            
            Book[] books = library.getBooks();
            assertEquals(2, books.length);
            
            // Verify it's a defensive copy by modifying returned array
            books[0] = null;
            assertNotNull(library.getBooks()[0]); // Original should be unchanged
        }

        @Test
        @DisplayName("Should return empty array when no books")
        void testGetBooksEmpty() {
            Book[] books = library.getBooks();
            assertNotNull(books);
            assertEquals(0, books.length);
        }

        @Test
        @DisplayName("Should return array of book titles")
        void testGetBookTitles() {
            library.addBook(book1);
            library.addBook(book2);
            
            String[] titles = library.getBookTitles();
            assertEquals(2, titles.length);
            assertEquals("The Great Gatsby", titles[0]);
            assertEquals("To Kill a Mockingbird", titles[1]);
        }

        @Test
        @DisplayName("Should return empty array of titles when no books")
        void testGetBookTitlesEmpty() {
            String[] titles = library.getBookTitles();
            assertNotNull(titles);
            assertEquals(0, titles.length);
        }
    }

    @Nested
    @DisplayName("Book Analysis Tests")
    class BookAnalysisTests {

        @BeforeEach
        void setupBooks() {
            library.addBook(book1); // "The Great Gatsby" by F. Scott Fitzgerald
            library.addBook(book2); // "To Kill a Mockingbird" by Harper Lee
            library.addBook(book3); // "1984" by George Orwell
            library.addBook(book4); // "Animal Farm" by George Orwell
        }

        @Test
        @DisplayName("Should count books starting with specified letter")
        void testCountBooksStartingWith() {
            assertEquals(2, library.countBooksStartingWith('T')); // The Great Gatsby, To Kill a Mockingbird
            assertEquals(2, library.countBooksStartingWith('t')); // Case insensitive
            assertEquals(1, library.countBooksStartingWith('1')); // 1984
            assertEquals(1, library.countBooksStartingWith('A')); // Animal Farm
            assertEquals(0, library.countBooksStartingWith('Z')); // No books
        }

        @Test
        @DisplayName("Should count books by author")
        void testCountBooksByAuthor() {
            assertEquals(2, library.countBooksByAuthor("George Orwell"));
            assertEquals(2, library.countBooksByAuthor("george orwell")); // Case insensitive
            assertEquals(1, library.countBooksByAuthor("Harper Lee"));
            assertEquals(1, library.countBooksByAuthor("F. Scott Fitzgerald"));
            assertEquals(0, library.countBooksByAuthor("Unknown Author"));
        }

        @Test
        @DisplayName("Should find longest book title")
        void testGetLongestBookTitle() {
            assertEquals("To Kill a Mockingbird", library.getLongestBookTitle());
        }

        @Test
        @DisplayName("Should find shortest book title")
        void testGetShortestBookTitle() {
            assertEquals("1984", library.getShortestBookTitle());
        }

        @Test
        @DisplayName("Should return null for longest/shortest title when empty")
        void testTitleAnalysisEmpty() {
            Library emptyLibrary = new Library("Empty", 10);
            assertNull(emptyLibrary.getLongestBookTitle());
            assertNull(emptyLibrary.getShortestBookTitle());
        }

        @Test
        @DisplayName("Should calculate average book title length")
        void testGetAverageBookTitleLength() {
            // "The Great Gatsby" = 16, "To Kill a Mockingbird" = 21, "1984" = 4, "Animal Farm" = 11
            // Average = (16 + 21 + 4 + 11) / 4 = 52 / 4 = 13.0
            assertEquals(13.0, library.getAverageBookTitleLength(), 0.001);
        }

        @Test
        @DisplayName("Should return 0.0 for average title length when empty")
        void testAverageTitleLengthEmpty() {
            Library emptyLibrary = new Library("Empty", 10);
            assertEquals(0.0, emptyLibrary.getAverageBookTitleLength(), 0.001);
        }
    }

    @Nested
    @DisplayName("Book Search Tests")
    class BookSearchTests {

        @BeforeEach
        void setupBooks() {
            library.addBook(book1); // "The Great Gatsby"
            library.addBook(book2); // "To Kill a Mockingbird"
            library.addBook(book3); // "1984"
            library.addBook(book4); // "Animal Farm"
        }

        @Test
        @DisplayName("Should search books by title substring")
        void testSearchBooks() {
            Book[] results = library.searchBooks("Great");
            assertEquals(1, results.length);
            assertEquals("The Great Gatsby", results[0].getTitle());
            
            results = library.searchBooks("the");
            assertEquals(1, results.length); // Case insensitive
            
            results = library.searchBooks("19");
            assertEquals(1, results.length);
            assertEquals("1984", results[0].getTitle());
        }

        @Test
        @DisplayName("Should return empty array when no books match search")
        void testSearchBooksNoMatch() {
            Book[] results = library.searchBooks("Nonexistent");
            assertNotNull(results);
            assertEquals(0, results.length);
        }

        @Test
        @DisplayName("Should search books by author")
        void testSearchBooksByAuthor() {
            Book[] results = library.searchBooksByAuthor("George Orwell");
            assertEquals(2, results.length);
            
            results = library.searchBooksByAuthor("george orwell"); // Case insensitive
            assertEquals(2, results.length);
            
            results = library.searchBooksByAuthor("Harper Lee");
            assertEquals(1, results.length);
            assertEquals("To Kill a Mockingbird", results[0].getTitle());
        }

        @Test
        @DisplayName("Should return empty array when no books by author")
        void testSearchBooksByAuthorNoMatch() {
            Book[] results = library.searchBooksByAuthor("Unknown Author");
            assertNotNull(results);
            assertEquals(0, results.length);
        }

        @Test
        @DisplayName("Should handle null search terms gracefully")
        void testSearchWithNullTerms() {
            Book[] results = library.searchBooks(null);
            assertNotNull(results);
            assertEquals(0, results.length);
            
            results = library.searchBooksByAuthor(null);
            assertNotNull(results);
            assertEquals(0, results.length);
        }
    }

    @Nested
    @DisplayName("Static Method Tests")
    class StaticMethodTests {

        @Test
        @DisplayName("Should validate library names correctly")
        void testIsValidLibraryName() {
            assertTrue(Library.isValidLibraryName("Valid Library"));
            assertTrue(Library.isValidLibraryName("City Library"));
            assertTrue(Library.isValidLibraryName("123 Library"));
            
            assertFalse(Library.isValidLibraryName(null));
            assertFalse(Library.isValidLibraryName(""));
            assertFalse(Library.isValidLibraryName("   "));
            assertFalse(Library.isValidLibraryName("\t\n"));
        }

        @Test
        @DisplayName("Should count total libraries created")
        void testGetTotalLibrariesCreated() {
            int initialCount = Library.getTotalLibrariesCreated();
            
            new Library("Test Library 1", 50);
            assertEquals(initialCount + 1, Library.getTotalLibrariesCreated());
            
            new Library("Test Library 2");
            assertEquals(initialCount + 2, Library.getTotalLibrariesCreated());
        }
    }

    @Nested
    @DisplayName("Object Methods Tests")
    class ObjectMethodsTests {

        @Test
        @DisplayName("Should implement toString correctly")
        void testToString() {
            String result = library.toString();
            assertTrue(result.contains("Library: Main Library"));
            assertTrue(result.contains("(0/100 books)"));
            
            library.addBook(book1);
            library.addBook(book2);
            result = library.toString();
            assertTrue(result.contains("(2/100 books)"));
        }
    }

    @Nested
    @DisplayName("Edge Cases and Integration Tests")
    class EdgeCasesTests {

        @Test
        @DisplayName("Should handle single book operations correctly")
        void testSingleBookOperations() {
            library.addBook(book1);
            
            assertEquals(1, library.getCurrentBookCount());
            assertEquals(1.0, library.getCapacityUsagePercentage(), 0.001);
            assertEquals("The Great Gatsby", library.getLongestBookTitle());
            assertEquals("The Great Gatsby", library.getShortestBookTitle());
            assertEquals(16.0, library.getAverageBookTitleLength(), 0.001);
            
            assertTrue(library.removeBook(book1));
            assertTrue(library.isEmpty());
        }

        @Test
        @DisplayName("Should handle minimum capacity library")
        void testMinimumCapacityLibrary() {
            Library minLibrary = new Library("Min Library", 1);
            
            minLibrary.addBook(book1);
            assertTrue(minLibrary.isFull());
            assertEquals(100.0, minLibrary.getCapacityUsagePercentage(), 0.001);
            
            assertThrows(IllegalStateException.class, 
                () -> minLibrary.addBook(book2));
        }

        @Test
        @DisplayName("Should handle duplicate book additions")
        void testDuplicateBooks() {
            library.addBook(book1);
            library.addBook(book1); // Same book object
            
            assertEquals(2, library.getCurrentBookCount()); // Should allow same object twice
        }

        @Test
        @DisplayName("Should handle equivalent books (same title and author)")
        void testEquivalentBooks() {
            Book book1Copy = new Book("The Great Gatsby", "F. Scott Fitzgerald");
            
            library.addBook(book1);
            library.addBook(book1Copy);
            
            assertEquals(2, library.getCurrentBookCount());
            assertTrue(library.hasBook(book1));
            assertTrue(library.hasBook(book1Copy));
            
            // Removing one should not affect the other
            assertTrue(library.removeBook(book1));
            assertTrue(library.hasBook(book1Copy));
            assertEquals(1, library.getCurrentBookCount());
        }

        @Test
        @DisplayName("Should maintain state consistency after multiple operations")
        void testStateConsistency() {
            // Add books
            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);
            assertEquals(3, library.getCurrentBookCount());
            
            // Remove middle book
            library.removeBook(book2);
            assertEquals(2, library.getCurrentBookCount());
            assertTrue(library.hasBook(book1));
            assertFalse(library.hasBook(book2));
            assertTrue(library.hasBook(book3));
            
            // Verify arrays are consistent
            Book[] books = library.getBooks();
            assertEquals(2, books.length);
            String[] titles = library.getBookTitles();
            assertEquals(2, titles.length);
            
            // Search should work correctly
            Book[] searchResults = library.searchBooks("1984");
            assertEquals(1, searchResults.length);
        }

        @Test
        @DisplayName("Should handle large number of books efficiently")
        void testManyBooks() {
            Library largeLibrary = new Library("Large Library", 1000);
            
            // Add 500 books
            for (int i = 0; i < 500; i++) {
                largeLibrary.addBook(new Book("Book " + i, "Author " + (i % 10)));
            }
            
            assertEquals(500, largeLibrary.getCurrentBookCount());
            assertEquals(50.0, largeLibrary.getCapacityUsagePercentage(), 0.001);
            assertFalse(largeLibrary.isFull());
            
            // Test search functionality with many books
            Book[] authorResults = largeLibrary.searchBooksByAuthor("Author 5");
            assertEquals(50, authorResults.length); // Every 10th book has "Author 5"
        }
    }
}