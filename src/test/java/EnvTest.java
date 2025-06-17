import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class EnvTest {
	@Test
	void testEnvironment() {
		assertTrue(true, "Environment is correctly set up and tests are running.");
	}

	@Test
	void testJavaVersion() {
		String version = System.getProperty("java.version");
		// Expecting Java 21 (as per pom.xml)
		assertTrue(version.startsWith("21"), "Expected Java version 21, but got: " + version);
	}

	@Test
	void testClasspath() {
		String classpath = System.getProperty("java.class.path");
		assertTrue(classpath != null && !classpath.isEmpty(), "Classpath should not be empty");
	}

	@Test
	void testJUnitAvailable() {
		try {
			Class.forName("org.junit.jupiter.api.Test");
		} catch (ClassNotFoundException e) {
			throw new AssertionError("JUnit Jupiter is not available in the classpath.", e);
		}
	}
}