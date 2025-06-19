package p3_mer_om_java.s1_collections;

// import java.util.List;

public class Casting {

    // public static char nLettersAfter(char c, int n) {
    //     int newChar = c - 97; // 0 - om c == 'a' er newChar nullte bokstav i alfabetet
    //     newChar += n; // 1
    //     newChar %= 26; // om vi går utenfor alfabetet
    //     newChar += 97; // tilbake opp til der de små bokstavene starter i ASCII 97
    //     return (char) (newChar); // caster til char
    // }

    public static void main(String[] args) {

        double num = 1.3;
        // Eksplisitt casting
        int castedNum = (int) num;
        System.out.println(castedNum);
        // Implisitt casting
        double recastedNum = castedNum;
        System.out.println(recastedNum);

        int aAsInt = 'a'; // ev med (int) 'a';
        System.out.println(aAsInt);

        // Denne castingen skjer automatisk når vi plusser char og int
        System.out.println('a' + 1);

        System.out.println((char) ('a' + 1));

        // System.out.println(nLettersAfter('a', 1));
        
        String numString = "42";
        
        int result = Integer.parseInt(numString) / 2; 
        System.out.println(result);

        // Vi vil caste fra en int til en String. Vi ser dette ikke går
        // String stringResult = result;
        // Her skjer det castinger automatisk for oss hvor datatypen endres
        String stringResult = ("" + result);
        // Skjer også på vei tilbake
        System.out.println(stringResult + 3);

    }

}
