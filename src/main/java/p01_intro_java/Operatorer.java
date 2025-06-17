package p01_intro_java;

public class Operatorer {

	public static void main(String[] args) {

		// Addere heltall
		int epler = 3;
		int bananer = 5;
		System.out.println(epler + bananer);

		// Kan sette sammen regning med tekst for å gjøre utskrift mer lesbar
		int frukt = epler + bananer;
		System.out.println("Antall frukt: " + frukt);

		// Bruker paranteser for å sikre rekkefølgen på utførelse
		System.out.println("Antall frukt: " + epler + bananer);
		System.out.println("Antall frukt: " + (epler + bananer));

		// Vi får så plutselig 4 appelsiner til
		frukt = frukt + 4;
		frukt += 4;
		frukt -= 4;
		// antallFrukt *= 2;
		// antallFrukt /= 2;
		frukt += 1;
		frukt++;
		frukt--;
		System.out.println("Antall epler, bananer og appelsiner: " + frukt);

		// Datatypene som inngår påvirker datatypen til resultatet
		int a = 5;
		int b = 3;
		System.out.println("5 + 3 = " + (a + b));

		System.out.println("5 / 3 = " + (a / b));

		double c = 3.0;
		System.out.println("5 / 3.0 = " + (a / c));
		// heltall / desimaltall = desimaltall

	}
}
