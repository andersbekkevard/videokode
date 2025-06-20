package p1_intro_java.s1_datatyper;

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


		boolean harEksamen = true;
		boolean staattOpp = true;
		boolean harForelesning = false;

		System.out.println("Er på Sluppen i tide: " + (harEksamen && staattOpp));
		System.out.println("Må rekke bussen: " + (harEksamen || harForelesning));
		System.out.println("Sover fortsatt: " + (!staattOpp));

		char onsketKarakter = 'A';
		char faktiskKarakter = 'C';
		System.out.println("Fikk vi det vi håpet på: " + (onsketKarakter == faktiskKarakter));
		System.out.println("Fikk noe annet enn vi håpet: " + (onsketKarakter != faktiskKarakter));

	}
}
