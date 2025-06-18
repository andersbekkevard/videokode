package p2_intro_oop.s2_innkapsling_validering;

public class Hacker {
    public static void main(String[] args) {
        Innkapsling innkapsling = new Innkapsling();

        System.out.println(innkapsling.password);
        System.out.println(innkapsling.openPassword);
        // System.out.println(innkapsling.secretPassword);

        System.out.println(innkapsling.getSecretPassword());

    }
}
