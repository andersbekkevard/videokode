package p6_funksjonell_programmering.s1_funksjonelle_grensesnitt.Funk_grensesnitt_og_predicate;

public class EvenNumberTester implements Tester<Integer> {

    @Override
    public boolean check(Integer t) {
        return t % 2 == 0;
    }

}
