package p1_intro_java.avsluttende;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Comprehensive test suite for TextAndNumberUtils class.
 * 
 * This test suite covers all static methods in the TextAndNumberUtils class,
 * testing both normal cases and edge cases including:
 * - Null inputs
 * - Empty arrays/strings
 * - Single element arrays
 * - Arrays with duplicate elements
 * - Case sensitivity handling
 * - Boundary conditions
 * - Method overloading
 * 
 * The tests are organized into nested classes by functionality for clarity.
 */
@DisplayName("TextAndNumberUtils Tests")
public class TextAndNumberUtilsTest {

    @Nested
    @DisplayName("Number Array Analysis Tests")
    class NumberArrayAnalysisTests {

        @Test
        @DisplayName("Should calculate sum of positive numbers")
        void testCalculateSumPositive() {
            int[] numbers = {1, 2, 3, 4, 5};
            assertEquals(15, TextAndNumberUtils.calculateSum(numbers));
        }

        @Test
        @DisplayName("Should calculate sum with negative numbers")
        void testCalculateSumWithNegatives() {
            int[] numbers = {-2, -1, 0, 1, 2};
            assertEquals(0, TextAndNumberUtils.calculateSum(numbers));
        }

        @Test
        @DisplayName("Should return 0 for null array in calculateSum")
        void testCalculateSumNull() {
            assertEquals(0, TextAndNumberUtils.calculateSum(null));
        }

        @Test
        @DisplayName("Should return 0 for empty array in calculateSum")
        void testCalculateSumEmpty() {
            assertEquals(0, TextAndNumberUtils.calculateSum(new int[]{}));
        }

        @Test
        @DisplayName("Should find maximum in positive array")
        void testFindMaximumPositive() {
            int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6};
            assertEquals(9, TextAndNumberUtils.findMaximum(numbers));
        }

        @Test
        @DisplayName("Should find maximum with negative numbers")
        void testFindMaximumWithNegatives() {
            int[] numbers = {-5, -2, -8, -1, -3};
            assertEquals(-1, TextAndNumberUtils.findMaximum(numbers));
        }

        @Test
        @DisplayName("Should return Integer.MIN_VALUE for null array in findMaximum")
        void testFindMaximumNull() {
            assertEquals(Integer.MIN_VALUE, TextAndNumberUtils.findMaximum(null));
        }

        @Test
        @DisplayName("Should return Integer.MIN_VALUE for empty array in findMaximum")
        void testFindMaximumEmpty() {
            assertEquals(Integer.MIN_VALUE, TextAndNumberUtils.findMaximum(new int[]{}));
        }

