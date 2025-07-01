package p1_intro_java.s4_password_checker;

import java.util.List;

/**
 * PasswordChecker-klasse
 * Hvert passord må:
 * 
 * - Være minst 8 tegn langt
 * 
 * - Inneholde minst én bokstav (a–z eller A–Z)
 * 
 * - Inneholde minst ett siffer (0–9)
 * 
 * - Ikke inneholde mellomrom
 * 
 */

public class PasswordChecker {
	public static final List<String> passwords = List.of(
			"short", // For kort (mindre enn 8 tegn)
			"12345678", // Ingen bokstaver
			"abcdefgh", // Ingen siffer
			"pass word", // Inneholder mellomrom
			"ValidPass123" // Gyldig passord (oppfyller alle kriterier)
	);

	public static final String UPPER_CASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String LOWER_CASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
	public static final String DIGITS = "0123456789";
	public static final String SPACE = " ";

	public static boolean isLongEnough(String password) {
		return password.length() >= 8;
	}

	public static boolean containsLetter(String password) {
		for (char c : password.toCharArray()) {
			if (UPPER_CASE_LETTERS.indexOf(c) != -1 || LOWER_CASE_LETTERS.indexOf(c) != -1) {
				return true;
			}
		}
		return false;
	}

	public static boolean containsDigit(String password) {
		for (char c : password.toCharArray()) {
			if (DIGITS.indexOf(c) != -1) {
				return true;
			}
		}
		return false;
	}

	public static boolean containsWhitespace(String password) {
		return password.contains(SPACE);
	}

	public static boolean isValid(String password) {
		return isLongEnough(password) && containsLetter(password) && containsDigit(password)
				&& !containsWhitespace(password);
	}

	public static void printPasswordValidation(String password) {
		System.out.println("Password: " + password);
		if (isValid(password)) {
			System.out.println("Password is valid");
			return;
		}
		System.out.println("Password is invalid, because:");
		if (!isLongEnough(password)) {
			System.out.println("Password is too short");
		}
		if (!containsLetter(password)) {
			System.out.println("Password does not contain a letter");
		}
		if (!containsDigit(password)) {
			System.out.println("Password does not contain a digit");
		}
		if (containsWhitespace(password)) {
			System.out.println("Password contains whitespace");
		}
		System.out.println("--------------------------------");
	}

	public static void main(String[] args) {
		for (String password : passwords) {
			printPasswordValidation(password);
		}
	}
}