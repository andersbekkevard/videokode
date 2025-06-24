package p3_mer_om_java.s1_collections;

public class Wrappers {
    
    public static void main(String[] args) {

        // Her ser vi at Java automatisk pakker de primitive typene inn i wrapper-klassene 
        int heltall = 5;
        Integer heltallObj = heltall;
        Integer2 egendefinert = new Integer2(heltall);

        double desimal = 2.3;
        Double desimalObj = desimal;

        char karakter = 'A';
        Character karakterObj = karakter;

        boolean sannhetsverdi = true;
        Boolean sannhetsverdiObj = sannhetsverdi;
        // Denne brukes sjeldent. Pleier løse på andre måter

        // Vi har nå lagd en klasse som inneholder primitive verdier
        // Vi ser at forskjellen er at de har stor forbokstav og er skrevet helt ut

        // Vi kan nå gjenkjenne at String også har stor forbokstav, og er en klasse på samme måte, som inneholder flere chars



        // Disse klassene har også hver sine metoder

        int n = Integer.parseInt("43");
        double d = Double.parseDouble("3.5");    

        System.out.println(n +  ", " + d);
        
        String qad = "" + 'a';
        // Kan og bruke
        String noeAnnet = Character.toString('a'); // men sjeldent nyttig


        String unknownString = "1a2b3cXYZ";
        for (char c : unknownString.toCharArray()) {
            // if (Character.isAlphabetic(c) && Character.isLowerCase(c)) {
            //     System.out.println(c);
            // }
            if (Character.isDigit(c)) {
                System.out.println(c);
            }
        }

        if (unknownString.contains("2b3")) {
            System.out.println("MATCH");
        }

        double notANumber = Double.NaN;
        double infinity = Double.POSITIVE_INFINITY;

        System.out.println(notANumber);
        System.out.println(infinity);
        System.out.println(infinity > 99999999);

    }
}
