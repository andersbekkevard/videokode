package p7_oop_teknikker.s1_delegering.v4.write;

public class WriterDemo {

	public static void main(String[] args) {
		System.out.println("=== DELEGATION PATTERN: WRITER/PRINTER ===\n");

		Writer writer = new Writer();

		System.out.println("1. Writer creates different types of documents:");
		Document article = writer.writeArticle("Java Basics", "Java is a programming language...");
		Document report = writer.writeReport("Sales Report Q1", "Sales increased by 15% this quarter...");
		Document letter = writer.writeLetter("Thank You", "Thank you for your business...");

		System.out.println("\n2. Writer focuses on writing, delegates printing:");
		System.out.println("Notice: Writer doesn't know HOW to print - that's Printer's job!\n");

		writer.publishDocument(article);
		writer.publishDocument(report);
		writer.publishDocument(letter);

		System.out.println("=== DELEGATION EXPLAINED ===");
		System.out.println("- Writer: Focuses on creating content");
		System.out.println("- Printer: Handles all printing logic and formatting");
		System.out.println("- Document: Simple data carrier");
		System.out.println("\nKey point: Writer delegates printing to Printer!");
		System.out.println("Writer doesn't need to know printing details - just WHO to ask!");
	}
}