package p1_intro_java.s4_password_checker;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

	// Test isLongEnough method
	@Test
	public void testIsLongEnough_ValidLength() {
		assertTrue(PasswordChecker.isLongEnough("12345678"));
		assertTrue(PasswordChecker.isLongEnough("verylongpassword"));
	}

	@Test
	public void testIsLongEnough_InvalidLength() {
		assertFalse(PasswordChecker.isLongEnough("short"));
		assertFalse(PasswordChecker.isLongEnough("1234567"));
		assertFalse(PasswordChecker.isLongEnough(""));
	}

	// Test containsLetter method
	@Test
	public void testContainsLetter_HasLetters() {
		assertTrue(PasswordChecker.containsLetter("password123"));
		assertTrue(PasswordChecker.containsLetter("ABC123"));
		assertTrue(PasswordChecker.containsLetter("a"));
		assertTrue(PasswordChecker.containsLetter("Z"));
	}

	@Test
	public void testContainsLetter_NoLetters() {
		assertFalse(PasswordChecker.containsLetter("12345678"));
		assertFalse(PasswordChecker.containsLetter("!@#$%^&*"));
		assertFalse(PasswordChecker.containsLetter(""));
	}

	// Test containsDigit method
	@Test
	public void testContainsDigit_HasDigits() {
		assertTrue(PasswordChecker.containsDigit("password123"));
		assertTrue(PasswordChecker.containsDigit("abc1"));
		assertTrue(PasswordChecker.containsDigit("0"));
		assertTrue(PasswordChecker.containsDigit("9"));
	}

	@Test
	public void testContainsDigit_NoDigits() {
		assertFalse(PasswordChecker.containsDigit("password"));
		assertFalse(PasswordChecker.containsDigit("ABCDEFGH"));
		assertFalse(PasswordChecker.containsDigit("!@#$%^&*"));
		assertFalse(PasswordChecker.containsDigit(""));
	}

	// Test containsWhitespace method
	@Test
	public void testContainsWhitespace_HasWhitespace() {
		assertTrue(PasswordChecker.containsWhitespace("pass word"));
		assertTrue(PasswordChecker.containsWhitespace(" password"));
		assertTrue(PasswordChecker.containsWhitespace("password "));
		assertTrue(PasswordChecker.containsWhitespace("my password 123"));
	}

	@Test
	public void testContainsWhitespace_NoWhitespace() {
		assertFalse(PasswordChecker.containsWhitespace("password123"));
		assertFalse(PasswordChecker.containsWhitespace("ValidPass"));
		assertFalse(PasswordChecker.containsWhitespace(""));
		assertFalse(PasswordChecker.containsWhitespace("no_spaces_here"));
	}

	// Test isValid method (integration tests)
	@Test
	public void testIsValid_ValidPasswords() {
		assertTrue(PasswordChecker.isValid("ValidPass123"));
		assertTrue(PasswordChecker.isValid("password1"));
		assertTrue(PasswordChecker.isValid("MySecure2024"));
		assertTrue(PasswordChecker.isValid("abcdefgh1"));
	}

	@Test
	public void testIsValid_InvalidPasswords_TooShort() {
		assertFalse(PasswordChecker.isValid("short"));
		assertFalse(PasswordChecker.isValid("abc123"));
		assertFalse(PasswordChecker.isValid(""));
	}

	@Test
	public void testIsValid_InvalidPasswords_NoLetters() {
		assertFalse(PasswordChecker.isValid("12345678"));
		assertFalse(PasswordChecker.isValid("987654321"));
	}

	@Test
	public void testIsValid_InvalidPasswords_NoDigits() {
		assertFalse(PasswordChecker.isValid("abcdefgh"));
		assertFalse(PasswordChecker.isValid("password"));
		assertFalse(PasswordChecker.isValid("HelloWorld"));
	}

	@Test
	public void testIsValid_InvalidPasswords_HasWhitespace() {
		assertFalse(PasswordChecker.isValid("pass word1"));
		assertFalse(PasswordChecker.isValid("password 123"));
		assertFalse(PasswordChecker.isValid("my password"));
	}

	@Test
	public void testIsValid_InvalidPasswords_MultipleIssues() {
		assertFalse(PasswordChecker.isValid("123")); // too short, no letters
		assertFalse(PasswordChecker.isValid("abc")); // too short, no digits
		assertFalse(PasswordChecker.isValid("pass 1")); // too short, has whitespace
	}

	// Test the passwords from the main method
	@Test
	public void testMainMethodPasswords() {
		// Test the hardcoded passwords from the main method
		assertFalse(PasswordChecker.isValid("short")); // Too short
		assertFalse(PasswordChecker.isValid("12345678")); // No letters
		assertFalse(PasswordChecker.isValid("abcdefgh")); // No digits
		assertFalse(PasswordChecker.isValid("pass word")); // Contains whitespace
		assertFalse(PasswordChecker.isValid("pass@word")); // No digits
		assertTrue(PasswordChecker.isValid("ValidPass123")); // Valid password
	}
}