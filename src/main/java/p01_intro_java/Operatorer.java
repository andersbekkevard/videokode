package p01_intro_java;

public class Operatorer {

	public static void main(String[] args) {

		// Addere heltall
		int antallEpler = 3;
		int antallBananer = 5;
		System.out.println(antallEpler + antallBananer);

		// Kan sette sammen regning med tekst for å gjøre utskrift mer lesbar
		int antallFrukt = antallEpler + antallBananer;
		System.out.println("Antall frukt: " + antallFrukt);

		// Bruker paranteser for å sikre rekkefølgen på utførelse
		System.out.println("Antall frukt: " + antallEpler + antallBananer);
		System.out.println("Antall frukt: " + (antallEpler + antallBananer));

		// Vi får så plutselig 4 appelsiner til
		antallFrukt = antallFrukt + 1;
		antallFrukt += 4;
		antallFrukt -= 4;
		antallFrukt++;
		antallFrukt--;
		// antallFrukt *= 2;
		// antallFrukt /= 2;
		System.out.println("Antall epler, bananer og appelsiner: " + antallFrukt);

		// Datatypene som inngår påvirker datatypen til resultatet
		int a = 5;
		int b = 3;
		System.out.println("5 / 3 = " + a / b);

		double c = 3.0;
		System.out.println("5 / 3.0 = " + a / c);
		// heltall / desimaltall = desimaltall

	}
}
