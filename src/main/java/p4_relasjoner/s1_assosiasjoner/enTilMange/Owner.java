package p4_relasjoner.s1_assosiasjoner.enTilMange;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    
    private String name;
    private List<Dog> dogs = new ArrayList<>();

    
    public Owner(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public List<Dog> getDogs() {
        return List.copyOf(dogs);
    }

    public void addDog(Dog dog) {
        if (!dogs.contains(dog)) {
            // Må legges til senere
            if (dog.getOwner() != null) {
                dog.getOwner().removeDog(dog);
            }
            dogs.add(dog);
            dog.setOwner(this);
        }
    }


    public void removeDog(Dog dog) {
        dogs.remove(dog);
        dog.setOwner(null);
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + "s dogs: ");
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


        o1.addDog(d2);

        // Dette skriver ut Dole på begge
        System.out.println(o1);
        System.out.println(o2);

    }

    
}
