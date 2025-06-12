package kladd;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	private final PrintStream standardOut = System.out;

	@BeforeEach
	void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@AfterEach
	void tearDown() {
		System.setOut(standardOut);
	}

	@Test
	@DisplayName("Test environment setup and Java version")
	void testEnvironment() {
		// Test that we're running in a test environment
		String javaVersion = System.getProperty("java.version");
		String userDir = System.getProperty("user.dir");
		String osName = System.getProperty("os.name");

		// Assert environment properties are not null
		assertThat(javaVersion).isNotNull().isNotEmpty();
		assertThat(userDir).isNotNull().isNotEmpty();
		assertThat(osName).isNotNull().isNotEmpty();

		// Check that we're using Java 21 (as specified in pom.xml)
		assertThat(javaVersion).startsWith("21");

		// Verify we're in the correct project directory
		assertThat(userDir).contains("videokode");

		System.out.println("Environment test passed - Java version: " + javaVersion);
		System.out.println("Operating system: " + osName);
		System.out.println("Working directory: " + userDir);
	}

	@Test
	@DisplayName("Test that App prints Hello World")
	void testAppPrintsHelloWorld() {
		// When
		App.main(new String[] {});

		// Then
		String output = outputStreamCaptor.toString().trim();

		// Assert using JUnit assertions
		assertEquals("Hello, World!", output);

		// Assert using AssertJ for more fluent assertions
		assertThat(output)
				.isNotNull()
				.isNotEmpty()
				.isEqualTo("Hello, World!")
				.contains("Hello")
				.contains("World");
	}

	@Test
	@DisplayName("Test App main method with different arguments")
	void testAppMainWithArguments() {
		// Test that the main method works regardless of arguments passed
		String[] args = { "arg1", "arg2", "arg3" };

		// When
		App.main(args);

		// Then
		String output = outputStreamCaptor.toString().trim();
		assertThat(output).isEqualTo("Hello, World!");
	}

	@Test
	@DisplayName("Test App main method with null arguments")
	void testAppMainWithNullArguments() {
		// When
		App.main(null);

		// Then
		String output = outputStreamCaptor.toString().trim();
		assertThat(output).isEqualTo("Hello, World!");
	}
}
