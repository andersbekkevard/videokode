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
        if (!dogs.contains(dog)) {
            dogs.add(dog);
            dog.setOwner(this);
        }
    }
    
    public void removeDog(Dog dog) {
        if (dogs.contains(dog)) {
            dogs.remove(dog);
            dog.setOwner(null);
        }
    }
    
    public boolean hasDog(Dog dog) {
        return dogs.contains(dog);
    }
    
    public int getDogCount() {
        return dogs.size();
    }
    
    @Override
    public String toString() {
        return "Owner{name='" + name + "', dogs=" + dogs.size() + "}";
    }
}