package p7_oop_teknikker.s1_delegering.actual.write;

import java.util.ArrayList;
import java.util.List;

public class FancyPrinter {

	private static final int BOX_WIDTH = 60;
	private static final int INNER_WIDTH = BOX_WIDTH - 2;

	public void print(Document doc) {
		topBorder();
		centeredLine(doc.getTitle().toUpperCase());
		separator('═');
		keyValueLine("Format", doc.getFormat());
		separator('─');

		keyLine("Content");
		for (String paragraph : doc.getContent().split("\n")) {
			for (String row : wrap(paragraph, INNER_WIDTH - 2)) {
				indentedLine(row);
			}
		}
		separator('─');

		keyValueLine("Printed by", "FancyPrinter 3000");
		bottomBorder();
		System.out.println();
	}

	private void topBorder() {
		border('╔', '═', '╗');
	}

	private void bottomBorder() {
		border('╚', '═', '╝');
	}

	private void separator(char fill) {
		border('╠', fill, '╣');
	}

	private void border(char left, char fill, char right) {
		System.out.print(left);
		System.out.print(String.valueOf(fill).repeat(INNER_WIDTH));
		System.out.println(right);
	}

	private void centeredLine(String text) {
		text = truncate(text, INNER_WIDTH);
		int leftPadding = (INNER_WIDTH - text.length()) / 2;
		printLine(" ".repeat(leftPadding) + text);
	}

	private void keyLine(String key) {
		printLine(key + ":");
	}

	private void keyValueLine(String key, String value) {
		printLine(String.format("%-9s %s", key + ":", value));
	}

	private void indentedLine(String text) {
		printLine("  " + text);
	}

	private void printLine(String body) {
		body = truncate(body, INNER_WIDTH);
		System.out.printf("║%-" + INNER_WIDTH + "s║%n", body);
	}

	private static String truncate(String txt, int max) {
		return txt.length() > max ? txt.substring(0, max - 3) + "..." : txt;
	}

	private static List<String> wrap(String text, int max) {
		List<String> out = new ArrayList<>();
		for (int i = 0; i < text.length(); i += max) {
			out.add(text.substring(i, Math.min(text.length(), i + max)));
		}
		if (out.isEmpty())
			out.add("");
		return out;
	}
}
