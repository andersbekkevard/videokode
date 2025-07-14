package p4_relasjoner.s1_assosiasjoner_v2.enTilMange;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Owner {

    private String name;
    private Collection<Dog> dogs = new ArrayList<>();

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Collection<Dog> getDogs() {
        return List.copyOf(dogs);
    }

    public void addDog(Dog dog) {
        // Sjekker om allerede finnes kobling
        if (dogs.contains(dog)) {
            return;
        }
        // Setter kobling
        dogs.add(dog);
        // Sjekker om må sette kobling tilbake
        if (dog.getOwner() != this) {
            dog.setOwner(this);
        }
    }

    public void removeDog(Dog dog) {
        // Sjekker om kobling allerede ikke finnes
        if (!dogs.contains(dog)) {
            return;
        }
        // Fjerner kobling
        dogs.remove(dog);
        // Sjekker om må fjerne kobling tilbake
        if (dog.getOwner() == this) {
            dog.setOwner(null);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + "s hunder: ");
        for (Dog d : dogs) {
            sb.append(d.getName() + ", ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Owner o1 = new Owner("Otto");
        Owner o2 = new Owner("Anna");

        Dog d1 = new Dog("Ole");
        Dog d2 = new Dog("Dole");
        Dog d3 = new Dog("Doffen");

        o1.addDog(d1);
        o2.addDog(d2);
        o2.addDog(d3);

        System.out.println(o1);
        System.out.println(o2);

        System.out.println("\nSetter Doles eier til å være Otto\n");

        o1.addDog(d2);

        System.out.println(o1);
        System.out.println(o2);
    }
}