        @Test
        @DisplayName("Should find minimum in positive array")
        void testFindMinimumPositive() {
            int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6};
            assertEquals(1, TextAndNumberUtils.findMinimum(numbers));
        }

        @Test
        @DisplayName("Should find minimum with negative numbers")
        void testFindMinimumWithNegatives() {
            int[] numbers = {-5, -2, -8, -1, -3};
            assertEquals(-8, TextAndNumberUtils.findMinimum(numbers));
        }

        @Test
        @DisplayName("Should return Integer.MAX_VALUE for null array in findMinimum")
        void testFindMinimumNull() {
            assertEquals(Integer.MAX_VALUE, TextAndNumberUtils.findMinimum(null));
        }

        @Test
        @DisplayName("Should return Integer.MAX_VALUE for empty array in findMinimum")
        void testFindMinimumEmpty() {
            assertEquals(Integer.MAX_VALUE, TextAndNumberUtils.findMinimum(new int[]{}));
        }

        @Test
        @DisplayName("Should calculate average correctly")
        void testCalculateAverage() {
            int[] numbers = {2, 4, 6, 8, 10};
            assertEquals(6.0, TextAndNumberUtils.calculateAverage(numbers), 0.001);
        }

        @Test
        @DisplayName("Should calculate average with decimals")
        void testCalculateAverageWithDecimals() {
            int[] numbers = {1, 2, 3};
            assertEquals(2.0, TextAndNumberUtils.calculateAverage(numbers), 0.001);
        }

        @Test
        @DisplayName("Should return 0.0 for null array in calculateAverage")
        void testCalculateAverageNull() {
            assertEquals(0.0, TextAndNumberUtils.calculateAverage(null), 0.001);
        }

        @Test
        @DisplayName("Should return 0.0 for empty array in calculateAverage")
        void testCalculateAverageEmpty() {
            assertEquals(0.0, TextAndNumberUtils.calculateAverage(new int[]{}), 0.001);
        }
    }

    @Nested
    @DisplayName("Even/Odd Number Tests")
    class EvenOddTests {

        @Test
        @DisplayName("Should count even numbers correctly")
        void testCountEvenNumbers() {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            assertEquals(5, TextAndNumberUtils.countEvenNumbers(numbers));
        }

        @Test
        @DisplayName("Should count even numbers including zero")
        void testCountEvenNumbersWithZero() {
            int[] numbers = {0, 1, 2, 3, 4};
            assertEquals(3, TextAndNumberUtils.countEvenNumbers(numbers)); // 0, 2, 4
        }

        @Test
        @DisplayName("Should return 0 for null array in countEvenNumbers")
        void testCountEvenNumbersNull() {
            assertEquals(0, TextAndNumberUtils.countEvenNumbers(null));
        }

        @Test
        @DisplayName("Should count odd numbers correctly")
        void testCountOddNumbers() {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            assertEquals(5, TextAndNumberUtils.countOddNumbers(numbers));
        }

        @Test
        @DisplayName("Should count odd numbers with negatives")
        void testCountOddNumbersWithNegatives() {
            int[] numbers = {-3, -2, -1, 0, 1, 2, 3};
            assertEquals(4, TextAndNumberUtils.countOddNumbers(numbers)); // -3, -1, 1, 3
        }

        @Test
        @DisplayName("Should return 0 for null array in countOddNumbers")
        void testCountOddNumbersNull() {
            assertEquals(0, TextAndNumberUtils.countOddNumbers(null));
        }
    }

    @Nested
    @DisplayName("Prime Number Tests")
    class PrimeNumberTests {

        @Test
        @DisplayName("Should identify prime numbers correctly")
        void testIsPrime() {
            assertTrue(TextAndNumberUtils.isPrime(2));
            assertTrue(TextAndNumberUtils.isPrime(3));
            assertTrue(TextAndNumberUtils.isPrime(5));
            assertTrue(TextAndNumberUtils.isPrime(7));
            assertTrue(TextAndNumberUtils.isPrime(11));
            assertTrue(TextAndNumberUtils.isPrime(13));
        }

        @Test
        @DisplayName("Should identify non-prime numbers correctly")
        void testIsNotPrime() {
            assertFalse(TextAndNumberUtils.isPrime(1));
            assertFalse(TextAndNumberUtils.isPrime(4));
            assertFalse(TextAndNumberUtils.isPrime(6));
            assertFalse(TextAndNumberUtils.isPrime(8));
            assertFalse(TextAndNumberUtils.isPrime(9));
            assertFalse(TextAndNumberUtils.isPrime(10));
        }

        @Test
        @DisplayName("Should handle edge cases for isPrime")
        void testIsPrimeEdgeCases() {
            assertFalse(TextAndNumberUtils.isPrime(0));
            assertFalse(TextAndNumberUtils.isPrime(-1));
            assertFalse(TextAndNumberUtils.isPrime(-5));
        }

        @Test
        @DisplayName("Should count prime numbers in array")
        void testCountPrimeNumbers() {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            assertEquals(4, TextAndNumberUtils.countPrimeNumbers(numbers)); // 2, 3, 5, 7
        }

        @Test
        @DisplayName("Should return 0 for null array in countPrimeNumbers")
        void testCountPrimeNumbersNull() {
            assertEquals(0, TextAndNumberUtils.countPrimeNumbers(null));
        }
    }

    @Nested
    @DisplayName("Array Manipulation Tests")
    class ArrayManipulationTests {

        @Test
        @DisplayName("Should reverse array correctly")
        void testReverseArray() {
            int[] numbers = {1, 2, 3, 4, 5};
            int[] expected = {5, 4, 3, 2, 1};
            assertArrayEquals(expected, TextAndNumberUtils.reverseArray(numbers));
        }

        @Test
        @DisplayName("Should reverse single element array")
        void testReverseArraySingleElement() {
            int[] numbers = {42};
            int[] expected = {42};
            assertArrayEquals(expected, TextAndNumberUtils.reverseArray(numbers));
        }

        @Test
        @DisplayName("Should return null for null array in reverseArray")
        void testReverseArrayNull() {
            assertNull(TextAndNumberUtils.reverseArray(null));
        }

        @Test
        @DisplayName("Should return empty array for empty input in reverseArray")
        void testReverseArrayEmpty() {
            int[] empty = {};
            assertArrayEquals(empty, TextAndNumberUtils.reverseArray(empty));
        }

        @Test
        @DisplayName("Should get positive numbers only")
        void testGetPositiveNumbers() {
            int[] numbers = {-3, -1, 0, 1, 2, 5, -2, 8};
            int[] expected = {1, 2, 5, 8};
            assertArrayEquals(expected, TextAndNumberUtils.getPositiveNumbers(numbers));
        }

        @Test
        @DisplayName("Should return empty array when no positive numbers")
        void testGetPositiveNumbersNone() {
            int[] numbers = {-5, -3, -1, 0};
            int[] expected = {};
            assertArrayEquals(expected, TextAndNumberUtils.getPositiveNumbers(numbers));
        }

        @Test
        @DisplayName("Should return empty array for null input in getPositiveNumbers")
        void testGetPositiveNumbersNull() {
            assertArrayEquals(new int[]{}, TextAndNumberUtils.getPositiveNumbers(null));
        }
    }

    @Nested
    @DisplayName("String Analysis Tests")
    class StringAnalysisTests {

        @Test
        @DisplayName("Should count total characters across strings")
        void testGetTotalCharacterCount() {
            String[] texts = {"hello", "world", "java"};
            assertEquals(14, TextAndNumberUtils.getTotalCharacterCount(texts)); // 5+5+4
        }

        @Test
        @DisplayName("Should return 0 for null array in getTotalCharacterCount")
        void testGetTotalCharacterCountNull() {
            assertEquals(0, TextAndNumberUtils.getTotalCharacterCount(null));
        }

        @Test
        @DisplayName("Should handle empty strings in getTotalCharacterCount")
        void testGetTotalCharacterCountWithEmpty() {
            String[] texts = {"hello", "", "world"};
            assertEquals(10, TextAndNumberUtils.getTotalCharacterCount(texts)); // 5+0+5
        }

        @Test
        @DisplayName("Should find longest string")
        void testFindLongestString() {
            String[] texts = {"hi", "hello", "programming", "java"};
            assertEquals("programming", TextAndNumberUtils.findLongestString(texts));
        }

        @Test
        @DisplayName("Should return first longest string when multiple have same length")
        void testFindLongestStringTie() {
            String[] texts = {"hello", "world", "java"};
            assertEquals("hello", TextAndNumberUtils.findLongestString(texts)); // First 5-letter word
        }

        @Test
        @DisplayName("Should return null for null array in findLongestString")
        void testFindLongestStringNull() {
            assertNull(TextAndNumberUtils.findLongestString(null));
        }

        @Test
        @DisplayName("Should find shortest string")
        void testFindShortestString() {
            String[] texts = {"programming", "hi", "hello", "java"};
            assertEquals("hi", TextAndNumberUtils.findShortestString(texts));
        }

        @Test
        @DisplayName("Should return first shortest string when multiple have same length")
        void testFindShortestStringTie() {
            String[] texts = {"hello", "world", "hi", "go"};
            assertEquals("hi", TextAndNumberUtils.findShortestString(texts)); // First 2-letter word
        }

        @Test
        @DisplayName("Should return null for null array in findShortestString")
        void testFindShortestStringNull() {
            assertNull(TextAndNumberUtils.findShortestString(null));
        }
    }

    @Nested
    @DisplayName("String Pattern Matching Tests")
    class StringPatternTests {

        @Test
        @DisplayName("Should count strings starting with character (case-insensitive)")
        void testCountStringsStartingWith() {
            String[] texts = {"Hello", "hello", "Hi", "world", "HELP"};
            assertEquals(3, TextAndNumberUtils.countStringsStartingWith(texts, 'h')); // Hello, hello, HELP
            assertEquals(3, TextAndNumberUtils.countStringsStartingWith(texts, 'H')); // Same result
        }

        @Test
        @DisplayName("Should return 0 for null array in countStringsStartingWith")
        void testCountStringsStartingWithNull() {
            assertEquals(0, TextAndNumberUtils.countStringsStartingWith(null, 'a'));
        }

        @Test
        @DisplayName("Should count strings containing substring (case-insensitive)")
        void testCountStringsContaining() {
            String[] texts = {"Hello", "help", "world", "HELP", "helping"};
            assertEquals(3, TextAndNumberUtils.countStringsContaining(texts, "help")); // help, HELP, helping
            assertEquals(3, TextAndNumberUtils.countStringsContaining(texts, "HELP")); // Same result
        }

        @Test
        @DisplayName("Should return 0 for null array in countStringsContaining")
        void testCountStringsContainingNull() {
            assertEquals(0, TextAndNumberUtils.countStringsContaining(null, "test"));
        }
    }

    @Nested
    @DisplayName("String Transformation Tests")
    class StringTransformationTests {

        @Test
        @DisplayName("Should convert all strings to uppercase")
        void testConvertToUpperCase() {
            String[] texts = {"hello", "World", "JAVA"};
            String[] expected = {"HELLO", "WORLD", "JAVA"};
            assertArrayEquals(expected, TextAndNumberUtils.convertToUpperCase(texts));
        }

        @Test
        @DisplayName("Should return null for null input in convertToUpperCase")
        void testConvertToUpperCaseNull() {
            assertNull(TextAndNumberUtils.convertToUpperCase(null));
        }

        @Test
        @DisplayName("Should convert all strings to lowercase")
        void testConvertToLowerCase() {
            String[] texts = {"HELLO", "World", "java"};
            String[] expected = {"hello", "world", "java"};
            assertArrayEquals(expected, TextAndNumberUtils.convertToLowerCase(texts));
        }

        @Test
        @DisplayName("Should return null for null input in convertToLowerCase")
        void testConvertToLowerCaseNull() {
            assertNull(TextAndNumberUtils.convertToLowerCase(null));
        }

        @Test
        @DisplayName("Should remove spaces from all strings")
        void testRemoveSpaces() {
            String[] texts = {"hello world", "java programming", "no spaces"};
            String[] expected = {"helloworld", "javaprogramming", "nospaces"};
            assertArrayEquals(expected, TextAndNumberUtils.removeSpaces(texts));
        }

        @Test
        @DisplayName("Should return null for null input in removeSpaces")
        void testRemoveSpacesNull() {
            assertNull(TextAndNumberUtils.removeSpaces(null));
        }
    }

    @Nested
    @DisplayName("Palindrome Tests")
    class PalindromeTests {

        @Test
        @DisplayName("Should identify palindromes correctly (case-insensitive)")
        void testIsPalindrome() {
            assertTrue(TextAndNumberUtils.isPalindrome("racecar"));
            assertTrue(TextAndNumberUtils.isPalindrome("RaceCar"));
            assertTrue(TextAndNumberUtils.isPalindrome("A man a plan a canal Panama"));
            assertTrue(TextAndNumberUtils.isPalindrome("Was it a car or a cat I saw"));
        }

        @Test
        @DisplayName("Should identify non-palindromes correctly")
        void testIsNotPalindrome() {
            assertFalse(TextAndNumberUtils.isPalindrome("hello"));
            assertFalse(TextAndNumberUtils.isPalindrome("world"));
            assertFalse(TextAndNumberUtils.isPalindrome("programming"));
        }

        @Test
        @DisplayName("Should handle edge cases for isPalindrome")
        void testIsPalindromeEdgeCases() {
            assertTrue(TextAndNumberUtils.isPalindrome(""));
            assertTrue(TextAndNumberUtils.isPalindrome("a"));
            assertFalse(TextAndNumberUtils.isPalindrome(null));
        }

        @Test
        @DisplayName("Should count palindromes in array")
        void testCountPalindromes() {
            String[] texts = {"racecar", "hello", "level", "world", "noon"};
            assertEquals(3, TextAndNumberUtils.countPalindromes(texts)); // racecar, level, noon
        }

        @Test
        @DisplayName("Should return 0 for null array in countPalindromes")
        void testCountPalindromesNull() {
            assertEquals(0, TextAndNumberUtils.countPalindromes(null));
        }
    }

    @Nested
    @DisplayName("Vowel and Consonant Tests")
    class VowelConsonantTests {

        @Test
        @DisplayName("Should count vowels correctly (case-insensitive)")
        void testCountVowels() {
            assertEquals(5, TextAndNumberUtils.countVowels("programming")); // o, a, i
            assertEquals(3, TextAndNumberUtils.countVowels("HELLO")); // E, O
            assertEquals(5, TextAndNumberUtils.countVowels("aeiou"));
            assertEquals(5, TextAndNumberUtils.countVowels("AEIOU"));
        }

        @Test
        @DisplayName("Should return 0 for null string in countVowels")
        void testCountVowelsNull() {
            assertEquals(0, TextAndNumberUtils.countVowels(null));
        }

        @Test
        @DisplayName("Should count consonants correctly")
        void testCountConsonants() {
            assertEquals(7, TextAndNumberUtils.countConsonants("programming")); // p,r,g,r,m,m,n,g
            assertEquals(3, TextAndNumberUtils.countConsonants("HELLO")); // H,L,L
        }

        @Test
        @DisplayName("Should return 0 for null string in countConsonants")
        void testCountConsonantsNull() {
            assertEquals(0, TextAndNumberUtils.countConsonants(null));
        }

        @Test
        @DisplayName("Should handle non-letter characters in vowel/consonant counts")
        void testVowelConsonantWithNonLetters() {
            assertEquals(2, TextAndNumberUtils.countVowels("hello123!")); // e, o
            assertEquals(3, TextAndNumberUtils.countConsonants("hello123!")); // h, l, l
        }
    }

    @Nested
    @DisplayName("Character Replacement Tests")
    class CharacterReplacementTests {

        @Test
        @DisplayName("Should replace characters in all strings")
        void testReplaceCharacterInAllStrings() {
            String[] texts = {"hello", "help", "world"};
            String[] expected = {"hexlo", "hexp", "worxd"};
            assertArrayEquals(expected, TextAndNumberUtils.replaceCharacterInAllStrings(texts, 'l', 'x'));
        }

        @Test
        @DisplayName("Should return null for null input in replaceCharacterInAllStrings")
        void testReplaceCharacterInAllStringsNull() {
            assertNull(TextAndNumberUtils.replaceCharacterInAllStrings(null, 'a', 'b'));
        }
    }

    @Nested
    @DisplayName("Advanced Array Tests")
    class AdvancedArrayTests {

        @Test
        @DisplayName("Should create digit frequency array")
        void testGetDigitFrequency() {
            int[] numbers = {1, 2, 2, 3, 3, 3, 0, 9};
            int[] result = TextAndNumberUtils.getDigitFrequency(numbers);
            int[] expected = {1, 1, 2, 3, 0, 0, 0, 0, 0, 1}; // counts for 0-9
            assertArrayEquals(expected, result);
        }

        @Test
        @DisplayName("Should return null for null input in getDigitFrequency")
        void testGetDigitFrequencyNull() {
            assertNull(TextAndNumberUtils.getDigitFrequency(null));
        }

        @Test
        @DisplayName("Should check if integer arrays have same elements")
        void testArraysHaveSameElementsInt() {
            int[] array1 = {1, 2, 3, 4};
            int[] array2 = {4, 3, 2, 1};
            int[] array3 = {1, 2, 3, 5};
            
            assertTrue(TextAndNumberUtils.arraysHaveSameElements(array1, array2));
            assertFalse(TextAndNumberUtils.arraysHaveSameElements(array1, array3));
        }

        @Test
        @DisplayName("Should handle null arrays in arraysHaveSameElements (int)")
        void testArraysHaveSameElementsIntNull() {
            int[] array1 = {1, 2, 3};
            assertFalse(TextAndNumberUtils.arraysHaveSameElements(array1, null));
            assertFalse(TextAndNumberUtils.arraysHaveSameElements(null, array1));
            assertTrue(TextAndNumberUtils.arraysHaveSameElements((int[])null, (int[])null));
        }

        @Test
        @DisplayName("Should check if string arrays have same elements")
        void testArraysHaveSameElementsString() {
            String[] array1 = {"hello", "world", "java"};
            String[] array2 = {"java", "hello", "world"};
            String[] array3 = {"hello", "world", "python"};
            
            assertTrue(TextAndNumberUtils.arraysHaveSameElements(array1, array2));
            assertFalse(TextAndNumberUtils.arraysHaveSameElements(array1, array3));
        }

        @Test
        @DisplayName("Should handle null arrays in arraysHaveSameElements (String)")
        void testArraysHaveSameElementsStringNull() {
            String[] array1 = {"hello", "world"};
            assertFalse(TextAndNumberUtils.arraysHaveSameElements(array1, null));
            assertFalse(TextAndNumberUtils.arraysHaveSameElements(null, array1));
            assertTrue(TextAndNumberUtils.arraysHaveSameElements((String[])null, (String[])null));
        }
    }

    @Nested
    @DisplayName("String Join and Split Tests")
    class StringJoinSplitTests {

        @Test
        @DisplayName("Should join strings with delimiter")
        void testJoinStrings() {
            String[] texts = {"hello", "wonderful", "world"};
            assertEquals("hello, wonderful, world", TextAndNumberUtils.joinStrings(texts, ", "));
            assertEquals("hello-wonderful-world", TextAndNumberUtils.joinStrings(texts, "-"));
        }

        @Test
        @DisplayName("Should return empty string for null array in joinStrings")
        void testJoinStringsNull() {
            assertEquals("", TextAndNumberUtils.joinStrings(null, ","));
        }

        @Test
        @DisplayName("Should return empty string for empty array in joinStrings")
        void testJoinStringsEmpty() {
            assertEquals("", TextAndNumberUtils.joinStrings(new String[]{}, ","));
        }

        @Test
        @DisplayName("Should handle single element in joinStrings")
        void testJoinStringsSingle() {
            String[] texts = {"hello"};
            assertEquals("hello", TextAndNumberUtils.joinStrings(texts, ", "));
        }

        @Test
        @DisplayName("Should split string into words")
        void testSplitIntoWords() {
            String text = "hello wonderful world";
            String[] expected = {"hello", "wonderful", "world"};
            assertArrayEquals(expected, TextAndNumberUtils.splitIntoWords(text));
        }

        @Test
        @DisplayName("Should handle multiple spaces in splitIntoWords")
        void testSplitIntoWordsMultipleSpaces() {
            String text = "hello    wonderful     world";
            String[] expected = {"hello", "wonderful", "world"};
            assertArrayEquals(expected, TextAndNumberUtils.splitIntoWords(text));
        }

        @Test
        @DisplayName("Should return empty array for null string in splitIntoWords")
        void testSplitIntoWordsNull() {
            assertArrayEquals(new String[]{}, TextAndNumberUtils.splitIntoWords(null));
        }

        @Test
        @DisplayName("Should return empty array for empty string in splitIntoWords")
        void testSplitIntoWordsEmpty() {
            assertArrayEquals(new String[]{}, TextAndNumberUtils.splitIntoWords(""));
            assertArrayEquals(new String[]{}, TextAndNumberUtils.splitIntoWords("   "));
        }
    }

    @Nested
    @DisplayName("Edge Cases and Integration Tests")
    class EdgeCasesTests {

        @Test
        @DisplayName("Should handle arrays with duplicate elements")
        void testDuplicateElements() {
            int[] numbers = {1, 1, 2, 2, 3, 3};
            assertEquals(12, TextAndNumberUtils.calculateSum(numbers));
            assertEquals(3, TextAndNumberUtils.findMaximum(numbers));
            assertEquals(1, TextAndNumberUtils.findMinimum(numbers));
        }

        @Test
        @DisplayName("Should handle single element arrays")
        void testSingleElementArrays() {
            int[] singleNumber = {42};
            assertEquals(42, TextAndNumberUtils.calculateSum(singleNumber));
            assertEquals(42, TextAndNumberUtils.findMaximum(singleNumber));
            assertEquals(42, TextAndNumberUtils.findMinimum(singleNumber));
            assertEquals(42.0, TextAndNumberUtils.calculateAverage(singleNumber), 0.001);

            String[] singleString = {"hello"};
            assertEquals(5, TextAndNumberUtils.getTotalCharacterCount(singleString));
            assertEquals("hello", TextAndNumberUtils.findLongestString(singleString));
            assertEquals("hello", TextAndNumberUtils.findShortestString(singleString));
        }

        @Test
        @DisplayName("Should handle arrays with all same elements")
        void testAllSameElements() {
            int[] sameNumbers = {5, 5, 5, 5, 5};
            assertEquals(25, TextAndNumberUtils.calculateSum(sameNumbers));
            assertEquals(5, TextAndNumberUtils.findMaximum(sameNumbers));
            assertEquals(5, TextAndNumberUtils.findMinimum(sameNumbers));
            assertEquals(5.0, TextAndNumberUtils.calculateAverage(sameNumbers), 0.001);

            String[] sameStrings = {"test", "test", "test"};
            assertEquals(12, TextAndNumberUtils.getTotalCharacterCount(sameStrings));
            assertEquals("test", TextAndNumberUtils.findLongestString(sameStrings));
            assertEquals("test", TextAndNumberUtils.findShortestString(sameStrings));
        }

        @Test
        @DisplayName("Should handle extreme values")
        void testExtremeValues() {
            int[] extremes = {Integer.MIN_VALUE, Integer.MAX_VALUE, 0};
            assertEquals(Integer.MAX_VALUE, TextAndNumberUtils.findMaximum(extremes));
            assertEquals(Integer.MIN_VALUE, TextAndNumberUtils.findMinimum(extremes));
        }
    }
}