package p9_misc.s2_varargs_and_ternary;

// I mange tilfeller setter vi verdier basert på betingelser.
// Ternary er bare en veldig kort if/else setning

public class Ternary {

	public static void main(String[] args) {

		System.out.println("Pris gitt student: " + getPrice(true));
		System.out.println("Pris gitt ikke student: " + getPrice(false));

		System.out.println(nicknameOf("Alexander"));
		// System.out.println(nicknameOf("Tor"));
		System.out.println(ternaryNicknameOf("Tor"));

	}

	public static String nicknameOf(String name) {
		return name.substring(0, 4);
	}

	public static String ternaryNicknameOf(String name) {
		return name.length() > 6 ? name.substring(0, 6) : name;
	}

	// Kommentar fra Anders. Du får bestemme om du gidder å ta med denne
	// det som er smart er at hvis den først er true, så sjekkes aldri andre verdi
	public static int getLengthOfNullableString(String s) {
		return s == null ? 0 : s.length();
	}

	// Denne er også ålreit
	public static int getIndexInAlphabet(char c) {
		String lowerCaseAlphabet = "abcdefghijklmnopqrstuvwxyz";
		String alphabetToUse = Character.isLowerCase(c) ? lowerCaseAlphabet : lowerCaseAlphabet.toUpperCase();
		return alphabetToUse.indexOf(c) + 1;
	}

	public static int getPrice(boolean isStudent) {
		int price = isStudent ? 99 : 149;
		return price;
	}
}
