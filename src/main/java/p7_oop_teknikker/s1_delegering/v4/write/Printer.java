package p7_oop_teknikker.s1_delegering.v4.write;

public class Printer {

	public void print(Document document) {
		System.out.println("=== PRINTING DOCUMENT ===");
		formatHeader(document);
		formatContent(document);
		formatFooter(document);
		System.out.println("=== PRINT COMPLETE ===\n");
	}

	private void formatHeader(Document document) {
		System.out.println("Title: " + document.getTitle());
		System.out.println("Format: " + document.getFormat());
		System.out.println("---");
	}

	private void formatContent(Document document) {
		String content = document.getContent();
		if (document.getFormat().equals("PDF")) {
			System.out.println("[PDF] " + content);
		} else if (document.getFormat().equals("WORD")) {
			System.out.println("[WORD] " + content);
		} else {
			System.out.println("[TEXT] " + content);
		}
	}

	private void formatFooter(Document document) {
		System.out.println("---");
		System.out.println("Printed by: Advanced Printer v2.0");
	}
}