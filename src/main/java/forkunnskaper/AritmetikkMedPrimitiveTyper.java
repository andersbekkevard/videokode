package forkunnskaper;

public class AritmetikkMedPrimitiveTyper {

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
        // Så gir vi disse bort
        antallFrukt -= 4;
        // antallFrukt *= 2;
        // antallFrukt /= 2;
        antallFrukt++;
        antallFrukt--;
        System.out.println("Antall epler, bananer og appelsiner: " + antallFrukt);

        // Datatypene som inngår påvirker datatypen til resultatet
        int a = 5;
        int b = 3;
        System.out.println("5 / 3 = " + a / b);
        // heltall / heltall = heltall

        double c = 3.0;
        System.out.println("5 / 3.0 = " + a / c);
        // heltall / desimaltall = desimaltall

        // boolske operatorer
        boolean harBil = true;
        boolean harLappen = false;

        System.out.println("Kan kjøre selv: " + (harBil && harLappen)); // false
        System.out.println("Kan bidra med bil eller som sjåfør: " + (harBil || harLappen)); // true
        System.out.println("Trenger noen andre til å kjøre: " + !harLappen); // true

    }
}
