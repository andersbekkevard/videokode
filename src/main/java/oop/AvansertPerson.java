package oop;

public class AvansertPerson {
    
    String navn;
    int alder;

    AvansertPerson(String nyttNavn, int nyAlder) {
        navn = nyttNavn;
        alder = nyAlder;
    }

    void presenterDegSelv() {
        System.out.println("Jeg heter " + navn + " og jeg er " + alder + " år gammel");
    }

    public static void main(String[] args) {
        AvansertPerson p = new AvansertPerson("Hans", 22);
        p.presenterDegSelv();
    }
}
