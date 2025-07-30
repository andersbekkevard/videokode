package p7_oop_teknikker.s1_delegering.actual.write;

public class Printer implements IPrinter {

	@Override
	public void print(Document document) {
		System.out.println("\n--- Document ---");
		System.out.println("Title: " + document.getTitle());
		System.out.println("Content: " + document.getContent());
		System.out.println("Format: " + document.getFormat());
		System.out.println("--- End of Document ---\n");
	}
}