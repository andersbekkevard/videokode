package p6_funksjonell_programmering.s1_funksjonelle_grensesnitt.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import p8_io.oppg.Trip;

public class Main {
    
    public static void main(String[] args) {
    
        Candidate c1 = new Candidate("Otto", "MTDT", 3);    
        Candidate c2 = new Candidate("Anne", "MTMART", 2);    
        Candidate c3 = new Candidate("Eddy", "MTKOM", 5);    
        List<Candidate> candidates = new ArrayList<>(Arrays.asList(c1,c2,c3));

        List<Candidate> candidatesForInterview = getCandidatesForInterview(candidates, new CandidatePredicate());

    }


    public static List<Candidate> getCandidatesForInterview(List<Candidate> candidates, Predicate<Candidate> p) {
        List<Candidate> result = new ArrayList<>();
        for (Candidate t : candidates) {
            if (p.test(t)) {
                result.add(t);
            }
        }

        return result;
    }



}
