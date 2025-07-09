package p9_misc.s2_varargs;

public class Main {


    public static void main(String[] args) {
        // cd til s2_varargs
        // javac Main.java
        // java Main.java Hello World....
        // Dette er egt en varargs som automatisk gjøres om 
        for (String s : args) {
            System.out.println(s);
        }
    }


}
