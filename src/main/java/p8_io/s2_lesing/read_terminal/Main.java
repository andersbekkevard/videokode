package p8_io.s2_lesing.read_terminal;

import java.util.Scanner;


// KAMERAOPPTAK
// Vi skal nå se på hvordan vi kan ta input fra terminalen i Java

public class Main {
    
    public static void main(String[] args) {

        // Du er sikkert vant med å skrive ut ting i debug consolen
        // For denne oppgaven skal vi ta input fra terminalen, så vi bytter over til det om du ennå ikke har gjort det
        // I prosjektene du har lastet ned ligger det ofte en ".vscode mappe"
        // Der står det spesifisert noen ting for utførelse av kode
        // Vi går da inn i mappen, og på settings.json, og kommenterer ut linjen
        // "java.debug.settings.console": "integratedTerminal"
        // Denne kan vi bare kommentere tilbake om du vil gå tilbake til å skrive i debug consolen

        
        // Vi er nå godt kjent med utskrift av ting til terminalen
        System.out.println("Utskrift");
        // Denne linjen betyr at System.out skal kalle funksjonen print line som automatisk legger til ny linje på slutten
        // Vi kan også skrive ut uten å ha new line, med
        System.out.print("Første");
        System.out.print("Andre");
        // Når vi printer dette ser vi at de havner på samme linje
        //      Legg til en newline
        // Vi bruker System.out for output
        // Uten å tenke for lenge kan vi da tenke oss til at vi tar input med System.in
        
        // Vi bruker fortsatt objektene våre for å ta input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv navnet ditt: ");

        String name = scanner.nextLine();

        System.out.println("Hei, " + name + "!");

        
        // Du kan også bruke nextInt men du kan også bare konvertere type, eller lete gjennom autofyll ved behov
        
        String current = "current";
        int secretNum = 3;
        
        while (!current.isBlank()) {
            System.out.println("Gjett tallet mellom 1 og 10. Trykk enter uten tekst for å avslutte");
            System.out.print("Gjett: ");
            int guess = scanner.nextInt();
            if (guess == secretNum) {
                System.out.println("Riktig!");
                break;
            }
            System.out.println("Prøv igjen\n");
        }

        
        scanner.close();
    
    }
}
