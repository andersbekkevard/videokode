package p01_intro_java;

public class Loops {

	public static void main(String[] args) {

		int alder = 21;

		if (alder >= 18) {
			System.out.println("Du er myndig!");
		}

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		int n = 0;
		while (n <= 10) {
			if (n % 2 == 0) {
				System.out.println(n + " er partall");
			}
			n++;
		}

		int tallViLeterEtter = 5;
		int maksTall = 10;
		for (int i = 0; i < maksTall; i++) {
			if (i != tallViLeterEtter) {
				System.out.println("Ikke funnet ennå");
				continue;
			}
			System.out.println("JIPPI! Jeg fant");
			break;
		}

		boolean funnetTall = false;
		int tallViUndersoker = 0;
		while (!funnetTall) {
			if (tallViUndersoker == tallViLeterEtter) {
				System.out.println("Vi fant tallet " + tallViLeterEtter);
				funnetTall = true;
			}
			tallViUndersoker++;
		}

	}

}
