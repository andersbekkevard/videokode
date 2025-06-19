package p3_mer_om_java.s1_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapss {
    
    public static void main(String[] args) {
        
        // Maps på formatet key: value
        // Hvor key brukes for å finne values: Keyen må være unik, value kan gjentas

        Map<String, Character> karakterer = new HashMap<>();

        // karakterer {(n1, k1), (n2, k2), (n3, k3) ... }

        karakterer.put("Anne", 'A');
        karakterer.put("Bjørg", 'B');

        if (karakterer.containsKey("Anne")) {
            System.out.println("Annes karakter er registrert");
        }

        // Siden keys må være unike overskriver dette valuen som stod fra før
        karakterer.put("Anne", 'C');

        if (karakterer.containsValue('F')) {
            System.out.println("Noen har fått F");
        }

        System.out.println("Anne fikk " + karakterer.get("Anne"));

        // Kan legge til en antakelse om at om key ikke finnes
        System.out.println("Frode fikk " + karakterer.getOrDefault("Frode", 'F'));


        System.out.println("\nRegistrerte navn:");
        for (String s : karakterer.keySet()) {
            System.out.println(s);
        }

        karakterer.remove("Bjørg");

        System.out.println("\nRegistrerte karakterer:");
        for (Character c : karakterer.values()) {
            System.out.println(c);
        }

        System.out.println("\nUtskrift:");
        for (Entry<String, Character> e : karakterer.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
