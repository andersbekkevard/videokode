package p4_relasjoner.s1_assosiasjoner_v2.enTilMange;

public class Dog {
    private String name;
    private Owner owner;
    
    public Dog(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public Owner getOwner() {
        return owner;
    }
    
    public void setOwner(Owner newOwner) {
        if (this.owner == newOwner) {
            return;
        }
        
        Owner oldOwner = this.owner;
        this.owner = newOwner;
        
        if (oldOwner != null && oldOwner.hasDog(this)) {
            oldOwner.removeDog(this);
        }
        
        if (this.owner != null) {
            this.owner.addDog(this);
        }
    }
    
    @Override
    public String toString() {
        return "Dog{name='" + name + "', owner=" + 
               (owner != null ? owner.getName() : "none") + "}";
    }
    
    public static void main(String[] args) {
        Owner john = new Owner("John");
        Owner jane = new Owner("Jane");
        Dog buddy = new Dog("Buddy");
        Dog max = new Dog("Max");
        Dog luna = new Dog("Luna");
        
        System.out.println("=== Testing 1-n Association (Wiki Approach) ===");
        System.out.println("Initial state:");
        System.out.println("John: " + john);
        System.out.println("Jane: " + jane);
        System.out.println("Buddy: " + buddy);
        System.out.println("Max: " + max);
        System.out.println("Luna: " + luna);
        
        john.addDog(buddy);
        john.addDog(max);
        System.out.println("\nAfter john.addDog(buddy) and john.addDog(max):");
        System.out.println("John: " + john);
        System.out.println("Buddy: " + buddy);
        System.out.println("Max: " + max);
        
        buddy.setOwner(jane);
        System.out.println("\nAfter buddy.setOwner(jane) - should transfer ownership:");
        System.out.println("John: " + john);
        System.out.println("Jane: " + jane);
        System.out.println("Buddy: " + buddy);
        
        jane.addDog(luna);
        System.out.println("\nAfter jane.addDog(luna):");
        System.out.println("Jane: " + jane);
        System.out.println("Luna: " + luna);
        
        jane.removeDog(buddy);
        System.out.println("\nAfter jane.removeDog(buddy):");
        System.out.println("Jane: " + jane);
        System.out.println("Buddy: " + buddy);
        
        System.out.println("\nFinal state:");
        System.out.println("John's dogs: " + john.getDogs());
        System.out.println("Jane's dogs: " + jane.getDogs());
    }
}