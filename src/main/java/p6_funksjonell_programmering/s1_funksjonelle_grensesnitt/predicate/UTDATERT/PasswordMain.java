package p6_funksjonell_programmering.s1_funksjonelle_grensesnitt.predicate.UTDATERT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;


public class PasswordMain {
    
    public static void main(String[] args) {
        
        // Begynn med å introdusere predicate klassen
        Predicate<String> passwordCheck = new PasswordPredicate();

        Collection<String> passwords = new ArrayList<>(List.of("hei", "hallo", "Passord", "12345"));

        for (String s : passwords) {
            System.out.println("Is " + s + " valid as password: " + passwordCheck.test(s));
        }



        System.out.println();
        Predicate<String> strongerPasswordCheck = new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t != null && t.length() >= 6 && Character.isUpperCase(t.charAt(0));
            }
        };

        for (String s : passwords) {
            System.out.println("Is " + s + " valid as a strong password: " + strongerPasswordCheck.test(s));
        }

    }

}
