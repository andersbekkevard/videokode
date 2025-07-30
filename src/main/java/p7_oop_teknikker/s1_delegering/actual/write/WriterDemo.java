package p7_oop_teknikker.s1_delegering.actual.write;

public class WriterDemo {

	public static void main(String[] args) {
		System.out.println("STEP 1: Creating documents...");
		System.out.println("========================================\n");

		Writer writer = new Writer();

		System.out.println("Writer creates different types of documents:");
		Document article = writer.writeArticle("Java Basics", "Java is a programming language...");
		Document report = writer.writeReport("Sales Report Q1", "Sales increased by 15% this quarter...");
		Document letter = writer.writeLetter("Thank You", "Thank you for your business...");

		// Bruker først standard printer
		System.out.println("\n" + "=".repeat(60));
		System.out.println("STEP 2: Using Simple Printer (Default)");
		System.out.println("=".repeat(60));

		writer.publishDocument(article);
		writer.publishDocument(report);
		writer.publishDocument(letter);

		// Bytter til fancy printer
		System.out.println("\n" + "=".repeat(60));
		System.out.println("STEP 3: Switching to FancyPrinter");
		System.out.println("=".repeat(60));

		writer.setPrinter(new FancyPrinter());

		writer.publishDocument(article);
		writer.publishDocument(report);
		writer.publishDocument(letter);
	}
}