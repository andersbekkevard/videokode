package p7_oop_teknikker.s1_delegering.v4.write;

public class Writer {
	private Printer printer;

	public Writer() {
		this.printer = new Printer();
	}

	public Document writeArticle(String title, String content) {
		System.out.println("Writer is creating article: " + title);
		return new Document(title, content, "TEXT");
	}

	public Document writeReport(String title, String content) {
		System.out.println("Writer is creating report: " + title);
		return new Document(title, content, "PDF");
	}

	public Document writeLetter(String title, String content) {
		System.out.println("Writer is creating letter: " + title);
		return new Document(title, content, "WORD");
	}

	public void publishDocument(Document document) {
		System.out.println("Writer wants to publish: " + document.getTitle());
		System.out.println("Writer delegates printing to Printer...");
		printer.print(document);
	}
}