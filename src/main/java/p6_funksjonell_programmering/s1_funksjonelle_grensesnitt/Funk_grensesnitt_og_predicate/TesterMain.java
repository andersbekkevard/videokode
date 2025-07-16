package p6_funksjonell_programmering.s1_funksjonelle_grensesnitt.Funk_grensesnitt_og_predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TesterMain {
    
    public static void main(String[] args) {

        Collection<String> strings = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(42, 37, 53));

        LongStringTester isLongString = new LongStringTester();
        EvenNumberTester isEvenNumber = new EvenNumberTester();


        System.out.println("Long strings:");
        for (String s : strings) {
            if (isLongString.check(s)) {
                System.out.println(s);
            }
        }

        System.out.println("\nEven numbers:");
        for (Integer n : numbers) {
            if (isEvenNumber.check(n)) {
                System.out.println(n);
            }
        }

        
    
    }

}
