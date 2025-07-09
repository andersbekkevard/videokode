package p9_misc.s2_varargs;

public class TerminalVarargs {

    // Gjør dette etterpå

    public static void main(String[] args) {

        // Kanskje du lurer på hva som ligger i /target mappen
        // Der ligger den kompilerte koden fra når vi kjører kode
        // Vi kan også kompilere koden i terminalen
    
        // cd til s2_varargs
        // javac Main.java
        // java Main.java Hello World....
        // Dette er egt en varargs som automatisk gjøres om 
        for (String s : args) {
            System.out.println(s);
        }
    }


}
