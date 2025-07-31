package p3_mer_om_java.avsluttende;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Set;

/**
 * Comprehensive test suite for StudentGradeManager class.
 * 
 * This test suite covers all functionality including:
 * - Constructor validation and overloading
 * - Student management (add, remove, update)
 * - Grade operations and statistics
 * - Collections usage (Set, List)
 * - String operations and StringBuilder
 * - Wrapper class parsing (Double.parseDouble)
 * - Static methods
 * - Exception handling
 * - Edge cases and boundary conditions
 * 
 * Tests p3_mer_om_java concepts:
 * - Collections (Set, List)
 * - Wrapper classes (Double parsing)
 * - StringBuilder for string building
 * - Enhanced exception handling
 * - Advanced validation patterns
 */
@DisplayName("StudentGradeManager Tests")
public class StudentGradeManagerSimpleTest {

    private StudentGradeManager manager;
    private StudentGradeManager smallManager;

    @BeforeEach
    void setUp() {
        manager = new StudentGradeManager("TDT4100", 100);
        smallManager = new StudentGradeManager("CS101", 3);
    }

    @Nested
    @DisplayName("Constructor Tests")
    class ConstructorTests {

        @Test
        @DisplayName("Should create manager with valid course name and max students")
        void testValidConstructor() {
            StudentGradeManager sgm = new StudentGradeManager("Mathematics", 50);
            assertEquals("Mathematics", sgm.getCourseName());
            assertEquals(50, sgm.getMaxStudents());
            assertEquals(0, sgm.getCurrentStudentCount());
        }

