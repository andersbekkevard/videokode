package p3_mer_om_java.s3_testing.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calculator;

	@BeforeEach
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void testAdd() {
		assertEquals(5, calculator.add(2, 3));
	}

	@Test
	public void testSubtract() {
		assertEquals(1, calculator.subtract(3, 2));
	}

	@Test
	public void testMultiply() {
		assertEquals(6, calculator.multiply(2, 3));
	}

	@Test
	public void testDivide() {
		assertEquals(2, calculator.divide(6, 3));
	}
}
