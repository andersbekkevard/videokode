package p9_misc.s3_random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

// KAMERAOPPTAK
// Vi skal nå se på hvordan vi kan plukke ut tilfeldige verdier ved hjelp av Random objektet

public class Main {

    public static void main(String[] args) {

        // Dette begynner med at vi oppretter et objekt

        Random random = new Random();

        // Random objektet er et objekt du lager kun 1 gang og kaller på det med
        // funkjsoner hver gang du trenger en verdi

        // Så bruker vi random objektet til å trekke verdier
        // Her trekker vi et tilfeldig heltall. Det kan være både positivt og negativt.
        System.out.println("Et tilfeldig heltall: " + random.nextInt());
        // Det ser vi bare er helt tilfeldig for alle ints vi kan representere

        // Vi kan også spesifisere en grense. Dette gir oss et tall fra 0 til 9.
        System.out.println("Et tall mellom 0 og 9: " + random.nextInt(10));

        // Så om vi vil trekke fra et spesifikt intervall, kan vi plusse oss dit vi vil
        // Funksjonen gir oss intervallet 0 til og med 5, så vi plusser på 1 for å få
        // intervallet 1 til 6
        System.out.println("Terningkast (1–6): " + (random.nextInt(6) + 1));

        // Mer uvanlig, men som også finner er random for boolske verdier
        System.out.println("Sant eller usant? " + random.nextBoolean());

        // Vi kan også få tilfeldige desimaltall mellom 0.0 og 1.0
        System.out.println("Et desimaltall mellom 0.0 og 1.0: " + random.nextDouble());
        // Denne kunne vi også brukt til å komme oss til hvor som helst
        System.out.println("Bool " + (random.nextDouble() < 0.5)); // Gir bool
        System.out.println("Int " + (int) (random.nextDouble() * 50));


        
        // Kan også erstattes av Math.random()
        System.out.println(Math.random());
        // Gir et tall mellom 0 inklusivt og 1 eksklusivt
        // 0 - 0.999...
        // Dette kan du gange opp for å endre spenn
        // Og plusse og trekke fra for å flytte intervallet
        System.out.println("Terningkast (1-6): " + ((int) (Math.random() * 6) + 1));


    }

}
