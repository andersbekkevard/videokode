package p6_funksjonell_programmering.s1_funksjonelle_grensesnitt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TesterMain {
    
    public static void main(String[] args) {
    
        Collection<String> strings = new ArrayList<>(Arrays.asList("", ""));
        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2));

        LongStringTester longString = new LongStringTester();
        EvenNumberTester evenNumber = new EvenNumberTester();

        
    
    }

}
