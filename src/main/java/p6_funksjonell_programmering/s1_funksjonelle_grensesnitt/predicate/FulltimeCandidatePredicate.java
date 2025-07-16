package p6_funksjonell_programmering.s1_funksjonelle_grensesnitt.predicate;

import java.util.function.Predicate;

public class FulltimeCandidatePredicate implements Predicate<Candidate> {
    
    @Override
    public boolean test(Candidate t) {
        return t.getYear() >= 5;
    }

}
