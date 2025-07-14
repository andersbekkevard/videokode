package p4_relasjoner.s1_assosiasjoner_v2.hierarkiske_el_rekursive;

// Vi skal nå se når på objekter av samme klasse står i forhold til hverandre.
// Dette har vi valgt å kalle for hierarkiske eller rekursive assosiasjoner

public class Person {

    // Kan ha alt annet ferdig opprettet unntatt settere og boolske metoder
    // Bruker genrelle navnene predecessor og successor fordi det er typisk eksamensoppgaver

    private String name;
    private Person predecessor; // Forgjenger
    private Person successor;   // Etterkommer
    
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
    
    // Er denne personen en etterkommer av p?
    public boolean isDescendantOf(Person p) {
        Person current = this.predecessor;
        while (current != null) { // Sjekker fram til du har nådd roten av familietreet
            if (current == p) {
                return true;
            }
            current = current.predecessor; // Klatrer seg oppover treet
        }
        return false; // Fant du ikke p på vei opp familietreet, er ikke p forgjengeren din
    }
    
    // Er denne personen en forgjenger til p?
    public boolean isPredecessorOf(Person p) { 
        return p != null && p.isDescendantOf(this); // Samme sjekk bare motsatt vei. Gjenbruker bare
    }
    
    public boolean hasSuccessor() {
        return successor != null;
    }
    
    public boolean hasPredecessor() {
        return predecessor != null;
    }
    
    public static void main(String[] args) {
        Person king = new Person("Kong Harald");
        Person crownPrince = new Person("Kronprins Haakon");
        Person princess = new Person("Prinsesse Ingrid Alexandra");

        king.setSuccessor(crownPrince);
        crownPrince.setSuccessor(princess);

        System.out.println(princess.isDescendantOf(king)); // true
        System.out.println(princess.isPredecessorOf(crownPrince)); // false
        System.out.println(king.isPredecessorOf(crownPrince));  // true

        
    }
}