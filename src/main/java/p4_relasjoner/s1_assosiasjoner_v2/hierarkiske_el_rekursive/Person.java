package p4_relasjoner.s1_assosiasjoner_v2.hierarkiske_el_rekursive;

public class Person {
    private String name;
    private Person predecessor;
    private Person successor;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public Person getPredecessor() {
        return predecessor;
    }
    
    public void setPredecessor(Person newPredecessor) {
        if (this.predecessor == newPredecessor) {
            return;
        }
        
        Person oldPredecessor = this.predecessor;
        this.predecessor = newPredecessor;
        
        if (oldPredecessor != null && oldPredecessor.getSuccessor() == this) {
            oldPredecessor.setSuccessor(null);
        }
        
        if (this.predecessor != null) {
            this.predecessor.setSuccessor(this);
        }
    }
    
    public Person getSuccessor() {
        return successor;
    }
    
    public void setSuccessor(Person newSuccessor) {
        if (this.successor == newSuccessor) {
            return;
        }
        
        Person oldSuccessor = this.successor;
        this.successor = newSuccessor;
        
        if (oldSuccessor != null && oldSuccessor.getPredecessor() == this) {
            oldSuccessor.setPredecessor(null);
        }
        
        if (this.successor != null) {
            this.successor.setPredecessor(this);
        }
    }
    
    public boolean isDescendantOf(Person person) {
        Person current = this.predecessor;
        while (current != null) {
            if (current == person) {
                return true;
            }
            current = current.predecessor;
        }
        return false;
    }
    
    public boolean isPredecessorOf(Person person) {
        Person current = this.successor;
        while (current != null) {
            if (current == person) {
                return true;
            }
            current = current.successor;
        }
        return false;
    }
    
    public boolean hasSuccessor() {
        return successor != null;
    }
    
    public boolean hasPredecessor() {
        return predecessor != null;
    }
    
    @Override
    public String toString() {
        return "Person{name='" + name + "', predecessor=" + 
               (predecessor != null ? predecessor.getName() : "none") + 
               ", successor=" + (successor != null ? successor.getName() : "none") + "}";
    }
    
    public static void main(String[] args) {
        Person alice = new Person("Alice");
        Person bob = new Person("Bob");
        Person charlie = new Person("Charlie");
        Person david = new Person("David");
        
        System.out.println("=== Testing Hierarchical Association (Wiki Approach) ===");
        System.out.println("Initial state:");
        System.out.println("Alice: " + alice);
        System.out.println("Bob: " + bob);
        System.out.println("Charlie: " + charlie);
        System.out.println("David: " + david);
        
        alice.setSuccessor(bob);
        System.out.println("\nAfter alice.setSuccessor(bob):");
        System.out.println("Alice: " + alice);
        System.out.println("Bob: " + bob);
        
        bob.setSuccessor(charlie);
        System.out.println("\nAfter bob.setSuccessor(charlie):");
        System.out.println("Alice: " + alice);
        System.out.println("Bob: " + bob);
        System.out.println("Charlie: " + charlie);
        
        charlie.setPredecessor(david);
        System.out.println("\nAfter charlie.setPredecessor(david) - should break chain:");
        System.out.println("Alice: " + alice);
        System.out.println("Bob: " + bob);
        System.out.println("Charlie: " + charlie);
        System.out.println("David: " + david);
        
        System.out.println("\nTesting relationship queries:");
        System.out.println("Is Charlie descendant of Alice? " + charlie.isDescendantOf(alice));
        System.out.println("Is Charlie descendant of David? " + charlie.isDescendantOf(david));
        System.out.println("Is Alice predecessor of Bob? " + alice.isPredecessorOf(bob));
        System.out.println("Is David predecessor of Charlie? " + david.isPredecessorOf(charlie));
        
        david.setSuccessor(null);
        charlie.setPredecessor(bob);
        System.out.println("\nAfter reconnecting chain:");
        System.out.println("Alice: " + alice);
        System.out.println("Bob: " + bob);
        System.out.println("Charlie: " + charlie);
        System.out.println("David: " + david);
        
        System.out.println("\nFinal relationship queries:");
        System.out.println("Is Charlie descendant of Alice? " + charlie.isDescendantOf(alice));
        System.out.println("Is Alice predecessor of Charlie? " + alice.isPredecessorOf(charlie));
    }
}