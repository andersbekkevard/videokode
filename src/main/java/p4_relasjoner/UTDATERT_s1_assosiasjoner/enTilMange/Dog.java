package p4_relasjoner.UTDATERT_s1_assosiasjoner.enTilMange;

public class Dog {
    
    private String name;
    private Owner owner;

    public Dog(String name) {
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
