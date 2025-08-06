package p9_misc.s1_optionals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        // STEG 0
        String name = "Otto";
        Optional<String> optionalName = Optional.ofNullable(name);
        System.out.println(optionalName);

        // STEG 1
        // (VIS PERSON KLASSEN FORT)
        // Vi vil søke opp en fyr vi kjenner, og sjekke hvor gammel han er
        // Person myDude = getPersonFromDatabase("Otto");
        // System.out.println(myDude.getAge());

        // STEG 3
        // if (myDude != null) {
        // System.out.println(myDude.getAge());
        // } else {
        // System.out.println("Fant ikke personen");
        // }

        // STEG 4
        // Men hvordan kan vi som lager funksjonen få de som kaller på den til å sjekke
        // for nullverdier?
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
        // Husk at hovedformålet er å gjøre det veldig åpenbart for den som kaller på
        // funksjonen at de MÅ sjekke for null
        // Så at man er mer sikre på at sjekken faktisk gjøres

        // Når du blir mer kjent med optionals
        // Om optionalen fra funksjonen inneholder Otto er det den verdien vi får. Er
        // den null opprettes en ny ukjent person
        // DENNE GIR EN default verdi
        Person person = getPersonFromDatabase("Otto").orElse(new Person("UKJENT", 0));

        // Kan også mappe eller flatmappe
        // Hvis du mapper kan du mappe fra objekt til funksjonen du vil kalle på den, og
        // den går automatisk forbi nulls
        // Kan kombinere dette med orElse
        optionalPerson.map(Person::getAge).orElse(-1);

        // Så bruk det hovedsakelig som returtype for å gjøre en annen bruker oppmerksom
        // på muligheten som null
    }

    // STEG 2
    // private static Person getPersonFromDatabase(String name) {
    // // Her kan kan lese ut info fra en fil, sjekke en database...
    // // Vi bare oppretter returverdien fra dette lokalt siden det er et eksempel

    // Person p = new Person(name, 22);
    // return p;

    // // Hva om databasen eller søket vårt i fil ikke finner noe?

    // // Person p = null;
    // // return p;
    // }

    private static Person p1 = new Person("Otto", 22);
    private static Person p2 = new Person("Anne", 25);;
    private static List<Person> database = new ArrayList<>(Arrays.asList(p1, p2));

    // STEG 5
    private static Optional<Person> getPersonFromDatabase(String name) {
        return database.stream().filter(p -> p.getName().equals(name)).findFirst();
    }
}
