package p6_funksjonell_programmering.s1_funksjonelle_grensesnitt.predicate.UTDATERT;

import java.util.function.Predicate;


// STEG 1
// OPPRETT KLASSEN, IMPLEMENT OG QUICK FIX

public class PasswordPredicate implements Predicate<String> {

    @Override
    public boolean test(String t) {
        return t != null && t.length() < 5;    

        // Mulig å legge til

        // boolean hasLetter = false;
        // boolean hasDigit = false;

        // for (char c : password.toCharArray()) {
        //     if (Character.isLetter(c)) {
        //         hasLetter = true;
        //     }
        //     if (Character.isDigit(c)) {
        //         hasDigit = true;
        //     }
        // }

        // return hasLetter && hasDigit;
    }
    
}
