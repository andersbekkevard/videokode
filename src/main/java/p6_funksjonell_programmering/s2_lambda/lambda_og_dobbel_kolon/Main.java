package p6_funksjonell_programmering.s2_lambda.lambda_og_dobbel_kolon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {


        // Først start med samme operator som i presentasjonen. Ta så fra del for del
        // Og vis at det funker for mange deler
        UnaryOperator<Integer> f = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer t) {
                return t * t;
            }
        };

        System.out.println(f.apply(2));


        // Fjern også Integer herfra
        UnaryOperator<Integer> g = (Integer t) -> {
                // Vis at du kan ønske denne formen fordi
                // Du kanksje ønsker mer kode
                // eks
                System.out.println("Nå kvadrerer jeg " + t);
                return t * t;
        };

        System.out.println(g.apply(3));



        UnaryOperator<Integer> h = (t) ->  t * t;

        System.out.println(h.apply(4));

        // Lambda er input parametre og en pil til output resultatet!


        

        // Denne notasjonen kan vi bruke på alle funksjonelle grensesnitt
        
        Consumer<String> printer = s -> System.out.println(s);

        printer.accept("hei");

        // For å sende inn uten parametre bruker man bare parenteser tomme

        Supplier<String> alarm = () -> "ALARM!!!";

        System.out.println(alarm.get());
        

        // Vis så Person klassen

        Person person1 = new Person("Otto", 22);

        Predicate<Person> isAdult = p -> p.isAdult();

        System.out.println("Er " + person1.getName() + " voksen: " + isAdult.test(person1));

        // Method referencing
        // Ikke nødvendig å skrive noen gang, men dere må kunne lese det


        Person person2 = new Person("Anna", 17);

        Predicate<Person> otherIsAdult = Person::isAdult;

        System.out.println("Er " + person2.getName() + " voksen: " + otherIsAdult.test(person2));


        // Klasse :: metode
        // At argumentet du sendes inn skal anvendes på dette er implisitt
        // Tar inn variabel av typen VS, returnerer variabelen anvendt på funksjonen HS
        // Men det betyr også at det bare må være en enkel ting som skal utføres
        // Som for eksempel at du bare kaller en metode på et element


        Function<Person, Integer> convertToAge = Person::getAge;

        System.out.println(convertToAge.apply(person1));
        System.out.println(convertToAge.apply(person2));



    }
}
