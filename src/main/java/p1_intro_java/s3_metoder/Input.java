package p1_intro_java.s3_metoder;

public class Input {
	// Metoder med inputparametre
	public static void scream(String sentence) {
		System.out.println(sentence.toUpperCase() + "!!!");
	}

	// Som også returnerer en verdi
	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		scream("hjelp meg");
		int number = add(1, 2);
		System.out.println(number);
	}
}
