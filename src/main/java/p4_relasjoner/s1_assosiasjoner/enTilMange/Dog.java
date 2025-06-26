package p4_relasjoner.s1_assosiasjoner.enTilMange;

public class Dog {
    
    private String name;
    private Owner owner;

    public Dog(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }    

}
