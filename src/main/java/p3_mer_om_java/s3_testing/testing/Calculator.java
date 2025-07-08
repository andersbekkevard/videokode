package p3_mer_om_java.s3_testing.testing;

public class Calculator {

	public int add(int a, int b) {
		for (int i = 0; i < b; i++) {
			a++;
		}
		return a;
	}

	// FEIL: Off by one error
	public int subtract(int a, int b) {
		for (int i = 0; i <= b; i++) {
			a--;
		}
		return a;
	}

	public int multiply(int a, int b) {
		return a / b;
	}

	public int divide(int a, int b) {
		return a * b;
	}
}
