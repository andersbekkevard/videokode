package p9_misc.s1_optionals;

import java.util.Optional;

public class Main {
    
    public static void main(String[] args) {
        
        // STEG 1
        // (VIS PERSON KLASSEN FORT)
        // Vi vil søke opp en fyr vi kjenner, og sjekke hvor gammel han er
        // Person myDude = getPersonFromDatabase("Otto");
        // System.out.println(myDude.getAge());

        // STEG 3
        // if (myDude != null) {
        //     System.out.println(myDude.getAge());
        // } else {
        //     System.out.println("Fant ikke personen");
        // }

        // STEG 4
        // Men hvordan kan vi som lager funksjonen få de som kaller på den til å sjekke for nullverdier?
        // Derfor bruker vi Optionals
        Optional<Person> optionalPerson = getPersonFromDatabase("Otto");


        // STEG 6 - Resterende
        // Bruker get for å hente ut verdien
        // Samme tilfelle her: prøver kanskje kalle på null
        System.out.println(optionalPerson.get().getAge());

        if (optionalPerson.isPresent()) {
            System.out.println(optionalPerson.get().getAge());
        } else {
            System.out.println("Fant ikke personen");
        }

        // Alternativt også !isEmpty

        // Dette gjorde ingenting jo??
        // Husk at hovedformålet er å gjøre det veldig åpenbart for den som kaller på funksjonen at de MÅ sjekke for null
        // Så at man er mer sikre på at sjekken faktisk gjøres


        // Når du blir mer kjent med optionals
        // Om optionalen fra funksjonen inneholder Otto er det den verdien vi får. Er den null opprettes en ny ukjent person
        // DENNE GIR EN default verdi
        Person person = getPersonFromDatabase("Otto").orElse(new Person("UKJENT", 0));

        // Kan også mappe eller flatmappe
        // Hvis du mapper kan du mappe fra objekt til funksjonen du vil kalle på den, og den går automatisk forbi nulls
        // Kan kombinere dette med orElse
        optionalPerson.map(Person::getAge).orElse(-1);

        // Så bruk det hovedsakelig som returtype for å gjøre en annen bruker oppmerksom på muligheten som null
    }

    // STEG 2
    // private static Person getPersonFromDatabase(String name) {
    //     // Her kan kan lese ut info fra en fil, sjekke en database...
    //     // Vi bare oppretter returverdien fra dette lokalt siden det er et eksempel
        
    //     Person p = new Person(name, 22);
    //     return p;

    //     // Hva om databasen eller søket vårt i fil ikke finner noe?

    //     // Person p = null;
    //     // return p;
    // }

    // STEG 5
    private static Optional<Person> getPersonFromDatabase(String name) {
        Person p1 = new Person(name, 22);
        Person p2 = null;
        return Optional.ofNullable(p1);
    }
}
