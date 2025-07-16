package p6_funksjonell_programmering.s1_funksjonelle_grensesnitt.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class InternshipCandidatePredicate implements Predicate<Candidate> {

    private static List<String> validPrograms = new ArrayList<>(Arrays.asList("MTDT", "MTING", "MTKOM"));

    @Override
    public boolean test(Candidate t) {
        return validPrograms.contains(t.getProgram()) && t.getYear() >= 3;

    }

}
