package p7_oop_teknikker.s1_delegering.v4.write;

public class Document {
	private String title;
	private String content;
	private String format;

	public Document(String title, String content, String format) {
		this.title = title;
		this.content = content;
		this.format = format;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getFormat() {
		return format;
	}

	@Override
	public String toString() {
		return "Document: " + title + " (" + format + ")";
	}
}