        @Test
        @DisplayName("Should create manager with default capacity using overloaded constructor")
        void testConstructorOverloading() {
            StudentGradeManager sgm = new StudentGradeManager("Physics");
            assertEquals("Physics", sgm.getCourseName());
            assertEquals(50, sgm.getMaxStudents()); // Default capacity
            assertEquals(0, sgm.getCurrentStudentCount());
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for null course name")
        void testNullCourseName() {
            assertThrows(IllegalArgumentException.class, 
                () -> new StudentGradeManager(null, 50));
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for blank course name")
        void testBlankCourseName() {
            assertThrows(IllegalArgumentException.class, 
                () -> new StudentGradeManager("", 50));
            assertThrows(IllegalArgumentException.class, 
                () -> new StudentGradeManager("   ", 50));
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for invalid max students")
        void testInvalidMaxStudents() {
            assertThrows(IllegalArgumentException.class, 
                () -> new StudentGradeManager("Course", 0));
            assertThrows(IllegalArgumentException.class, 
                () -> new StudentGradeManager("Course", -1));
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for null course name in overloaded constructor")
        void testOverloadedConstructorNullCourseName() {
            assertThrows(IllegalArgumentException.class, 
                () -> new StudentGradeManager(null));
            assertThrows(IllegalArgumentException.class, 
                () -> new StudentGradeManager(""));
        }
    }

    @Nested
    @DisplayName("Basic Information Tests")
    class BasicInformationTests {

        @Test
        @DisplayName("Should return correct course name")
        void testGetCourseName() {
            assertEquals("TDT4100", manager.getCourseName());
        }

        @Test
        @DisplayName("Should return correct max students")
        void testGetMaxStudents() {
            assertEquals(100, manager.getMaxStudents());
            assertEquals(3, smallManager.getMaxStudents());
        }

        @Test
        @DisplayName("Should return correct current student count")
        void testGetCurrentStudentCount() {
            assertEquals(0, manager.getCurrentStudentCount());
            
            manager.addStudent("Alice", 85.0);
            assertEquals(1, manager.getCurrentStudentCount());
            
            manager.addStudent("Bob", 90.0);
            assertEquals(2, manager.getCurrentStudentCount());
        }
    }

    @Nested
    @DisplayName("Student Management Tests")
    class StudentManagementTests {

        @Test
        @DisplayName("Should add student with valid name and grade")
        void testAddValidStudent() {
            manager.addStudent("Alice", 85.5);
            assertEquals(1, manager.getCurrentStudentCount());
            assertEquals(85.5, manager.getGrade("Alice"));
        }

        @Test
        @DisplayName("Should add multiple students")
        void testAddMultipleStudents() {
            manager.addStudent("Alice", 85.0);
            manager.addStudent("Bob", 90.0);
            manager.addStudent("Charlie", 78.5);
            
            assertEquals(3, manager.getCurrentStudentCount());
            assertEquals(85.0, manager.getGrade("Alice"));
            assertEquals(90.0, manager.getGrade("Bob"));
            assertEquals(78.5, manager.getGrade("Charlie"));
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for invalid student name")
        void testAddStudentInvalidName() {
            assertThrows(IllegalArgumentException.class, 
                () -> manager.addStudent(null, 85.0));
            assertThrows(IllegalArgumentException.class, 
                () -> manager.addStudent("", 85.0));
            assertThrows(IllegalArgumentException.class, 
                () -> manager.addStudent("   ", 85.0));
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for invalid grade")
        void testAddStudentInvalidGrade() {
            assertThrows(IllegalArgumentException.class, 
                () -> manager.addStudent("Alice", -1.0));
            assertThrows(IllegalArgumentException.class, 
                () -> manager.addStudent("Alice", 100.1));
            assertThrows(IllegalArgumentException.class, 
                () -> manager.addStudent("Alice", Double.NaN));
        }

        @Test
        @DisplayName("Should accept boundary grade values")
        void testAddStudentBoundaryGrades() {
            assertDoesNotThrow(() -> manager.addStudent("Alice", 0.0));
            assertDoesNotThrow(() -> manager.addStudent("Bob", 100.0));
            assertDoesNotThrow(() -> manager.addStudent("Charlie", 50.5));
        }

        @Test
        @DisplayName("Should throw IllegalStateException when adding duplicate student")
        void testAddDuplicateStudent() {
            manager.addStudent("Alice", 85.0);
            assertThrows(IllegalStateException.class, 
                () -> manager.addStudent("Alice", 90.0));
        }

        @Test
        @DisplayName("Should throw IllegalStateException when exceeding max capacity")
        void testAddStudentExceedingCapacity() {
            smallManager.addStudent("Alice", 85.0);
            smallManager.addStudent("Bob", 90.0);
            smallManager.addStudent("Charlie", 78.0);
            
            assertThrows(IllegalStateException.class, 
                () -> smallManager.addStudent("David", 88.0));
        }

        @Test
        @DisplayName("Should update existing student grade")
        void testUpdateStudentGrade() {
            manager.addStudent("Alice", 85.0);
            manager.updateGrade("Alice", 95.0);
            assertEquals(95.0, manager.getGrade("Alice"));
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for invalid update grade")
        void testUpdateGradeInvalid() {
            manager.addStudent("Alice", 85.0);
            assertThrows(IllegalArgumentException.class, 
                () -> manager.updateGrade("Alice", -1.0));
            assertThrows(IllegalArgumentException.class, 
                () -> manager.updateGrade("Alice", 101.0));
        }

        @Test
        @DisplayName("Should throw IllegalStateException when updating non-existent student")
        void testUpdateNonExistentStudent() {
            assertThrows(IllegalStateException.class, 
                () -> manager.updateGrade("NonExistent", 90.0));
        }

        @Test
        @DisplayName("Should remove existing student")
        void testRemoveStudent() {
            manager.addStudent("Alice", 85.0);
            manager.addStudent("Bob", 90.0);
            
            assertTrue(manager.removeStudent("Alice"));
            assertEquals(1, manager.getCurrentStudentCount());
            assertThrows(IllegalStateException.class, 
                () -> manager.getGrade("Alice"));
        }

        @Test
        @DisplayName("Should return false when removing non-existent student")
        void testRemoveNonExistentStudent() {
            manager.addStudent("Alice", 85.0);
            assertFalse(manager.removeStudent("NonExistent"));
            assertEquals(1, manager.getCurrentStudentCount());
        }

        @Test
        @DisplayName("Should throw IllegalStateException when getting grade for non-existent student")
        void testGetGradeNonExistentStudent() {
            assertThrows(IllegalStateException.class, 
                () -> manager.getGrade("NonExistent"));
        }
    }

    @Nested
    @DisplayName("Collections Tests")
    class CollectionsTests {

        @BeforeEach
        void setupStudents() {
            manager.addStudent("Alice", 95.0);
            manager.addStudent("Bob", 87.5);
            manager.addStudent("Charlie", 92.0);
            manager.addStudent("Diana", 78.0);
        }

        @Test
        @DisplayName("Should return Set of all student names")
        void testGetAllStudentNames() {
            Set<String> names = manager.getAllStudentNames();
            assertEquals(4, names.size());
            assertTrue(names.contains("Alice"));
            assertTrue(names.contains("Bob"));
            assertTrue(names.contains("Charlie"));
            assertTrue(names.contains("Diana"));
        }

        @Test
        @DisplayName("Should return List of all grades in order")
        void testGetAllGrades() {
            List<Double> grades = manager.getAllGrades();
            assertEquals(4, grades.size());
            // Should be in order students were added
            assertEquals(95.0, grades.get(0));
            assertEquals(87.5, grades.get(1));
            assertEquals(92.0, grades.get(2));
            assertEquals(78.0, grades.get(3));
        }

        @Test
        @DisplayName("Should return empty collections when no students")
        void testEmptyCollections() {
            StudentGradeManager emptyManager = new StudentGradeManager("Empty", 10);
            assertTrue(emptyManager.getAllStudentNames().isEmpty());
            assertTrue(emptyManager.getAllGrades().isEmpty());
        }

        @Test
        @DisplayName("Should handle defensive copying properly")
        void testDefensiveCopying() {
            Set<String> names = manager.getAllStudentNames();
            List<Double> grades = manager.getAllGrades();
            
            // Modifying returned collections should not affect original
            names.clear();
            grades.clear();
            
            assertEquals(4, manager.getCurrentStudentCount());
            assertEquals(4, manager.getAllStudentNames().size());
            assertEquals(4, manager.getAllGrades().size());
        }
    }

    @Nested
    @DisplayName("Grade Statistics Tests")
    class GradeStatisticsTests {

        @BeforeEach
        void setupStudents() {
            manager.addStudent("Alice", 95.0);
            manager.addStudent("Bob", 87.5);
            manager.addStudent("Charlie", 92.0);
            manager.addStudent("Diana", 78.0);
        }

        @Test
        @DisplayName("Should calculate correct average grade")
        void testAverageGrade() {
            double expected = (95.0 + 87.5 + 92.0 + 78.0) / 4;
            assertEquals(expected, manager.getAverageGrade(), 0.01);
        }

        @Test
        @DisplayName("Should return 0.0 for average when no students")
        void testAverageGradeNoStudents() {
            StudentGradeManager emptyManager = new StudentGradeManager("Empty", 10);
            assertEquals(0.0, emptyManager.getAverageGrade());
        }

        @Test
        @DisplayName("Should return highest grade")
        void testHighestGrade() {
            assertEquals(95.0, manager.getHighestGrade());
        }

        @Test
        @DisplayName("Should return 0.0 for highest grade when no students")
        void testHighestGradeNoStudents() {
            StudentGradeManager emptyManager = new StudentGradeManager("Empty", 10);
            assertEquals(0.0, emptyManager.getHighestGrade());
        }

        @Test
        @DisplayName("Should return lowest grade")
        void testLowestGrade() {
            assertEquals(78.0, manager.getLowestGrade());
        }

        @Test
        @DisplayName("Should return 100.0 for lowest grade when no students")
        void testLowestGradeNoStudents() {
            StudentGradeManager emptyManager = new StudentGradeManager("Empty", 10);
            assertEquals(100.0, emptyManager.getLowestGrade());
        }

        @Test
        @DisplayName("Should count students in grade range correctly")
        void testCountStudentsInGradeRange() {
            assertEquals(2, manager.countStudentsInGradeRange(90.0, 100.0)); // Alice, Charlie
            assertEquals(1, manager.countStudentsInGradeRange(85.0, 89.0)); // Bob
            assertEquals(4, manager.countStudentsInGradeRange(0.0, 100.0)); // All students
            assertEquals(0, manager.countStudentsInGradeRange(60.0, 70.0)); // No students
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for invalid grade range")
        void testCountStudentsInvalidRange() {
            assertThrows(IllegalArgumentException.class, 
                () -> manager.countStudentsInGradeRange(90.0, 80.0)); // min > max
            assertThrows(IllegalArgumentException.class, 
                () -> manager.countStudentsInGradeRange(-1.0, 50.0)); // invalid min
            assertThrows(IllegalArgumentException.class, 
                () -> manager.countStudentsInGradeRange(50.0, 101.0)); // invalid max
        }

        @Test
        @DisplayName("Should return students above threshold sorted alphabetically")
        void testGetStudentsAboveThreshold() {
            List<String> students = manager.getStudentsAboveThreshold(85.0);
            assertEquals(3, students.size());
            
            // Should be sorted alphabetically
            assertEquals("Alice", students.get(0));
            assertEquals("Bob", students.get(1));
            assertEquals("Charlie", students.get(2));
        }

        @Test
        @DisplayName("Should return empty list when no students above threshold")
        void testGetStudentsAboveThresholdEmpty() {
            List<String> students = manager.getStudentsAboveThreshold(100.0);
            assertTrue(students.isEmpty());
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for invalid threshold")
        void testGetStudentsAboveThresholdInvalid() {
            assertThrows(IllegalArgumentException.class, 
                () -> manager.getStudentsAboveThreshold(-1.0));
            assertThrows(IllegalArgumentException.class, 
                () -> manager.getStudentsAboveThreshold(101.0));
        }
    }

    @Nested
    @DisplayName("Static Method Tests")
    class StaticMethodTests {

        @Test
        @DisplayName("Should convert numeric grade to correct letter grade")
        void testConvertToLetterGrade() {
            assertEquals('A', StudentGradeManager.convertToLetterGrade(95.0));
            assertEquals('A', StudentGradeManager.convertToLetterGrade(90.0));
            assertEquals('B', StudentGradeManager.convertToLetterGrade(89.9));
            assertEquals('B', StudentGradeManager.convertToLetterGrade(80.0));
            assertEquals('C', StudentGradeManager.convertToLetterGrade(79.9));
            assertEquals('C', StudentGradeManager.convertToLetterGrade(70.0));
            assertEquals('D', StudentGradeManager.convertToLetterGrade(69.9));
            assertEquals('D', StudentGradeManager.convertToLetterGrade(60.0));
            assertEquals('F', StudentGradeManager.convertToLetterGrade(59.9));
            assertEquals('F', StudentGradeManager.convertToLetterGrade(0.0));
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for invalid numeric grade")
        void testConvertToLetterGradeInvalid() {
            assertThrows(IllegalArgumentException.class, 
                () -> StudentGradeManager.convertToLetterGrade(-1.0));
            assertThrows(IllegalArgumentException.class, 
                () -> StudentGradeManager.convertToLetterGrade(100.1));
            assertThrows(IllegalArgumentException.class, 
                () -> StudentGradeManager.convertToLetterGrade(Double.NaN));
        }
    }

    @Nested
    @DisplayName("String Operations Tests")
    class StringOperationsTests {

        @BeforeEach
        void setupStudents() {
            manager.addStudent("Alice", 95.0);
            manager.addStudent("Bob", 87.5);
            manager.addStudent("Charlie", 78.0);
        }

        @Test
        @DisplayName("Should generate course summary with StringBuilder")
        void testGenerateCourseSummary() {
            String summary = manager.generateCourseSummary();
            
            assertTrue(summary.contains("Course: TDT4100"));
            assertTrue(summary.contains("Students: 3/100"));
            assertTrue(summary.contains("Average Grade: 86.8")); // (95+87.5+78)/3 = 86.83...
            assertTrue(summary.contains("Highest Grade: 95.0"));
            assertTrue(summary.contains("Lowest Grade: 78.0"));
        }

        @Test
        @DisplayName("Should generate proper format for empty course")
        void testGenerateCourseSummaryEmpty() {
            StudentGradeManager emptyManager = new StudentGradeManager("Empty", 10);
            String summary = emptyManager.generateCourseSummary();
            
            assertTrue(summary.contains("Course: Empty"));
            assertTrue(summary.contains("Students: 0/10"));
            assertTrue(summary.contains("Average Grade: 0.0"));
            assertTrue(summary.contains("Highest Grade: 0.0"));
            assertTrue(summary.contains("Lowest Grade: 100.0"));
        }

        @Test
        @DisplayName("Should parse grade from string and update student")
        void testAddGradeFromString() {
            manager.addGradeFromString("Alice", "88.5");
            assertEquals(88.5, manager.getGrade("Alice"));
        }

        @Test
        @DisplayName("Should handle integer strings in addGradeFromString")
        void testAddGradeFromStringInteger() {
            manager.addGradeFromString("Bob", "92");
            assertEquals(92.0, manager.getGrade("Bob"));
        }

        @Test
        @DisplayName("Should throw IllegalArgumentException for invalid grade string")
        void testAddGradeFromStringInvalid() {
            assertThrows(IllegalArgumentException.class, 
                () -> manager.addGradeFromString("Alice", "not-a-number"));
            assertThrows(IllegalArgumentException.class, 
                () -> manager.addGradeFromString("Alice", "150.0")); // Out of range
            assertThrows(IllegalArgumentException.class, 
                () -> manager.addGradeFromString("Alice", "")); // Empty string
        }

        @Test
        @DisplayName("Should throw IllegalStateException for non-existent student in addGradeFromString")
        void testAddGradeFromStringNonExistentStudent() {
            assertThrows(IllegalStateException.class, 
                () -> manager.addGradeFromString("NonExistent", "90.0"));
        }

        @Test
        @DisplayName("Should handle whitespace in grade strings")
        void testAddGradeFromStringWhitespace() {
            manager.addGradeFromString("Alice", "  89.5  ");
            assertEquals(89.5, manager.getGrade("Alice"));
        }
    }

    @Nested
    @DisplayName("Edge Cases and Boundary Tests")
    class EdgeCasesTests {

        @Test
        @DisplayName("Should handle single student correctly")
        void testSingleStudent() {
            manager.addStudent("OnlyStudent", 85.0);
            
            assertEquals(85.0, manager.getAverageGrade());
            assertEquals(85.0, manager.getHighestGrade());
            assertEquals(85.0, manager.getLowestGrade());
            assertEquals(1, manager.getAllStudentNames().size());
            assertEquals(1, manager.getAllGrades().size());
        }

        @Test
        @DisplayName("Should handle boundary capacity correctly")
        void testBoundaryCapacity() {
            StudentGradeManager singleCapacity = new StudentGradeManager("Small", 1);
            singleCapacity.addStudent("OnlyOne", 90.0);
            
            assertThrows(IllegalStateException.class, 
                () -> singleCapacity.addStudent("TooMany", 85.0));
        }

        @Test
        @DisplayName("Should handle grade range boundaries correctly")
        void testGradeBoundaries() {
            assertDoesNotThrow(() -> manager.addStudent("MinGrade", 0.0));
            assertDoesNotThrow(() -> manager.addStudent("MaxGrade", 100.0));
            
            assertEquals(0.0, manager.getGrade("MinGrade"));
            assertEquals(100.0, manager.getGrade("MaxGrade"));
        }

        @Test
        @DisplayName("Should handle empty course operations")
        void testEmptyOperations() {
            StudentGradeManager empty = new StudentGradeManager("Empty", 10);
            
            assertEquals(0, empty.getCurrentStudentCount());
            assertTrue(empty.getAllStudentNames().isEmpty());
            assertTrue(empty.getAllGrades().isEmpty());
            assertEquals(0.0, empty.getAverageGrade());
            assertEquals(0.0, empty.getHighestGrade());
            assertEquals(100.0, empty.getLowestGrade());
            assertEquals(0, empty.countStudentsInGradeRange(0.0, 100.0));
            assertTrue(empty.getStudentsAboveThreshold(50.0).isEmpty());
        }

        @Test
        @DisplayName("Should maintain case sensitivity for student names")
        void testCaseSensitiveNames() {
            manager.addStudent("Alice", 85.0);
            manager.addStudent("alice", 90.0); // Different student
            
            assertEquals(2, manager.getCurrentStudentCount());
            assertEquals(85.0, manager.getGrade("Alice"));
            assertEquals(90.0, manager.getGrade("alice"));
        }

        @Test
        @DisplayName("Should handle names with internal whitespace")
        void testNamesWithWhitespace() {
            assertDoesNotThrow(() -> manager.addStudent("Mary Jane", 90.0));
            assertDoesNotThrow(() -> manager.addStudent("John  Doe", 85.0));
            assertEquals(90.0, manager.getGrade("Mary Jane"));
            assertEquals(85.0, manager.getGrade("John  Doe"));
        }
    }

    @Nested
    @DisplayName("Integration Tests")
    class IntegrationTests {

        @Test
        @DisplayName("Should handle complete student lifecycle")
        void testCompleteStudentLifecycle() {
            // Add students
            manager.addStudent("Alice", 85.0);
            manager.addStudent("Bob", 92.0);
            manager.addStudent("Charlie", 78.0);
            
            // Update grades
            manager.updateGrade("Alice", 95.0);
            
            // Parse grade from string
            manager.addGradeFromString("Bob", "88.5");
            
            // Check statistics
            double avgGrade = manager.getAverageGrade();
            assertTrue(avgGrade > 80.0 && avgGrade < 90.0);
            
            // Check collections
            Set<String> names = manager.getAllStudentNames();
            assertEquals(3, names.size());
            
            // Remove student
            assertTrue(manager.removeStudent("Charlie"));
            assertEquals(2, manager.getCurrentStudentCount());
            
            // Generate summary
            String summary = manager.generateCourseSummary();
            assertTrue(summary.contains("Students: 2/100"));
        }

        @Test
        @DisplayName("Should maintain data consistency after operations")
        void testDataConsistency() {
            // Add multiple students
            for (int i = 1; i <= 10; i++) {
                manager.addStudent("Student" + i, 70.0 + i * 2);
            }
            
            assertEquals(10, manager.getCurrentStudentCount());
            assertEquals(10, manager.getAllStudentNames().size());
            assertEquals(10, manager.getAllGrades().size());
            
            // Remove some students
            manager.removeStudent("Student5");
            manager.removeStudent("Student10");
            
            assertEquals(8, manager.getCurrentStudentCount());
            assertEquals(8, manager.getAllStudentNames().size());
            assertEquals(8, manager.getAllGrades().size());
            
            // Verify removed students don't exist
            assertFalse(manager.getAllStudentNames().contains("Student5"));
            assertFalse(manager.getAllStudentNames().contains("Student10"));
        }

        @Test
        @DisplayName("Should handle complex grade operations")
        void testComplexGradeOperations() {
            // Setup diverse grade distribution
            manager.addStudent("Excellent", 98.0);
            manager.addStudent("VeryGood", 85.0);
            manager.addStudent("Good", 75.0);
            manager.addStudent("Fair", 65.0);
            manager.addStudent("Poor", 45.0);
            
            // Test various statistics
            assertEquals(73.6, manager.getAverageGrade(), 0.1);
            assertEquals(98.0, manager.getHighestGrade());
            assertEquals(45.0, manager.getLowestGrade());
            
            // Test range counting
            assertEquals(1, manager.countStudentsInGradeRange(90.0, 100.0));
            assertEquals(2, manager.countStudentsInGradeRange(70.0, 89.0));
            assertEquals(2, manager.countStudentsInGradeRange(40.0, 69.0));
            
            // Test threshold filtering
            List<String> highPerformers = manager.getStudentsAboveThreshold(80.0);
            assertEquals(2, highPerformers.size());
            assertTrue(highPerformers.contains("Excellent"));
            assertTrue(highPerformers.contains("VeryGood"));
            
            // Test letter grade conversion
            assertEquals('A', StudentGradeManager.convertToLetterGrade(98.0));
            assertEquals('B', StudentGradeManager.convertToLetterGrade(85.0));
            assertEquals('C', StudentGradeManager.convertToLetterGrade(75.0));
            assertEquals('D', StudentGradeManager.convertToLetterGrade(65.0));
            assertEquals('F', StudentGradeManager.convertToLetterGrade(45.0));
        }
    }
}