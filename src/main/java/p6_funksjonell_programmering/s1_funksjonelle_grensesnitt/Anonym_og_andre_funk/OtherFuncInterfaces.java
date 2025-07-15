package p6_funksjonell_programmering.s1_funksjonelle_grensesnitt.Anonym_og_andre_funk;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class OtherFuncInterfaces {
    
    public static <T> void main(String[] args) {
        
        // Consumer<T>: tar inn en verdi uten å returnere noe. "Forbruker" innverdien
        Consumer<String> gamerTagGenerator = new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println("xX" + t + "420Xx");
            }
        };
        gamerTagGenerator.accept("Otto");



        // Supplier<T>: Gir verdier, tar ikke inn noe
        Supplier<Integer> diceRoll = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 6 + 1);
            }
        };
        System.out.println(diceRoll.get());



        // Function<T, R>: Tar inn en verdi T, returnerer en annen verdi R
        Function<Double, Double> exp = new Function<Double,Double>() {
            @Override
            public Double apply(Double t) {
                return Math.exp(t);
            }
        };
        System.out.println(exp.apply(3.0));



        // BiFunction<T, U, R>: Tar inn to verdier T og U, returnerer verdi R
        BiFunction<String, String, String> stringZipper = new BiFunction<String,String,String>() {
            @Override
            public String apply(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return ""; 
                }
                String returnString = "";
                for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
                    returnString += "" + s1.charAt(i) + s2.charAt(i);
                }
                return returnString;
            }
        };
        System.out.println(stringZipper.apply("123", "XYZ"));



        // UnaryOperator<T>: Tar inn en verdi, og returnerer en verdi av samme type
        UnaryOperator<String> censor = new UnaryOperator<String>() {
            @Override
            public String apply(String t) {
                return t.replaceAll("sommerjobb", "s********");
            }
        };
        System.out.println(censor.apply("Har du fått deg sommerjobb?"));



        // BinaryOperator<T>: Tar inn to verdier av samme type, returnerer verdi også av samme type
        BinaryOperator<Double> avg = new BinaryOperator<Double>() {
            @Override
            public Double apply(Double t, Double u) {
                return (t + u) / 2;   
            }
        };
        System.out.println(avg.apply(4.2, 3.0));

    }

}
