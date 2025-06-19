package p2_intro_oop.s2_innkapsling_validering;

public class Person {
    
    private int age;
    private boolean isSleeping;

    Person(int age, boolean isSleeping) {
        this.age = age;
        this.isSleeping = isSleeping;
    }

    public void setAge(int age) {
        // if (age >= 0) {
        //     this.age = age;
        // }
        
        // if (age < 0) {
        //     throw new IllegalArgumentException();
        // }

        if (age < 0) {
            throw new IllegalArgumentException("Alder må være positiv!");
        }

        this.age = age;
    }

    public void goToSleep() {
        // Kan ikke være noe ugyldig argument som sendes inn i funksjonen når den ikke har argumenter
        // Men tilstanden til objektet gjør funksjonskallet likevel ugyldig
        if (isSleeping) {
            throw new IllegalStateException("Sover allerede!");
        }
        System.out.println("Jeg legger seg...");
        isSleeping = true;
    }


    // Endres når video er igang
    public static void main(String[] args) {
        
        Person hans = new Person(21, false);
        hans.setAge(-22);

        hans.setAge(22);

        hans.goToSleep();
        hans.goToSleep();

    }

}

