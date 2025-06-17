package p1_intro_java.s2_løkker;

public class Loops {

	public static void main(String[] args) {

		int poeng = 87;
		boolean duSkrevAdressenTilSensorIBesvarelsen = true;

		// Uten boolsk først, legg så til
		if (poeng >= 90 || duSkrevAdressenTilSensorIBesvarelsen) {
			System.out.println("Karakter A");
		} else if (poeng >= 80) {
			System.out.println("Karakter B");
		} else if (poeng >= 70) {
			System.out.println("Karakter C");
		} else {
			System.out.println("Du må øve mer");
		}

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		for (int i = 0; i < 10; i += 3) {
			System.out.println(i);
		}

		int n = 0;
		while (true) {
			if (n > 10) {
				break;
			}
			if (n % 2 == 0) {
				System.out.println(n + " er partall");
			}
			n++;
		}

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i + " er et oddetall");
		}

		int x = 10;
		if (x > 6 && x < 15) {
			System.out.println("x er mellom 6 og 15");
		} else if (x == 6 || x == 15) {
			System.out.println("x er 6 eller 15");
		} else {
			System.out.println("x er ikke mellom 6 og 15");
		}

		String[] names = { "Ola", "Hans", "Leif" };

		for (String name : names) {
			System.out.println(name);
		}

	}
}