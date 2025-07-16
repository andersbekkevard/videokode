package p6_funksjonell_programmering.s1_funksjonelle_grensesnitt.predicate;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Candidate c1 = new Candidate("Otto", "MTDT", 3);
        Candidate c2 = new Candidate("Anne", "MTMART", 2);
        Candidate c3 = new Candidate("Eddy", "MTKOM", 5);
        List<Candidate> candidates = new ArrayList<>(Arrays.asList(c1, c2, c3));

        List<Candidate> internships = getCandidatesForInterview(candidates, new InternshipCandidatePredicate());
        List<Candidate> fulltimes = getCandidatesForInterview(candidates, new FulltimeCandidatePredicate());

        System.out.println("Candidates for internships: ");
        for (Candidate c : internships) {
            System.out.println(c);
        }

        System.out.println("\nCandidates for fulltime positions: ");
        for (Candidate c : fulltimes) {
            System.out.println(c);
        }

    }

    public static List<Candidate> getCandidatesForInterview(List<Candidate> candidates, Predicate<Candidate> pred) {
        List<Candidate> result = new ArrayList<>();
        for (Candidate c : candidates) {
            if (pred.test(c)) {
                result.add(c);
            }
        }
    
        return result;
    }

}


