package p1_intro_java.s1_datatyper;

public class Arrays {

	public static void main(String[] args) {

		// To måter å opprette arrays på

		// Tomt array med plass til 3 tall. Tallet inni klammeparentesene til høyre er størrelsen
		int[] tall = new int[3];
		// [0, 0, 0]
		// Skriver plasseringen til et element i arrayen for å referere til den plassen. Starter på indeks null
		tall[0] = 10;
		tall[1] = 20;
		// [10, 20, 0]

		// Med verdier direkte. Størrelse og verdier gitt ved opprettelse
		int[] andreTall = { 10, 20, 30 };
		// [10, 20, 30]

		System.out.println(tall); // Denne skriver bare ut en id for arrayen, som kan ses på som adressen til arrayen, ikke hva den inneholder
		// Må hente ut en og en verdi
		System.out.println("Tall: " + tall[0] + ", " + tall[1] + ", " + tall[2]);
		// Ser også her at siden vi ikke definerte tall[2] ble den satt til verdien 0
		

		System.out.println(andreTall.length);
		// Er bundet av lengden vi definerte arrayen til i begynnelsen
		// tall[4] = 50;
		// System.out.println(andreTall[3]);

		String[] navn = { "Kari", "Ola" };
		System.out.println("Første navn i lista: " + navn[0]);

	}
}
