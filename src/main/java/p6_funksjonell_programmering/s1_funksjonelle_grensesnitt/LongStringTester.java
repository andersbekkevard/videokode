package p6_funksjonell_programmering.s1_funksjonelle_grensesnitt;

public class LongStringTester implements Tester<String> {

    @Override
    public boolean check(String t) {
        return t.length() > 5;
    }
    

}
