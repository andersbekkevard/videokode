package p4_relasjoner.s1_assosiasjoner_v2.enTilEn;

public class SingleHotelRoom {
    private int roomNumber;
    private Guest guest;
    
    public SingleHotelRoom(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public int getRoomNumber() {
        return roomNumber;
    }
    
    public Guest getGuest() {
        return guest;
    }
    
    public void setGuest(Guest newGuest) {
        if (this.guest == newGuest) {
            return;
        }
        
        Guest oldGuest = this.guest;
        this.guest = newGuest;
        
        if (oldGuest != null && oldGuest.getRoom() == this) {
            oldGuest.setRoom(null);
        }
        
        if (this.guest != null) {
            this.guest.setRoom(this);
        }
    }
    
    public boolean isOccupied() {
        return guest != null;
    }
    
    @Override
    public String toString() {
        return "SingleHotelRoom{roomNumber=" + roomNumber + ", guest=" + 
               (guest != null ? guest.getName() : "none") + "}";
    }
    
    public static void main(String[] args) {
        Guest alice = new Guest("Alice");
        Guest bob = new Guest("Bob");
        SingleHotelRoom room101 = new SingleHotelRoom(101);
        SingleHotelRoom room102 = new SingleHotelRoom(102);
        
        System.out.println("=== Testing 1-1 Association (Wiki Approach) ===");
        System.out.println("Initial state:");
        System.out.println("Alice: " + alice);
        System.out.println("Bob: " + bob);
        System.out.println("Room 101: " + room101);
        System.out.println("Room 102: " + room102);
        
        alice.setRoom(room101);
        System.out.println("\nAfter alice.setRoom(room101):");
        System.out.println("Alice: " + alice);
        System.out.println("Room 101: " + room101);
        
        bob.setRoom(room101);
        System.out.println("\nAfter bob.setRoom(room101) - should transfer room:");
        System.out.println("Alice: " + alice);
        System.out.println("Bob: " + bob);
        System.out.println("Room 101: " + room101);
        
        room102.setGuest(bob);
        System.out.println("\nAfter room102.setGuest(bob) - should transfer guest:");
        System.out.println("Bob: " + bob);
        System.out.println("Room 101: " + room101);
        System.out.println("Room 102: " + room102);
        
        alice.setRoom(null);
        System.out.println("\nAfter alice.setRoom(null):");
        System.out.println("Alice: " + alice);
        System.out.println("Room 101: " + room101);
    }
}