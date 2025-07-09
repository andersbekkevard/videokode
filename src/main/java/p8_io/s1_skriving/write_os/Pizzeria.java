package p8_io.s1_skriving.write_os;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizzeria {

	public static void write(List<PizzaRecipe> pizzaRecipes, OutputStream outputStream) throws IOException {
		// Begynn å skriv vanlig så bruke Throws istedenfor try catch. Si så man så må
		// ha try catch der man kaller fra isteden
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
		for (PizzaRecipe r : pizzaRecipes) {
			String newEntry = r + "\n";
			writer.write(newEntry);
			// writer.write(r.toString() + "\n"); // Her må vi hjelpe med å gi toString
			// eksplisitt
		}
		writer.flush();
		writer.close();
	}

	/*
	 * Komentar fra Anders:
	 * Synes vi burde bruke StringBuilder i steden for å skrive til outputStreamen
	 * hver gang.
	 * Mønsteret outputStream.write(sb.toString().getBytes()); er nice å bruke hver
	 * gang.
	 */
	public static void otherWrite(List<PizzaRecipe> pizzaRecipes, OutputStream outputStream) throws IOException {
		// Fortell man så kan skrive direkte til outputstream, men at man da må omgjøre
		// til bytes
		StringBuilder sb = new StringBuilder();
		for (PizzaRecipe r : pizzaRecipes) {
			String newEntry = r + "\n";
			sb.append(newEntry);
		}
		outputStream.write(sb.toString().getBytes());
		outputStream.flush();
		outputStream.close();
	}

	public static void main(String[] args) {

		List<PizzaRecipe> pizzaRecipes = new ArrayList<>(Arrays.asList(
				new PizzaRecipe("Margarita", Arrays.asList("Tomatsaus", "Ost")),
				new PizzaRecipe("Hawaii", Arrays.asList("Tomatsaus", "Ost", "Skinke", "Ananas")),
				new PizzaRecipe("Pepperoni", Arrays.asList("Tomatsaus", "Ost", "Pepperoni"))));

		try (OutputStream outputStream = new PrintStream("files/pizzaRecipes.txt")) {
			Pizzeria.write(pizzaRecipes, outputStream);
		} catch (Exception e) {
			System.err.println("Feil i skrivefunksjonen! Error: " + e.getMessage());
		}

		try (OutputStream outputStream = new PrintStream("files/otherPizzaRecipes.txt")) {
			Pizzeria.otherWrite(pizzaRecipes, outputStream);
		} catch (Exception e) {
			System.err.println("Feil i skrivefunksjonen! Error: " + e.getMessage());
		}

		// Så lett det kan gjøres! De innebygde funkjsonene gjør heavyLiftimng
	}

}
