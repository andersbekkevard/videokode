package p4_relasjoner.s1_assosiasjoner_v2.enTilEn;

public class Guest {

    private String name;
    private SingleHotelRoom room;
    
    public Guest(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public SingleHotelRoom getRoom() {
        return room;
    }
    
    public void setRoom(SingleHotelRoom newRoom) {
        if (this.room == newRoom) {
            return;
        }
        
        SingleHotelRoom oldRoom = this.room;
        this.room = newRoom;
        
        if (oldRoom != null && oldRoom.getGuest() == this) {
            oldRoom.setGuest(null);
        }
        
        if (this.room != null) {
            this.room.setGuest(this);
        }
    }
    
    @Override
    public String toString() {
        if (room == null) {
            return name + " har ikke et rom";
        }
        return name + " bor på " + room.getRoomNumber();
    }
}